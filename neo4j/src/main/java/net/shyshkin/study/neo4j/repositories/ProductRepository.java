package net.shyshkin.study.neo4j.repositories;

import net.shyshkin.study.neo4j.domain.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {
}
