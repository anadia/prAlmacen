package com.anadiait.prAlmacen;

@SuppressWarnings("serial")
public class ListaPedidosExcepcion extends RuntimeException {

    public ListaPedidosExcepcion(String mensaje) {
        super(mensaje);
    }
}
