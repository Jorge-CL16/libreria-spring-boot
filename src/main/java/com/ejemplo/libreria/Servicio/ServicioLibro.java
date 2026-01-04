package com.ejemplo.libreria.Servicio;

import org.springframework.stereotype.Service;

@Service
public class ServicioLibro {

    public String buscaLibro(String titulo){
        if("El quijote".equalsIgnoreCase(titulo)){
            return "Libro encontrado";
        } else{
            return "Libro no encontrado";
        }
    }
}