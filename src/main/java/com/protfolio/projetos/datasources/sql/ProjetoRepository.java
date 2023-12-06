package com.protfolio.projetos.datasources.sql;

import com.protfolio.projetos.entities.data.Projeto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjetoRepository extends JpaRepository<Projeto, Long> {


}
