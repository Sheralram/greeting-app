package com.bridgelabz.greetingappproblem.repository;

import com.bridgelabz.greetingappproblem.model.GreetingModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Purpose : Greeting Repository
 *
 * @author : Ramkrishna Sheral
 * @version : 0.0.1
 * @since : 01-12-2021
 */
@Repository
public interface GreetingRepository extends JpaRepository<GreetingModel, Integer> {
}
