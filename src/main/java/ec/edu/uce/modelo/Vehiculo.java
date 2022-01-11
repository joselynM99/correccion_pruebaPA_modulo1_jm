package ec.edu.uce.modelo;

public class Vehiculo {

	protected String marca;
	protected String paisOrigen;
	protected String placa;
	

	protected Propietario propietario;

	protected double precio;
	protected double valorMatricula;

	// Metodos Set y Get

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getPaisOrigen() {
		return paisOrigen;
	}

	public void setPaisOrigen(String paisOrigen) {
		this.paisOrigen = paisOrigen;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public Propietario getPropietario() {
		return propietario;
	}

	public void setPropietario(Propietario propietario) {
		this.propietario = propietario;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public double getValorMatricula() {
		return valorMatricula;
	}

	public void setValorMatricula(double valorMatricula) {
		this.valorMatricula = valorMatricula;
	}

	@Override
	public String toString() {
		return "Vehiculo [marca=" + marca + ", paisOrigen=" + paisOrigen + ", placa=" + placa + ", propietario="
				+ propietario + ", precio=" + precio + ", valorMatricula=" + valorMatricula + "]";
	}
	
	
}
