package net.shyshkin.study.mariadb.services;


import net.shyshkin.study.mariadb.commands.ProductForm;
import net.shyshkin.study.mariadb.domain.Product;

import java.util.List;

public interface ProductService {

    List<Product> listAll();

    Product getById(Long id);

    Product saveOrUpdate(Product product);

    void delete(Long id);

    Product saveOrUpdateProductForm(ProductForm productForm);
}
