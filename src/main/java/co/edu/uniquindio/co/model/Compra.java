package co.edu.uniquindio.co.model;

import java.util.ArrayList;
import java.util.List;

public class Compra {
    private List<Producto> items = new ArrayList<>();
    private double total;

    public void eliminarItem(Producto item) {
        items.remove(item);
        total -= item.getPrecio();
        System.out.println("Item eliminado: " + item.getNombre());
    }

    public void agregarItem(Producto item) {
        items.add(item);
        total += item.getPrecio();
        System.out.println("Item reincorporado: " + item.getNombre());
    }

    public List<Producto> getItems() {
        return items;
    }

    public double getTotal() {
        return total;
    }
}
