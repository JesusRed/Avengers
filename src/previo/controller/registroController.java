package previo.controller;

import java.io.IOException;
import java.math.BigDecimal;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import previo.entities.Clasificacion;
import previo.entities.Pelicula;
import previo.model.ClasificacionDao;
import previo.model.PeliculaDao;

import static j2html.TagCreator.*;

/**
 * Servlet implementation class registroController
 */
@WebServlet("/registroController")
public class registroController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public registroController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		int id = Integer.parseInt(request.getParameter("id"));
		String nombre = request.getParameter("nombre");
		String anolans = request.getParameter("anolan");
		BigDecimal anolan = new BigDecimal(anolans);
		String anosecs = request.getParameter("anosec");
		BigDecimal anosec = new BigDecimal(anosecs);
		String sinop = request.getParameter("sinop");
		String clasificacion = request.getParameter("clasificacion");
		
		ClasificacionDao claDao = new ClasificacionDao();
		Clasificacion cla = claDao.find(clasificacion);
		
		Pelicula p = new Pelicula();
		p.setAnolanzamiento(anolan);
		p.setAnosecuencia(anosec);
		p.setClasificacionBean(cla);
		p.setId(id);
		p.setSinopsis(sinop);
		p.setNombre(nombre);
		
		PeliculaDao pDao = new PeliculaDao();
		pDao.insert(p);
		System.out.println("registrado");
		RequestDispatcher rd = request.getRequestDispatcher("/index.html");
		rd.forward(request, response);
		
		
	}

}
