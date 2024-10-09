package co.edu.uniquindio.marketplace.factory;

import co.edu.uniquindio.marketplace.mapping.dto.VendedorDto;
import co.edu.uniquindio.marketplace.mapping.mappers.MarketplaceMapppingImp;
import co.edu.uniquindio.marketplace.model.builder.Vendedor;
import co.edu.uniquindio.marketplace.model.builder.Marketplace;
import co.edu.uniquindio.marketplace.service.IModelFactoryService;

import java.util.List;

public class ModelFactory implements IModelFactoryService {
    private static ModelFactory instance;
    Marketplace marketplace;
    MarketplaceMapppingImp mapper;

    public static ModelFactory getInstance() {
        if (instance == null) {
            instance = new ModelFactory();
        }
        return instance;
    }

    private ModelFactory() {
        mapper = new MarketplaceMapppingImp();
        marketplace = inicializarDatos();
    }

    public Marketplace getMarketplace() {
        return marketplace;
    }

    public void setMarketplace(Marketplace marketplace) {
        this.marketplace = marketplace;
    }

    @Override
    public List<VendedorDto> obtenerVendedores() {
        return mapper.getVendedoresDto(marketplace.getListVendedores());
    }

    @Override
    public boolean agregarVendedor(VendedorDto vendedorDto) {
        if (marketplace.verificarVendedorExistente(vendedorDto.cedula())){

            Vendedor newVendedor = mapper.vendedorDtoToVendedor(vendedorDto);

            getMarketplace().crearVendedor(newVendedor);
            return true;

        }
        return false;
    }

    @Override
    public boolean eliminarVendedor(String cedula) {
        return false;
    }

    @Override
    public boolean actualizarVendedor(String cedulaActual, VendedorDto vendedorDto) {
        return false;
    }

    public static Marketplace inicializarDatos() {
        Marketplace marketplace = new Marketplace();
        Vendedor vendedor1 = Vendedor.builder()
                .nombres("Andrés")
                .apellidos("Rodríguez")
                .cedula("100903")
                .direccion("casa")
                .usuario("andrewkxz")
                .contrasena("1023")
                .build();

        Vendedor vendedor2 = Vendedor.builder()
                .nombres("Juliana")
                .apellidos("Bustamante")
                .cedula("134340")
                .direccion("home")
                .usuario("strw.jl")
                .contrasena("pelón")
                .build();

        Vendedor vendedor3 = Vendedor.builder()
                .nombres("Yerilin")
                .apellidos("Ul Yalanda")
                .cedula("081096")
                .direccion("casita")
                .usuario("yer_996")
                .contrasena("050417")
                .build();

        marketplace.getListVendedores().add(vendedor1);
        marketplace.getListVendedores().add(vendedor2);
        marketplace.getListVendedores().add(vendedor3);

        return marketplace;
    }



}
