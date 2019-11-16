package previo.model;

import previo.entities.Planeta;
import previo.util.Conexion;

public class PlanetaDao extends Conexion<Planeta> implements GenericDao<Planeta> {
	
	public PlanetaDao() {
		super(Planeta.class);
	}
}
