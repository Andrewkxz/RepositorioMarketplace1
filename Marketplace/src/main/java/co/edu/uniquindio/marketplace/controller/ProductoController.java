package co.edu.uniquindio.marketplace.controller;
import co.edu.uniquindio.marketplace.factory.ModelFactory;
import co.edu.uniquindio.marketplace.mapping.dto.ProductoDto;
import co.edu.uniquindio.marketplace.model.Producto;
import co.edu.uniquindio.marketplace.service.IProductoControllerService;

import java.util.ArrayList;
import java.util.List;

public class ProductoController implements IProductoControllerService {
    ModelFactory modelFactory;


    public ProductoController() {
        modelFactory = ModelFactory.getInstance();
    }

    //Método para agregar un producto
    public void agregarProducto(Producto producto) {
        productos.add(producto);
        System.out.println("Producto agregado: "+ producto.getNombre());

    }

    @Override
    public List<ProductoDto> getProductosDto() {
        return List.of();
    }

    @Override
    public boolean agregarProducto(ProductoDto producto) {
        return false;
    }

    //Método para eliminar un producto
    public boolean eliminarProducto(String nombreProducto) {
        for (Producto producto : productos) {
            if (producto.getNombre().equals(nombreProducto)) {
                productos.remove(producto);
                System.out.println("Producto eliminado: "+ producto.getNombre());
                return true;
            }
        }
        System.out.println("Producto no encontrado: " + nombreProducto);
        return false;
    }

    @Override
    public boolean actualizarProducto(String nombre, ProductoDto productoDto) {
        return false;
    }

    //Método para actualizar un producto
    public
}