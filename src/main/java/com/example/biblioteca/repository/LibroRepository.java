package com.example.biblioteca.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.biblioteca.modelo.Libro;

@Repository
public class LibroRepository {

    //Arreglo que guardare todos los libros
    private List<Libro> listaLibros = new ArrayList<>();

    //metodo que retornatodos los libros
    public List<Libro> obtenerLibros() {
        return listaLibros;
    }

    //buscar libro por su id
    public Libro buscarPorId(int id){
        for (Libro libro : listaLibros){
            if (libro.getId() == id){
                return libro;
            }
        }
        return null;
    }

    public Libro guardar(Libro lib){
        listaLibros.add(lib);
        return lib;
    }

    }

    public

}
