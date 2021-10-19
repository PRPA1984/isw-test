import java.util.ArrayList;
import java.util.List;

public class Carrito {

    private int codigoPostal;
    private List<Producto> productos = new ArrayList<Producto>();

    public boolean validar_carrito_no_nulo() {
        if(productos.size() > 0){
            return true;
        }
        else{
            return false;
        }
    }
}
