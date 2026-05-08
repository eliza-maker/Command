package co.edu.uniquindio.co;


import co.edu.uniquindio.co.model.*;

public class Main {
    public static void main(String[] args) {
        Compra miCompra = new Compra();


        InvocadorCarrito invocador = new InvocadorCarrito();


        Producto entradaGeneral = new Producto("Boleta General - Juanes", 120000);
        Producto entradaVip = new Producto("Boleta VIP - Juanes", 250000);
        Producto merchandising = new Producto("Camiseta Oficial", 80000);
        Producto seguro = new Producto("Seguro de Cancelación", 20000);

        System.out.println("--- Iniciando selección de productos ---");

        invocador.ejecutarComando(new AddProductCommand(miCompra, entradaGeneral));
        invocador.ejecutarComando(new AddProductCommand(miCompra, entradaVip));
        invocador.ejecutarComando(new AddProductCommand(miCompra, merchandising));

        System.out.println("Carrito actual: " + miCompra.getItems());


        // PRUEBA 1: El usuario decide eliminar un objeto del carrito (RF-006)
        /*
        System.out.println("\n[SIMULACIÓN: Usuario elimina la Camiseta]");
        ICommand eliminarCami = new RemoveProductCommand(miCompra, merchandising);
        invocador.ejecutarComando(eliminarCami);
        System.out.println("Carrito tras eliminar: " + miCompra.getItems());
        */

        // PRUEBA 2: El usuario se arrepiente y presiona 'Deshacer' (Undo)
/*
        System.out.println("\n[SIMULACIÓN: Usuario presiona Deshacer]");
        invocador.deshacerUltimaAccion();
        System.out.println("Carrito restaurado: " + miCompra.getItems());
*/

        // PRUEBA 3: Agregar algo más y deshacer dos veces seguidas
/*
        System.out.println("\n[SIMULACIÓN: Agregando seguro y deshaciendo todo]");
        invocador.ejecutarComando(new AddProductCommand(miCompra, seguro));
        System.out.println("Carrito con seguro: " + miCompra.getItems());

        invocador.deshacerUltimaAccion(); // Quita el seguro
        invocador.deshacerUltimaAccion(); // Quita la última acción previa
        System.out.println("Estado final: " + miCompra.getItems());
*/
    }
}


