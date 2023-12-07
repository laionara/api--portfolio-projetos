package com.protfolio.projetos.repositories;

import com.protfolio.projetos.entities.data.Pessoa;
import com.protfolio.projetos.entities.data.Projeto;
import com.protfolio.projetos.entities.dto.PessoaDTO;
import com.protfolio.projetos.entities.dto.ProjetoDTO;
import org.springframework.stereotype.Component;

@Component
public interface PessoaRepositorie {

    Pessoa cadastrar(PessoaDTO pessoaDTO);

}
