package com.entity;
// Generated 31 d�c. 2018 16:54:55 by Hibernate Tools 5.1.10.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ContactId generated by hbm2java
 */
@Embeddable
public class ContactId implements java.io.Serializable {

	private String nom;
	private Integer tel;

	public ContactId() {
	}

	public ContactId(String nom, Integer tel) {
		this.nom = nom;
		this.tel = tel;
	}

	@Column(name = "nom", length = 254)
	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@Column(name = "tel")
	public Integer getTel() {
		return this.tel;
	}

	public void setTel(Integer tel) {
		this.tel = tel;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ContactId))
			return false;
		ContactId castOther = (ContactId) other;

		return ((this.getNom() == castOther.getNom())
				|| (this.getNom() != null && castOther.getNom() != null && this.getNom().equals(castOther.getNom())))
				&& ((this.getTel() == castOther.getTel()) || (this.getTel() != null && castOther.getTel() != null
						&& this.getTel().equals(castOther.getTel())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getNom() == null ? 0 : this.getNom().hashCode());
		result = 37 * result + (getTel() == null ? 0 : this.getTel().hashCode());
		return result;
	}

}
