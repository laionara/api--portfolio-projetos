package com.protfolio.projetos.entities.dto;

import com.protfolio.projetos.entities.enun.StatusProjeto;

import java.math.BigDecimal;
import java.time.LocalDate;

public record ProjetoDTO(String nome, LocalDate dataInicio,
                         LocalDate dataPrevisao, LocalDate dataFim,
                         String descricao, StatusProjeto status,
                         PessoaDTO pessoa,
                         BigDecimal orcamento, String risco) {
}
