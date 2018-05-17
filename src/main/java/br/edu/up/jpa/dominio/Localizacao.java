package br.edu.up.jpa.dominio;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name="localizacao")
public class Localizacao {


	public Localizacao(String nome, float variacaovalor, BigDecimal disponibilidade,
			Date datamodificacao) {
		super();
		this.nome = nome;
		this.variacaovalor = variacaovalor;
		this.disponibilidade = disponibilidade;
		this.datamodificacao = datamodificacao;
	}
	
	protected Localizacao() {
	}

	@Id
	@GeneratedValue
	@Column(unique=true, nullable=false)
	private int idlocalizacao;

	@Column(nullable=false, length=50)
	private String nome;

	@Column(nullable=false)
	private float variacaovalor;

	@Column(nullable=false, precision=10, scale=2)
	private BigDecimal disponibilidade;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(nullable=false)
	private Date datamodificacao;

	public int getIdlocalizacao() {
		return idlocalizacao;
	}

	public void setIdlocalizacao(int idlocalizacao) {
		this.idlocalizacao = idlocalizacao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getVariacaovalor() {
		return variacaovalor;
	}

	public void setVariacaovalor(float variacaovalor) {
		this.variacaovalor = variacaovalor;
	}

	public BigDecimal getDisponibilidade() {
		return disponibilidade;
	}

	public void setDisponibilidade(BigDecimal disponibilidade) {
		this.disponibilidade = disponibilidade;
	}

	public Date getDatamodificacao() {
		return datamodificacao;
	}

	public void setDatamodificacao(Date datamodificacao) {
		this.datamodificacao = datamodificacao;
	}

	@Override
	public String toString() {
		return "Localizacao [idlocalizacao=" + idlocalizacao + ", nome=" + nome + ", variacaovalor=" + variacaovalor
				+ ", disponibilidade=" + disponibilidade + ", datamodificacao=" + datamodificacao + "]";
	}



	
}
