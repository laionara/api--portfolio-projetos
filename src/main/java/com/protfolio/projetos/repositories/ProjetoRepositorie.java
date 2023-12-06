package com.protfolio.projetos.repositories;

import com.protfolio.projetos.entities.dto.ProjetoDTO;
import org.springframework.stereotype.Component;

@Component
public interface ProjetoRepositorie {

    void cadastrar(ProjetoDTO projetoDTO);
}
