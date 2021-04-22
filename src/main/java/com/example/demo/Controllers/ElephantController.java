package com.example.demo.Controllers;

import com.example.demo.Enteties.Elephant;
import com.example.demo.Services.ElephantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ElephantController {

    @Autowired
    ElephantService elephantService;

    @GetMapping("/api/elephants")
    public List<Elephant> getAllElephants() {
        return elephantService.getAllElephants();
    }
}
