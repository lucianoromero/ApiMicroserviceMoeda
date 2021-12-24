package br.com.moedas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.moedas.dto.ResponseDTO;
import br.com.moedas.service.ConsultaMoedasServices;

@RestController
@RequestMapping("/v1")
public class MoedaController {

	@Autowired
	private ConsultaMoedasServices consultaMoedasServices;

	@GetMapping
	public ResponseDTO listaMoedas(){
		return consultaMoedasServices.Consultar();
	}

}
