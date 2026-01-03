package com.ejemplo.libreria.Model;

import java.time.LocalDate;

public class Libro implements Cloneable {

    private long idLibro;
    private String autor;
    private String titulo;
    private LocalDate fechaPublicacion;

    public Libro(long idLibro, String autor, String titulo, LocalDate fechaPublicacion){
        this.idLibro = idLibro;
        this.autor = autor;
        this.titulo = titulo;
        this.fechaPublicacion = fechaPublicacion;
    }

    public long getIdLibro() {
        return idLibro;
    }

    public String getAutor() {
        return autor;
    }

    public void setIdLibro(long idLibro) {
        this.idLibro = idLibro;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setFechaPublicacion(LocalDate fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public LocalDate getFechaPublicacion() {
        return fechaPublicacion;
    }

    @Override
    public Libro clone(){
        try{
            return (Libro) super.clone();
        } catch(CloneNotSupportedException ERROR){
            throw new AssertionError();
        }
    }

    @Override
    public String toString(){
        return "Libros:{"+
                "Id= " + idLibro + ", titulo = "+ titulo+ '\''+
                ", autor = " + autor + '\'' +
                ", Fecha publicacion = " + fechaPublicacion + '}';
    }
}