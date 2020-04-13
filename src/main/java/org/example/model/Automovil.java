package org.example.model;


import java.util.LinkedList;
import java.util.List;


public class Automovil{

    private String modelo;
    private List<String> listaOpcional;

    public Automovil(){

    }

    public Automovil(Modelo modelo) {
        this.modelo = modelo.getModeloVehiculo();
        listaOpcional = new LinkedList<>();
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
