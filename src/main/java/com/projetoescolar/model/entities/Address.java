package com.projetoescolar.model.entities;


import jakarta.persistence.*;
import lombok.Data;


@Entity
@Data
public class Address {
    private String zipCode;
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String city;
    private String district;
    private String publicPlace;
    private Integer number;





}
