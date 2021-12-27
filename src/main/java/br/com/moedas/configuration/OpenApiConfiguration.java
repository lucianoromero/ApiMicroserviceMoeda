package br.com.moedas.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class OpenApiConfiguration {
	
	@Bean
	public OpenAPI customOpenAPI() {
		return new OpenAPI()
				.components(new Components())
				.info(new Info()
						.title("Cambio Service API")
						.description("Microsserviço que retorna o valor atual das principais moedas comparada ao valor do real")
						.version("v1")
						.license(
								new License()
								.name("Apache 2.0")
								.url("http://springdoc.org")
								)
						.contact(new Contact()
								.name("Luciano Romero")
								.email("lucianoluizromero@gmail.com")
								.url("https://www.linkedin.com/in/luciano-luiz-romero-6818bbb3")
								)
						);
	}

}


