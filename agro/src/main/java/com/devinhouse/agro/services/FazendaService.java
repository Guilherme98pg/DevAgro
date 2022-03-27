package com.devinhouse.agro.services;

import com.devinhouse.agro.models.Empresas;
import com.devinhouse.agro.models.Fazendas;
import com.devinhouse.agro.repositories.FazendasRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FazendaService {
    final FazendasRepository fazendasRepository;


    public FazendaService(FazendasRepository fazendasRepository) {
        this.fazendasRepository = fazendasRepository;
    }

    public List<Fazendas> listaFazendas() {
        return (List<Fazendas>) fazendasRepository.findAll();
    }

    public Fazendas adicionaFazendas(Fazendas fazendas) {
        return fazendasRepository.save(fazendas);
    }

    public Fazendas atualizaFazendas(Long id, Fazendas fazendas) {
        Fazendas fazendaAtualizada = fazendasRepository.findById(id).get();
        fazendaAtualizada.setId(id);
        fazendaAtualizada.setNome(fazendas.getNome());
        fazendaAtualizada.setEndereco(fazendas.getEndereco());
        fazendaAtualizada.setUltimaColheita(fazendaAtualizada.getUltimaColheita());
        return fazendasRepository.save(fazendaAtualizada);
    }
    public void deletaFazenda(Long id) {
        fazendasRepository.deleteById(id);
    }
    //Endpoint 2  - Retorna a lista de fazendas de uma empresa.
    public List<Fazendas> suasfazendas(Long id) {
        return fazendasRepository.findAllByempresa_id(id);
    }
    //Endpoint 3 - Retorna a quantidade de fazendas de uma empresa
    public Long countAllFazendas(Empresas empresa){
        return fazendasRepository.countByEmpresa(empresa);
    }
}
