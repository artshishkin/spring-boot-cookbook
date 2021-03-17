package net.shyshkin.study.neo4j.services;


import net.shyshkin.study.neo4j.domain.Product;
import net.shyshkin.study.neo4j.commands.ProductForm;

import java.util.List;

public interface ProductService {

    List<Product> listAll();

    Product getById(Long id);

    Product saveOrUpdate(Product product);

    void delete(Long id);

    Product saveOrUpdateProductForm(ProductForm productForm);
}
