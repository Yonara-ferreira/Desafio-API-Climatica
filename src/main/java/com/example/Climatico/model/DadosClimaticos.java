package com.example.Climatico.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class DadosClimaticos {
    @JsonAlias("temp")
    private double temperatura;
    @JsonAlias("temp_min")
    private double temperatura_minima;
    @JsonAlias("temp_max")
    private double temperatura_maxima;
    @JsonAlias("feels_like")
    private double sensacaoTermica;
    @JsonAlias("pressure")
    private int pressao;
    @JsonAlias("humidity")
    private int umidade;
    @JsonAlias("dew_point")
    private double pontoOrvalho;
}
