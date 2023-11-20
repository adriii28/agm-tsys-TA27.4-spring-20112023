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

import com.example.demo.dto.Equipo;
import com.example.demo.services.EquipoServiceImpl;

@RestController
@RequestMapping("/api")
public class EquipoController {
	
	@Autowired
	EquipoServiceImpl eSer;
	
	@GetMapping("/equipos")
	public List<Equipo> listarEquipos(){
		return eSer.listarEquipos();
	}
	
	@GetMapping("/equipos/{id}")
	public Equipo listarEquipoById(@PathVariable(name="id") Integer id){
		return eSer.listarEquipoById(id);
	}
	
	@PostMapping("/equipos")
	public Equipo guardarEquipo(@RequestBody Equipo e) {
		return eSer.guardarNuevo(e);
	}
	
	@PutMapping("/equipos/{id}")
	public Equipo actualizarEquipo(@PathVariable(name="id") Integer id, @RequestBody Equipo e) {
		Equipo e1 = eSer.listarEquipoById(id);
		Equipo e2 = new Equipo();
		
		e1.setFacultad(e.getFacultad());
		e1.setNombre(e.getNombre());
		e1.setNum_serie(e.getNum_serie());
		
		e2 = eSer.actualizarEquipo(e1);
		
		return e2;
	}
	
	@DeleteMapping("/equipos/{id}")
	public void deleteEquipo(@PathVariable(name="id") Integer id) {
		eSer.deleteEquipo(id);
	}

}
