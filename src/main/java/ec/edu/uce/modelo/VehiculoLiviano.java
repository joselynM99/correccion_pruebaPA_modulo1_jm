package ec.edu.uce.modelo;

public class VehiculoLiviano extends Vehiculo {

	private double cilindraje;

	// Metodos get y set
	public double getCilindraje() {
		return cilindraje;
	}

	public void setCilindraje(double cilindraje) {
		this.cilindraje = cilindraje;
	}

	@Override
	public String toString() {
		return "VehiculoLiviano [cilindraje=" + cilindraje + ", marca=" + marca + ", paisOrigen=" + paisOrigen
				+ ", placa=" + placa + ", propietario=" + propietario + ", precio=" + precio + ", valorMatricula="
				+ valorMatricula + "]";
	}

	
}
