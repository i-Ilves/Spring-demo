package com.example.demo.Controllers;

import com.example.demo.Enteties.Owner;
import com.example.demo.Services.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class OwnerController {
    @Autowired
    OwnerService ownerService;

    @GetMapping("/api/owners")
        public List<Owner> getAllOwners() {
        return ownerService.getAllOwners();
    }

        @GetMapping("/api/owners/{id}")
        public Optional<Owner> getOwner(@PathVariable int id) {
            return ownerService.getOwnerById(id);
        }

        @GetMapping("/api/owners/name/{name}")
        public List<Owner> getAllOwnersByName(@PathVariable String name) {
            return ownerService.getAllOwnersByName(name);
        }

        @PostMapping("/api/owners")
        public Owner addNewOwner(@RequestBody Owner owner) {
            return ownerService.addNewOwner(owner);
        }

        @DeleteMapping("/api/owners/{id}")
        public void deleteOwner(@PathVariable int id) {
            ownerService.deleteOwner(id);
        }
}
