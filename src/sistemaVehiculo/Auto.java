package sistemaVehiculo;

public class Auto extends Vehiculo {
	private int cantPuertas;
	public Auto(int idVehiculo, String marca, String modelo, int anio, int cantRuedas, double eficienciaMotor, int cantPuertas) {
		super(idVehiculo, marca, modelo, anio, cantRuedas, eficienciaMotor);
		this.cantPuertas = cantPuertas;
	}
	public int getCantPuertas() {
		return cantPuertas;
	}
	public void setCantPuertas(int cantPuertas) {
		this.cantPuertas = cantPuertas;
	}
	
	
	@Override
	public String toString() {
		return "Auto [cantPuertas=" + cantPuertas + ", idVehiculo=" + idVehiculo + ", marca=" + marca + ", modelo="
				+ modelo + ", anio=" + anio + ", cantRuedas=" + cantRuedas + ", eficienciaMotor=" + eficienciaMotor
				+ "]";
	}
	
	@Override
	public double calcularConsumo(int km) {
		double consumo = (double)(km * this.eficienciaMotor);
		return consumo;
	}
	
}
