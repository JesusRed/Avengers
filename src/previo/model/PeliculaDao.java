package previo.model;

import previo.entities.Pelicula;
import previo.util.Conexion;

public class PeliculaDao 
	extends Conexion<Pelicula> 
	implements GenericDao<Pelicula> {

	public PeliculaDao() {
		super(Pelicula.class);
	}
}
