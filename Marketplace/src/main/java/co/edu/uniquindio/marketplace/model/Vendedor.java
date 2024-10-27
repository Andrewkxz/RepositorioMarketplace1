package co.edu.uniquindio.marketplace.model;

import co.edu.uniquindio.marketplace.model.builder.VendedorBuilder;

import java.util.Collection;
import java.util.LinkedList;

public class Vendedor extends Persona {
    private Collection<Producto> productos;

    public Vendedor() {
    }

    public Vendedor(String nombres, String apellidos, String cedula, String direccion, Usuario usuario) {
        super(nombres, apellidos, cedula, direccion, usuario);
        this.productos = new LinkedList<>();
    }

    public static VendedorBuilder builder() {
        return new VendedorBuilder();
    }

    public void agregarProducto(Producto producto){
        productos.add(producto);
    }

    public void listarProductos(){
        if(productos.isEmpty()){
            System.out.println("No hay productos");
        }else{
            for(Producto producto: productos){
                System.out.println(producto);
            }
        }
    }

    public Collection<Producto> getProductos() {
        return productos;
    }
}
