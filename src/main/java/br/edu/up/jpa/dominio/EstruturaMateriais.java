package br.edu.up.jpa.dominio;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name="estruturamateriais")
public class EstruturaMateriais {

	
	


	public EstruturaMateriais(int idestruturamateriais, int idprodutomontado, int idcomponente, Date datainicio,
			Date datafim, String idunidademedida, short nivelestrutura, BigDecimal qtdaserproduzida,
			Date datamodificacao) {
		super();
		this.idestruturamateriais = idestruturamateriais;
		this.idprodutomontado = idprodutomontado;
		this.idcomponente = idcomponente;
		this.datainicio = datainicio;
		this.datafim = datafim;
		this.idunidademedida = idunidademedida;
		this.nivelestrutura = nivelestrutura;
		this.qtdaserproduzida = qtdaserproduzida;
		this.datamodificacao = datamodificacao;
	}
	protected EstruturaMateriais() {
	}

	@Id
	@GeneratedValue
	@Column(name ="idestruturamateriais",unique=true, nullable=false)
	private int idestruturamateriais;
	
	@Column(name ="idprodutomontado",unique=true, nullable=false)
	private int idprodutomontado;
	
	@Column(name ="idcomponente",unique=true, nullable=false)
	private int idcomponente;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name ="datainicio",nullable=false)
	private Date datainicio;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name ="datafim")
	private Date datafim;
	
	@Column(name ="idunidademedida",unique=true, nullable=false, length=3)
	private String idunidademedida;

	@Column(name ="nivelestrutura",nullable=false)
	private short nivelestrutura;
	
	@Column(name ="qtdaserproduzida",nullable=false, precision=10, scale=2)
	private BigDecimal qtdaserproduzida;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name ="datamodificacao",nullable=false)
	private Date datamodificacao;

	public int getIdestruturamateriais() {
		return idestruturamateriais;
	}

	public void setIdestruturamateriais(int idestruturamateriais) {
		this.idestruturamateriais = idestruturamateriais;
	}

	public int getIdprodutomontado() {
		return idprodutomontado;
	}

	public void setIdprodutomontado(int idprodutomontado) {
		this.idprodutomontado = idprodutomontado;
	}

	public int getIdcomponente() {
		return idcomponente;
	}

	public void setIdcomponente(int idcomponente) {
		this.idcomponente = idcomponente;
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

	public String getIdunidademedida() {
		return idunidademedida;
	}

	public void setIdunidademedida(String idunidademedida) {
		this.idunidademedida = idunidademedida;
	}

	public short getNivelestrutura() {
		return nivelestrutura;
	}

	public void setNivelestrutura(short nivelestrutura) {
		this.nivelestrutura = nivelestrutura;
	}

	public BigDecimal getQtdaserproduzida() {
		return qtdaserproduzida;
	}

	public void setQtdaserproduzida(BigDecimal qtdaserproduzida) {
		this.qtdaserproduzida = qtdaserproduzida;
	}

	public Date getDatamodificacao() {
		return datamodificacao;
	}

	public void setDatamodificacao(Date datamodificacao) {
		this.datamodificacao = datamodificacao;
	}

	@Override
	public String toString() {
		return "EstruturaMateriais [idestruturamateriais=" + idestruturamateriais + ", idprodutomontado="
				+ idprodutomontado + ", idcomponente=" + idcomponente + ", datainicio=" + datainicio + ", datafim="
				+ datafim + ", idunidademedida=" + idunidademedida + ", nivelestrutura=" + nivelestrutura
				+ ", qtdaserproduzida=" + qtdaserproduzida + ", datamodificacao=" + datamodificacao + "]";
	}





	
	
}
