package net.shyshkin.study.mongodb.commands;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class ProductForm {
    private String id;
    private String description;
    private BigDecimal price;
    private String imageUrl;
}
