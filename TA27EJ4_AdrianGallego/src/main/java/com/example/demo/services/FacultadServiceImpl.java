package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IFacultadDAO;
import com.example.demo.dto.Facultad;

@Service
public class FacultadServiceImpl implements IFacultadService{

	@Autowired
	IFacultadDAO dao;
	
	@Override
	public List<Facultad> listarFacultades() {
		return dao.findAll();
	}

	@Override
	public Facultad listarFacultadById(Integer id) {
		return dao.findById(id).get();
	}

	@Override
	public Facultad guardarNuevo(Facultad f) {
		return dao.save(f);
	}

	@Override
	public Facultad actualizarFacultad(Facultad f) {
		return dao.save(f);
	}

	@Override
	public void deleteFacultad(Integer id) {
		dao.deleteById(id);
	}

}
