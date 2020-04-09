package org.example.service;

import org.example.model.Automovil;
import org.example.model.Modelo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AutomovilService implements IAutomovilService {

    private List<Automovil> listaAutomovil;

    public AutomovilService(){
        this.listaAutomovil = new ArrayList<>();

        Automovil automovil = new Automovil(Modelo.FAMILIAR);
        automovil.setListaOpcional("airbag");
        automovil.setListaOpcional("techo corredizo");
        automovil.setListaOpcional("aire acondicionado");

        Automovil automovil1 = new Automovil(Modelo.COUPE);
        automovil1.setListaOpcional("llantas");
        automovil1.setListaOpcional("abs");

        Automovil automovil2 = new Automovil(Modelo.SEDAN);

        listaAutomovil.add(automovil);
        listaAutomovil.add(automovil1);
        listaAutomovil.add(automovil2);
    }

    @Override
    public List<Automovil> buscarAutomovil() {
        return listaAutomovil;
    }

    @Override
    public Automovil crearAutomovil() {
        return new Automovil(Modelo.FAMILIAR);
    }
}
