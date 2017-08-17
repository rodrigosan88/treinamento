package br.jus.cnj.pje.cepservice.model.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

@Entity
@Table(name = Cep.TABLE_NAME, uniqueConstraints = { @UniqueConstraint(columnNames = { "nr_cep" }) })
@SequenceGenerator(allocationSize = 1, name = "gen_cep", sequenceName = "sq_tb_cep")
public class Cep implements java.io.Serializable {

	public static final String TABLE_NAME = "tb_cep";
	private static final long serialVersionUID = 1L;

	private int idCep;
	private String numeroCep;
	private String nomeLogradouro;
	private String nomeBairro;
	private Municipio municipio;
	private String complemento;
	private Boolean ativo;
	private String numeroEndereco;

	public Cep() {
	}

	@Id
	@GeneratedValue(generator = "gen_cep")
	@Column(name = "id_cep", unique = true, nullable = false)
	public int getIdCep() {
		return this.idCep;
	}

	public void setIdCep(int idCep) {
		this.idCep = idCep;
	}

	@Column(name = "nr_cep", nullable = false, length = 9, unique = true)
	@NotNull
	@Length(max = 9)
	public String getNumeroCep() {
		return this.numeroCep;
	}

	public void setNumeroCep(String numeroCep) {
		this.numeroCep = numeroCep;
	}

	@Column(name = "nm_logradouro", length = 200)
	@Length(max = 200)
	public String getNomeLogradouro() {
		return this.nomeLogradouro;
	}

	public void setNomeLogradouro(String nomeLogradouro) {
		this.nomeLogradouro = nomeLogradouro;
	}

	@Column(name = "nm_bairro", length = 100)
	@Length(max = 100)
	public String getNomeBairro() {
		return this.nomeBairro;
	}

	public void setNomeBairro(String nomeBairro) {
		this.nomeBairro = nomeBairro;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_municipio")
	public Municipio getMunicipio() {
		return municipio;
	}

	public void setMunicipio(Municipio municipio) {
		this.municipio = municipio;
	}

	@Column(name = "ds_complemento", length = 100)
	@Length(max = 100)
	public String getComplemento() {
		return this.complemento;
	}
   
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	@Column(name = "in_ativo", nullable = false)
	@NotNull
	public Boolean getAtivo() {
		return this.ativo;
	}

	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}
	
	@Column(name = "nr_endereco_cep", length = 15)
	@Length(max = 15)
	public String getNumeroEndereco() {
		return numeroEndereco;
	}

	public void setNumeroEndereco(String numeroEndereco) {
		this.numeroEndereco = numeroEndereco;
	}

	@Override
	public String toString() {
		return numeroCep;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((getNumeroCep() == null) ? 0 : numeroCep.hashCode());
		return result;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Cep))
			return false;
		Cep other = (Cep) obj;
		if (getNumeroCep() == null) {
			if (other.getNumeroCep() != null)
				return false;
		} else if (!numeroCep.equals(other.getNumeroCep()))
			return false;
		return true;
	}
}
