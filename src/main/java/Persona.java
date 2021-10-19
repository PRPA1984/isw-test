public class Persona {
    private String nombre;

    public Persona() {
    }

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public boolean validar_max_nombre(){
        if(this.nombre.length()<=30){
            return true;
        }
        return false;
    }
    public boolean validar_min_nombre(){
        if(this.nombre.length()>8){
            return true;
        }
        return false;
    }
}
