package TallerPrincipioSRP.SRP3;

public class AutenticacionService {
    public boolean autenticar(Usuario usuario, String contrasena) {
        return usuario.getContrasena().equals(contrasena);
    }
}
