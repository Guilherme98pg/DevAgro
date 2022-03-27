package com.devinhouse.agro.controllers.dto;

import com.devinhouse.agro.models.Empresas;
import com.devinhouse.agro.models.Fazendas;

public class FazendaDto {
    private String nome;
    private String endereco;
    private String capacidadeEstoque;
    private Empresas empresa;
    private String ultimaColheita;

    public Fazendas converter() {
        Fazendas fazendas = new Fazendas();
        fazendas.setNome(nome);
        fazendas.setEndereco(endereco);
        fazendas.setCapacidadeEstoque(capacidadeEstoque);
        fazendas.setEmpresa(empresa);
        fazendas.setUltimaColheita(ultimaColheita);

        return fazendas;
    }
}
