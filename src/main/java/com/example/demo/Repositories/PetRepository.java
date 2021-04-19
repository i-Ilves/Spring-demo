package com.example.demo.Repositories;

import com.example.demo.Enteties.Pet;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PetRepository extends CrudRepository<Pet, Integer> {

    public List<Pet> findAllBySpeciesIgnoreCase(String specie);

    List<Pet> findAllPetsByNameIgnoreCase(String name);
}

