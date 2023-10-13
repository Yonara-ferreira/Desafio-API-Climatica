package com.example.Climatico.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class DadosPrincipais {
    @JsonAlias("temp")
    private double temp;
    @JsonAlias("feels_like")
    private double sensacao;
    @JsonAlias("temp_min")
    private double temperaturaMinima;
    @JsonAlias("temp_max")
    private double temperaturaMaxima;
    @JsonAlias("pressure")
    private int pressao;
    @JsonAlias("humidity")
    private int umidade;
    @JsonAlias("sea_level")
    private int nivelMar;
    @JsonAlias("grnd_level")
    private int nivelChao;
}
