package org.example.controller;

import org.example.model.Automovil;
import org.example.model.Modelo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.example.service.IAutomovilService;

import java.util.List;


@RestController
@RequestMapping(value = "/automovil")
public class AutomovilController {

    @Autowired
    private IAutomovilService automovilService;

    @PostMapping(value ="/create", produces = MediaType.APPLICATION_JSON_VALUE)
    public Automovil crear(@RequestBody Modelo modelo){
        return automovilService.crearAutomovil(modelo);
    }

    @GetMapping(value ="/show")
    public List<Automovil> obtenerLista(){
        return automovilService.BuscarAutomovil();
    }
}
