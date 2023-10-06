package com.example.Climatico.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DadosClimaticoVento {
    @JsonAlias("speed")
    private double velocidade;
    @JsonAlias("deg")
    private int graus;
    @JsonAlias("gust")
    private double rajada;

    
}
