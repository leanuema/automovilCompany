package model;

import java.util.HashMap;
import java.util.Map;

public class PrecioObjetos {

    private HashMap<String, Integer> precio;
    private int precioTotal;

    public PrecioObjetos() {
        precio = new HashMap<>();
        precioTotal = 0;
    }

    public int getPrecioTotal() {
        return this.precioTotal;
    }

    private Map<String, Integer> listaDePrecios() {
        precio.put("Familiar", 245000);
        precio.put("Coupe", 270000);
        precio.put("Sedan", 230000);
        precio.put("airbag", 7000);
        precio.put("techo corredizo", 12000);
        precio.put("abs", 14000);
        precio.put("aire acondicionado", 20000);
        precio.put("llantas", 12000);
        return this.precio;
    }

    private Integer precioDeCosas(String cosas){
        return this.precio.get(cosas);
    }

    public int calcularPrecioFinal(Automovil automovil){
        int precioModelo = precioDeCosas(automovil.getModelo());
        int precioAccesorios = 0;
        for (String i : automovil.getListaOpcional()) {
            precioAccesorios = precioAccesorios + precioDeCosas(i);
        }
        if (precioAccesorios == 0){
            return precioModelo;
        }
            this.precioTotal = precioAccesorios + precioModelo;
        return precioTotal;
    }
}
