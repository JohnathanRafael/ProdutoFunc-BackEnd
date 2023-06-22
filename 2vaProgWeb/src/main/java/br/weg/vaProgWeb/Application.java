package br.weg.vaProgWeb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;

@SpringBootApplication(scanBasePackages = {
		"br.weg.vaProgWeb.*", // modificar conforme o pacote padrão do seu projeto
		"br.ueg.prog.webi.api.*" //Para funcionamento da Arquitetura
})
@EntityScan(basePackageClasses = { Jsr310JpaConverters.class },
		basePackages = {
				"br.weg.vaProgWeb.*", //modificar conforme o pacote padrão do seu projeto
				"br.ueg.prog.webi.api.*" //Para funcionamento da Arquitetura
})
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}