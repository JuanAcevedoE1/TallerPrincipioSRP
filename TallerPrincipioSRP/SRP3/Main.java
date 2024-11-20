package TallerPrincipioSRP.SRP3;

public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("admin", "1234");
        
        ValidacionService validacionService = new ValidacionService();
        validacionService.validar(usuario);
        
        AutenticacionService autenticacionService = new AutenticacionService();
        boolean autenticado = autenticacionService.autenticar(usuario, "1234");
        
        if (autenticado) {
            System.out.println("Usuario autenticado con éxito.");
        } else {
            System.out.println("Autenticación fallida.");
        }
    }
}