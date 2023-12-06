package com.protfolio.projetos.transportlayers;

import com.protfolio.projetos.entities.dto.ProjetoDTO;
import com.protfolio.projetos.interactors.ProjetoUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("portfolio")
public class projetoController {

    @Autowired
    private ProjetoUseCase projetoUseCase;

    @PostMapping(value = "/cadastrar")
    public void cadastrar(@RequestBody ProjetoDTO projetoDTO){

        projetoUseCase.cadastrar(projetoDTO);

    }


}
