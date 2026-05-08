package co.edu.uniquindio.co.model;

import java.util.Stack;

public class InvocadorCarrito {
    private Stack<ICommand> historial = new Stack<>();

    public void ejecutarComando(ICommand comando) {
        comando.ejecutar();
        historial.push(comando);
    }

    public void deshacerUltimaAccion() {
        if (!historial.isEmpty()) {
            historial.pop().deshacer();
        } else {
            System.out.println("Nada para deshacer");
        }
    }

    @Override
    public String toString() {
        return "InvocadorCarrito{" +
                "historial=" + historial +
                '}';
    }
}
