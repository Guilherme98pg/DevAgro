package com.devinhouse.agro.models;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name="Funcionarios")
public class Funcionarios {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="nome")
    private String nome;
    @Column(name="sobrenome")
    private String sobrenome;

    @Column(name="cpf")
    private String cpf;
    @Column(name="endereco")
    private String endereco;
    @Column(name="telefone")
    private String telefone;
    @Column(name="sexo")
    private String sexo;
    @Column(name="dataDeNacimento")
    private String dataNascimento;
    @Column(name="dataDeContratacao")
    private String dataContratacao;
    @ManyToOne
    @JoinColumn(name = "empresa_id")
    private Empresas empresas;

}
