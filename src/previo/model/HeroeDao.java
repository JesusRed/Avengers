package previo.model;

import previo.util.Conexion;
import previo.entities.Heroe;

public class HeroeDao extends Conexion<Heroe> implements GenericDao<Heroe> {
	
	public HeroeDao() {
		
		super(Heroe.class);
	}
}
