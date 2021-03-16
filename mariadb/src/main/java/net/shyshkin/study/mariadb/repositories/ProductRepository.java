package net.shyshkin.study.mariadb.repositories;

import net.shyshkin.study.mariadb.domain.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {
}
