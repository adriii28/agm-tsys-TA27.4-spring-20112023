package com.example.demo.services;

import java.util.List;

import com.example.demo.dto.Facultad;

public interface IFacultadService {
	
	public List<Facultad> listarFacultades();
	
	public Facultad listarFacultadById(Integer id);
	
	public Facultad guardarNuevo(Facultad f);

	public Facultad actualizarFacultad(Facultad f);
	
	public void deleteFacultad(Integer id);
}
