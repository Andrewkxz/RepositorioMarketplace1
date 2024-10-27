package co.edu.uniquindio.marketplace.model;

import java.util.ArrayList;
import java.util.List;

public class Muro {
    private final List<String> mensajes;
    private final List<String> comentarios;

    //Constructor para inicializar las listas

    public Muro(){
        this.mensajes = new ArrayList<>();      //Inicializa la lista de mensajes
        this.comentarios = new ArrayList<>();       //Inicializa la lista de comentarios
    }

    //Método para agregar un mensaje al muro

    public void agregarMensaje(String mensaje){
        mensajes.add(mensaje);
        System.out.println("Mensaje agregado al muro: " + mensaje);
    }

    //Método para agregar un comentario al muro
    public void agregarComentario(String comentario) {
        comentarios.add(comentario);
        System.out.println("Comentario agregado al muro: " + comentario);
    }

    //Getters para acceder a los mensaje y comentarios
    public List<String> getMensajes() {
        return mensajes;
    }
    public List<String> getComentarios() {
        return comentarios;
    }
}
