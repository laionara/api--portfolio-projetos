package com.protfolio.projetos.entities.dto;

import com.protfolio.projetos.entities.enun.RiscoEnum;
import com.protfolio.projetos.entities.enun.StatusEnum;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

public record ProjetoDTO(String nome, LocalDate dataInicio,
                         LocalDate dataPrevisaoFim, LocalDate dataFim,
                         String descricao, StatusEnum status,
                         BigDecimal orcamento,
                         RiscoEnum risco,
                         PessoaDTO gerente) {
}
