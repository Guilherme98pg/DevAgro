package com.devinhouse.agro.controllers.dto;



import com.devinhouse.agro.models.Empresas;
import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
public class EmpresaDto {
    private String nome;
    private String cnpj;
    private String endereco;


    public Empresas converter(){
        Empresas empresa = new Empresas();
        empresa.setNome(nome);
        empresa.setCnpj(cnpj);
        empresa.setEndereco(endereco);
        return empresa;

    }
}

