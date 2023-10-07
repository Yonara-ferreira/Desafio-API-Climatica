package com.example.Climatico.model;

import com.fasterxml.jackson.annotation.JsonAlias;

public class DescricaoClima {
    @JsonAlias("id")
    private int id;
    @JsonAlias("main")
    private String principal;
    @JsonAlias("description")
    private String descricao;
    @JsonAlias("icon")
    private String icone;
}
