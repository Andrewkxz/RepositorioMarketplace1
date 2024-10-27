package co.edu.uniquindio.marketplace.controller;
import co.edu.uniquindio.marketplace.factory.ModelFactory;
import co.edu.uniquindio.marketplace.mapping.dto.ProductoDto;
import co.edu.uniquindio.marketplace.model.Producto;
import co.edu.uniquindio.marketplace.model.Vendedor;
import co.edu.uniquindio.marketplace.service.IProductoControllerService;

import java.util.ArrayList;
import java.util.List;

public class ProductoController implements IProductoControllerService {
    private Vendedor vendedor;

    public ProductoController(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    @Override
    public List<ProductoDto> getProductosDto() {
        return vendedor.getProductos().stream().map(producto -> new ProductoDto(producto.getNombre(), producto.getImagen(), producto.getPrecio(), producto.getEstado())).toList();
    }

    @Override
    public boolean agregarProducto(ProductoDto productoDto) {
        Producto producto = new Producto(productoDto.nombre(), productoDto.imagen(), productoDto.precio(), productoDto.estado());
        vendedor.getProductos().add(producto);
        System.out.println("Producto agregado: " + producto.getNombre());
        return true;
    }

    //Método para eliminar un producto
    public boolean eliminarProducto(String nombreProducto) {
        for (Producto producto : vendedor.getProductos()) {
            if (producto.getNombre().equals(nombreProducto)) {
                vendedor.getProductos().remove(producto);
                System.out.println("Producto eliminado: "+ producto.getNombre());
                return true;
            }
        }
        System.out.println("Producto no encontrado: " + nombreProducto);
        return false;
    }

    //Método para actualizar un producto
    public boolean actualizarProducto(String nombreProducto, ProductoDto productoDto) {
        List<Producto> productos = vendedor.getProductos();
        for (int i = 0; i < productos.size(); i++){
            if (productos.get(i).getNombre().equals(nombreProducto)){
                Producto productoActualizado = new Producto(productoDto.nombre(), productoDto.imagen(), productoDto.precio(), productoDto.estado());
                productos.set(i, productoActualizado);
                System.out.println("Producto actualizado: " + productoActualizado.getNombre());
                return true;
            }
        }
        System.out.println("Producto no encontrado: " + nombreProducto);
        return false;
    }
}
