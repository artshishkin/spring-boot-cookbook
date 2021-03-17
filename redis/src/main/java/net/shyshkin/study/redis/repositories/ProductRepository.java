package net.shyshkin.study.redis.repositories;

import net.shyshkin.study.redis.domain.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {
}
