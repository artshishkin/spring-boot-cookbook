package net.shyshkin.study.oracle.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
@Getter
@Setter
public class Product {

    @Id
    @GeneratedValue
    private Long id;
    private String description;
    private BigDecimal price;
    private String imageUrl;

}
