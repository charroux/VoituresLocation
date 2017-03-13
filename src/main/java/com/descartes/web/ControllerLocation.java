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

import com.descartes.service.ServiceLocation;

@Controller
public class ControllerLocation {

	ServiceLocation serviceLocation = new  ServiceLocation();
	
	@RequestMapping(value="/voitures", method=RequestMethod.GET)
	@ResponseBody
	@ResponseStatus(HttpStatus.OK)
	public List<Voiture> getListeVoiture(){		
		return serviceLocation.listerVoitures();
	}

	@RequestMapping(value="/voiture", method=RequestMethod.POST)
	@ResponseStatus(HttpStatus.OK)
	public void addVoitureParBodyHTTP(@RequestBody Voiture voiture){
		serviceLocation.ajouterVoiture(voiture);
	}
	
	@RequestMapping(value="/voiture", method=RequestMethod.PUT)
	@ResponseStatus(HttpStatus.OK)
	public void modifierVoiture( @RequestBody Voiture voiture){
		System.out.println("modifierVoiture : " + voiture);
		// ...
	}
	
	@RequestMapping(value="/voiture", method=RequestMethod.DELETE)
	@ResponseStatus(HttpStatus.OK)
	public void deleteVoiture( @RequestBody Voiture voiture){
		System.out.println("deleteVoiture : " + voiture);
		// ...
	}
	


}
