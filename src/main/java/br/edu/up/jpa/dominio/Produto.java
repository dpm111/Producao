package br.edu.up.jpa.dominio;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name="produto")
public class Produto {
	
	
	public Produto( Date datamodificacao, byte fazerflag, byte itensfinalizadosflag, String nome,
			String numeroproduto) {
		super();
		this.datamodificacao = datamodificacao;
		this.fazerflag = fazerflag;
		this.itensfinalizadosflag = itensfinalizadosflag;
		this.nome = nome;
		this.numeroproduto = numeroproduto;
	}

	protected Produto() {
	}
	@Id
	@GeneratedValue
	@Column(unique=true, nullable=false)
	private int idproduto;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(nullable=false)
	private Date datamodificacao;

	@Column(nullable=false)
	private byte fazerflag;

	@Column(nullable=false)
	private byte itensfinalizadosflag;

	@Column(nullable=false, length=50)
	private String nome;

	@Column(nullable=false, length=25)
	private String numeroproduto;

	public int getIdproduto() {
		return idproduto;
	}

	public void setIdproduto(int idproduto) {
		this.idproduto = idproduto;
	}

	public Date getDatamodificacao() {
		return datamodificacao;
	}

	public void setDatamodificacao(Date datamodificacao) {
		this.datamodificacao = datamodificacao;
	}

	public byte getFazerflag() {
		return fazerflag;
	}

	public void setFazerflag(byte fazerflag) {
		this.fazerflag = fazerflag;
	}

	public byte getItensfinalizadosflag() {
		return itensfinalizadosflag;
	}

	public void setItensfinalizadosflag(byte itensfinalizadosflag) {
		this.itensfinalizadosflag = itensfinalizadosflag;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNumeroproduto() {
		return numeroproduto;
	}

	public void setNumeroproduto(String numeroproduto) {
		this.numeroproduto = numeroproduto;
	}

	@Override
	public String toString() {
		return "Produto [idproduto=" + idproduto + ", datamodificacao=" + datamodificacao + ", fazerflag=" + fazerflag
				+ ", itensfinalizadosflag=" + itensfinalizadosflag + ", nome=" + nome + ", numeroproduto="
				+ numeroproduto + "]";
	}
	
}
