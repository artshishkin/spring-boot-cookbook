package net.shyshkin.study.rabbitmq.config;

import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitConfig {

    private final String queueName;

    public RabbitConfig(@Value("${app.product-message-queue}") String queueName) {
        this.queueName = queueName;
    }

    @Bean
    public Queue queue() {
        return new Queue(queueName);
    }
}
