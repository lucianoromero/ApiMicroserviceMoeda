package br.com.moedas.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.com.moedas.dto.ResponseDTO;

@Service
public class ConsultaMoedasServices {

	private static final String BASEURL = "http://economia.awesomeapi.com.br/json/last";

	public ResponseDTO Consultar() {
		ResponseDTO responseDTO = null;
		ResponseEntity<ResponseDTO> responseEntity = new RestTemplate().getForEntity(BASEURL + "/USD-BRL,EUR-BRL",ResponseDTO.class);
		if (responseEntity.getStatusCode().is2xxSuccessful()) {
			responseDTO = responseEntity.getBody();
			responseDTO.setStatus("Consulta realizada com sucesso");
			return responseDTO;
		}
		responseDTO.setStatus("Verificar os parâmetros");
		return responseDTO;
	}

}
