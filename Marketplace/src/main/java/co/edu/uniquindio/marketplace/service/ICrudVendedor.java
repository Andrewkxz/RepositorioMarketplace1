package co.edu.uniquindio.marketplace.service;

import co.edu.uniquindio.marketplace.model.builder.Vendedor;

import java.util.List;

public interface ICrudVendedor {
    boolean crearVendedor(Vendedor newVendedor);
    boolean eliminarVendedor(String cedula);
    boolean modificarVendedor(String nombres, String apellidos, String cedula, String direccion, String usuario, String contrasena);
    Vendedor buscarVendedor(String cedula);
    List<Vendedor> listarVendedores();

    boolean verificarVendedorExistente(String cedula);
}
