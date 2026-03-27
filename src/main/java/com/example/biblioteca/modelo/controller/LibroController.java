package com.example.biblioteca.modelo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.biblioteca.modelo.Libro;
import com.example.biblioteca.sservice.LibroService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;




@RestController
@RequestMapping("/api/v1/libros")
public class LibroController {

    @Autowired
    private LibroService libroService;

    @GetMapping("")
    public List<Libro> listarLibros() {
        return libroService.getAllLibros();
    }
    @PostMapping("path")
    public Libro agregarLibro(@RequestBody Libro libro){
        return libroService.saveLibro(libro);
    }
    @GetMapping("path")
    public Libro buscarLibro(@PathVariable int id){
        return libroService.getlibroId(id);
    }
    @PutMapping("{id}")
    public Libro actualizarLibro(@PathVariable int id, @RequestBody Libro libro){
        // el id lo usaremos mas adelante
        return libroService.updateLibro(libro);
    }
    @DeleteMapping
    public String eliminarLibro(@PathVariable int id){
        return libroService.deleteLibro(id);
    }
    
    
    

}
