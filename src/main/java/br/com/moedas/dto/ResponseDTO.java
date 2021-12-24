package br.com.moedas.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class ResponseDTO {

	@JsonProperty("STATUS")
	private String status;

	@JsonProperty("USDBRL")
	private MoedaDTO dolar;

	@JsonProperty("EURBRL")
	private MoedaDTO euro;

	@JsonProperty("USDBRL")
	public MoedaDTO getDolar() {
		return dolar;
	}

	@JsonProperty("USDBRL")
	public void setDolar(MoedaDTO dolar) {
		this.dolar = dolar;
	}

	@JsonProperty("EURBRL")
	public MoedaDTO getEuro() {
		return euro;
	}

	@JsonProperty("EURBRL")
	public void setEuro(MoedaDTO euro) {
		this.euro = euro;
	}

	@JsonProperty("STATUS")
	public String getStatus() {
		return status;
	}

	@JsonProperty("STATUS")
	public void setStatus(String status) {
		this.status = status;
	}
}
