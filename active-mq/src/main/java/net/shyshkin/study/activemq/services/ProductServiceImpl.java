package net.shyshkin.study.activemq.services;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import net.shyshkin.study.activemq.commands.ProductForm;
import net.shyshkin.study.activemq.config.JmsConfig;
import net.shyshkin.study.activemq.converters.ProductFormToProduct;
import net.shyshkin.study.activemq.domain.Product;
import net.shyshkin.study.activemq.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
@Slf4j
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;
    private final ProductFormToProduct productFormToProduct;
    private final JmsTemplate jmsTemplate;

    @Override
    public List<Product> listAll() {
        List<Product> products = new ArrayList<>();
        productRepository.findAll().forEach(products::add); //fun with Java 8
        return products;
    }

    @Override
    public Product getById(Long id) {
        return productRepository.findById(id).orElse(null);
    }

    @Override
    public Product saveOrUpdate(Product product) {
        productRepository.save(product);
        return product;
    }

    @Override
    public void delete(Long id) {
        productRepository.deleteById(id);
    }

    @Override
    public Product saveOrUpdateProductForm(ProductForm productForm) {
        Product savedProduct = saveOrUpdate(productFormToProduct.convert(productForm));

        log.info("Saved Product Id: `{}`", savedProduct.getId());
        return savedProduct;
    }

    @Override
    public void sendMessage(String id) {
        Map<String, String> actionmap = new HashMap<>();
        actionmap.put("id", id);
        log.info("Sending the index request through queue message");
        jmsTemplate.convertAndSend(JmsConfig.PRODUCT_MESSAGE_QUEUE, actionmap);
    }
}
