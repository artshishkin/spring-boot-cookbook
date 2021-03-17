package net.shyshkin.study.cassandra.services;


import net.shyshkin.study.cassandra.commands.ProductForm;
import net.shyshkin.study.cassandra.domain.Product;

import java.util.List;
import java.util.UUID;

public interface ProductService {

    List<Product> listAll();

    Product getById(UUID id);

    Product saveOrUpdate(Product product);

    void delete(UUID id);

    Product saveOrUpdateProductForm(ProductForm productForm);
}
