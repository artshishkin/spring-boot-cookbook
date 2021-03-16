package net.shyshkin.study.mongodb.services;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import net.shyshkin.study.mongodb.commands.ProductForm;
import net.shyshkin.study.mongodb.converters.ProductFormToProduct;
import net.shyshkin.study.mongodb.domain.Product;
import net.shyshkin.study.mongodb.repositories.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;
    private final ProductFormToProduct productFormToProduct;

    @Override
    public List<Product> listAll() {
        List<Product> products = new ArrayList<>();
        productRepository.findAll().forEach(products::add); //fun with Java 8
        return products;
    }

    @Override
    public Product getById(String id) {
        return productRepository.findById(id).orElse(null);
    }

    @Override
    public Product saveOrUpdate(Product product) {
        productRepository.save(product);
        return product;
    }

    @Override
    public void delete(String id) {
        productRepository.deleteById(id);
    }

    @Override
    public Product saveOrUpdateProductForm(ProductForm productForm) {
        Product savedProduct = saveOrUpdate(productFormToProduct.convert(productForm));

        log.info("Saved Product Id: `{}`", savedProduct.getId());
        return savedProduct;
    }
}
