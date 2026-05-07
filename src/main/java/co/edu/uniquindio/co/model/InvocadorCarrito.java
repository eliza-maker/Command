package co.edu.uniquindio.co.model;

import java.util.Stack;

public class InvocadorCarrito {
    private Compra compraActual = new Compra();
    private Stack<ICommand> historialEliminaciones = new Stack<>();


    public void accionEliminar(Producto item) {
        ICommand comando = new RemoveProductCommand(compraActual, item);
        comando.ejecutar();
        historialEliminaciones.push(comando);
    }

    public void accionDeshacerEliminacion() {
        if (!historialEliminaciones.isEmpty()) {
            ICommand ultimo = historialEliminaciones.pop();
            ultimo.deshacer();
        }
    }
}
