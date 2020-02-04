package com.ceiba.tiendatecnologica.infraestructura.configuracion;

import com.ceiba.tiendatecnologica.dominio.Vendedor;
import com.ceiba.tiendatecnologica.dominio.repositorio.RepositorioGarantiaExtendida;
import com.ceiba.tiendatecnologica.dominio.repositorio.RepositorioProducto;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanServicio {

	@Bean
	public Vendedor servicioCrearUsuario(RepositorioProducto repositorioProducto, RepositorioGarantiaExtendida repositorioGarantiaExtendida) {
		return new Vendedor(repositorioProducto, repositorioGarantiaExtendida);
	}
}
