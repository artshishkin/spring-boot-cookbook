package net.shyshkin.study.activemq.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.jms.annotation.EnableJms;

@EnableJms
@Configuration
public class JmsConfig {

    public static final String PRODUCT_MESSAGE_QUEUE = "product_message_queue";

}
