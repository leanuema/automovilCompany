package org.example;


import model.Automovil;
import model.Modelo;
import org.assertj.core.api.Assertions;
import org.junit.Test;

public class TestAutomovilConOpcionales {

    @Test
    public void crear_automovil_modelo_familiar_con_abs(){
        Automovil automovil = new Automovil(Modelo.FAMILIAR);
        automovil.setListaOpcional("abs");
        Assertions.assertThat(automovil.getListaOpcional()).contains("abs");
    }

    @Test
    public void crear_automovil_familiar_con_abs_y_techoCorredizo(){
        Automovil automovil = new Automovil(Modelo.FAMILIAR);
        automovil.setListaOpcional("abs");
        automovil.setListaOpcional("techoCorredizo");
        Assertions.assertThat(automovil.getListaOpcional()).contains("abs", "techoCorredizo");
    }

    @Test
    public void crear_automovil_familiar_con_todos_opcionales_posibles(){
        Automovil automovil = new Automovil(Modelo.FAMILIAR);
        automovil.setListaOpcional("abs");
        automovil.setListaOpcional("techoCorredizo");
        automovil.setListaOpcional("aireAcondicionado");
        automovil.setListaOpcional("airBag");
        automovil.setListaOpcional("llantas");
        Assertions.assertThat(automovil.getListaOpcional()).contains("abs", "techoCorredizo", "aireAcondicionado",
                "airBag", "llantas");
    }
}
