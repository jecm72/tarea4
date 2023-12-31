package com.company.intecap.apiautos.controllers;

import com.company.intecap.apiautos.model.Categoria;
import com.company.intecap.apiautos.response.CategoriaResponseRest;
import com.company.intecap.apiautos.service.ICategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")  //prefijo de la ruta de la api rest  http://localhost:8080/api/v1
public class CategoriaRestController {

    //implementar los metodos de la clase CategoriaServiceImpl
    @Autowired //inyeccion de dependencias
    private ICategoriaService service;

    @GetMapping("/categorias") //ruta de la api rest http://localhost:8080/api/v1/categorias
    public ResponseEntity<CategoriaResponseRest> buscarCategorias(){
        return service.buscarCategorias();
    }

    @GetMapping("/categorias/{id}") //ruta de la api rest http://localhost:8080/api/v1/categorias/1
    public ResponseEntity<CategoriaResponseRest> buscarPorId(@PathVariable Long id){
        return service.buscarPorId(id);
    }
    @PostMapping("/categorias") //ruta de la api rest http://localhost:8080/api/v1/categorias
    public ResponseEntity<CategoriaResponseRest> crear(@RequestBody Categoria request){
        return service.crear(request);
    }

    @PutMapping("/categorias/{id}") //ruta de la api rest http://localhost:8080/api/v1/categorias/1
    public ResponseEntity<CategoriaResponseRest> actualizar(@RequestBody Categoria request, @PathVariable Long id){
        return service.actualizar(request, id);
    }

    @DeleteMapping("/categorias/{id}") //ruta de la api rest http://localhost:8080/api/v1/categorias/1
    public ResponseEntity<CategoriaResponseRest> eliminar(@PathVariable Long id){
        return service.eliminar(id);
    }
}
