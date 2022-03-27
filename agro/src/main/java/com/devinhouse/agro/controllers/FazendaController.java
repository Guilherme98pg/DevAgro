package com.devinhouse.agro.controllers;


import com.devinhouse.agro.controllers.dto.FazendaDto;
import com.devinhouse.agro.models.Empresas;
import com.devinhouse.agro.models.Fazendas;
import com.devinhouse.agro.services.EmpresaService;
import com.devinhouse.agro.services.FazendaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping
@RestController
public class FazendaController {
    final FazendaService fazendasService;
    final EmpresaService empresaService;

    public FazendaController(FazendaService fazendasService, EmpresaService empresaService) {
        this.fazendasService = fazendasService;
        this.empresaService = empresaService;
    }
    @GetMapping
    public String fazendas() {
        return "Fazendas";
    }

    @GetMapping("/todos")
    public List<Fazendas> listafazenda() {
        return fazendasService.listaFazendas();
    }



    @PostMapping
    public Fazendas adicionarFazenda(@RequestBody FazendaDto fazendaDto) {
        return fazendasService.adicionaFazendas(fazendaDto.converter());
    }


    @PutMapping("/{id}")
    public Fazendas atualizafazendas(
            @PathVariable Long id,
            @RequestBody FazendaDto fazendaDto) {
        return fazendasService.atualizaFazendas(id, fazendaDto.converter());
    }
    @DeleteMapping("/{id}")
    public void deletafazenda(
            @PathVariable Long id) {
        fazendasService.deletaFazenda(id);
    }



    // Retorna a lista de fazendas
    @GetMapping("/suasfazendas/{id}")
    public List<Fazendas> suasfazendas(@PathVariable Long id) {
        return fazendasService.suasfazendas(id);
    }

    //Retorna quantidade de fazendas na empresa
    @GetMapping("/contaempresa/{id}")
    public ResponseEntity<Long> countAllFazendas(@PathVariable Long id){
        Empresas empresa = empresaService.findById(id);
        return ResponseEntity.status(HttpStatus.OK).body(fazendasService.countAllFazendas(empresa));
    }
}
