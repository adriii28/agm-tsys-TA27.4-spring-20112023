package com.example.demo.services;

import java.util.List;

import com.example.demo.dto.Reserva;

public interface IReservaService {

	public List<Reserva> listarReservas();
	
	public Reserva listarReservarById(Integer id);
	
	public Reserva guardarNuevo(Reserva r);

	public Reserva actualizarReserva(Reserva r);
	
	public void deleteReserva(Integer id);
}
