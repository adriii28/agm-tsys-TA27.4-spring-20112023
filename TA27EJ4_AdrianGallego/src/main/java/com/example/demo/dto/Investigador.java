package com.example.demo.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="investigadores")
public class Investigador {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_investigador;
	private String dni;
	private String nom_apels;
	
	@ManyToOne
	@JoinColumn(name="codigo_facultad")
	private Facultad facultad;
	
	public Investigador() {

	}

	public Investigador(int id_investigador, String dni, String nom_apels, int codigo_facultad, Facultad facultad) {
		this.id_investigador = id_investigador;
		this.dni = dni;
		this.nom_apels = nom_apels;
		this.facultad = facultad;
	}

	public int getId_investigador() {
		return id_investigador;
	}

	public void setId_investigador(int id_investigador) {
		this.id_investigador = id_investigador;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNom_apels() {
		return nom_apels;
	}

	public void setNom_apels(String nom_apels) {
		this.nom_apels = nom_apels;
	}

	public Facultad getFacultad() {
		return facultad;
	}

	public void setFacultad(Facultad facultad) {
		this.facultad = facultad;
	}

}
