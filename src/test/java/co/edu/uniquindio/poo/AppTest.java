/**
 * Clase para probar el funcionamiento del código
 * @author Área de programación UQ
 * @since 2023-08
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import java.util.Collection;
import java.time.LocalDate;
import java.util.List;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    private static final Logger LOG = Logger.getLogger(AppTest.class.getName());

    /**
     * Rigorous Test :-)
     */
    @Test
    public void TodoCompleto() {
        LOG.info("Iniciado test TodoCompleto");
        Drogueria drogueria = new Drogueria("Municipal");

        Medicamento paracetamol = new Medicamento("123654", "paracetamol", "cada 8 horas", 1000, 15, "distrifarmacos", 8);
        Hogar jabon = new Hogar("789654", "aromatel", "detergente de ropa ", 8000, 12, "aromatel", "Usar  en el ultimo ciclo de lavado ");
        CuidadoPersonal crema = new CuidadoPersonal("446698", "cerave", "limpiador facial ", 15000, 13, "natura", "");

        Cliente alejandra = new Cliente("alejandra", "gomez", "1003951234", "callle 23 norte casa 65-23", "3225669988");

        Empleado empleado_1 = new Empleado("andres", "rendon", "1096646866", "barrio 25 de mayo manzana d casa 5 ", "3228557744", 1360000);

        Gerente gerente = new Gerente("sebastian", "millan", "7666786", "condominio campestre los aludines", "3022264974", 2000000);

        Pedido pedido = new Pedido(LocalDate.now(), 5, paracetamol, alejandra);

        drogueria.registrarProducto(paracetamol);
        drogueria.registrarProducto(jabon);
        drogueria.registrarProducto(crema);
        drogueria.registrarCliente(alejandra);

        drogueria.registrarEmpleado(empleado_1);
        drogueria.registrarEmpleado(gerente);

        drogueria.registrarPedido(pedido);
       assertEquals("Municipal", drogueria.getNombre());

        LOG.info("Finalizando test TodoCompleto");
    }
    @Test
    public void pedidos_sin_stock() {
        LOG.info("Iniciado test pedidos_sin_stock");
        Drogueria drogueria = new Drogueria("Municipal");

        Medicamento paracetamol = new Medicamento("123654", "paracetamol", "cada 8 horas", 1000, 15, "distrifarmacos", 8);
        Hogar jabon = new Hogar("789654", "aromatel", "detergente de ropa ", 8000, 12, "aromatel", "Usar  en el ultimo ciclo de lavado ");
        CuidadoPersonal crema = new CuidadoPersonal("446698", "cerave", "limpiador facial ", 15000, 13, "natura", "");

        Cliente alejandra = new Cliente("alejandra", "gomez", "1003951234", "callle 23 norte casa 65-23", "3225669988");

        Empleado empleado_1 = new Empleado("andres", "rendon", "1096646866", "barrio 25 de mayo manzana d casa 5 ", "3228557744", 1360000);

        Gerente gerente = new Gerente("sebastian", "millan", "7666786", "condominio campestre los aludines", "3022264974", 2000000);

        Pedido pedido = new Pedido(LocalDate.now(), 5, paracetamol, alejandra);

        drogueria.registrarProducto(paracetamol);
        drogueria.registrarProducto(jabon);
        drogueria.registrarProducto(crema);
        drogueria.registrarCliente(alejandra);

        drogueria.registrarEmpleado(empleado_1);
        drogueria.registrarEmpleado(gerente);

        assertThrows(Throwable.class, ()-> drogueria.registrarPedido(pedido));



        LOG.info("Finalizando test pedidos_sin_stock");
    }
        @Test
        public void prductos_stock_100() {
            LOG.info("Iniciado test productos_stock_100");
            Drogueria drogueria = new Drogueria("Municipal");
    
            Medicamento paracetamol = new Medicamento("123654", "paracetamol", "cada 8 horas", 1000, 15, "distrifarmacos", 8);
        Hogar jabon = new Hogar("789654", "aromatel", "detergente de ropa ", 8000, 12, "aromatel", "Usar  en el ultimo ciclo de lavado ");
        CuidadoPersonal crema = new CuidadoPersonal("446698", "cerave", "limpiador facial ", 15000, 13, "natura", "");

        Cliente alejandra = new Cliente("alejandra", "gomez", "1003951234", "callle 23 norte casa 65-23", "3225669988");

        Empleado empleado_1 = new Empleado("andres", "rendon", "1096646866", "barrio 25 de mayo manzana d casa 5 ", "3228557744", 1360000);

        Gerente gerente = new Gerente("sebastian", "millan", "7666786", "condominio campestre los aludines", "3022264974", 2000000);
    
            Pedido pedido = new Pedido(LocalDate.now(), 5, paracetamol, alejandra);
    
            drogueria.registrarProducto(paracetamol);
            drogueria.registrarProducto(jabon);
            drogueria.registrarProducto(crema);
            drogueria.registrarCliente(alejandra);
    
            drogueria.registrarEmpleado(empleado_1);
            drogueria.registrarEmpleado(gerente);
            drogueria.registrarPedido(pedido);
    
            Collection<Producto>listaProductosStock100 = drogueria.obtenerStockMayorCien();
            Collection<Producto>listaProductosDeseados = List.of(jabon,crema);
            assertIterableEquals(listaProductosStock100, listaProductosDeseados);
            for(Producto producto : listaProductosStock100){
                System.err.println(producto.getNombre());
            }

    
            LOG.info("Finalizando test prductos_stock_100");
        }
            @Test
            public void saberCostodeunPedido() {
                LOG.info("Iniciado test saberCostodeunPedido");
                Drogueria drogueria = new Drogueria("Municipal");
        
                Medicamento acetaminofen = new Medicamento("00123", "acetaminofen", "cada 8 horas", 1000, 1, "Jaimes", 8);
                Hogar jabon = new Hogar("00124", "Evon", "Para el cuerpo", 8000, 200, "Evon", "Usar solamente en el cuerpo");
                CuidadoPersonal crema = new CuidadoPersonal("00124", "crema cicatricure", "cicatrices", 15000, 100, "Bayer", "No se ");
                CuidadoPersonal shampoo = new CuidadoPersonal("11106", "Savital", "anticaspa", 20000, 14, "Para la cabez", "RCN");
        
                Cliente sara = new Cliente("sara", "gomez", "103565946", "avenida centenario", "3045987878");
                Cliente jessica = new Cliente("jessica", "londoño", "1096646866", "barrio olaya manzana d casa 7 ", "3158654578");

                Empleado empleado_1 = new Empleado("Raul", "caicedo", "103332656", "corbones", "30222549", 1200000);
        
                Gerente gerente = new Gerente("Martin", "martinez", "103326594", "colinas", "3022264974", 2000000);
        
                Pedido pedido = new Pedido(LocalDate.now(), 5, acetaminofen, sara);
                Pedido pedido2 = new Pedido((LocalDate.now()), 15, shampoo, jessica);
                Pedido pedido3 = new Pedido(LocalDate.now(), 2, jabon, sara);


        
                drogueria.registrarProducto(acetaminofen);
                drogueria.registrarProducto(jabon);
                drogueria.registrarProducto(crema);
                drogueria.registrarCliente(sara);
        
                drogueria.registrarEmpleado(empleado_1);
                drogueria.registrarEmpleado(gerente);
                drogueria.registrarPedido(pedido);
                drogueria.registrarPedido(pedido2);
                drogueria.registrarPedido(pedido3);

                System.out.println(drogueria.costoTotalPedido(sara));
                System.out.println(drogueria.costoTotalPedido(jessica));
        
                LOG.info("Finalizando test saberCostodeunPedido");
}
}