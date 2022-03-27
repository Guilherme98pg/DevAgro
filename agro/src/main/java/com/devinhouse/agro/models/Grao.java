package com.devinhouse.agro.models;

import lombok.Data;

import javax.persistence.*;

@Table(name="Grao")
@Data
@Entity
public class Grao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="nome")
    private String nome;
    @Column(name="tempoDeColheita")
    private String tempoDeColheita;
    @ManyToOne
    @JoinColumn(name = "empresa_id")
    private Empresas empresa;

}
