package Vehiculos_Tienda;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class Vista {
	public int menuPrincipal() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Qué información quieres ver?");
        System.out.println("1. Ingresar datos del producto");
        System.out.println("2. Mostrar stock con nombres de productos");
        System.out.println("3. Mostrar información financiera");
        System.out.println("0. Salir");
        return scanner.nextInt();
    }
	
    public void ingresarInfoStock(Modelo modelo) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("Ingrese información para el producto:");

            System.out.print("Detalle: ");
            String detalle = scanner.nextLine();

            System.out.print("Color: ");
            String color = scanner.nextLine();

            System.out.print("Peso: ");
            double peso = Double.parseDouble(scanner.nextLine());

            System.out.print("Precio: ");
            double precio = Double.parseDouble(scanner.nextLine());

            System.out.print("Unidades vendidas: ");
            int unidadesVendidas = Integer.parseInt(scanner.nextLine());

            System.out.print("Fecha de elaboración (YYYY-MM-DD): ");
            LocalDate fechaElaboracion = LocalDate.parse(scanner.nextLine());

            System.out.print("Fecha de vencimiento (YYYY-MM-DD): ");
            LocalDate fechaVencimiento = LocalDate.parse(scanner.nextLine());

            Producto producto = new Producto(detalle, color, peso, precio, unidadesVendidas,
                                              fechaElaboracion, fechaVencimiento);
            modelo.agregarProducto(producto);

            System.out.println("¿Desea agregar otro producto? (Sí = 1, No = 0)");
            int opcion = scanner.nextInt();
            if (opcion == 0) {
                continuar = false;
            }
            scanner.nextLine();
        }
    }

    public void mostrarInfoStock(Modelo modelo) {
        List<Producto> stock = modelo.obtenerStock();

        if (stock.isEmpty()) {
            System.out.println("No hay productos informados.");
        } else {
            System.out.println("Productos Informados:");

            for (Producto producto : stock) {
                System.out.println("Detalle: " + producto.getDetalle());
                System.out.println("Color: " + producto.getColor());
                System.out.println("Peso: " + producto.getPeso());
                System.out.println("Precio: " + producto.getPrecio());
                System.out.println("Unidades vendidas: " + producto.getUnidadesVendidas());
                System.out.println("Fecha de elaboración: " + producto.getFechaElaboracion());
                System.out.println("Fecha de vencimiento: " + producto.getFechaVencimiento());
                System.out.println("--------------------");
            }
        }

        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("¿Desea volver al menú principal? (Sí = 1, No = 0)");
            int opcion = scanner.nextInt();
            if (opcion == 1) {
                continuar = false;
            }
        }
    }
    
    
    public void mostrarInfoFinanciera(Controlador controlador, Modelo modelo) {
        double gananciaBruta = controlador.calcularGananciaBruta(modelo);
        double gananciaNeta = controlador.calcularGananciaNeta(gananciaBruta);
        double perdidaProyectada = controlador.calcularPerdidaProyectada(gananciaNeta);

        System.out.println("Ganancia Bruta: " + gananciaBruta);
        System.out.println("Ganancia Neta: " + gananciaNeta);
        System.out.println("Pérdida Proyectada: " + perdidaProyectada);

        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("¿Desea volver al menú principal? (Sí = 1, No = 0)");
            int opcion = scanner.nextInt();
            if (opcion == 1) {
                continuar = false; 
            }
        }
    }
}