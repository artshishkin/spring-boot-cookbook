package net.shyshkin.study.neo4j.domain;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;

import java.math.BigDecimal;

@Getter
@Setter
@Node
public class Product {

    @Id
    @GeneratedValue
    private Long id;
    private String description;
    private BigDecimal price;
    private String imageUrl;

}
