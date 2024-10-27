package co.edu.uniquindio.marketplace.controller;
import co.edu.uniquindio.marketplace.factory.ModelFactory;
import co.edu.uniquindio.marketplace.mapping.dto.ProductoDto;
import co.edu.uniquindio.marketplace.model.Producto;
import co.edu.uniquindio.marketplace.service.IProductoControllerService;

import java.util.ArrayList;
import java.util.List;

public class ProductoController implements IProductoControllerService {

    }

    @Override
    public List<ProductoDto> getProductosDto() {
    }

    @Override
    }

    //Método para eliminar un producto
    public boolean eliminarProducto(String nombreProducto) {
            if (producto.getNombre().equals(nombreProducto)) {
                System.out.println("Producto eliminado: "+ producto.getNombre());
                return true;
            }
        }
        System.out.println("Producto no encontrado: " + nombreProducto);
        return false;
    }

        return false;
    }
