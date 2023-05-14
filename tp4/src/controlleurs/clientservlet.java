package controlleurs;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modeles.clientbean;

import java.io.PrintWriter;

/**
 * Servlet implementation class clientservlet
 */
@WebServlet("/clientservlet")
public class clientservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public clientservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		String adresse = request.getParameter("adress");
		String tel = request.getParameter("tel");
		String email = request.getParameter("email");
		clientbean c = new clientbean();
		c.setNom(nom);
		c.setPrenom(prenom);
		c.setAdresse(adresse);
		c.setTel(tel);
		c.setEmail(email);
		request.setAttribute("c", c);
		this.getServletContext().getRequestDispatcher("/client.jsp").forward(request, response);
		/*PrintWriter out = response.getWriter();
		out.println("<html><head>");
		out.println("<title>MR F</title><head>");
		out.println("<body><h1>"+nom +"</h1><h1>"+prenom +"</h1><h1>"+adresse+"</h1><h1>"+tel +"</h1><h1>"+email +"</h1></body></html>");*/
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
