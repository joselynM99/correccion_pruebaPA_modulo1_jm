package ec.edu.uce.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.Vehiculo;
import ec.edu.uce.modelo.VehiculoLiviano;
import ec.edu.uce.repository.IVehiculoRepo;

@Service
public class GestorMatricula {
	
	private static final Logger LOG = LoggerFactory.getLogger(GestorMatricula.class);
	
	@Autowired
	@Qualifier("liviano")
	private IVehiculoRepo vlRepo;
	
	@Autowired
	@Qualifier("pesado")
	private IVehiculoRepo vpRepo;
	
	@Autowired
	@Qualifier("liviano")
	private IVehiculoService vlServ;
	
	@Autowired
	@Qualifier("pesado")
	private IVehiculoService vpServ;
	
	public void matricularVehiculo(Vehiculo v) {
		
		if(v.getClass().equals(VehiculoLiviano.class)) {
			this.vlRepo.guardar(v);
		}else {
			this.vpRepo.guardar(v);
		}
		
	}
	
	public void imprimirVehiculo(Vehiculo v) {

		if(v.getClass().equals(VehiculoLiviano.class)) {
			v.setValorMatricula(this.vlServ.calcularValorMatricula(v));
			LOG.info(v.toString());
		}else {
			v.setValorMatricula(this.vpServ.calcularValorMatricula(v));
			LOG.info(v.toString());
		}
		
		
		
		
	}

}
