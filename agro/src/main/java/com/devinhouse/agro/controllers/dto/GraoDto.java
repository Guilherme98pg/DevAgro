package com.devinhouse.agro.controllers.dto;


import com.devinhouse.agro.models.Empresas;
import com.devinhouse.agro.models.Grao;



public class GraoDto {

    private String nome;
    private String tempoDeColheita;
    private Empresas empresa;

    public Grao converter() {
        Grao grao = new Grao();
        grao.setNome(nome);
        grao.setTempoDeColheita(tempoDeColheita);
        grao.setEmpresa(empresa);
        return grao;
    }
}
