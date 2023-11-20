package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IInvestigadorDAO;
import com.example.demo.dto.Investigador;

@Service
public class InvestigadorServiceImpl implements IInvestigadorService{

	@Autowired
	IInvestigadorDAO dao;
	
	@Override
	public List<Investigador> listarInvestigadores() {
		return dao.findAll();
	}

	@Override
	public Investigador listarInvestigadorById(Integer id) {
		return dao.findById(id).get();
	}

	@Override
	public Investigador guardarNuevo(Investigador i) {
		return dao.save(i);
	}

	@Override
	public Investigador actualizarInvestigador(Investigador i) {
		return dao.save(i);
	}

	@Override
	public void deleteInvestigador(Integer id) {
		dao.deleteById(id);
	}
	
	

}
