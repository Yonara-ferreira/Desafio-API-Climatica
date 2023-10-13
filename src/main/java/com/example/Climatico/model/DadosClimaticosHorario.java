package com.example.Climatico.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class DadosClimaticosHorario {
    @JsonAlias("type")
    private int tipo;
    @JsonAlias("id")
    private int id;
    @JsonAlias("country")
    private String pais;
    @JsonAlias("sunrise")
    private long nascerSol;
    @JsonAlias("sunset")
    private long porSol;
}
