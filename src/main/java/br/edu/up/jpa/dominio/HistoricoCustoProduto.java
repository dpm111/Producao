package br.edu.up.jpa.dominio;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name="historicocustoproduto")
public class HistoricoCustoProduto{
	
	
	
	public HistoricoCustoProduto( int idproduto, Date datainicio, Date datafim,
			float custopadrao, Date datamodificacao) {
		super();
		
		this.idproduto = idproduto;
		this.datainicio = datainicio;
		this.datafim = datafim;
		this.custopadrao = custopadrao;
		this.datamodificacao = datamodificacao;
	}

	protected HistoricoCustoProduto() {
    }

	@Id
	@GeneratedValue
	@Column(unique=true, nullable=false)
	private int idhistoricocustoproduto;
	
	@Column(nullable=false)
	private int idproduto;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(nullable=false)
	private Date datainicio;

	@Temporal(TemporalType.TIMESTAMP)
	private Date datafim;

	@Column(nullable=false)
	private float custopadrao;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(nullable=false)
	private Date datamodificacao;

	public int getIdhistoricocustoproduto() {
		return idhistoricocustoproduto;
	}

	public void setIdhistoricocustoproduto(int idhistoricocustoproduto) {
		this.idhistoricocustoproduto = idhistoricocustoproduto;
	}

	public int getIdproduto() {
		return idproduto;
	}

	public void setIdproduto(int idproduto) {
		this.idproduto = idproduto;
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

	public float getCustopadrao() {
		return custopadrao;
	}

	public void setCustopadrao(float custopadrao) {
		this.custopadrao = custopadrao;
	}

	public Date getDatamodificacao() {
		return datamodificacao;
	}

	public void setDatamodificacao(Date datamodificacao) {
		this.datamodificacao = datamodificacao;
	}

	@Override
	public String toString() {
		return "HistoricoCustoProduto [idhistoricocustoproduto=" + idhistoricocustoproduto + ", idproduto=" + idproduto
				+ ", datainicio=" + datainicio + ", datafim=" + datafim + ", custopadrao=" + custopadrao
				+ ", datamodificacao=" + datamodificacao + "]";
	}

	
	 
	

}
