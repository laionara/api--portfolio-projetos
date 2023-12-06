package com.protfolio.projetos.entities.data;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity(name = "Projeto")
@Table(name = "projeto")
public class Projeto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nome")
    private String nome ;
    @Column(name = "data_inicio")
    private LocalDate dataInicio;
    @Column(name = "data_previsao_fim")
    private LocalDate dataPrevisaoFim ;
    @Column(name = "data_fim")
    private LocalDate dataFim;
    @Column(name = "descricao")
    private String descricao;
    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private String status ;
    @Column(name = "orcamento")
    private Double orcamento;
    @Column(name = "risco")
    private String risco;
    @Column(name = "id_gerente   ")
    private Long idGerente ;
}
