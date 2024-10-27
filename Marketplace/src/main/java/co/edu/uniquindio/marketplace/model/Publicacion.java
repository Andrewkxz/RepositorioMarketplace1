package co.edu.uniquindio.marketplace.model;

import java.util.ArrayList;
import java.util.List;

public class Publicacion {
    private int likes;
    private List<Comentario> comentarios;

    public Publicacion() {
        comentarios = new ArrayList<Comentario>();
    }

    public void agregarComentario(Comentario comentario) {
        comentarios.add(comentario);
    }

    public void agregarLike(){
        likes++;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public List<Comentario> getComentarios() {
        return comentarios;
    }

    public void setComentarios(List<Comentario> comentarios) {
        this.comentarios = comentarios;
    }
}
