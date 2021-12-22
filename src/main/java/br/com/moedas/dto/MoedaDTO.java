package br.com.moedas.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MoedaDTO {

	@JsonProperty("code")
	private String code;
	@JsonProperty("codein")
	private String codein;
	@JsonProperty("name")
	private String name;
	@JsonProperty("high")
	private String high;
	@JsonProperty("low")
	private String low;
	@JsonProperty("varBid")
	private String varBid;
	@JsonProperty("pctChange")
	private String pctChange;
	@JsonProperty("bid")
	private String bid;
	@JsonProperty("ask")
	private String ask;
	@JsonProperty("timestamp")
	private String timestamp;
	@JsonProperty("create_date")
	private String create_date;

	@JsonProperty("code")
	public String getCode() {
		return code;
	}

	@JsonProperty("code")
	public void setCode(String code) {
		this.code = code;
	}

	@JsonProperty("codein")
	public String getCodein() {
		return codein;
	}

	@JsonProperty("codein")
	public void setCodein(String codein) {
		this.codein = codein;
	}

	@JsonProperty("name")
	public String getName() {
		return name;
	}

	@JsonProperty("name")
	public void setName(String name) {
		this.name = name;
	}

	@JsonProperty("high")
	public String getHigh() {
		return high;
	}

	@JsonProperty("high")
	public void setHigh(String high) {
		this.high = high;
	}

	@JsonProperty("low")
	public String getLow() {
		return low;
	}

	@JsonProperty("low")
	public void setLow(String low) {
		this.low = low;
	}

	@JsonProperty("varBid")
	public String getVarBid() {
		return varBid;
	}

	@JsonProperty("varBid")
	public void setVarBid(String varBid) {
		this.varBid = varBid;
	}

	@JsonProperty("pctChange")
	public String getPctChange() {
		return pctChange;
	}

	@JsonProperty("pctChange")
	public void setPctChange(String pctChange) {
		this.pctChange = pctChange;
	}

	@JsonProperty("bid")
	public String getBid() {
		return bid;
	}

	@JsonProperty("bid")
	public void setBid(String bid) {
		this.bid = bid;
	}

	@JsonProperty("ask")
	public String getAsk() {
		return ask;
	}

	@JsonProperty("ask")
	public void setAsk(String ask) {
		this.ask = ask;
	}

	@JsonProperty("timestamp")
	public String getTimestamp() {
		return timestamp;
	}

	@JsonProperty("timestamp")
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	@JsonProperty("create_date")
	public String getCreate_date() {
		return create_date;
	}

	@JsonProperty("create_date")
	public void setCreate_date(String create_date) {
		this.create_date = create_date;
	}

}
