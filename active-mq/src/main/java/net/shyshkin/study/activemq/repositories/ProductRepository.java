package net.shyshkin.study.activemq.repositories;

import net.shyshkin.study.activemq.domain.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {
}
