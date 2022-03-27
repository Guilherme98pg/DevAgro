package com.devinhouse.agro.controllers;

import com.devinhouse.agro.controllers.dto.EmpresaDto;
import com.devinhouse.agro.models.Empresas;
import com.devinhouse.agro.services.EmpresaService;
import org.jetbrains.annotations.NotNull;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(value = "/devagro")
@RestController
public class EmpresaController {

    final EmpresaService service;

    public EmpresaController(EmpresaService service){
        this.service = service;
    }
    @PostMapping
    public Empresas adicionarEmpresa(@RequestBody @NotNull EmpresaDto empresaDto) {
        return service.adicionaEmpresa(empresaDto.converter());
    }

    @GetMapping
    public String empresas(){
        return "Empresas";
    }

    @GetMapping("/todos")
    public List<Empresas> listaempresa(){
        return service.listaEmpresa();
    }

    @PutMapping("/{id}")
    public Empresas atualizaEmpresa(@PathVariable Long id, @RequestBody EmpresaDto empresaDto){
        return service.atualizaEmpresa(id, empresaDto.converter());
    }
    @DeleteMapping("/{id}")
    public void deletaEmpresa(
            @PathVariable Long id){
        service.deletaEmpresa(id);
    }
}
