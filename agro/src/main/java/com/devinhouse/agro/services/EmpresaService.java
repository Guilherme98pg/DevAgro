package com.devinhouse.agro.services;


import com.devinhouse.agro.models.Empresas;
import com.devinhouse.agro.repositories.EmpresasRepository;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Getter
@Setter
@Service
public class EmpresaService {


    final EmpresasRepository repository;


    public EmpresaService(EmpresasRepository repository){
        this.repository = repository;
    }

    public List<Empresas> listaEmpresa(){
        return (List<Empresas>) repository.findAll();
    }
    public Empresas adicionaEmpresa(Empresas empresa) {
        return repository.save(empresa);
    }
    public Empresas atualizaEmpresa(Long id, Empresas empresa){
        Empresas empresaAtualizada = repository.findById(id).get();
        empresaAtualizada.setId(id);
        empresaAtualizada.setNome(empresa.getNome());
        empresaAtualizada.setEndereco(empresa.getEndereco());
        return repository.save(empresaAtualizada);
    }
    public void deletaEmpresa(Long id){
        repository.deleteById(id);
    }



    public Empresas findById(Long id){
        Optional<Empresas> empresa = repository.findById(id);
        return empresa.get();
    }
}