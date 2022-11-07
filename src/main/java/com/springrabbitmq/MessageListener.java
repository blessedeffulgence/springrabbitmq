package com.springrabbitmq;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class MessageListener {
    private static final Logger logger = LoggerFactory.getLogger(MessageListener.class);

    private final RabbitConsumerService service;

    public MessageListener(RabbitConsumerService service) {
        this.service = service;
    }

    @RabbitListener(queues = MQConfig.MESSAGE_QUEUE)
    public void listener(CustomMessage customMessage)
    {
        logger.info("message received: " + customMessage);
        CustomMessage message = new CustomMessage();
        message.setMessage(customMessage.getMessage());
        message.setMessageDate(customMessage.getMessageDate());
        service.saveMessage(message);

    }
}
