package com.ifms.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ifms.entities.Escola;

@RestController
@RequestMapping(value = "/escolas")
public class EscolaResource {
	@GetMapping
	public ResponseEntity<List<Escola>> findAll(){
		List<Escola> lista = new ArrayList<>();
		lista.add(new Escola(1L,"Eurico Gaspar","Centro","euricogaspar.com","euricogaspar@gmail.com","Robson","96016592"));
		lista.add(new Escola(2L,"Diomedes Vatentim Cerri","Ipê","diomedesvatentim.com","diomedes@gmail.com","Janaina","3461-0064"));
		lista.add(new Escola(3L,"Maria Aquino","Centro","mariaaquino.com","mariaaquino@gmail.com","Angela","3461-1261"));		
		return ResponseEntity.ok().body(lista);
	}

}
