package com.protfolio.projetos.Interactors;


import com.protfolio.projetos.entities.enun.StatusEnum;
import com.protfolio.projetos.interactors.ProjetoUseCase;
import com.protfolio.projetos.interactors.exception.BusinessException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class ProjetoUseCaseTest {

    @InjectMocks
    ProjetoUseCase instancia;
    @Test
    public void test_validarExclusaoStatusIniciado(){
        Assertions.assertThrows(BusinessException.class, () -> instancia.validarExclusao(StatusEnum.INICIADO));
    }

    @Test
    public void test_validarExclusaoStatusEmAndamento(){
        Assertions.assertThrows(BusinessException.class, () -> instancia.validarExclusao(StatusEnum.EM_ANDAMENTO));
    }

    @Test
    public void test_validarExclusaoStatusEncerrado(){
        Assertions.assertThrows(BusinessException.class, () -> instancia.validarExclusao(StatusEnum.ENCERRADO));
    }


}

