package co.edu.uniquindio.marketplace.model;

import co.edu.uniquindio.marketplace.model.builder.VendedorBuilder;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class Vendedor extends Persona {
    private List<Producto> productos;
    private List<Vendedor> contactos;

    public Vendedor() {
    }

    public Vendedor(String nombres, String apellidos, String cedula, String direccion, Usuario usuario) {
        super(nombres, apellidos, cedula, direccion, usuario);
        this.productos = new LinkedList<>();
        this.contactos = new LinkedList<>();
    }

    public static VendedorBuilder builder() {
        return new VendedorBuilder();
    }

    //Método CRUD para los productos

    public void agregarProducto(Producto producto){
        productos.add(producto);
    }

    public void eliminarProducto(Producto producto){
        productos.remove(producto);
    }

    public Producto obtenerProducto(String nombre){
        return productos.stream()
                .filter(producto -> producto.getNombre().equals(nombre))
                .findFirst()
                .orElse(null);
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

    //Método CRUD para contactos
    public void agregarContacto (Vendedor vendedor){
    contactos.add(vendedor);
    }

    public void eliminarContacto(Vendedor vendedor){
    contactos.remove(vendedor);
    }

    public Collection<Vendedor> getContactos(){
        return contactos;
    }

    public List<Producto> getProductos(){
        return  productos;
    }

    public String obtenerEstadisticas(){
        int totalProductos = productos.size();
        int totalContactos = contactos.size();

        StringBuilder estadisticas = new StringBuilder();
        estadisticas.append("Estadisticas: de ").append(getNombres()).append(" ").append(getApellidos()).append("\n");
        estadisticas.append("Total de productos: ").append(totalProductos).append("\n");
        estadisticas.append("Total de contactos: ").append(totalContactos);

        return estadisticas.toString();
    }
}