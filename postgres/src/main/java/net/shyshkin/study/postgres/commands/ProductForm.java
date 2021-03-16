package net.shyshkin.study.postgres.commands;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class ProductForm {
    private Long id;
    private String description;
    private BigDecimal price;
    private String imageUrl;
}
