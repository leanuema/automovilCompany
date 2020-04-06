package org.example;

import model.Automovil;
import model.Modelo;
import model.PrecioObjetos;
import org.assertj.core.api.Assertions;
import org.junit.Test;

public class TestAutomovilPrecios {

    @Test
    public void obtener_precio_vehiculo_familiar_basico_sin_opcionales(){
        Automovil automovil = new Automovil(Modelo.FAMILIAR);
        PrecioObjetos precioObjetos = new PrecioObjetos();
        precioObjetos.calcularPrecioFinal(automovil);
        Assertions.assertThat(precioObjetos.getPrecioTotal()).isEqualTo(245000);
    }

    @Test
    public void obtener_precio_vehiculo_coupe_basico_sin_opcionales(){
        Automovil automovil = new Automovil(Modelo.COUPE);
        PrecioObjetos precioObjetos = new PrecioObjetos();
        precioObjetos.calcularPrecioFinal(automovil);
        Assertions.assertThat(precioObjetos.getPrecioTotal()).isEqualTo(270000);
    }

    @Test
    public void obtener_precio_vehiculo_sedan_basico_sin_opcionales(){
        Automovil automovil = new Automovil(Modelo.SEDAN);
        PrecioObjetos precioObjetos = new PrecioObjetos();
        precioObjetos.calcularPrecioFinal(automovil);
        Assertions.assertThat(precioObjetos.getPrecioTotal()).isEqualTo(230000);
    }

    @Test
    public void obtener_precio_vehiculo_familiar_con_airbag(){
        Automovil automovil = new Automovil(Modelo.FAMILIAR);
        PrecioObjetos precioObjetos = new PrecioObjetos();
        automovil.setListaOpcional("airbag");
        precioObjetos.calcularPrecioFinal(automovil);
        Assertions.assertThat(precioObjetos.getPrecioTotal()).isEqualTo(252000);
    }

    @Test
    public void obtener_precio_vehiculo_coupe_con_todos_los_accesorios(){
        Automovil automovil = new Automovil(Modelo.COUPE);
        PrecioObjetos precioObjetos = new PrecioObjetos();
        automovil.setListaOpcional("airbag");
        automovil.setListaOpcional("aire acondicionado");
        automovil.setListaOpcional("llantas");
        automovil.setListaOpcional("abs");
        automovil.setListaOpcional("techo corredizo");
        precioObjetos.calcularPrecioFinal(automovil);
        Assertions.assertThat(precioObjetos.getPrecioTotal()).isEqualTo(335000);
    }
}
