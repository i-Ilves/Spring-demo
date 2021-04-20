package com.example.demo.Controllers;

import com.example.demo.Enteties.Owner;
import com.example.demo.Enteties.Pet;
import com.example.demo.Services.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class PetController {

    @Autowired
    PetService petService;

    @GetMapping("/api/pets")
    public List<Pet> getAllPets() {
        return petService.getAllPets();
    }

    @GetMapping("/api/pets/{id}")
    public Optional<Pet> getPet(@PathVariable int id) {
        return petService.getPetById(id);
    }

    @GetMapping("/api/pets/species/{specie}")
        public List<Pet> getAllPetsBySpecies(@PathVariable String specie) {
        return petService.getAllPetsBySpecie(specie);
    }

    @GetMapping("/api/pets/name/{name}")
    public List<Pet> getAllPetsByName(@PathVariable String name) {
        return petService.getAllPetsByName(name);
    }

    @PostMapping("/api/pets")
    public Pet addNewPet(@RequestBody Pet pet){
        return petService.addNewPet(pet);
    }

    @DeleteMapping("/api/pets/{id}")
    public void deletePet(@PathVariable int id) {
        petService.deletePet(id);
    }

    @PutMapping("/api/pets/{id}")
    public void updatePet(@PathVariable int id, @RequestBody Pet pet) {
        petService.updatePet(id, pet);
    }

}
