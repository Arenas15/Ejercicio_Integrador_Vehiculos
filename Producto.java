package Vehiculos_Tienda;

import java.time.LocalDate;

public class Producto {
    
	private String detalle;
    private String color;
    private double peso;
    private double precio;
    private int unidadesVendidas;
    private LocalDate fechaElaboracion;
    private LocalDate fechaVencimiento;

    public Producto(String detalle, String color, double peso, double precio, int unidadesVendidas,
                    LocalDate fechaElaboracion, LocalDate fechaVencimiento) {
        this.detalle = detalle;
        this.color = color;
        this.peso = peso;
        this.precio = precio;
        this.unidadesVendidas = unidadesVendidas;
        this.fechaElaboracion = fechaElaboracion;
        this.fechaVencimiento = fechaVencimiento;
    }
    
    public String getDetalle() {
		return detalle;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getUnidadesVendidas() {
		return unidadesVendidas;
	}

	public void setUnidadesVendidas(int unidadesVendidas) {
		this.unidadesVendidas = unidadesVendidas;
	}

	public LocalDate getFechaElaboracion() {
		return fechaElaboracion;
	}

	public void setFechaElaboracion(LocalDate fechaElaboracion) {
		this.fechaElaboracion = fechaElaboracion;
	}

	public LocalDate getFechaVencimiento() {
		return fechaVencimiento;
	}

	public void setFechaVencimiento(LocalDate fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}

	@Override
	public String toString() {
		return "Producto [detalle=" + detalle + ", color=" + color + ", peso=" + peso + ", precio=" + precio
				+ ", unidadesVendidas=" + unidadesVendidas + ", fechaElaboracion=" + fechaElaboracion
				+ ", fechaVencimiento=" + fechaVencimiento + "]";
	}
}
