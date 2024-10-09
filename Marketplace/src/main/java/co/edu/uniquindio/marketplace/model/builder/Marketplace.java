package co.edu.uniquindio.marketplace.model.builder;

import co.edu.uniquindio.marketplace.service.ICrudVendedor;

import java.util.ArrayList;
import java.util.List;

public class Marketplace implements ICrudVendedor {
    List<Vendedor> listVendedores = new ArrayList<>();
    List<Objeto> listObjetos = new ArrayList<>();

    private String nombre;

    public Marketplace(){
    }

    @Override
//    public boolean crearVendedor(String nombres, String apellidos, String cedula, String direccion, String usuario, String contrasena) {
    public boolean crearVendedor(Vendedor newVendedor) {
        //        Vendedor vendedorEncontrado = verificarVendedor(cedula);

        if (newVendedor != null) {
            getListVendedores().add(newVendedor);

            return true;
        }

        return false;
    }

    @Override
    public boolean eliminarVendedor(String cedula) {
        Vendedor vendedorEncontrado = verificarVendedor(cedula);
        if (vendedorEncontrado != null) {
            getListVendedores().remove(vendedorEncontrado);
            return true;
        }
        return false;
    }

    @Override
    public boolean modificarVendedor(String nombres, String apellidos, String cedula, String direccion, String usuario, String contrasena) {
        Vendedor vendedorEncontrado = verificarVendedor(cedula);
        if (vendedorEncontrado != null) {
            vendedorEncontrado.setNombres(nombres);
            vendedorEncontrado.setApellidos(apellidos);
            vendedorEncontrado.setCedula(cedula);
            vendedorEncontrado.setDireccion(direccion);
            vendedorEncontrado.setUsuario(usuario);
            vendedorEncontrado.setContrasena(contrasena);

            return true;
        }
        return false;
    }

    @Override
    public Vendedor buscarVendedor(String cedula) {
        Vendedor vendedorEncontrado = verificarVendedor(cedula);
        if (vendedorEncontrado != null) {
            return vendedorEncontrado;
        }
        return null;
    }

    @Override
    public List<Vendedor> listarVendedores() {
        return List.of();
    }

    @Override
    public boolean verificarVendedorExistente(String cedula) {
        if (verificarVendedor(cedula) == null){
            return true;
        }
        return false;
    }

    public Vendedor verificarVendedor(String cedula) {
        Vendedor vendedorExistente = null;

        for (Vendedor vendedor : listVendedores){
            if (vendedor.getCedula().equals(cedula)){
                vendedorExistente = vendedor;
                break;
            }
        }
        return vendedorExistente;
    }

    public List<Vendedor> getListVendedores() {
        return listVendedores;
    }

    public void setListVendedores(List<Vendedor> listVendedores) {
        this.listVendedores = listVendedores;
    }

    public List<Objeto> getListObjetos() {
        return listObjetos;
    }

    public void setListObjetos(List<Objeto> listObjetos) {
        this.listObjetos = listObjetos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
