package com.protfolio.projetos.interactors.mapper;

import com.protfolio.projetos.entities.data.Projeto;
import com.protfolio.projetos.entities.dto.ProjetoDTO;
import com.protfolio.projetos.entities.dto.ProjetoResponseDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;


@Mapper(componentModel="spring")
public interface ProjetoResponseMapper {

    ProjetoResponseMapper INSTANCE = Mappers.getMapper(ProjetoResponseMapper.class);

    ProjetoResponseDTO mapToProjetoResponseDTO(Projeto projeto);

    List<ProjetoResponseDTO> mapToListProjetoResponseDTO(List<Projeto> projetos);
}
