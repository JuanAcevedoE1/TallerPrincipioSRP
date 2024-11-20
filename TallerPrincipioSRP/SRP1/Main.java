package TallerPrincipioSRP.SRP1;

public class Main {
    public static void main(String[] args) {
        Libro libro = new Libro("El Principito", "Antoine de Saint-Exupéry", "123456789");
        
        ReporteService reporteService = new ReporteService();
        reporteService.generarReporte(libro);
        
        PersistenciaService persistenciaService = new PersistenciaService();
        persistenciaService.guardarEnBaseDeDatos(libro);
    }
}