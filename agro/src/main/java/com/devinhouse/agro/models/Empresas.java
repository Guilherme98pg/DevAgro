package com.devinhouse.agro.models;

import lombok.Data;
import org.hibernate.validator.constraints.br.CNPJ;
import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Data
@Entity
@Table(name="empresa")
public class Empresas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotEmpty(message="Insira o nome da empresa")
    @Column(name="nome")
    private String nome;
    @CNPJ(message="Insira um CNPJ valido")
    @Column(name="cnpj")
    private String cnpj;
    @NotEmpty(message="Insira um endereço valido")
    @Column(name="endereco")
    private String endereco;


}
