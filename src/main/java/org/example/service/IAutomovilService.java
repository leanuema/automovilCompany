package org.example.service;

import org.example.model.Automovil;

import java.util.List;

public interface IAutomovilService {

    List<Automovil> buscarAutomovil();

    Automovil crearAutomovil();
}
