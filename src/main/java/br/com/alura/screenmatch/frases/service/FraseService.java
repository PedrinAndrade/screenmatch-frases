package br.com.alura.screenmatch.frases.service;

import br.com.alura.screenmatch.frases.dto.FraseDTO;
import br.com.alura.screenmatch.frases.model.Frase;
import br.com.alura.screenmatch.frases.repository.FraseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FraseService {

    @Autowired
    private FraseRepository repositorio;
    public FraseDTO obterFrase() {
        Frase frase = repositorio.buscaFraseAleatoria();
        return new FraseDTO(frase.getTitulo(), frase.getFrase(), frase.getPersonagem(), frase.getPoster());
    }
}
