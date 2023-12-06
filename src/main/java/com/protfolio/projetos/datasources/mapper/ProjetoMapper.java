package com.protfolio.projetos.datasources.mapper;

import com.protfolio.projetos.entities.data.Projeto;
import com.protfolio.projetos.entities.dto.ProjetoDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;


@Mapper(componentModel="spring")
public interface ProjetoMapper {

    ProjetoMapper INSTANCE = Mappers.getMapper(ProjetoMapper.class);

    Projeto mapToProjeto(ProjetoDTO projetoDTO);

}
