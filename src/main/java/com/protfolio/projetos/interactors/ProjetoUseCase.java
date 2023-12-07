package com.protfolio.projetos.interactors;

import com.protfolio.projetos.entities.data.Projeto;
import com.protfolio.projetos.entities.dto.ProjetoDTO;
import com.protfolio.projetos.entities.dto.ProjetoResponseDTO;
import com.protfolio.projetos.entities.enun.StatusEnum;
import com.protfolio.projetos.interactors.exception.BusinessException;
import com.protfolio.projetos.interactors.mapper.ProjetoResponseMapper;
import com.protfolio.projetos.repositories.ProjetoRepositorie;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjetoUseCase {
    @Autowired
    private ProjetoRepositorie projetoRepositorie;

    private final ProjetoResponseMapper projetoResponseMapper;

    public ProjetoUseCase(ProjetoResponseMapper projetoMapper) {
        this.projetoResponseMapper = projetoMapper;
    }

    @Transactional
    public ProjetoResponseDTO cadastrar(ProjetoDTO projetoDTO) throws BusinessException {
        if(projetoDTO.status()==null){
            throw new BusinessException("É necessário adicionar Status ao projeto");
        }
      return projetoResponseMapper.mapToProjetoResponseDTO(projetoRepositorie.cadastrar(projetoDTO));

    }

    public boolean delete(Long id) {
        var projeto = projetoRepositorie.getProjetoById(id);
        if(projeto.isEmpty()){
            return false;
        }
        this.validarExclusao(projeto.get().getStatus());
        projetoRepositorie.excluir(projeto.get());
        return true;
    }

    public void validarExclusao(StatusEnum status){
        if (StatusEnum.INICIADO.equals(status)
                || StatusEnum.EM_ANDAMENTO.equals(status)
                || StatusEnum.ENCERRADO.equals(status)){
            throw new BusinessException("O Projeto não pode ser excluído");
        }
    }

    public List<ProjetoResponseDTO> getProjetos() {
        return projetoResponseMapper.mapToListProjetoResponseDTO(projetoRepositorie.getProjetos());

    }

    public ProjetoResponseDTO alterar(Long id, ProjetoDTO projetoDTO) {
        var projeto = projetoRepositorie.getProjetoById(id);
        if(projeto.isEmpty()){
            throw new BusinessException("Projeto não encontrado ");
        }
        return projetoResponseMapper.mapToProjetoResponseDTO(projetoRepositorie.alterar(buildProjeto(projeto.get(), projetoDTO)));

    }

    public Projeto buildProjeto(Projeto projeto, ProjetoDTO dto){
        projeto.setNome(dto.nome());
        projeto.setDescricao(dto.descricao());
        projeto.setDataFim(dto.dataFim());
        projeto.setDataPrevisaoFim(dto.dataPrevisaoFim());
        projeto.setDataInicio(dto.dataInicio());

        return projeto;

    }

    public ProjetoResponseDTO associarMembros(ProjetoDTO projetoDTO) {
        return projetoResponseMapper.mapToProjetoResponseDTO(projetoRepositorie.associar(projetoDTO));
    }
}
