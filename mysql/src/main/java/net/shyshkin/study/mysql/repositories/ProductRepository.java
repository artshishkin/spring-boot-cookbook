package net.shyshkin.study.mysql.repositories;

import net.shyshkin.study.mysql.domain.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {
}
