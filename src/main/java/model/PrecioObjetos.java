package model;

import java.util.HashMap;

public class PrecioObjetos {

    private HashMap<String, Integer> precio;
    private int obtenerValor;

    public PrecioObjetos(){
        precio = new HashMap<String, Integer>();
        obtenerValor = 0;
    }

    public int getPrecio() {
        return this.obtenerValor;
    }

    public int calcularPrecioTotal(String automovil) {
        precio.put("Familiar", 245000);
        precio.put("Coupe", 270000);
        precio.put("Sedan", 230000);
        precio.put("airbag", 7000);
        obtenerValor = precio.get(automovil);
        return obtenerValor;
    }
}
