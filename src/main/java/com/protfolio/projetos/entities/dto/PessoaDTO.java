package com.protfolio.projetos.entities.dto;


import java.time.LocalDate;

public record PessoaDTO(String nome, LocalDate dataNascimento, String cpf, boolean funcionario) {
}
