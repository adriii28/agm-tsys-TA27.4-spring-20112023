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

import com.example.demo.dto.Investigador;
import com.example.demo.services.InvestigadorServiceImpl;

@RestController
@RequestMapping("/api")
public class InvestigadorController {
	
	@Autowired
	InvestigadorServiceImpl iSer;
	
	@GetMapping("/investigadores")
	public List<Investigador> listarInvestigadores(){
		return iSer.listarInvestigadores();
	}
	
	@GetMapping("/investigadores/{id}")
	public Investigador listarInvestigadores(@PathVariable(name="id") Integer id){
		return iSer.listarInvestigadorById(id);
	}
	
	@PostMapping("/investigadores")
	public Investigador guardarInvestigador(@RequestBody Investigador i) {
		return iSer.guardarNuevo(i);
	}
	
	@PutMapping("/investigadores/{id}")
	public Investigador actualizarInvestigador(@PathVariable(name="id") Integer id, @RequestBody Investigador i) {
		Investigador i1 = iSer.listarInvestigadorById(id);
		Investigador i2 = new Investigador();
		
		i1.setDni(i.getDni());
		i1.setFacultad(i.getFacultad());
		i1.setId_investigador(i.getId_investigador());
		i1.setNom_apels(i.getNom_apels());
		
		i2 = iSer.actualizarInvestigador(i1);
		
		return i2;
	}
	
	@DeleteMapping("/investigadores/{id}")
	public void deleteInvestigadores(@PathVariable(name="id") Integer id) {
		iSer.deleteInvestigador(id);
	}


}
