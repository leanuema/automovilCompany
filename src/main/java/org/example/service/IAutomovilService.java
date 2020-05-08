package org.example.service;


import org.example.model.Automovil;
import org.example.model.Modelo;

import java.util.List;

public interface IAutomovilService {

    Automovil crearAutomovil(Modelo modelo);

    List<Automovil> BuscarAutomovil();

    Automovil modificarAutomovil(String modelo);

    void eliminarAutomovil();
}
