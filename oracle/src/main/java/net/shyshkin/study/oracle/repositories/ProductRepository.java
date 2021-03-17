package net.shyshkin.study.oracle.repositories;

import net.shyshkin.study.oracle.domain.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {
}
