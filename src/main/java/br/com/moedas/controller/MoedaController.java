package br.com.moedas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.moedas.dto.ResponseDTO;
import br.com.moedas.service.ConsultaMoedasServices;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "Cambio Service API")
@RestController
@RequestMapping("/v1")
public class MoedaController {

	@Autowired
	private ConsultaMoedasServices consultaMoedasServices;

	@Operation(description = "Retorno Cambio USD-BRL e EUR-BRL")
	@ApiResponses(value = {
		    @ApiResponse(responseCode = "200", description = "Operação realizada com sucesso"),
		})
	@GetMapping
	public ResponseDTO listaMoedas(){
		return consultaMoedasServices.Consultar();
	}

}
