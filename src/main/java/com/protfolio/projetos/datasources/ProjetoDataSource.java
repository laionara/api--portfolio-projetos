package com.protfolio.projetos.datasources;

import com.protfolio.projetos.datasources.mapper.ProjetoMapper;
import com.protfolio.projetos.datasources.sql.ProjetoRepository;
import com.protfolio.projetos.entities.data.Projeto;
import com.protfolio.projetos.entities.dto.ProjetoDTO;
import com.protfolio.projetos.repositories.ProjetoRepositorie;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Getter
public class ProjetoDataSource implements ProjetoRepositorie {
    @Autowired
    private ProjetoRepository projetoRepository;

    private final ProjetoMapper projetoMapper;

    public ProjetoDataSource(ProjetoMapper projetoMapper) {
        this.projetoMapper = projetoMapper;
    }


    @Override
    public void cadastrar(ProjetoDTO projetoDTO) {

        Projeto projeto= this.projetoMapper.INSTANCE.mapToProjeto(projetoDTO);
        projetoRepository.save( this.projetoMapper.INSTANCE.mapToProjeto(projetoDTO));

    }
}
