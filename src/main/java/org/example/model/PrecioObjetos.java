package org.example.model;

import java.util.HashMap;

public class PrecioObjetos {

    private HashMap<String, Integer> precio;
    private int precioTotal;

    public PrecioObjetos() {
        this.precio = new HashMap<>();
        this.precio.put("Familiar", 245000);
        this.precio.put("Coupe", 270000);
        this.precio.put("Sedan", 230000);
        this.precio.put("airbag", 7000);
        this.precio.put("techo corredizo", 12000);
        this.precio.put("abs", 14000);
        this.precio.put("aire acondicionado", 20000);
        this.precio.put("llantas", 12000);    }

    public int getPrecioTotal() {
        return this.precioTotal;
    }

    private Integer precioDeCosas(String objetos){
        return this.precio.get(objetos);
    }

    public int calcularPrecioFinal(Automovil automovil){
        int precioModelo = precioDeCosas(automovil.getModelo());
        int precioAccesorios = 0;
        for (String i : automovil.getListaOpcional()) {
            precioAccesorios = precioAccesorios + precioDeCosas(i);
        }
        if (precioAccesorios == 0){
            return precioTotal = precioModelo;
        }
        this.precioTotal = precioAccesorios + precioModelo;
        return precioTotal;
    }
}
