package net.shyshkin.study.activemq.listener;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import net.shyshkin.study.activemq.config.JmsConfig;
import net.shyshkin.study.activemq.domain.Product;
import net.shyshkin.study.activemq.repositories.ProductRepository;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
@Slf4j
@RequiredArgsConstructor
public class MessageListener {

    private final ProductRepository productRepository;

    @JmsListener(destination = "${app.product-message-queue}")
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
