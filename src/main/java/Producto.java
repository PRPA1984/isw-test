public class Producto {
    public static final int cantidad_stock = 5;

    private String nombre;

    public Producto(String nombre) {
        this.nombre = nombre;
    }

    public boolean validar_stock(int cantidad) {
        if(cantidad > cantidad_stock || cantidad <=0) {
            return false;
        }
        else {
            return true;
        }
    }

}
