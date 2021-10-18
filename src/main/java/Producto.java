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
        if(cantidad > cantidad_stock) {
            return false;
        }
        else {
            return true;
        }
    }

    public boolean validar_stock_negativo(int cantidadStock) {
        if( 0 > cantidadStock) {
            return false;
        }
        else {
            return true;
        }
    }

    public boolean validar_largo_descripcion(String descrip) {
        if(descrip.length() > 29){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean validar_largo_nombre_maximo(String nombMax) {
        if(nombMax.length() < 30){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean validar_largo_nombre_minimo(String nombMin) {
        if(nombMin.length() > 8){
            return true;
        }
        else{
            return false;
        }
    }

}