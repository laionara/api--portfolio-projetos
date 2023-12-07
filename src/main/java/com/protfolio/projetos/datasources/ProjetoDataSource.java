package com.protfolio.projetos.datasources;

import com.protfolio.projetos.datasources.mapper.ProjetoMapper;
import com.protfolio.projetos.datasources.sql.PessoaRepository;
import com.protfolio.projetos.datasources.sql.ProjetoRepository;
import com.protfolio.projetos.entities.data.Projeto;
import com.protfolio.projetos.entities.dto.ProjetoDTO;
import com.protfolio.projetos.repositories.ProjetoRepositorie;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
@Getter
public class ProjetoDataSource implements ProjetoRepositorie {
    @Autowired
    private ProjetoRepository projetoRepository;

    @Autowired
    private PessoaRepository pessoaRepository;

    private final ProjetoMapper projetoMapper;

    public ProjetoDataSource(ProjetoMapper projetoMapper) {
        this.projetoMapper = projetoMapper;
    }


    @Override
    public Projeto cadastrar(ProjetoDTO projetoDTO) {

        var projeto = projetoMapper.mapToProjeto(projetoDTO);
        projeto.setGerente(pessoaRepository.save(projeto.getGerente()));

        return projetoRepository.save(projeto);

    }

    @Override
    public void excluir(Projeto projeto) {
        projetoRepository.delete(projeto);
    }

    @Override
    public Optional<Projeto> getProjetoById(Long id) {
        return projetoRepository.findById(id);
    }

    @Override
    public List<Projeto> getProjetos() {
        return projetoRepository.findAll();
    }
}
