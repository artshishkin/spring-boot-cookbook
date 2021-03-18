package net.shyshkin.study.activemq.services;


import net.shyshkin.study.activemq.domain.Product;
import net.shyshkin.study.activemq.commands.ProductForm;

import java.util.List;

public interface ProductService {

    List<Product> listAll();

    Product getById(Long id);

    Product saveOrUpdate(Product product);

    void delete(Long id);

    Product saveOrUpdateProductForm(ProductForm productForm);

    void sendMessage(String id);
}
