package com.tuuniversidad.deberappd.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.tuuniversidad.deberappd.models.Libro;

@Repository
public class LibroRepository {

    private List<Libro> libros;

    public LibroRepository() {
        libros = new ArrayList<>();
        libros.add(new Libro(1L, "El Enigma del Unicornio", "A. C. Escritor", "Ediciones Imaginarias", 2024));
        libros.add(new Libro(2L, "Las Aventuras de Copilot", "J. K. Imaginador", "Libros Fantásticos", 2023));
        libros.add(new Libro(3L, "El Código Oculto", "L. M. Inventor", "Editorial Imaginación", 2022));
        libros.add(new Libro(4L, "El Gran Viaje Espacial", "F. S. Explorador", "Galaxia Ediciones", 2021));
        libros.add(new Libro(5L, "El Secreto del Bosque Encantado", "H. M. Soñador", "Mundo Mágico Publishing", 2020));
    }

    public List<Libro> obtenerTodosLosLibros() {
        return libros;
    }

    public Optional<Libro> obtenerLibroPorId(Long id) {
        return libros.stream().filter(libro -> libro.getId().equals(id)).findFirst();
    }
}
