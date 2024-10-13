package test;
import java.util.List;

import sistemaVehiculo.Auto;
import sistemaVehiculo.SistemaVehiculos;
import sistemaVehiculo.Vehiculo;

public class TestSistemaVehiculos {

	public static void main(String[] args) {
		SistemaVehiculos s = new SistemaVehiculos();
		s.agregarAuto("Renault", "Clio", 2010, 4, 0.4, 5);
		Vehiculo a = s.traerVehiculo("Renault", "Clio");
		s.agregarMoto("Honda", "Tornado", 2010, 4, 0.4, false,true);
		Vehiculo m = s.traerVehiculo("Honda", "Tornado");
		System.out.println(a);
		System.out.println(a.aniosAntiguedad());
		System.out.println(m);
		List<Vehiculo> vehiculosDeTransporte = s.traerVehiculosDeTransporte();
		System.out.println(vehiculosDeTransporte);
		System.out.println(a.calcularConsumo(10));
		System.out.println(m.calcularConsumo(10));
		System.out.println(s.traerVehiculosPorConsumo(10, 4));
	}

}
