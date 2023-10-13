package com.example.Climatico.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class DadosClimaticosNuvem {
    @JsonAlias("all")
    private int nublado;
}
