public class Envio {
    private Carrito carrito;
    private String codigoPostal;

    public Envio(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public boolean validar_codigo_postal() {
        if (this.codigoPostal.length() == 4) {
            return true;
        } else {
            return false;
        }
    }
}