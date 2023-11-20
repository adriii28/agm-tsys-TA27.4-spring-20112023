package com.example.demo.services;

import java.util.List;

import com.example.demo.dto.Investigador;


public interface IInvestigadorService {
	
	public List<Investigador> listarInvestigadores();
	
	public Investigador listarInvestigadorById(Integer id);
	
	public Investigador guardarNuevo(Investigador i);

	public Investigador actualizarInvestigador(Investigador i);
	
	public void deleteInvestigador(Integer id);
}
