package com.company.intecap.apiautos.response;

import com.company.intecap.apiautos.model.Libro;
import java.util.List;
public class LibroResponse {

    private List<Libro> libros;

    public List<Libro> getLibros() {
        return libros;
    }
    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }
}
