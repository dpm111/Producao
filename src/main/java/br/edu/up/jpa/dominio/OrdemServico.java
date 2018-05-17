package br.edu.up.jpa.dominio;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name="ordemservico")
public class OrdemServico {


	public OrdemServico( int idproduto, int qtdordem, int qtdestoque, short qtddescartada,
			Date datainicio, Date datafim, Date qatavencimento, short idmotivodescarte, Date datamodificacao) {
		super();
		this.idproduto = idproduto;
		this.qtdordem = qtdordem;
		this.qtdestoque = qtdestoque;
		this.qtddescartada = qtddescartada;
		this.datainicio = datainicio;
		this.datafim = datafim;
		this.qatavencimento = qatavencimento;
		this.idmotivodescarte = idmotivodescarte;
		this.datamodificacao = datamodificacao;
	}

	protected OrdemServico() {
	}

	@Id
	@GeneratedValue
	@Column(unique=true, nullable=false)
	private int idordemservico;

	@Column(nullable=false)
	private int idproduto;

	@Column(nullable=false)
	private int qtdordem;

	@Column(nullable=false)
	private int qtdestoque;

	@Column(nullable=false)
	private short qtddescartada;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(nullable=false)
	private Date datainicio;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date datafim;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(nullable=false)
	private Date qatavencimento;
	
	@Column
	private short idmotivodescarte;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(nullable=false)
	private Date datamodificacao;



	public int getIdordemservico() {
		return idordemservico;
	}




	public void setIdordemservico(int idordemservico) {
		this.idordemservico = idordemservico;
	}




	public int getIdproduto() {
		return idproduto;
	}




	public void setIdproduto(int idproduto) {
		this.idproduto = idproduto;
	}




	public int getQtdordem() {
		return qtdordem;
	}




	public void setQtdordem(int qtdordem) {
		this.qtdordem = qtdordem;
	}




	public int getQtdestoque() {
		return qtdestoque;
	}




	public void setQtdestoque(int qtdestoque) {
		this.qtdestoque = qtdestoque;
	}




	public short getQtddescartada() {
		return qtddescartada;
	}




	public void setQtddescartada(short qtddescartada) {
		this.qtddescartada = qtddescartada;
	}




	public Date getDatainicio() {
		return datainicio;
	}




	public void setDatainicio(Date datainicio) {
		this.datainicio = datainicio;
	}




	public Date getDatafim() {
		return datafim;
	}




	public void setDatafim(Date datafim) {
		this.datafim = datafim;
	}




	public Date getQatavencimento() {
		return qatavencimento;
	}




	public void setQatavencimento(Date qatavencimento) {
		this.qatavencimento = qatavencimento;
	}




	public short getIdmotivodescarte() {
		return idmotivodescarte;
	}




	public void setIdmotivodescarte(short idmotivodescarte) {
		this.idmotivodescarte = idmotivodescarte;
	}




	public Date getDatamodificacao() {
		return datamodificacao;
	}




	public void setDatamodificacao(Date datamodificacao) {
		this.datamodificacao = datamodificacao;
	}




	@Override
	public String toString() {
		return "OrdemServico [idordemservico=" + idordemservico + ", idproduto=" + idproduto + ", qtdordem=" + qtdordem
				+ ", qtdestoque=" + qtdestoque + ", qtddescartada=" + qtddescartada + ", datainicio=" + datainicio
				+ ", datafim=" + datafim + ", qatavencimento=" + qatavencimento + ", idmotivodescarte="
				+ idmotivodescarte + ", datamodificacao=" + datamodificacao + "]";
	}
	
}
