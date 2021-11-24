package stream.guiada;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

public class StreamsEjemplo4 {

    private static final BigDecimal PRECIO_BUSQUEDA = new BigDecimal(200000.00);
    public static void main(String[] args) {

        List<Producto> catalogoProductos = List.of(
            new Producto("iPhone 13 Pro","Celulares", new BigDecimal(400000.00)),
            new Producto("Samsung Galaxy S21 Ultra","Celulares", new BigDecimal(200000.00)),
            new Producto("Motorola Edge Special Edition","Celulares", new BigDecimal(158000.00)));
        
        Optional<Producto> productoBarato = catalogoProductos.stream()
            .filter(producto -> PRECIO_BUSQUEDA.compareTo(producto.getPrecioUnitario()) > 0)
            .findFirst();

        if (productoBarato.isPresent()) {
            System.out.println("El primer producto que se encontro menor a " + PRECIO_BUSQUEDA + " es " + productoBarato.get());   
        } else {
            System.out.println("No se encontro producto menor a " + PRECIO_BUSQUEDA);
        }
    }
}
