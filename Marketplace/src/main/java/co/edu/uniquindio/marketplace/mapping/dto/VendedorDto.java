package co.edu.uniquindio.marketplace.mapping.dto;

import co.edu.uniquindio.marketplace.model.Usuario;

import java.util.Collection;
import java.util.List;

public record VendedorDto(
        String nombres,
        String apellidos,
        String cedula,
        String direccion,
        Usuario usuario


) {

}