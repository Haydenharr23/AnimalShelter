package dmacc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;


import dmacc.beans.Animal;
import dmacc.controller.BeanConfiguration;
import dmacc.repository.ContactRepository;

@SpringBootApplication
public class AnimalShelterApplication {

	public static void main(String[] args) {
		SpringApplication.run(AnimalShelterApplication.class, args);
	}

	@Autowired
	ContactRepository repo;

	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		
		//Using an existing bean
		Animal c = appContext.getBean("animal", Animal.class);
		c.setRelationship("pet");
		repo.save(c);
		
		//Create a bean to use - not managed by Spring
		Animal d = new Animal("Brick", "cat", "male", 1);
		
		repo.save(d);
		
		List<Animal> allMyAnimals = repo.findAll();
		for(Animal people: allMyAnimals) {
			System.out.println(people.toString());
		}
		
		//closes the ApplicationContext resource leak - not imperative to add but nice to clean it up
		((AbstractApplicationContext) appContext).close();
	
	}
}
