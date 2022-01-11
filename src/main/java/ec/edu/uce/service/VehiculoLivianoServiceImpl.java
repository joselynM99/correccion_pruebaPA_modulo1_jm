package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.Vehiculo;

@Service
@Qualifier("liviano")
public class VehiculoLivianoServiceImpl implements IVehiculoService {

	@Override
	public double calcularValorMatricula(Vehiculo v) {
		
		return (v.getPrecio()*0.1);
	}

}
