package co.edu.uniquindio.marketplace.model;
import java.util.ArrayList;
import java.util.List;

public class Muro {
    private List<Publicacion> publicaciones;
    private List<Chat> chats;

    //Constructor para inicializar las listas

    public Muro(){
        this.publicaciones = new ArrayList<>();
        this.chats = new ArrayList<>();
    }

    public void agregarPublicacion(Publicacion publicacion){
        publicaciones.add(publicacion);
    }

    public List<Publicacion> getPublicaciones(){
        return publicaciones;
    }

    public void agregarChat(Chat chat){
        chats.add(chat);
    }

    public List<Chat> getChats(){
        return chats;
    }
}
