package com.example.Climatico.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class DadosClima {
    @JsonAlias("id")
    private int id;
    @JsonAlias("main")
    private String main;
    @JsonAlias("description")
    private String description;
    @JsonAlias("icon")
    private String icon;
}
