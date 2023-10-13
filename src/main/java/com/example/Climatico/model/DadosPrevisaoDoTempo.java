package com.example.Climatico.model;

import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class DadosPrevisaoDoTempo {
    private DadosClimaticosCoordenada coordenada;
    private DadosClima[] clima;
    private String base;
    private DadosPrincipais principais;
    private int visibility;
    private DadosClimaticosVento vento;
    private DadosClimaticosNuvem nuvens;
    private long dt;
    private DadosClimaticosHorario horarios;
    private int timezone;
    private long id;
    private String name;
    private int cod;
}
