package Vehiculos_Tienda;

public class Main {
    public static void main(String[] args) {
        Modelo modelo = new Modelo();
        Controlador controlador = new Controlador();
        Vista vista = new Vista();

        int opcion = -1; // Inicializa con un valor diferente de 0

        while (opcion != 0) {
            opcion = vista.menuPrincipal();

            switch (opcion) {
                case 1:
                    Thread hiloIngresarProducto = new Thread(() -> vista.ingresarInfoStock(modelo));
                    hiloIngresarProducto.start();
                    try {
                        hiloIngresarProducto.join();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    break;
                case 2:
                    Thread hiloMostrarProductos = new Thread(() -> vista.mostrarInfoStock(modelo));
                    hiloMostrarProductos.start();
                    try {
                        hiloMostrarProductos.join();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    break;
                case 3:
                    Thread hiloMostrarFinanciera = new Thread(() -> vista.mostrarInfoFinanciera(controlador, modelo));
                    hiloMostrarFinanciera.start();
                    try {
                        hiloMostrarFinanciera.join();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida");
                    break;
            }
        }
    }
}
