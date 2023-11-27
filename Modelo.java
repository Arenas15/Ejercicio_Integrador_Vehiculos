package Vehiculos_Tienda;

import java.util.ArrayList;
import java.util.List;

public class Modelo {
    private List<Producto> stock;

    public Modelo() {
        this.stock = new ArrayList<>();
    }

    // Métodos para manejar el stock
    public void agregarProducto(Producto producto) {
        this.stock.add(producto);
    }

    public List<Producto> obtenerStock() {
        return this.stock;
    }
}