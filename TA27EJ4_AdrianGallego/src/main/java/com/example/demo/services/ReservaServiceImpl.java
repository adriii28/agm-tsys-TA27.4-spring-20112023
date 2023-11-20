package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IReservaDAO;
import com.example.demo.dto.Reserva;

@Service
public class ReservaServiceImpl implements IReservaService{

	@Autowired
	IReservaDAO dao;
	
	@Override
	public List<Reserva> listarReservas() {
		return dao.findAll();
	}

	@Override
	public Reserva listarReservarById(Integer id) {
		return dao.findById(id).get();
	}

	@Override
	public Reserva guardarNuevo(Reserva r) {
		return dao.save(r);
	}

	@Override
	public Reserva actualizarReserva(Reserva r) {
		return dao.save(r);
	}

	@Override
	public void deleteReserva(Integer id) {
		dao.deleteById(id);
	}

}
