package model;

import org.springframework.stereotype.Service;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.LinkedList;
import java.util.List;


public class Automovil {

    private int id;

    private String modelo;
    private List<String> listaOpcional;

    public Automovil(Modelo modelo) {
        this.modelo = modelo.getModeloVehiculo();
        listaOpcional = new LinkedList<>();
        this.id = 0;
    }

    public String getModelo() {
        return this.modelo;
    }

    public List<String> getListaOpcional() {
        return this.listaOpcional;
    }

    public void setListaOpcional(String opcional) {
        listaOpcional.add(opcional);
    }
}
