package com.ejemplo.libreria.Controlador;
import com.ejemplo.libreria.Servicio.ServicioLibro;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/libros")
public class ControladorLibreria {

    private final ServicioLibro libroServicio;

    public ControladorLibreria(ServicioLibro libroServicio){
        this.libroServicio = libroServicio;
    }

    @GetMapping("/{titulo}")
    public String DameLibro(@PathVariable String titulo){
        return libroServicio.buscaLibro(titulo);
    }

}