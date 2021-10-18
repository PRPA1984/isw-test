public class Persona {
    private String contraseña;
    public boolean validar_max_contraseña(String contraseña) {

        if(contraseña.length() < 8){
            return true;
        }
        else{
            return false;
        }
    }
}
