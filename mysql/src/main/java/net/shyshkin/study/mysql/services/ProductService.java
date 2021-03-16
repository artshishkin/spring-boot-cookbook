package net.shyshkin.study.mysql.services;


import net.shyshkin.study.mysql.commands.ProductForm;
import net.shyshkin.study.mysql.domain.Product;

import java.util.List;

public interface ProductService {

    List<Product> listAll();

    Product getById(Long id);

    Product saveOrUpdate(Product product);

    void delete(Long id);

    Product saveOrUpdateProductForm(ProductForm productForm);
}
