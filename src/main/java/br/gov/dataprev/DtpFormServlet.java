package br.gov.dataprev;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DtpFormServlet
 */
public class DtpFormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public DtpFormServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nome = request.getParameter("nome");
		String matricula = request.getParameter("matricula");
		String setor = request.getParameter("setor");
		
		response.setContentType("text/html; charset=utf-8");
		response.setCharacterEncoding("UTF-8");
		
		PrintWriter writer = response.getWriter();
		writer.print("<h1>Requisição GET:</h1>");
		writer.print("<ul>");
		if (nome != null) {
			if (!"".equalsIgnoreCase(nome)) {
				writer.print("<li>Nome: " + nome  + "</li>");
			}
		}
		
		if (nome != null) {
			if (!"".equalsIgnoreCase(nome)) {
				writer.print("<li>Matricula: " + matricula + "</li>");
			}
		}
		
		if (nome != null) {
			if (!"".equalsIgnoreCase(nome)) {
				writer.print("<li>Setor: " + setor + "</li>");
			}
		}
		writer.print("</ul>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nome = request.getParameter("nome");
		String matricula = request.getParameter("matricula");
		String setor = request.getParameter("setor");
		
		response.setContentType("text/html; charset=utf-8");
		response.setCharacterEncoding("UTF-8");
		
		PrintWriter writer = response.getWriter();
		writer.print("<h1>Requisição POST:</h1>");
		writer.print("<ul>");
		if (nome != null) {
			if (!"".equalsIgnoreCase(nome)) {
				writer.print("<li>Nome: " + nome  + "</li>");
			}
		}
		
		if (nome != null) {
			if (!"".equalsIgnoreCase(nome)) {
				writer.print("<li>Matricula: " + matricula + "</li>");
			}
		}
		
		if (nome != null) {
			if (!"".equalsIgnoreCase(nome)) {
				writer.print("<li>Setor: " + setor + "</li>");
			}
		}
		writer.print("</ul>");
		
	}

}
