package org.example;

import model.Automovil;
import model.Modelo;
import org.assertj.core.api.Assertions;
import org.junit.Test;

public class TestAutomobil {

    @Test
    public void crear_automovil_modelo_familiar(){
        Automovil automovil = new Automovil(Modelo.FAMILIAR);
        Assertions.assertThat(automovil.getModelo()).isEqualTo("Familiar");
    }

    @Test
    public void crear_automobil_modelo_coupe(){
        Automovil automovil = new Automovil(Modelo.COUPE);
        Assertions.assertThat(automovil.getModelo()).isEqualTo("Coupe");
    }

    @Test
    public void crear_automovil_modelo_sedan(){
        Automovil automovil = new Automovil(Modelo.SEDAN);
        Assertions.assertThat(automovil.getModelo()).isEqualTo("Sedan");
    }
}
