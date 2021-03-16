package net.shyshkin.study.mongodb.repositories;

import net.shyshkin.study.mongodb.domain.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, String> {
}
