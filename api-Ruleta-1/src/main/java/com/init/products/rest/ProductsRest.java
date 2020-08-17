package com.init.products.rest;

import java.util.ArrayList;
import java.util.Random;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.init.products.entitys.Roulette;

@RestController
@RequestMapping("roulette")
public class ProductsRest {
	
	@GetMapping
	public ResponseEntity<ArrayList<Roulette>> roulette() {
		ArrayList<Roulette> roule=new ArrayList<>();
		Roulette roulette=new Roulette();
		roulette.setId((Math.floor(Math.random()*5)));
		roulette.setName("ruleta: "+ (Math.floor(Math.random()*5)));
		roulette.setColour1("rojo");
		roulette.setColour2("negro");
		roulette.setCondition("open");
		roule.add(roulette);
		return ResponseEntity.ok(roule);
	}
	
	@RequestMapping(value="id")// /roulette/{id} -> /roulette/1.0
	public ResponseEntity<String> bet(@PathVariable("id") Roulette id){
		double container=id.getId();
		if(container==1.0 || container==2.0 || container==3.0 || container==4.0 || container==5.0) {
			
			return ResponseEntity.ok("Successful operation");
			}
		
		return ResponseEntity.ok("failed operation");		
	} 
	
	@RequestMapping(value="condition") // /roulette/{condition} -> /roulette/open
	public ResponseEntity<ArrayList<String>> rouletteStatus(@PathVariable ("condition") Roulette condition){
		String container=condition.getCondition();
		ArrayList<String> roule=new ArrayList<>();
		if(container.equals("open") || container.equals("close")) {
			
			roule.add((int) condition.getId(),condition.getCondition());
			
			return ResponseEntity.ok(roule);
		}
		
		return null;
	}
	
	
}

	
