package com.example.dance.controller;

import com.example.dance.entity.Dance;
import com.example.dance.model.DanceRequestDTO;
import com.example.dance.model.DanceResponseDTO;
import com.example.dance.repository.DanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("dance")
public class DanceController {

    @Autowired
    private DanceRepository danceRepository;

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping
    public List<DanceResponseDTO> getAllDance(){
        return danceRepository.findAll().stream().map(DanceResponseDTO::new).toList();
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping
    public void createDance(@RequestBody DanceRequestDTO data){
        Dance dance = new Dance(data);
        danceRepository.save(dance);

    }
}
