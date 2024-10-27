package co.edu.uniquindio.marketplace.model;

import java.util.ArrayList;
import java.util.List;

public class Chat {
    private List<Mensaje> mensajes;

    public Chat() {
        mensajes = new ArrayList<Mensaje>();
    }

    public void agregarMensaje(Mensaje mensaje) {
        mensajes.add(mensaje);
    }

    public List<Mensaje> getMensajes() {
        return mensajes;
    }
}
