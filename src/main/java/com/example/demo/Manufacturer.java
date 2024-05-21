package com.example.demo;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Table(name = "manufacturer")
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Manufacturer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

}
