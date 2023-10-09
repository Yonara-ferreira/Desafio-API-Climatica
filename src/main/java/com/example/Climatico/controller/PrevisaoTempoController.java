package com.example.Climatico.controller;

import com.example.Climatico.model.DadosPrincipais;
import com.example.Climatico.service.PrevisaoTempoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/previsao")
public class PrevisaoTempoController {

    @Autowired
    private PrevisaoTempoService service;

    @GetMapping("/{cidade}")
    public DadosPrincipais obterPrevisaoTempoAtual(@PathVariable String cidade) {
        return service.previsaoDoTempo(cidade);
    }

}
