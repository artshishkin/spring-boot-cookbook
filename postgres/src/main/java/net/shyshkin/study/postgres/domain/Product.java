package net.shyshkin.study.postgres.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
@Getter
@Setter
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long _id;
    private String description;
    private BigDecimal price;
    private String imageUrl;

    public Long getId() {
        return _id;
    }

    public void setId(Long _id) {
        this._id = _id;
    }
}
