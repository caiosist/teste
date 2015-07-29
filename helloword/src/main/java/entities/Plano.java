package entities;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Plano {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(length = 40)
	private String descricao;

	@Column
	private Float valor;

	@Column
	private Integer numeroCaminhoes;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Float getValor() {
		return valor;
	}

	public void setValor(Float valor) {
		this.valor = valor;
	}

	public Integer getNumeroCaminhoes() {
		return numeroCaminhoes;
	}

	public void setNumeroCaminhoes(Integer numeroCaminhoes) {
		this.numeroCaminhoes = numeroCaminhoes;
	}

}
