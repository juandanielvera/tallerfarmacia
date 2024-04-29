package co.edu.uniquindio.poo;

import java.time.LocalDate;

public class Pedido {
    private final LocalDate fecha;
    private int cantidad;
    private Producto productoPedido;
    private Cliente clientePedido;
    public Pedido(LocalDate fecha, int cantidad, Producto productoPedido, Cliente clientePedido) {
        this.fecha = fecha;
        this.cantidad = cantidad;
        this.productoPedido = productoPedido;
        this.clientePedido = clientePedido;
    }
    public LocalDate getFecha() {
        return fecha;
    }
    public int getCantidad() {
        return cantidad;
    }
    public Producto getProductoPedido() {
        return productoPedido;
    }
    public Cliente getClientePedido() {
        return clientePedido;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public void setProductoPedido(Producto productoPedido) {
        this.productoPedido = productoPedido;
    }
    public void setClientePedido(Cliente clientePedido) {
        this.clientePedido = clientePedido;
    }
    @Override
    public String toString() {
        return "Pedido [fecha=" + fecha + ", cantidad=" + cantidad + ", productoPedido=" + productoPedido
                + ", clientePedido=" + clientePedido + "]";
    }
   
    
   
}