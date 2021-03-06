package com.wine.betest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.wine.betest.dto.LojaDto;

@Entity
@Table(name = "loja")
public class Loja {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private long id;
	@Column(name = "CODIGO_LOJA", nullable = false)
	private String codigoLoja;
	@Column(name = "FAIXA_INICIO", nullable = false, length = 9)
	private String faixaInicio;
	@Column(name = "FAIXA_FIM", nullable = false, length = 9)
	private String faixaFim;

	public Loja() {
	}

	public Loja(LojaDto newLoja) {
		super();
		this.codigoLoja = newLoja.getCodigoLoja();
		this.faixaInicio = newLoja.getFaixaInicio();
		this.faixaFim = newLoja.getFaixaFim();
	}

	public Loja(String codigoLoja, String faixaInicio, String faixaFim) {
		super();
		this.codigoLoja = codigoLoja;
		this.faixaInicio = faixaInicio;
		this.faixaFim = faixaFim;
	}

	public void setFaixaInicio(String faixaInicio) {
		this.faixaInicio = faixaInicio;
	}

	public void setFaixaFim(String faixaFim) {
		this.faixaFim = faixaFim;
	}

	public void setCodigoLoja(String codigoLoja) {
		this.codigoLoja = codigoLoja;
	}

	public long getId() {
		return id;
	}

	public String getCodigoLoja() {
		return codigoLoja;
	}

	public String getFaixaInicio() {
		return faixaInicio;
	}

	public String getFaixaFim() {
		return faixaFim;
	}
}
