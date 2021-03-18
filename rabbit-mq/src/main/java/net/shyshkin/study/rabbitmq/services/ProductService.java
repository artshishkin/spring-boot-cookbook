package net.shyshkin.study.rabbitmq.services;


import net.shyshkin.study.rabbitmq.commands.ProductForm;
import net.shyshkin.study.rabbitmq.domain.Product;

import java.util.List;

public interface ProductService {

    List<Product> listAll();

    Product getById(Long id);

    Product saveOrUpdate(Product product);

    void delete(Long id);

    Product saveOrUpdateProductForm(ProductForm productForm);

    void sendMessage(String id);
}
