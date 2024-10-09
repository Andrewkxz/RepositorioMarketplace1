package co.edu.uniquindio.marketplace.service;

import co.edu.uniquindio.marketplace.mapping.dto.VendedorDto;

import java.util.List;

public interface IVendedorControllerService {
    List<VendedorDto> obtenerVendedoresDto();
    boolean agregarVendedor(VendedorDto vendedorDto);
    boolean actualizarVendedor(String cedulaActual, VendedorDto vendedorDto);
    boolean eliminarVendedor(String cedula);

}
