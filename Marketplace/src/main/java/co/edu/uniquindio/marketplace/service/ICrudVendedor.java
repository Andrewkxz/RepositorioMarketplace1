package co.edu.uniquindio.marketplace.service;

import co.edu.uniquindio.marketplace.model.Vendedor;

import java.util.List;

public interface ICrudVendedor {
    boolean crearVendedor(Vendedor newVendedor);
    boolean eliminarVendedor(String cedula);
    boolean actualizarVendedor(String cedula, Vendedor vendedor);
    Vendedor buscarVendedor(String cedula);
    boolean verificarVendedorExistente(String cedula);
}
