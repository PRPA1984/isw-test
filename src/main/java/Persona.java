public class Persona {
    private String nombre;
    private String contraseña;

    public Persona() {
    }

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public boolean validar_nombre(){
        if(this.nombre.length()<=30 && this.nombre.length()>8){
            return true;
        }
        return false;
    }

    public boolean validar_max_contraseña(String contraseña) {

        if(contraseña.length() > 8){
            return true;
        }
        else{
            return false;
        }
    }
}
