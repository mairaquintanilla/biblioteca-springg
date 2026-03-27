package com.example.biblioteca.sservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.biblioteca.modelo.Libro;
import com.example.biblioteca.repository.LibroRepository;

@Service
public class LibroService {
    @Autowired
    private LibroRepository libroRepository;

    public List<Libro> getAllLibros() {
        return libroRepository.obtenerLibros();
    }
    public Libro saveLibro(Libro libro){
        return libroRepository.guardar(libro);
    }
    public Libro getlibroId(int id){
        return libroRepository.buscarPorId(id);
    }
    public Libro updateLibro(Libro libro){
        return libroRepository.actualizar(libro);
    }
    public String deleteLibro(Libro libro){
        libroRepository.eliminar(id);
        return "Producto eliminado";

    }
}
