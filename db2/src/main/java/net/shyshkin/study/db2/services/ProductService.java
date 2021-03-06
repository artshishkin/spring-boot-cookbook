package net.shyshkin.study.db2.services;


import net.shyshkin.study.db2.commands.ProductForm;
import net.shyshkin.study.db2.domain.Product;

import java.util.List;

public interface ProductService {

    List<Product> listAll();

    Product getById(Long id);

    Product saveOrUpdate(Product product);

    void delete(Long id);

    Product saveOrUpdateProductForm(ProductForm productForm);
}
