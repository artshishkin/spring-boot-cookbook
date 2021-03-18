package net.shyshkin.study.rabbitmq.listener;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import net.shyshkin.study.rabbitmq.domain.Product;
import net.shyshkin.study.rabbitmq.repositories.ProductRepository;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
@Slf4j
@RequiredArgsConstructor
public class MessageListener {

    private final ProductRepository productRepository;

    @RabbitListener(queues = "${app.product-message-queue}")
    public void receiveMessage(Map<String, String> message) {
        log.info("Received <" + message + ">");
        Long id = Long.valueOf(message.get("id"));
        Product product = productRepository.findById(id).orElse(null);
        product.setMessageReceived(true);
        product.setMessageCount(product.getMessageCount() + 1);
        productRepository.save(product);
        log.info("Message processed...");
    }
}
