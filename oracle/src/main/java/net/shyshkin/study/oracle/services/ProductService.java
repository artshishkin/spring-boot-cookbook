package net.shyshkin.study.oracle.services;


import net.shyshkin.study.oracle.commands.ProductForm;
import net.shyshkin.study.oracle.domain.Product;

import java.util.List;

public interface ProductService {

    List<Product> listAll();

    Product getById(Long id);

    Product saveOrUpdate(Product product);

    void delete(Long id);

    Product saveOrUpdateProductForm(ProductForm productForm);
}
