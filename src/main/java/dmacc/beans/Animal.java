package dmacc.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Hayden Harris - CIS175 
 * DMACC FALL 2022
 * Oct 26, 2022
 */
@Entity
public class Animal {
	@Id
	@GeneratedValue
	private long id;
	private String name;
	private String animal;
	private String sex;
	private int age;
	
	public Animal() {
		super();
	}
	public Animal(String name, String animal, String sex, int age) {
		this.name=name;
		this.animal=animal;
		this.sex=sex;
		this.age=age;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAnimal() {
		return animal;
	}
	public void setAnimal(String animal) {
		this.animal = animal;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	

}
