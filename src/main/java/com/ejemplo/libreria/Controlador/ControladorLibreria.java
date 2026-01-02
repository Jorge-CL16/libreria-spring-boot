package com.ejemplo.libreria.Controlador;
import com.ejemplo.libreria.Model.Libro;
import com.ejemplo.libreria.RepoLibros.RepoLibros;
import com.ejemplo.libreria.Servicio.ServicioLibro;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/libros")
public class ControladorLibreria {

    private final ServicioLibro libroServicio;
    private final RepoLibros libroRepositorio;

    public ControladorLibreria(ServicioLibro libroServicio, RepoLibros libroRepositorio){
        this.libroServicio = libroServicio;
        this.libroRepositorio = libroRepositorio;
    }

    @GetMapping("/{titulo}")
    public String DameLibro(@PathVariable String titulo){
        return libroServicio.buscaLibro(titulo);
    }

    @GetMapping("/todos")
    public List<Libro> dimeTodo(){
        return libroRepositorio.finAll();
    }

    @GetMapping("/id/{id}")
    public ResponseEntity<Libro> buscarId(@PathVariable long id){
        return libroRepositorio.BuscaId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}