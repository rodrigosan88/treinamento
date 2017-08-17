package br.jus.cnj.pje.cepservice.model.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@Entity
@Table(name = "tb_estado")
@XmlAccessorType(XmlAccessType.NONE)
@SequenceGenerator(allocationSize = 1, name = "gen_estado", sequenceName = "sq_tb_estado")
public class Estado implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	private int idEstado;
	private String codEstado;
	private String estado;
	private Boolean ativo;

	public Estado() {
	}

	@Id
	@GeneratedValue(generator = "gen_estado")
	@Column(name = "id_estado", unique = true, nullable = false)
	public int getIdEstado() {
		return this.idEstado;
	}

	public void setIdEstado(int idEstado) {
		this.idEstado = idEstado;
	}

	@Column(name = "ds_estado", length = 30)
	@XmlElement
	public String getEstado() {
		return this.estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	@Column(name = "cd_estado", length = 2)
	@XmlElement
	public String getCodEstado() {
		return this.codEstado;
	}

	public void setCodEstado(String codEstado) {
		this.codEstado = codEstado;
	}

	@Column(name = "in_ativo", nullable = false)
	@NotNull
	public Boolean getAtivo() {
		return this.ativo;
	}

	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}

	@Override
	public String toString() {
		return estado;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idEstado;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Estado))
			return false;
		Estado other = (Estado) obj;
		if (this.getIdEstado() != other.getIdEstado())
			return false;
		return true;
	}

}