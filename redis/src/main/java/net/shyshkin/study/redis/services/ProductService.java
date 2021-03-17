package net.shyshkin.study.redis.services;


import net.shyshkin.study.redis.commands.ProductForm;
import net.shyshkin.study.redis.domain.Product;

import java.util.List;

public interface ProductService {

    List<Product> listAll();

    Product getById(Long id);

    Product saveOrUpdate(Product product);

    void delete(Long id);

    Product saveOrUpdateProductForm(ProductForm productForm);
}
