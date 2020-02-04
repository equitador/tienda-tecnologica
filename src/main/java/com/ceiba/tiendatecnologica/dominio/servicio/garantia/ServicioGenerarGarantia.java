package com.ceiba.tiendatecnologica.dominio.servicio.garantia;

import com.ceiba.tiendatecnologica.dominio.GarantiaExtendida;
import com.ceiba.tiendatecnologica.dominio.repositorio.RepositorioGarantiaExtendida;
import org.springframework.stereotype.Component;

@Component
public class ServicioGenerarGarantia {
    private RepositorioGarantiaExtendida repositorioGarantiaExtendida;

    public ServicioGenerarGarantia(RepositorioGarantiaExtendida repositorioGarantiaExtendida) {
        this.repositorioGarantiaExtendida = repositorioGarantiaExtendida;
    }

    public GarantiaExtendida ejecutar(GarantiaExtendida garantiaExtendida) {
        return this.repositorioGarantiaExtendida.agregar(garantiaExtendida);
    }
}
