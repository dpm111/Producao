package br.edu.up.jpa.dominio;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name="motivodescarte")
public class MotivoDescarte {
	
	
	public MotivoDescarte( String nome, Date datamodificacao) {
		super();
		this.nome = nome;
		this.datamodificacao = datamodificacao;
	}

	protected MotivoDescarte() {
	}
	
	@Id
	@GeneratedValue
	@Column(unique=true, nullable=false)
	private short idmotivodescarte;

	@Column(nullable=false, length=50)
	private String nome;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(nullable=false)
	private Date datamodificacao;

	public short getIdmotivodescarte() {
		return idmotivodescarte;
	}

	public void setIdmotivodescarte(short idmotivodescarte) {
		this.idmotivodescarte = idmotivodescarte;
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
		return "MotivoDescarte [idmotivodescarte=" + idmotivodescarte + ", nome=" + nome + ", datamodificacao="
				+ datamodificacao + "]";
	}

	
	
	
}
