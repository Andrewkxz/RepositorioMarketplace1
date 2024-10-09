package co.edu.uniquindio.marketplace.controller;

import co.edu.uniquindio.marketplace.factory.ModelFactory;
import co.edu.uniquindio.marketplace.mapping.dto.VendedorDto;
import co.edu.uniquindio.marketplace.service.IVendedorControllerService;

import java.util.List;

public class VendedorController implements IVendedorControllerService {
    ModelFactory modelFactory;
    public VendedorController() {
        modelFactory = ModelFactory.getInstance();
    }

    public List<VendedorDto> obtenerVendedores() {
        return modelFactory.obtenerVendedores();
    }

    @Override
    public List<VendedorDto> obtenerVendedoresDto() {
        return List.of();
    }

    @Override
    public boolean agregarVendedor(VendedorDto vendedorDto) {
        return modelFactory.agregarVendedor(vendedorDto);
    }

    @Override
    public boolean actualizarVendedor(String cedulaActual, VendedorDto vendedorDto) {
        return false;
    }

    @Override
    public boolean eliminarVendedor(String cedula) {
        return false;
    }
}
