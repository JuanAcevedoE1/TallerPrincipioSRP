package TallerPrincipioSRP.SRP2;

public class EtiquetaService {
    public void generarEtiqueta(Producto producto) {
        System.out.println("Etiqueta del producto:");
        System.out.println("Nombre: " + producto.getNombre());
        System.out.println("Precio: " + producto.getPrecio());
    }
}
