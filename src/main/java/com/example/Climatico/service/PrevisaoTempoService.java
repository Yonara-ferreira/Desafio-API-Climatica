package com.example.Climatico.service;

import com.example.Climatico.model.DadosPrevisaoDoTempo;
import lombok.extern.log4j.Log4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.RestTemplate;

@Service
public class PrevisaoTempoService extends RuntimeException {

    @Autowired
    private RestTemplate template = new RestTemplate();
    private static final Logger logger = LoggerFactory.getLogger(PrevisaoTempoService.class);

    public DadosPrevisaoDoTempo previsaoDoTempo(String cidade){
        try {
            logger.info("Chamando API OpenWeatherMap para a cidade: " + cidade);
            DadosPrevisaoDoTempo previsaoTempo = template.getForObject("https://api.openweathermap.org/data/2.5/weather?q=" + cidade + "&appid=2ad90ed5fc16cde0674b8e2be9186c80&lang=pt_br", DadosPrevisaoDoTempo.class);
            logger.info("Resposta da API OpenWeatherMap: " + previsaoTempo);
            return previsaoTempo;
        } catch (HttpClientErrorException | HttpServerErrorException e) {
            logger.error("Erro na chamada à API OpenWeatherMap: " + e.getMessage());
            return null;
        } catch (Exception e) {
            logger.error("Erro inesperado na chamada à API OpenWeatherMap: " + e.getMessage());
            return null;
        }
    }

}
