public class Envio {
    private Carrito carrito;
    private String codigoPostal;

    public boolean validar_codigo_postal(String codigoP) {
        if (codigoP.length() == 4) {
            return true;
        } else {
            return false;
        }
    }
}
