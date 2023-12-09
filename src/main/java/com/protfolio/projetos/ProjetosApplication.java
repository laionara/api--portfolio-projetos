package com.protfolio.projetos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackages={"src/main/resources/templates/"})
public class ProjetosApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetosApplication.class, args);
	}

}
