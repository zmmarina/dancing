package com.example.dance.entity;

import com.example.dance.model.DanceRequestDTO;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "dance")
@Entity(name = "dance")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Dance {

    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "Dance type must be informed")
    private String type;
    @NotBlank(message = "Group level must be informed")
    private String degree;
    @NotBlank(message = "Class schedule must be informed")
    private String schedule;
    @Positive(message = "Class fee must be above zero")
    private Float fee;
    private String image;

    public Dance(DanceRequestDTO data) {
        this.type = data.type();
        this.degree = data.degree();
        this.schedule = data.schedule();
        this.fee = data.fee();
        this.image = data.image();
    }
}
