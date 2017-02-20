package com.descartes.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
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
		return voitures;
	}
}
