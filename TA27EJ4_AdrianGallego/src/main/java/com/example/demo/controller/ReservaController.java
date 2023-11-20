package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Reserva;
import com.example.demo.services.ReservaServiceImpl;

@RestController
@RequestMapping("/api")
public class ReservaController {
	
	@Autowired
	ReservaServiceImpl rSer;
	
	@GetMapping("/reservas")
	public List<Reserva> listarReservas(){
		return rSer.listarReservas();
	}
	
	@GetMapping("/reservas/{id}")
	public Reserva listarReservaById(@PathVariable(name="id") Integer id){
		return rSer.listarReservarById(id);
	}
	
	@PostMapping("/reservas")
	public Reserva guardarReserva(@RequestBody Reserva r) {
		return rSer.guardarNuevo(r);
	}
	
	@PutMapping("/reservas/{id}")
	public Reserva actualizarReserva(@PathVariable(name="id") Integer id, @RequestBody Reserva r) {
		Reserva r1 = rSer.listarReservarById(id);
		Reserva r2 = new Reserva();
		
		r1.setId_reserva(r.getId_reserva());
		r1.setInvestigador(r.getInvestigador());
		r1.setEquipos(r.getEquipos());
		r1.setComienzo(r.getComienzo());
		r1.setFin(r.getFin());
		
		r2 = rSer.actualizarReserva(r1);
		
		return r2;
	}
	
	@DeleteMapping("/reserva/{id}")
	public void deleteReserva(@PathVariable(name="id") Integer id) {
		rSer.deleteReserva(id);
	}

}
