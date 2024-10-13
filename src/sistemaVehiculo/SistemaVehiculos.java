package sistemaVehiculo;

import java.util.ArrayList;
import java.util.List;

public class SistemaVehiculos {
	private List<Vehiculo> lstVehiculos;

	public SistemaVehiculos() {
		this.lstVehiculos = new ArrayList();
	}

	public Vehiculo traerVehiculo(String marca, String modelo) {
		Vehiculo v = null;
		int i = 0;
		while (i < this.lstVehiculos.size() && v == null) {
			Vehiculo vActual = this.lstVehiculos.get(i);
			if (vActual.getMarca() == marca && vActual.getModelo() == modelo)
				v = vActual;
			i++;
		}
		return v;
	}

	public boolean agregarAuto(String marca, String modelo, int anio, int cantRuedas, double eficienciaMotor,
			int cantPuertas) {
		int id = 1;
		if (this.lstVehiculos.size() > 0) {
			id = this.lstVehiculos.get(this.lstVehiculos.size() - 1).getIdVehiculo() + 1;
		}
		Auto nuevoAuto = new Auto(id, marca, modelo, anio, cantRuedas, eficienciaMotor, cantPuertas);
		this.lstVehiculos.add(nuevoAuto);
		return true;
	}

	public boolean agregarMoto(String marca, String modelo, int anio, int cantRuedas, double eficienciaMotor,
			boolean incluyeCaja, boolean disenioAerodinamico) {
		int id = 1;
		if (this.lstVehiculos.size() > 0) {
			id = this.lstVehiculos.get(this.lstVehiculos.size() - 1).getIdVehiculo() + 1;
		}
		Moto nuevoMoto = new Moto(id, marca, modelo, anio, cantRuedas, eficienciaMotor, incluyeCaja,
				disenioAerodinamico);
		this.lstVehiculos.add(nuevoMoto);
		return true;
	}
	
	 public List<Vehiculo> traerVehiculosDeTransporte() {
		 List<Vehiculo> v = new ArrayList();
		 for(Vehiculo actual : lstVehiculos) {
			 if(actual instanceof Auto) {
				 v.add(actual);
			 }else if(actual instanceof Moto) {
				 Moto moto = (Moto)actual;
				 if(moto.isIncluyeCaja()) {
					 v.add(moto);
				 }
			 }
		 }
		 return v;
	 }
	 
	 public List<Vehiculo> traerVehiculosPorConsumo(int km, double topeConsumo) {
		 List<Vehiculo> v = new ArrayList();
		 for(Vehiculo actual : lstVehiculos) {
			 if(actual.calcularConsumo(km) <= topeConsumo) {
				 v.add(actual);
			 }
		 }
		 
		 return v;
	 }
}
