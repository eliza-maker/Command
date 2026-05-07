package co.edu.uniquindio.co.model;

public class RemoveProductCommand implements ICommand{

    private Compra compra;
    private Producto itemAEliminar;

    public RemoveProductCommand(Compra compra, Producto item) {
        this.compra = compra;
        this.itemAEliminar = item;
    }



    @Override
    public void ejecutar() {
        compra.eliminarItem(itemAEliminar);
    }

    @Override
    public void deshacer() {
        compra.agregarItem(itemAEliminar);
    }
}

