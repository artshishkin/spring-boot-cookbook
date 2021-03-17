package net.shyshkin.study.cassandra.repositories;

import net.shyshkin.study.cassandra.domain.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface ProductRepository extends CrudRepository<Product, UUID> {
}
