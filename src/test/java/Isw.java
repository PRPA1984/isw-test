import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Isw {

    @Test
    public void verificar_que_cantidad_sea_menor_stock() {
        Producto producto = new Producto("Fideos");
        boolean esperado = true;
        boolean resultado = producto.validar_stock(3);
        assertEquals(esperado,resultado);
    }

    @Test
    public void verificar_que_no_pueda_validar_un_carrito_sir_productos() {
        Carrito carrito = new Carrito();
        boolean esperado = false;
        boolean resultado = carrito.validar_carrito_no_nulo();
        assertEquals(esperado,resultado);
    }

    @Test
        public void verificar_que_no_pueda_validar_cantidad_stock_negativo() {
            Producto producto = new Producto("fideos"," fideos ");
            boolean esperado = false;
            boolean resultado = producto.validar_stock(-3);
            assertEquals(esperado,resultado);
        }

    @Test
    public void verificar_largo_descripcion() {
        Producto producto = new Producto(" Fideos","Fideos");
        boolean esperado = false;
        boolean resultado = producto.validar_largo_descripcion();
        assertEquals(esperado,resultado);
    }
}
