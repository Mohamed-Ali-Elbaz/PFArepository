package com.emsi.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Contact")
public class Contact {
	@Id
	@GeneratedValue
	private Integer id_contact;
	private String nom;
	private String num;
	public int getId_contact() {
		return id_contact;
	}
	public void setId_contact(int id_contact) {
		this.id_contact = id_contact;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	

}
