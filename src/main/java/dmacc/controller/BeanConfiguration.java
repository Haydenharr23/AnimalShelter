package dmacc.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dmacc.beans.Animal;

/**
 * Hayden Harris - CIS175 
 * DMACC FALL 2022
 * Oct 19, 2022
 */
@Configuration
public class BeanConfiguration {

	@Bean
	public Animal animal() {
		Animal bean = new Animal();
		bean.setName("fluffy");
		bean.setAnimal("dog");
		bean.setAge(12);
		bean.setSex("male");
		return bean;
	}
	
}
