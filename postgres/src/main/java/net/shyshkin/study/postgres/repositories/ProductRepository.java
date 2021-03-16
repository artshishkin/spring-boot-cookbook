package net.shyshkin.study.postgres.repositories;

import net.shyshkin.study.postgres.domain.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {
}
