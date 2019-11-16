package previo.model;


import previo.entities.Clasificacion;
import previo.util.Conexion;

public class ClasificacionDao 
	extends Conexion<Clasificacion> 
	implements GenericDao<Clasificacion> {

	
	public ClasificacionDao() {
		super(Clasificacion.class);
	}
}
