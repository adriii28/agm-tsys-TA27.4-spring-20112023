package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IEquipoDAO;
import com.example.demo.dto.Equipo;

@Service
public class EquipoServiceImpl implements IEquipoService{

	@Autowired
	IEquipoDAO dao;
	
	@Override
	public List<Equipo> listarEquipos() {
		return dao.findAll();
	}

	@Override
	public Equipo listarEquipoById(Integer id) {
		return dao.findById(id).get();
	}

	@Override
	public Equipo guardarNuevo(Equipo e) {
		return dao.save(e);
	}

	@Override
	public Equipo actualizarEquipo(Equipo e) {
		return dao.save(e);
	}

	@Override
	public void deleteEquipo(Integer id) {
		dao.deleteById(id);
		
	}

}
