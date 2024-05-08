package jservlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.DatabaseController;
import utils.StringUtils;
/**
 * Servlet implementation class AdminServlet
 */
@WebServlet(asyncSupported = true, urlPatterns = { "/AdminServlet" })
public class AdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	DatabaseController db = new DatabaseController();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		// product 
		String product_id = request.getParameter("product_id");
		String product_name = request.getParameter("product_name");
		String product_price = request.getParameter("product_price");
		String product_desc = request.getParameter("product_desc");
		String vendor = request.getParameter("vendor");
		String category = request.getParameter("category_id");
		String product_img = request.getParameter("product_img");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
