package com.ceiba.tiendatecnologica.aplicacion.manejadores.garantia;

import com.ceiba.tiendatecnologica.aplicacion.fabrica.FabricaGarantiaExtendida;
import com.ceiba.tiendatecnologica.dominio.GarantiaExtendida;
import com.ceiba.tiendatecnologica.dominio.Producto;
import com.ceiba.tiendatecnologica.dominio.Vendedor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class ManejadorGenerarGarantia {
	FabricaGarantiaExtendida fabricaGarantiaExtendida;
	public ManejadorGenerarGarantia(FabricaGarantiaExtendida FabricaGarantiaExtendida) {
		this.fabricaGarantiaExtendida = FabricaGarantiaExtendida;
	}
	
	@Transactional
	public GarantiaExtendida ejecutar(String codigoProducto,String nombreCliente) {
		return  fabricaGarantiaExtendida.crearGarantiaExtendida(codigoProducto,nombreCliente);
	}
}
