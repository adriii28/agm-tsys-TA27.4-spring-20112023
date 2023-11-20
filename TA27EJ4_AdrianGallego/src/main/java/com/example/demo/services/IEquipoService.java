package com.example.demo.services;

import java.util.List;

import com.example.demo.dto.Equipo;


public interface IEquipoService {

	public List<Equipo> listarEquipos();
	
	public Equipo listarEquipoById(Integer id);
	
	public Equipo guardarNuevo(Equipo e);

	public Equipo actualizarEquipo(Equipo e);
	
	public void deleteEquipo(Integer id);
}
