package com.protfolio.projetos.repositories;

import com.protfolio.projetos.entities.data.Projeto;
import com.protfolio.projetos.entities.dto.ProjetoDTO;
import com.protfolio.projetos.entities.dto.ProjetoResponseDTO;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public interface ProjetoRepositorie {

    Projeto cadastrar(ProjetoDTO projetoDTO);
    void excluir(Projeto projeto);

    Optional<Projeto> getProjetoById(Long id);

    List<Projeto> getProjetos() ;

    Projeto alterar(Projeto projeto);


    Projeto associar(ProjetoDTO projetoDTO);
}
