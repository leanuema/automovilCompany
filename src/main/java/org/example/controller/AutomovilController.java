package org.example.controller;

import org.example.model.Automovil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.example.service.IAutomovilService;

import java.util.List;

@RestController
@RequestMapping(value = "/automovil")
public class AutomovilController {

    @Autowired
    private IAutomovilService automovilService;

    @PostMapping(name = "/create{modelo}")
    public Automovil crear(@PathVariable(name = "modelo") String modelo){
    }
}
