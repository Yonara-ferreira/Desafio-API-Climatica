package com.example.Climatico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class previsaoTempoService extends RuntimeException {

    @Autowired
    private RestTemplate template = new RestTemplate();


}
