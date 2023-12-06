package com.protfolio.projetos.interactors;

import com.protfolio.projetos.entities.dto.ProjetoDTO;
import com.protfolio.projetos.repositories.ProjetoRepositorie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjetoUseCase {
    @Autowired
    private ProjetoRepositorie projetoRepositorie;

    public void cadastrar(ProjetoDTO projeto){

        projetoRepositorie.cadastrar(projeto);

    }
}
