package co.edu.uniquindio.co.model;

public class AddProductCommand implements ICommand{
    private Compra compra;
    private Producto itemAAgregar;

    public  AddProductCommand(Compra compra, Producto item) {
        this.compra = compra;
        this.itemAAgregar = item;
    }

    @Override
    public void ejecutar() {
        compra.agregarItem(itemAAgregar);
    }

    @Override
    public void deshacer() {

        compra.eliminarItem(itemAAgregar);
    }

}
