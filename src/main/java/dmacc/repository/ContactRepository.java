package dmacc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dmacc.beans.Animal;
/**
 * Hayden Harris - CIS175 
 * DMACC FALL 2022
 * Oct 19, 2022
 */
@Repository
public interface ContactRepository extends JpaRepository<Animal, Long> {
	

}
