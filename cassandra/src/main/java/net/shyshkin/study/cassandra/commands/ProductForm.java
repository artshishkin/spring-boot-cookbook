package net.shyshkin.study.cassandra.commands;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.UUID;

@Getter
@Setter
public class ProductForm {
    private UUID id;
    private String description;
    private BigDecimal price;
    private String imageUrl;
}
