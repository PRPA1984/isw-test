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
    }
    
    @Test
    public void verificar_que_el_nombre_contenga_menos_de_30_caracteres(){
        Persona persona=new Persona("Fideos Marolio 200gr");
        boolean esperado=true;
        boolean resultado=persona.validar_max_nombre();
        assertEquals(esperado,resultado);
    }
    @Test
    public void verificar_que_el_nombre_contenga_mas_de_8_caracteres(){
        Persona persona=new Persona("Fideos Marolio 200gr");
        boolean esperado=true;
        boolean resultado=persona.validar_min_nombre();
        assertEquals(esperado,resultado);
    }

    @Test
    public void verificar_que_no_pueda_validar_codigo_postal_2_caracteres() {
        Envio envio = new Envio("52");
        boolean esperado = false;
        boolean resultado = envio.validar_codigo_postal();
        assertEquals(esperado,resultado);
    }

    @Test
    public void verificar_pueda_validar_codigo_postal_4_caracteres() {
        Envio envio = new Envio("5200");
        boolean esperado = true;
        boolean resultado = envio.validar_codigo_postal();
        assertEquals(esperado,resultado);
    }
    @Test
    public void verificar_longitud_minima_contraseña_usuario(){
        Persona persona = new Persona();
        boolean esperado = false;
        boolean resultado = persona.validar_max_contraseña("Holanda");
        assertEquals(esperado,resultado);
    }
    @Test
    public void verificar_cantidad_de_stock_minima() {
        Producto producto = new Producto("Remera");
        boolean esperado = true;
        boolean resultado = producto.validar_stock(10);
        assertEquals(esperado,resultado);

    }
}

