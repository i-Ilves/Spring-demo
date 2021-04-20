package com.example.demo.Services;

import com.example.demo.Enteties.Owner;
import com.example.demo.Repositories.OwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OwnerService {

    @Autowired
    OwnerRepository ownerRepository;



    public Optional<Owner> getOwnerById(int id) {
        return ownerRepository.findById(id);
    }

    public List<Owner> getAllOwnersByName(String name) {
        return ownerRepository.findAllOwnersByNameIgnoreCase(name);
    }

    public List<Owner> getAllOwners() {
        return (List<Owner>) ownerRepository.findAll();
    }

    public Owner addNewOwner(Owner owner) {
        ownerRepository.save(owner);
        return owner;
    }


    public void deleteOwner(int id) {
        ownerRepository.deleteById(id);
    }

    public void updateOwner(int id, Owner owner) {
        if (ownerRepository.existsById(id)) {
            owner.setId(id);
            ownerRepository.save(owner);
        }

    }
}
