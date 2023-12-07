package com.protfolio.projetos.transportlayers;

import com.protfolio.projetos.entities.dto.ProjetoDTO;
import com.protfolio.projetos.entities.dto.ProjetoResponseDTO;
import com.protfolio.projetos.interactors.ProjetoUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("portfolio")
public class projetoController {

    @Autowired
    private ProjetoUseCase projetoUseCase;

    @PostMapping(value = "/cadastrar")
    public ResponseEntity<ProjetoResponseDTO> cadastrar(@RequestBody ProjetoDTO projetoDTO){

        return ResponseEntity.status(HttpStatus.CREATED)
                .body(projetoUseCase.cadastrar(projetoDTO));

    }

    @GetMapping(value = "/consultar")
    public ResponseEntity<List<ProjetoResponseDTO>> getProjeto(){

        return ResponseEntity.status(HttpStatus.OK)
                .body(projetoUseCase.getProjetos());

    }

    @DeleteMapping(value = "/excluir/{id}")
    public ResponseEntity<String> excluir(@PathVariable Long id){

        var isRemoved = projetoUseCase.delete(id);

        if (!isRemoved) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>("Projeto excluído com sucesso!", HttpStatus.OK);

    }


}
