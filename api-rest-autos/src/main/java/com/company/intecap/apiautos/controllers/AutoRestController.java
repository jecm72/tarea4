package com.company.intecap.apiautos.controllers;

import com.company.intecap.apiautos.response.LibroResponseRest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1") //prefijo de la ruta de la api rest  http://localhost:8080/api/v1
public class AutoRestController {

    @Autowired //inyeccion de dependencias
    private IAutoService service;

    @GetMapping("/autos") //ruta de la api rest http://localhost:8080/api/v1/libros
    public ResponseEntity<AutoResponseRest> buscarAutos(){
        return service.buscarAutos();
    }
}
