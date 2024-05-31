package com.example.dance.model;

import com.example.dance.entity.Dance;

public record DanceResponseDTO(Long id, String type, String degree, String schedule, Float fee, String image) {

    public DanceResponseDTO(Dance dance){
        this(dance.getId(), dance.getType(), dance.getDegree(), dance.getSchedule(), dance.getFee(), dance.getImage());
    }

}
