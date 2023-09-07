package com.company.intecap.apiautos.service;

import com.company.intecap.apiautos.response.LibroResponseRest;
import org.springframework.http.ResponseEntity;
public interface ILibroService {

    //mostrar todos los libros
    public ResponseEntity<LibroResponseRest> buscarLibros();


}
