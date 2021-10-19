public class Producto {
    public static final int cantidad_stock = 5;
    private String nombre;
    private String descripcion;

    public Producto(String nombre,String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }
    public Producto(String nombre) {
        this.nombre = nombre;

    }
    public boolean validar_stock(int cantidad) {
        if(cantidad > cantidad_stock || cantidad <= 0) {
            return false;
        }
        else {
            return true;
        }
    }

    public boolean validar_largo_descripcion() {
        if(this.descripcion.length() > 29){
            return true;
        }
        else{
            return false;
        }
    }


}