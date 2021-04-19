package com.example.demo.Repositories;

import com.example.demo.Enteties.Owner;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OwnerRepository extends CrudRepository<Owner, Integer> {

    List<Owner> findAllOwnersByNameIgnoreCase(String name);
}
