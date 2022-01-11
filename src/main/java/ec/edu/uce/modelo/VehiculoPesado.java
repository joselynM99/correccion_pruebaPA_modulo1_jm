package ec.edu.uce.modelo;

public class VehiculoPesado extends Vehiculo {
	
	private double pesoToneladas;
	
	
	//Metodos get y set
	
	public double getPesoToneladas() {
		return pesoToneladas;
	}

	public void setPesoToneladas(double pesoToneladas) {
		this.pesoToneladas = pesoToneladas;
	}

	@Override
	public String toString() {
		return "VehiculoPesado [pesoToneladas=" + pesoToneladas + ", marca=" + marca + ", paisOrigen=" + paisOrigen
				+ ", placa=" + placa + ", propietario=" + propietario + ", precio=" + precio + ", valorMatricula="
				+ valorMatricula + "]";
	}
	
	
	

}
