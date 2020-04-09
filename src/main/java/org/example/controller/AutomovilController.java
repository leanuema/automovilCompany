package org.example.controller;

import org.example.model.Automovil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.example.service.IAutomovilService;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/automovil")
public class AutomovilController {

    @Autowired
    private IAutomovilService automovilService;

    @GetMapping("create")
    public Automovil crear(){
        return automovilService.crearAutomovil();
    }
}
