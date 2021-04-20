package com.example.demo.Services;

import com.example.demo.Enteties.Pet;
import com.example.demo.Repositories.PetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PetService {

    @Autowired
    PetRepository petRepository;

    public List<Pet> getAllPets() {
        return (List<Pet>) petRepository.findAll();
    }

    public Optional<Pet> getPetById(int id) {
        return petRepository.findById(id);
    }

    public List<Pet> getAllPetsBySpecie(String specie) {
        return petRepository.findAllBySpeciesIgnoreCase(specie);
    }

    public List<Pet> getAllPetsByName(String name) {
        return petRepository.findAllPetsByNameIgnoreCase(name);
    }

    public Pet addNewPet(Pet pet) {
        petRepository.save(pet);
        return pet;
    }

    public void deletePet(int id) {
        petRepository.deleteById(id);
    }

    public void updatePet(int id, Pet pet) {
        if(petRepository.existsById(id)) {
            pet.setId(id);
            petRepository.save(pet);
        }
    }
}
