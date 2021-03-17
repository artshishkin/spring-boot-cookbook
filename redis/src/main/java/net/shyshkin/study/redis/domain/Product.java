package net.shyshkin.study.redis.domain;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import java.math.BigDecimal;

@Getter
@Setter
@RedisHash
public class Product {

    @Id
    private Long id;
    private String description;
    private BigDecimal price;
    private String imageUrl;

}
