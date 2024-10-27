package co.edu.uniquindio.marketplace.service;

import co.edu.uniquindio.marketplace.mapping.dto.ProductoDto;

import java.util.List;

public interface IProductoControllerService {
    List<ProductoDto> getProductosDto();
    boolean agregarProducto(ProductoDto producto);
    boolean eliminarProducto(String nombreProducto);
    boolean actualizarProducto(String nombreProducto, ProductoDto producto);

}
