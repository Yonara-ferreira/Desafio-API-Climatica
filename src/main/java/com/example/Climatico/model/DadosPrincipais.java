package com.example.Climatico.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class DadosPrincipais {
    @JsonAlias("city_name")
    private String nomeCidade;
    @JsonAlias("lat")
    private double latitude;
    @JsonAlias("lon")
    private double longitude;
    private DadosClimaticos dadosClimaticos;
    private DadosClimaticoVento dadosClimaticoVento;
    private DadosChuva dadosChuva;
    private DadosNuvens dadosNuvens;



}
