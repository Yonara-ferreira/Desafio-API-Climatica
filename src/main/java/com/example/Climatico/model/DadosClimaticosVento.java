package com.example.Climatico.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class DadosClimaticosVento {
    @JsonAlias("speed")
    private double velocidade;
    @JsonAlias("deg")
    private int grau;
    @JsonAlias("gust")
    private double rajada;

}
