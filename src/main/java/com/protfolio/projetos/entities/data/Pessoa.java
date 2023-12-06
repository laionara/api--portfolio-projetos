package com.protfolio.projetos.entities.data;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity(name = "Pessoa")
@Table(name = "pessoa")
public class Pessoa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nome")
    private String nome ;
    @Column(name = "data_nascimento")
    private LocalDate dataNascimento;
    @Column(name = "cpf")
    private String cpf ;
    @Column(name = "funcionario")
    private String funcionario;

}
