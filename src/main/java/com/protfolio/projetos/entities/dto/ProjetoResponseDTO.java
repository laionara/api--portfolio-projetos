package com.protfolio.projetos.entities.dto;

import com.protfolio.projetos.entities.enun.StatusEnum;

public record ProjetoResponseDTO(Long id, String nome, String descricao, StatusEnum status) {
}
