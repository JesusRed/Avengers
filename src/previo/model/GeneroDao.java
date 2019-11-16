package previo.model;

import previo.entities.Genero;
import previo.util.Conexion;

public class GeneroDao extends Conexion<Genero> implements GenericDao<Genero> {
	
	public GeneroDao() {
		super(Genero.class);
	}
}
