package com.mrbarin.microservicios.geo.cajeros.api.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(url="https://www.banamex.com/localizador/",name="CajeroClient")
public interface CajeroClient {
	
	@GetMapping("/jsonP/json5.json")
	public String jsonCajeros();
}
