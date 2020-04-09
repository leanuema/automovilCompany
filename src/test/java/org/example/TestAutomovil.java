package org.example;

import org.example.model.Automovil;
import org.example.model.Modelo;
import org.assertj.core.api.Assertions;
import org.junit.Test;

public class TestAutomovil {

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
