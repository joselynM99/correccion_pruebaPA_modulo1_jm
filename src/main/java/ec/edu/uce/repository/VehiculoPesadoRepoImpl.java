package ec.edu.uce.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.Vehiculo;

@Repository
@Qualifier("pesado")
public class VehiculoPesadoRepoImpl implements IVehiculoRepo {

	private static final Logger LOG = LoggerFactory.getLogger(VehiculoPesadoRepoImpl.class);

	@Override
	public void guardar(Vehiculo v) {
		if (v.getPrecio() <= 0) {
			LOG.error("Error, proceso incorrecto. No se ha guardado el vehiculo pesado con placas: " + v.getPlaca());
		} else if (v.getPrecio() > 0 && v.getPrecio() <= 10000) {
			LOG.warn("El precio está por debajo del promedio");
			LOG.info("Vehiculo pesado con placa: " + v.getPlaca() + " Ha sido guardado ");

		} else {
			LOG.info("El precio es correcto");
			LOG.info("Vehiculo pesado con placa: " + v.getPlaca() + " Ha sido guardado ");

		}

	}

}
