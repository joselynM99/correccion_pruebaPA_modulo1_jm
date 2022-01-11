package ec.edu.uce.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.Vehiculo;

@Repository
@Qualifier("liviano")
public class VehiculoLivianoRepoImpl implements IVehiculoRepo {

	private static final Logger LOG = LoggerFactory.getLogger(VehiculoLivianoRepoImpl.class);

	@Override
	public void guardar(Vehiculo v) {

		if (v.getPrecio() <= 0) {
			LOG.error("Error, proceso incorrecto. No se ha guardado el vehiculo liviano con placas: " + v.getPlaca());
		} else if (v.getPrecio() > 0 && v.getPrecio() <= 10000) {
			LOG.warn("El precio está por debajo del promedio");
			LOG.info("Vehiculo liviano con placa: " + v.getPlaca() + " Ha sido guardado ");

		} else {
			LOG.info("El precio es correcto");
			LOG.info("Vehiculo liviano con placa: " + v.getPlaca() + " Ha sido guardado ");

		}

	}

}
