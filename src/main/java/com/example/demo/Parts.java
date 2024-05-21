package com.example.demo;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Table(name = "catalog")
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Parts {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int price;
    private String status;

    @ManyToOne
    @JoinColumn(name = "manufacturer", referencedColumnName = "id")
    private Manufacturer manufacturer;

}
