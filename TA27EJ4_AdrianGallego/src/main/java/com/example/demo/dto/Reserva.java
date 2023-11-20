package com.example.demo.dto;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="reserva")
public class Reserva {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_reserva;

	@ManyToOne
    @JoinColumn(name = "id_invest")
	private Investigador investigador;
	
	@ManyToOne
    @JoinColumn(name = "num_serie")
	private Equipo equipos;
	
	private Date comienzo;
	
	private Date fin;

	public Reserva(int id_reserva, Investigador investigador, Equipo equipos, Date comienzo, Date fin) {
		this.id_reserva = id_reserva;
		this.investigador = investigador;
		this.equipos = equipos;
		this.comienzo = comienzo;
		this.fin = fin;
	}

	public Reserva() {

	}

	public int getId_reserva() {
		return id_reserva;
	}

	public void setId_reserva(int id_reserva) {
		this.id_reserva = id_reserva;
	}

	public Investigador getInvestigador() {
		return investigador;
	}

	public void setInvestigador(Investigador investigador) {
		this.investigador = investigador;
	}

	public Equipo getEquipos() {
		return equipos;
	}

	public void setEquipos(Equipo equipos) {
		this.equipos = equipos;
	}

	public Date getComienzo() {
		return comienzo;
	}

	public void setComienzo(Date comienzo) {
		this.comienzo = comienzo;
	}

	public Date getFin() {
		return fin;
	}

	public void setFin(Date fin) {
		this.fin = fin;
	}
	
}
