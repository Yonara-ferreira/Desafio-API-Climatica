package com.example.Climatico.model;

import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class DadosClimaticosCoordenada {
    private double lon;
    private double lat;
}
