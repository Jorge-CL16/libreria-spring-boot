package com.ejemplo.libreria.RepoLibros;


import com.ejemplo.libreria.Model.Libro;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class RepoLibros {

    private final List<Libro> libros = new ArrayList<>();

    public RepoLibros(){
        libros.add(new Libro(
                1L,
                "Gabriel García Márquez",
                "Cien años de soledad",
                LocalDate.of(1967, 5, 30)
        ));

        libros.add(new Libro(
                2L,
                "George Orwell",
                "1984",
                LocalDate.of(1949, 6, 8)
        ));

        libros.add(new Libro(
                3L,
                "J. R. R. Tolkien",
                "El Señor de los Anillos",
                LocalDate.of(1954, 7, 29)
        ));

        libros.add(new Libro(
                4L,
                "Julio Verne",
                "Veinte mil leguas de viaje submarino",
                LocalDate.of(1870, 3, 20)
        ));

        libros.add(new Libro(
                5L,
                "Isabel Allende",
                "La casa de los espíritus",
                LocalDate.of(1982, 1, 1)
        ));
    }

    public List<Libro> finAll(){
        return libros;
    }

    public Optional<Libro> BuscaId(long idLibro){
        return libros.stream()
                .filter(libro -> libro.getIdLibro() == idLibro)
                .findFirst();
    }


}
