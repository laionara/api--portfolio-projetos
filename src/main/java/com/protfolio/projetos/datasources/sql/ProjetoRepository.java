package com.protfolio.projetos.datasources.sql;

import com.protfolio.projetos.entities.data.Projeto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface ProjetoRepository extends JpaRepository<Projeto, Long> {


}
