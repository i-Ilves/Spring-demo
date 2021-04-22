package com.example.demo.Repositories;


import com.example.demo.Enteties.Elephant;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ElephantRepository extends CrudRepository<Elephant, Integer> {
}
