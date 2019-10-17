package controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegistreerController
 */
@WebServlet("/registreer")
public class RegistreerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistreerController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.print("GET");
		request.getRequestDispatcher("/WEB-INF/views/MyForm.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if (!request.getParameter("name").isEmpty() && !request.getParameter("wachtwoord").isEmpty() && !request.getParameter("email").isEmpty()) {
			request.getRequestDispatcher("/WEB-INF/views/Bedankt.jsp").forward(request, response);
			System.out.println("gegevens zijn verstuurd");
		} else {
			request.getRequestDispatcher("/index.jsp").forward(request, response);
			System.out.println("error ��n of meerdere velden waren leeg");
		}
	}

}
