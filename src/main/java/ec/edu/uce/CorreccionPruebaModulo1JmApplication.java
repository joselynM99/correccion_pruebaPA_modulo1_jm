package ec.edu.uce;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ec.edu.uce.modelo.Propietario;
import ec.edu.uce.modelo.Vehiculo;
import ec.edu.uce.modelo.VehiculoLiviano;
import ec.edu.uce.modelo.VehiculoPesado;
import ec.edu.uce.service.GestorMatricula;

@SpringBootApplication
public class CorreccionPruebaModulo1JmApplication implements CommandLineRunner{
	
	private static final Logger LOG = LoggerFactory.getLogger(CorreccionPruebaModulo1JmApplication.class);
	
	@Autowired
	private GestorMatricula gm;

	public static void main(String[] args) {
		SpringApplication.run(CorreccionPruebaModulo1JmApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Vehiculo v1 = new VehiculoLiviano();
		Vehiculo v2 = new VehiculoPesado();
		Propietario p1 = new Propietario();
		
		p1.setNombre("Joselyn");
		p1.setApellido("Moncayo");
		p1.setCedula("15455455");
		
		v1.setMarca("Toyota");
		v1.setPaisOrigen("España");
		v1.setPrecio(-5000);
		v1.setPlaca("P548");
		v1.setPropietario(p1);
		
		
		v2.setMarca("Chevrolet");
		v2.setPaisOrigen("EEUU");
		v2.setPrecio(8000);
		v2.setPlaca("PXF889");
		v2.setPropietario(p1);
		
		LOG.info("**********Vehiculo 1*************");
		
		this.gm.imprimirVehiculo(v1);
		this.gm.matricularVehiculo(v1);
		
		LOG.info("**********Vehiculo 2**************");
		this.gm.imprimirVehiculo(v2);
		this.gm.matricularVehiculo(v2);
		
		
	}

}
