import java.util.ArrayList;
import java.util.List;

public class Carrito {

    private int codigoPostal;

    public Producto(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }
    private List<Producto> productos = new ArrayList<Producto>();

    public boolean validar_carrito_no_nulo() {
        if(productos.size() > 0){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean validar_largo_CP(int codigoP ) {
        if(codigoP. () < 4){
            return false;
        }
        else{
            return true;
        }

    public boolean validar_largo_CP(int codigoP ) {
        if(codigoP.size() > 4){
            return false;
        }
        else{
            return true;
    }
}
