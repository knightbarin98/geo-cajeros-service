package com.mrbarin.microservicios.geo.cajeros.api;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;


@Configuration
@EnableFeignClients("com.mrbarin.microservicios.geo.cajeros.api.client")
public class GeoCajeroConfiguracion {

}
