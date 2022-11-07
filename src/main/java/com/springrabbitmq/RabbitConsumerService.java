package com.springrabbitmq;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class RabbitConsumerService {
    private static final Logger logger = LoggerFactory.getLogger(RabbitConsumerService.class);

    private final RabbitConsumerRepository repository;

    public RabbitConsumerService(RabbitConsumerRepository repository) {
        this.repository = repository;
    }

    public void saveMessage(CustomMessage customMessage)
    {
        repository.save(customMessage);

        logger.info("message saved: " + customMessage);
    }
}
