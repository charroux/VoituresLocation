package com.descartes.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
public class ControllerLocation {

	List<Voiture> voitures = new ArrayList<Voiture>();
	
	public ControllerLocation(){
		Voiture v = new Voiture("AA11EE", "Ferrari");
		voitures.add(v);
	}
	
	@RequestMapping(value="/voitures", method=RequestMethod.GET)
	@ResponseBody
	@ResponseStatus(HttpStatus.OK)
	public List<Voiture> getListeVoiture(){		
		System.out.println("getListeVoiture()");
		return voitures;
	}

	@RequestMapping(value="/voiture", method=RequestMethod.POST)
	@ResponseStatus(HttpStatus.OK)
	public void addVoitureParBodyHTTP(@RequestBody Voiture voiture){
		System.out.println("addVoitureParBodyHTTP : " + voiture);
		voitures.add(voiture);
	}
	
	@RequestMapping(value="/voiture", method=RequestMethod.PUT)
	@ResponseStatus(HttpStatus.OK)
	public void modifierVoiture( @RequestBody Voiture voiture){
		System.out.println("modifierVoiture : " + voiture);
		int index = voitures.indexOf(voiture);
		if(index != -1){
			voitures.remove(index);
			voiture.setImmatriculation("xxxxx");
			voitures.add(voiture);
		}
	}
	
	@RequestMapping(value="/voiture", method=RequestMethod.DELETE)
	@ResponseStatus(HttpStatus.OK)
	public void deleteVoiture( @RequestBody Voiture voiture){
		System.out.println("deleteVoiture : " + voiture);
		voitures.remove(voiture);
	}
	


}
