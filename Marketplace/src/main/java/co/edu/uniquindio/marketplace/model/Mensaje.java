package co.edu.uniquindio.marketplace.model;

import java.time.LocalDateTime;

public class Mensaje {
    private String contenido;
    private Vendedor autor;
    private LocalDateTime fecha;

    public Mensaje(String contenido, Vendedor autor) {
        this.contenido = contenido;
        this.autor = autor;
        this.fecha = LocalDateTime.now();
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public Vendedor getAutor() {
        return autor;
    }

    public void setAutor(Vendedor autor) {
        this.autor = autor;
    }
    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }
}
