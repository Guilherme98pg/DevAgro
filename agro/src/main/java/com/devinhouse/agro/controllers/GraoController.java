package com.devinhouse.agro.controllers;

import com.devinhouse.agro.controllers.dto.GraoDto;
import com.devinhouse.agro.models.Grao;
import com.devinhouse.agro.services.GraoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class GraoController {
    final GraoService service;

    public GraoController(GraoService service){
        this.service = service;
    }
    @GetMapping
    public String grao(){
        return "grão";
    }
    @GetMapping("/todos")
    public List<Grao> listaGrao() {
        return service.listaGrao();
    }
    @PostMapping
    public Grao adicionaGrao(@RequestBody GraoDto graoDto){
        return service.adicionaGrao(graoDto.converter());
    }
    @PutMapping("/{id}")
    public void deletagrao(
            @PathVariable Long id) {
        service.deletaGrao(id);
    }
    @DeleteMapping("/{id}")
    public void deletaGrao(
            @PathVariable Long id){
        service.deletaGrao(id);
    }
}
