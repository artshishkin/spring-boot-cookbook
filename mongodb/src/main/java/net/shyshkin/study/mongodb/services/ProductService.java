package net.shyshkin.study.mongodb.services;


import net.shyshkin.study.mongodb.commands.ProductForm;
import net.shyshkin.study.mongodb.domain.Product;

import java.util.List;

public interface ProductService {

    List<Product> listAll();

    Product getById(String id);

    Product saveOrUpdate(Product product);

    void delete(String id);

    Product saveOrUpdateProductForm(ProductForm productForm);
}
