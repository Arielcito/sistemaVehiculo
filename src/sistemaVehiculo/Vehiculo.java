package sistemaVehiculo;

import java.time.LocalDate;

public abstract class Vehiculo {
	protected int idVehiculo;
	protected String marca;
	protected String modelo;
	protected int anio;
	protected int cantRuedas;
	protected double eficienciaMotor;
	public Vehiculo(int idVehiculo, String marca, String modelo, int anio, int cantRuedas, double eficienciaMotor) {
		super();
		this.idVehiculo = idVehiculo;
		this.marca = marca;
		this.modelo = modelo;
		this.anio = anio;
		this.cantRuedas = cantRuedas;
		this.eficienciaMotor = eficienciaMotor;
	}
	public int getIdVehiculo() {
		return idVehiculo;
	}
	public void setIdVehiculo(int idVehiculo) {
		this.idVehiculo = idVehiculo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getAnio() {
		return anio;
	}
	public void setAnio(int anio) {
		this.anio = anio;
	}
	public int getCantRuedas() {
		return cantRuedas;
	}
	public void setCantRuedas(int cantRuedas) {
		this.cantRuedas = cantRuedas;
	}
	public double getEficienciaMotor() {
		return eficienciaMotor;
	}
	public void setEficienciaMotor(double eficienciaMotor) {
		this.eficienciaMotor = eficienciaMotor;
	}
	
	public abstract double calcularConsumo(int km);
	
	public int aniosAntiguedad() {
		return (LocalDate.now().getYear() - this.anio);
	}
	@Override
	public String toString() {
		return "Vehiculo [idVehiculo=" + idVehiculo + ", marca=" + marca + ", modelo=" + modelo + ", anio=" + anio
				+ ", cantRuedas=" + cantRuedas + ", eficienciaMotor=" + eficienciaMotor + "]";
	}
	
	
}
