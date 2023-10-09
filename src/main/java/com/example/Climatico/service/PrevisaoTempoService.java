package com.example.Climatico.service;

import com.example.Climatico.model.DadosPrincipais;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PrevisaoTempoService extends RuntimeException {

    @Autowired
    private RestTemplate template = new RestTemplate();

    public DadosPrincipais previsaoDoTempo(String cidade){
        DadosPrincipais previsaoTempo = template.getForObject("https://api.openweathermap.org/data/2.5/weather?q="+ cidade +"&appid=2ad90ed5fc16cde0674b8e2be9186c80&lang=pt_br", DadosPrincipais.class);

        return previsaoTempo;
    }

}
