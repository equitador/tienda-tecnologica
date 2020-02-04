package com.ceiba.tiendatecnologica.aplicacion.fabrica;


import com.ceiba.tiendatecnologica.aplicacion.manejadores.producto.ManejadorObtenerProducto;
import com.ceiba.tiendatecnologica.dominio.GarantiaExtendida;
import com.ceiba.tiendatecnologica.dominio.Producto;
import org.springframework.stereotype.Component;
import springfox.documentation.service.ApiListing;

@Component
public class FabricaGarantiaExtendida {
    private final ManejadorObtenerProducto manejadorObtenerProducto;

    FabricaGarantiaExtendida(ManejadorObtenerProducto manejadorObtenerProducto){
        this.manejadorObtenerProducto = manejadorObtenerProducto;
    }

    public GarantiaExtendida crearGarantiaExtendida (String codigoProducto, String cliente){
       Producto producto= manejadorObtenerProducto.ejecutar(codigoProducto);
        return new  GarantiaExtendida(producto);
    }
}
