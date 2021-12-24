package br.com.moedas.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.com.moedas.dto.ResponseDTO;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@Service
public class ConsultaMoedasServices {

	private static final String BASEURL = "http://economia.awesomeapi.com.br/json/last";
	private ResponseDTO responseDTO;

	@CircuitBreaker(name = "defaul", fallbackMethod = "fallbackMethod")
	public ResponseDTO Consultar() {
		responseDTO = null;
		ResponseEntity<ResponseDTO> responseEntity = new RestTemplate().getForEntity(BASEURL + "/USD-BRL,EUR-BRL",
				ResponseDTO.class);
		responseDTO = responseEntity.getBody();
		responseDTO.setStatus("Consulta realizada com sucesso");
		return responseDTO;
	}

	public ResponseDTO fallbackMethod(Exception ex) {
		ResponseDTO responseDTO = new ResponseDTO();
		responseDTO.setStatus("Problemas de conexao com a API- economia.awesomeapi.com.br -");
		return responseDTO;
	}
}
