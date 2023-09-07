package com.company.intecap.apiautos.service;

import com.company.intecap.apiautos.model.Categoria;
import com.company.intecap.apiautos.response.CategoriaResponseRest;
import org.springframework.http.ResponseEntity;

public interface ICategoriaService {

   // declaramos los servicios que vamos a utilizar
    // metodo que devuelve una lista de categorias
    public ResponseEntity<CategoriaResponseRest> buscarCategorias();
    // metodo que devuelve una categoria por id
    public ResponseEntity<CategoriaResponseRest> buscarPorId(Long id);
    // metodo que crea una categoria
    public ResponseEntity<CategoriaResponseRest> crear(Categoria categoria);
    // metodo que actualiza una categoria
    public ResponseEntity<CategoriaResponseRest> actualizar(Categoria categoria, Long id);

    // metodo que elimina una categoria
    public ResponseEntity<CategoriaResponseRest> eliminar(Long id);

}
