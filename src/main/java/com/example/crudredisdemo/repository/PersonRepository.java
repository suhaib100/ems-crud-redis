package com.example.crudredisdemo.repository;

import com.example.crudredisdemo.entity.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PersonRepository extends CrudRepository<Person, String> {
}
