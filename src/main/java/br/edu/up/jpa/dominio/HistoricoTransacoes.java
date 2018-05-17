package br.edu.up.jpa.dominio;

import java.util.Date;

import javax.persistence.*;


@Entity
@Table(name="historicotransacoes")
public class HistoricoTransacoes {


	
	
	public HistoricoTransacoes( int idproduto, int idordemreferencia, int idlinhaordemreferencia,
			Date datatransacao, String tipotransacao, int quantidade, float custoreal, Date datamodificacao) {
		super();
		this.idproduto = idproduto;
		this.idordemreferencia = idordemreferencia;
		this.idlinhaordemreferencia = idlinhaordemreferencia;
		this.datatransacao = datatransacao;
		this.tipotransacao = tipotransacao;
		this.quantidade = quantidade;
		this.custoreal = custoreal;
		this.datamodificacao = datamodificacao;
	}

	protected HistoricoTransacoes() {
	}
	
	@Id
	@GeneratedValue
	@Column(unique=true, nullable=false)
	private int idtransacao;

	@Column(nullable=false)
	private int idproduto;

	@Column(nullable=false)
	private int idordemreferencia;
	
	@Column(nullable=false)
	private int idlinhaordemreferencia;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(nullable=false)
	private Date datatransacao;

	@Column(nullable=false, length=1)
	private String tipotransacao;
	
	@Column(nullable=false)
	private int quantidade;

	@Column(nullable=false)
	private float custoreal;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(nullable=false)
	private Date datamodificacao;

	public int getIdtransacao() {
		return idtransacao;
	}

	public void setIdtransacao(int idtransacao) {
		this.idtransacao = idtransacao;
	}

	public int getIdproduto() {
		return idproduto;
	}

	public void setIdproduto(int idproduto) {
		this.idproduto = idproduto;
	}

	public int getIdordemreferencia() {
		return idordemreferencia;
	}

	public void setIdordemreferencia(int idordemreferencia) {
		this.idordemreferencia = idordemreferencia;
	}

	public int getIdlinhaordemreferencia() {
		return idlinhaordemreferencia;
	}

	public void setIdlinhaordemreferencia(int idlinhaordemreferencia) {
		this.idlinhaordemreferencia = idlinhaordemreferencia;
	}

	public Date getDatatransacao() {
		return datatransacao;
	}

	public void setDatatransacao(Date datatransacao) {
		this.datatransacao = datatransacao;
	}

	public String getTipotransacao() {
		return tipotransacao;
	}

	public void setTipotransacao(String tipotransacao) {
		this.tipotransacao = tipotransacao;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public float getCustoreal() {
		return custoreal;
	}

	public void setCustoreal(float custoreal) {
		this.custoreal = custoreal;
	}

	public Date getDatamodificacao() {
		return datamodificacao;
	}

	public void setDatamodificacao(Date datamodificacao) {
		this.datamodificacao = datamodificacao;
	}

	@Override
	public String toString() {
		return "HistoricoTransacoes [idtransacao=" + idtransacao + ", idproduto=" + idproduto + ", idordemreferencia="
				+ idordemreferencia + ", idlinhaordemreferencia=" + idlinhaordemreferencia + ", datatransacao="
				+ datatransacao + ", tipotransacao=" + tipotransacao + ", quantidade=" + quantidade + ", custoreal="
				+ custoreal + ", datamodificacao=" + datamodificacao + "]";
	}



}
