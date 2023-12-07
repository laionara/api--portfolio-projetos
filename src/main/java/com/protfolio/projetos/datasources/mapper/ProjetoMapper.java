package com.protfolio.projetos.datasources.mapper;

import com.protfolio.projetos.entities.data.Projeto;
import com.protfolio.projetos.entities.dto.ProjetoDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;


@Mapper(componentModel="spring")
public interface ProjetoMapper {


   Projeto mapToProjeto(ProjetoDTO projetoDTO);

}
