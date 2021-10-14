public class Persona {
    public static final String nombre="Fideos Marolio 200gr";

    public boolean validar_max_nombre(){
        if(nombre.length()<=30){
            return true;
        }
        return false;
    }
    public boolean validar_min_nombre(){
        if(nombre.length()>8){
            return true;
        }
        return false;
    }
}
