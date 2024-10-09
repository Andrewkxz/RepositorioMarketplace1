package co.edu.uniquindio.marketplace.model.builder;

public class VendedorBuilder {

    protected String nombres;
    protected String apellidos;
    protected String cedula;
    protected String direccion;
    protected String usuario;
    protected String contrasena;

    public Vendedor build(){
        return new Vendedor(nombres, apellidos, cedula, direccion, usuario, contrasena);
    }

    public VendedorBuilder nombres(String nombres){
        this.nombres = nombres;
        return this;
    }

    public VendedorBuilder apellidos(String apellidos){
        this.apellidos = apellidos;
        return this;
    }

    public VendedorBuilder cedula(String cedula){
        this.cedula = cedula;
        return this;
    }

    public VendedorBuilder direccion(String direccion){
        this.direccion = direccion;
        return this;
    }

    public VendedorBuilder usuario(String usuario){
        this.usuario = usuario;
        return this;
    }

    public VendedorBuilder contrasena(String contrasena){
        this.contrasena = contrasena;
        return this;
    }
}
