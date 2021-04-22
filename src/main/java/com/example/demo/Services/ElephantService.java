package com.example.demo.Services;

import com.example.demo.Enteties.Elephant;
import com.example.demo.Repositories.ElephantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class ElephantService {

    @Autowired
    ElephantRepository elephantRepository;

    private String elephantsAPI = "https://elephant-api.herokuapp.com/";

    public List<Elephant> getAllElephants() {
        RestTemplate restTemplate = new RestTemplate();
        Elephant[] elephants= restTemplate.getForObject(elephantsAPI + "elephants", Elephant[].class);

        List<Elephant> listOfElephants = new ArrayList<>();

        for(Elephant elephant : elephants) {
            if (elephant.getName() != null && elephant.getNote() != null){
                listOfElephants.add(elephant);
                elephantRepository.save(elephant);
            }
        }
        return listOfElephants;
    }
}
