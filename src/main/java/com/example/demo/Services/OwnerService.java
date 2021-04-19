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

}
