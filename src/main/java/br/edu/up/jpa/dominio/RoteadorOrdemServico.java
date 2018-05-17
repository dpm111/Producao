package br.edu.up.jpa.dominio;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "roteadorordemservico")
public class RoteadorOrdemServico {

	
	public RoteadorOrdemServico(int idordemservico, int idproduto, int sequenciaoperacao, Date datainicioagendada,
			Date datafimagendada, Date datainicioreal, Date datafimreal, BigDecimal recursoshrsreal,
			float custoplanejado, float custoreal, Date datamodificacao) {
		super();
		this.idordemservico = idordemservico;
		this.idproduto = idproduto;
		this.sequenciaoperacao = sequenciaoperacao;
		this.datainicioagendada = datainicioagendada;
		this.datafimagendada = datafimagendada;
		this.datainicioreal = datainicioreal;
		this.datafimreal = datafimreal;
		this.recursoshrsreal = recursoshrsreal;
		this.custoplanejado = custoplanejado;
		this.custoreal = custoreal;
		this.datamodificacao = datamodificacao;
	}

	protected RoteadorOrdemServico() {
	}
	
	@Id
	@Column(unique=true, nullable=false)
	private int idordemservico;

	@Column(nullable=false)
	private int idproduto;
	
	@Column(nullable=false)
	private int sequenciaoperacao;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(nullable=false)
	private Date datainicioagendada;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(nullable=false)
	private Date datafimagendada;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(nullable=true)
	private Date datainicioreal;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(nullable=true)
	private Date datafimreal;
	
	@Column(nullable=true, precision=9, scale=4)
	private BigDecimal recursoshrsreal;
	
	@Column(nullable=false)
	private float custoplanejado;
	
	@Column(nullable=true)
	private float custoreal;
	
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

	public int getSequenciaoperacao() {
		return sequenciaoperacao;
	}

	public void setSequenciaoperacao(int sequenciaoperacao) {
		this.sequenciaoperacao = sequenciaoperacao;
	}

	public Date getDatainicioagendada() {
		return datainicioagendada;
	}

	public void setDatainicioagendada(Date datainicioagendada) {
		this.datainicioagendada = datainicioagendada;
	}

	public Date getDatafimagendada() {
		return datafimagendada;
	}

	public void setDatafimagendada(Date datafimagendada) {
		this.datafimagendada = datafimagendada;
	}

	public Date getDatainicioreal() {
		return datainicioreal;
	}

	public void setDatainicioreal(Date datainicioreal) {
		this.datainicioreal = datainicioreal;
	}

	public Date getDatafimreal() {
		return datafimreal;
	}

	public void setDatafimreal(Date datafimreal) {
		this.datafimreal = datafimreal;
	}

	public BigDecimal getRecursoshrsreal() {
		return recursoshrsreal;
	}

	public void setRecursoshrsreal(BigDecimal recursoshrsreal) {
		this.recursoshrsreal = recursoshrsreal;
	}

	public float getCustoplanejado() {
		return custoplanejado;
	}

	public void setCustoplanejado(float custoplanejado) {
		this.custoplanejado = custoplanejado;
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
		return "RoteadorOrdemServico [idordemservico=" + idordemservico + ", idproduto=" + idproduto
				+ ", sequenciaoperacao=" + sequenciaoperacao + ", datainicioagendada=" + datainicioagendada
				+ ", datafimagendada=" + datafimagendada + ", datainicioreal=" + datainicioreal + ", datafimreal="
				+ datafimreal + ", recursoshrsreal=" + recursoshrsreal + ", custoplanejado=" + custoplanejado
				+ ", custoreal=" + custoreal + ", datamodificacao=" + datamodificacao + "]";
	}

}
