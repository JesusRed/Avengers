package previo.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import previo.entities.Pelicula;
import previo.model.PeliculaDao;


public class Prueba {
	public static void main(String[] args) {
		
		/*Empleado emp = new Empleado();
		emp.setCedula("1090529341");
		emp.setCodigo("11311");
		emp.setNombre("Heriberto");
		String dobDate="31/12/1998";  
		SimpleDateFormat parseDate = new SimpleDateFormat("dd/MM/yyyy");
		Date dobFDate;
		
		try {
			  dobFDate = (Date)parseDate.parse(dobDate);
			  emp.setFechaingreso(dobFDate); 
			  emp.setFechanacimiento(dobFDate);
			  emp.setFecharetiro(dobFDate);
			} catch (ParseException e) {
			  e.printStackTrace();
			}
		
		empleadoDao empDao = new empleadoDao();
		empDao.insert(emp);*/
		
		/*empleadoDao empDao = new empleadoDao();
		Empleado emp = empDao.find("11311");
		
		System.out.println(emp.getNombre());*/
		
		/*tipoConceptoDao tcDao = new tipoConceptoDao();
		Tipoconcepto tc = tcDao.find(0);
		System.out.println(tc.getDescripcion());*/
		
		PeliculaDao pDao = new PeliculaDao();
		
		Pelicula p = pDao.find(1);
		System.out.println(p.getNombre());
		
		
	}
}
