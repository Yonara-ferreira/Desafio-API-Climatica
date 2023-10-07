package com.example.Climatico.controller;

import com.example.Climatico.model.DadosPrincipais;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/previsao")
public class PrevisaoTempoController {

    @GetMapping("/{cidade}")
    public ResponseEntity<DadosPrincipais>obterPrevisaoTempoPorCidade(@PathVariable String cidade){
        return ResponseEntity.ok();
    }

}
