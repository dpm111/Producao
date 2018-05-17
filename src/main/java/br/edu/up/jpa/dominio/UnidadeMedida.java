package br.edu.up.jpa.dominio;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name="unidademedida")
public class UnidadeMedida {

	public UnidadeMedida(String idunidademedida, String nome, Date datamodificacao) {
		super();
		this.idunidademedida = idunidademedida;
		this.nome = nome;
		this.datamodificacao = datamodificacao;
	}
	protected UnidadeMedida() {
	}
	
	
	@Id
	@Column(unique=true, nullable=false, length=3)
	private String idunidademedida;

	@Column(nullable=false, length=50)
	private String nome;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(nullable=false)
	private Date datamodificacao;

	public String getIdunidademedida() {
		return idunidademedida;
	}

	public void setIdunidademedida(String idunidademedida) {
		this.idunidademedida = idunidademedida;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDatamodificacao() {
		return datamodificacao;
	}

	public void setDatamodificacao(Date datamodificacao) {
		this.datamodificacao = datamodificacao;
	}

	@Override
	public String toString() {
		return "UnidadeMedida [idunidademedida=" + idunidademedida + ", nome=" + nome + ", datamodificacao="
				+ datamodificacao + "]";
	}

	
	
}
