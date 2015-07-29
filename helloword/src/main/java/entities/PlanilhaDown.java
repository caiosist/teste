package entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

public class PlanilhaDown {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(length = 8)
	private String placa;

	@Column
	private Integer categoria;

	@Column
	private Integer categoriaCorreta;

	@Column
	@Temporal(value = TemporalType.DATE)
	private Date data;

	@Column
	@Temporal(value = TemporalType.TIME)
	private Date hora;

	@Column(length = 40)
	private String concessionaria;

	@Column(length = 40)
	private String praca;

	@Column
	private Float valor;

	@Column
	private Float valorCorreto;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public Integer getCategoria() {
		return categoria;
	}

	public void setCategoria(Integer categoria) {
		this.categoria = categoria;
	}

	public Integer getCategoriaCorreta() {
		return categoriaCorreta;
	}

	public void setCategoriaCorreta(Integer categoriaCorreta) {
		this.categoriaCorreta = categoriaCorreta;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Date getHora() {
		return hora;
	}

	public void setHora(Date hora) {
		this.hora = hora;
	}

	public String getConcessionaria() {
		return concessionaria;
	}

	public void setConcessionaria(String concessionaria) {
		this.concessionaria = concessionaria;
	}

	public String getPraca() {
		return praca;
	}

	public void setPraca(String praca) {
		this.praca = praca;
	}

	public Float getValor() {
		return valor;
	}

	public void setValor(Float valor) {
		this.valor = valor;
	}

	public Float getValorCorreto() {
		return valorCorreto;
	}

	public void setValorCorreto(Float valorCorreto) {
		this.valorCorreto = valorCorreto;
	}

}
