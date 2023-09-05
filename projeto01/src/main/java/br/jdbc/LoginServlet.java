package br.jdbc;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.jdbc.dao.loginDAO;
import br.jdbc.dto.loginDTO;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    private loginDAO loginDAO = new loginDAO();

    public LoginServlet() {
        super();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String emailCliente = request.getParameter("email");
        String senhaCliente = request.getParameter("senha");

        loginDTO loginDTO = new loginDTO();

        loginDTO.setEmailCliente(emailCliente);
        loginDTO.setSenhaCliente(senhaCliente);

        try {
			if (loginDAO.validarLogin(loginDTO)) {
			    HttpSession session = request.getSession();
			    session.setAttribute("email", emailCliente);
			    response.sendRedirect("./html/area.jsp");
			} else {
			    response.sendRedirect("pagina_de_erro.jsp");
			}
		} catch (ClassNotFoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
