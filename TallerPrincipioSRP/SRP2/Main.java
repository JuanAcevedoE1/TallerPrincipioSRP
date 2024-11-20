package TallerPrincipioSRP.SRP2;

public class Main {
    public static void main(String[] args) {
        Producto producto = new Producto("Laptop", 1000.00);
        
        EtiquetaService etiquetaService = new EtiquetaService();
        etiquetaService.generarEtiqueta(producto);
        
        PrecioService precioService = new PrecioService();
        double precioConImpuesto = precioService.calcularPrecioConImpuesto(producto);
        System.out.println("Precio con impuesto: " + precioConImpuesto);
    }
}