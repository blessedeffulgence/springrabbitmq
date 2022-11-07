package com.springrabbitmq;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RabbitConsumerRepository extends JpaRepository<CustomMessage,Integer> {
}
