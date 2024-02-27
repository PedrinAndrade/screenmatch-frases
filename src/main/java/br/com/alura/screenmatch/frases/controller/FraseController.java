package br.com.alura.screenmatch.frases.controller;

import br.com.alura.screenmatch.frases.dto.FraseDTO;
import br.com.alura.screenmatch.frases.service.FraseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FraseController {

    @Autowired
    private FraseService service;

    @GetMapping("/series/frases")
    public FraseDTO obterFrase(){
        return service.obterFrase();
    }
}
