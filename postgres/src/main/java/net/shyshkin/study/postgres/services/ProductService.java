package net.shyshkin.study.postgres.services;

import net.shyshkin.study.postgres.commands.ProductForm;
import net.shyshkin.study.postgres.domain.Product;

import java.util.List;

public interface ProductService {

    List<Product> listAll();

    Product getById(Long id);

    Product saveOrUpdate(Product product);

    void delete(Long id);

    Product saveOrUpdateProductForm(ProductForm productForm);
}
