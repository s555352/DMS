package com.baddamClasses.DMS.repository;

import java.util.List;

/**
 * @author S555352 Asritha Baddam
 * 
 */

import org.springframework.data.repository.CrudRepository;

import com.baddamClasses.DMS.Models.Dog;

public interface DogRepository extends CrudRepository<Dog, Integer>{
	List<Dog> findByName(String name);

}
