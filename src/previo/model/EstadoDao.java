package previo.model;

import previo.entities.Estado;
import previo.util.Conexion;

public class EstadoDao 
	extends	Conexion<Estado> 
	implements 	GenericDao<Estado> {

	
	public EstadoDao() {
		super(Estado.class);
	}
}
