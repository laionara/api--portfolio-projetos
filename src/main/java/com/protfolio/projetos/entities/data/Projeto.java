package com.protfolio.projetos.entities.data;

import com.protfolio.projetos.entities.dto.ProjetoDTO;
import com.protfolio.projetos.entities.enun.RiscoEnum;
import com.protfolio.projetos.entities.enun.StatusEnum;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "projeto")
@Getter
@Setter
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
    private StatusEnum status ;
    @Column(name = "orcamento")
    private BigDecimal orcamento;
    @Enumerated(EnumType.STRING)
    @Column(name = "risco")
    private RiscoEnum risco;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_gerente")
    private Pessoa gerente ;

    @ManyToMany
    @JoinTable(
            name = "membros",
            joinColumns = @JoinColumn(name = "idprojeto", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "idpessoa", referencedColumnName = "id"))
    private List<Pessoa> pessoas;



}
