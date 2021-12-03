package com.bridgelabz.greetingappproblem.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Purpose : Greeting Model
 *
 * @author : Ramkrishna Sheral
 * @version : 0.0.1
 * @since : 01-12-2021
 */
@Entity
@Data
public class GreetingModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String message;
}
