package Vehiculos_Tienda;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Controlador {
    public double calcularGananciaBruta(Modelo modelo) {
        double gananciaBruta = 0;
        for (Producto producto : modelo.obtenerStock()) {
            gananciaBruta += producto.getUnidadesVendidas();
        }
        return gananciaBruta;
    }

    public double calcularGananciaNeta(double gananciaBruta) {
        return gananciaBruta * 0.83;
    }

    public double calcularPerdidaProyectada(double gananciaNeta) {
        return gananciaNeta / 12;
    }

    public long diferenciaDias(LocalDate fechaElaboracion, LocalDate fechaVencimiento) {
        return ChronoUnit.DAYS.between(fechaElaboracion, fechaVencimiento);
    }
}
