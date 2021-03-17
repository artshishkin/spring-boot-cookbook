package net.shyshkin.study.db2.repositories;

import net.shyshkin.study.db2.domain.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {
}
