package com.devinhouse.agro.models;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Entity
@Data
@Table
public class Fazendas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotEmpty(message="Insira um nome")
    @Column(name="nome")
    private String nome;
    @NotEmpty(message="Insira um endereço valido")
    @Column(name="endereco")
    private String endereco;
    @Column(name="capacidadeEstoque")
    private String capacidadeEstoque;
    @ManyToOne
    @JoinColumn(name = "empresa_id")
    private Empresas empresa;
    @JsonFormat(pattern = "DD-MM-AAAA")
    private String UltimaColheita;



}
