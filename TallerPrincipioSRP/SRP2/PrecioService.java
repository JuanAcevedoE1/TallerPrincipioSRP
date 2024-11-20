package TallerPrincipioSRP.SRP2;

public class PrecioService {
    public double calcularPrecioConImpuesto(Producto producto) {
        return producto.getPrecio() * 1.21; 
    }
}

