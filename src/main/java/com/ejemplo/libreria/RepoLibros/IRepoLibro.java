package com.ejemplo.libreria.RepoLibros;

import com.ejemplo.libreria.Model.Libro;

import java.util.List;
import java.util.Optional;

public interface IRepoLibro {

    List<Libro> findAll();
    Optional<Libro> findById(long id);

    void save(Libro libro);
    void deleById(long id);
}
