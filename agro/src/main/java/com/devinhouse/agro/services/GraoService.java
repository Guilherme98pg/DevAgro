package com.devinhouse.agro.services;

import com.devinhouse.agro.models.Grao;
import com.devinhouse.agro.repositories.GraoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GraoService {

    final GraoRepository repository;

    public GraoService(GraoRepository repository) {
        this.repository = repository;
    }

    public Grao adicionaGrao(Grao converter) {
        Grao grao = new Grao();
        return repository.save(grao);
    }

    public void deletaGrao(Long id) {
        repository.deleteById(id);
    }



    public List<Grao> listaGrao() {
        return (List<Grao>) repository.findAll();    }
}
