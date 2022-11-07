package com.springrabbitmq;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class CustomMessage {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer messageId;
    private String message;
    private Date messageDate;
}
