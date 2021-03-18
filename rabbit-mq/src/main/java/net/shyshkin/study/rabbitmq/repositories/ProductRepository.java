package net.shyshkin.study.rabbitmq.repositories;

import net.shyshkin.study.rabbitmq.domain.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {
}
