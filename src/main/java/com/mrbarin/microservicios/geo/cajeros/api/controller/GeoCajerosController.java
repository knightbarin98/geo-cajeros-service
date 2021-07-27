package com.mrbarin.microservicios.geo.cajeros.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mrbarin.microservicios.geo.cajeros.api.client.CajeroClient;
import com.mrbarin.microservicios.geo.cajeros.api.dto.CajeroResponse;

@RestController
public class GeoCajerosController {
	
	@Autowired
	private CajeroClient cajeroClient;
	
	
	@GetMapping("/cajeros-cerca")
	public String ubicarCajerosCercanos(){
		String cajeros = cajeroClient.jsonCajeros();
		
		return cajeros;
	}
	
}
