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

import com.example.demo.dto.Facultad;
import com.example.demo.services.FacultadServiceImpl;

@RestController
@RequestMapping("/api")
public class FacultadController {
	
	@Autowired
	FacultadServiceImpl fSer;
	
	@GetMapping("/facultades")
	public List<Facultad> listarFacultades(){
		return fSer.listarFacultades();
	}
	
	@GetMapping("/facultades/{id}")
	public Facultad listarFacultades(@PathVariable(name="id") Integer id){
		return fSer.listarFacultadById(id);
	}
	
	@PostMapping("/facultades")
	public Facultad guardarFacultad(@RequestBody Facultad f) {
		return fSer.guardarNuevo(f);
	}
	
	@PutMapping("/facultades/{id}")
	public Facultad actualizarFacultad(@PathVariable(name="id") Integer id, @RequestBody Facultad f) {
		Facultad f1 = fSer.listarFacultadById(id);
		Facultad f2 = new Facultad();
		
		f1.setCodigo(f.getCodigo());
		f1.setNombre(f.getNombre());
		
		f2 = fSer.actualizarFacultad(f1);
		return f2;
	}
	
	@DeleteMapping("/facultades/{id}")
	public void deleteFacultad(@PathVariable(name="id") Integer id) {
		fSer.deleteFacultad(id);
	}
}
