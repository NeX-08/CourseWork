package jservlets;

import java.io.*;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import controller.DatabaseController;
import model.ProductModel;
import utils.StringUtils;
/**
 * Servlet implementation class AddProduct
 */
@WebServlet(asyncSupported = true, urlPatterns = {"/AddProductServlet"})
@MultipartConfig(fileSizeThreshold = 1024 * 1024 * 5, // 5 MB
	maxFileSize = 1024 * 1024 * 10,
	maxRequestSize = 1024 * 1024 * 30) 
public class AddProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	DatabaseController db = new DatabaseController();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddProductServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
//	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
        PrintWriter out = response.getWriter();
		try {
			String product_name = request.getParameter("product_name");
			String product_price = request.getParameter("product_price");
	        String product_desc = request.getParameter("product_desc");
	        String category_id = request.getParameter("category_id");
	        Part filePart = request.getPart("product_img");
	        String filename = extractFileName(filePart);
	        String savePath = "C:\\Users\\user\\eclipse-workspace\\CourseWork\\src\\main\\webapp\\images" + File.separator;
	        String databasePath = "images" + File.separator + filename;
	        InputStream fileContent = filePart.getInputStream();
	        FileOutputStream outputStream = new FileOutputStream(savePath);
	        
	        byte[] buffer = new byte[1024];
	        int bytesRead;
	        while((bytesRead = fileContent.read(buffer)) !=1 ) {
	        	outputStream.write(buffer,0,bytesRead);
	        }
	        
	        ProductModel productModel = new ProductModel(product_name, product_price, product_desc, category_id, databasePath);
	        db.addProduct(productModel);
	        fileContent.close();
	        outputStream.close();
		} catch ( FileNotFoundException ex) {
			ex.printStackTrace();		
		}
//		doGet(request, response);
        getServletContext().getRequestDispatcher(StringUtils.ADD_PRODUCTS).forward(request, response);
    }
	
	private String extractFileName(Part part) {//This method will print the file name.
        String contentDisp = part.getHeader("content-disposition");
        String[] items = contentDisp.split(";");
        for (String s : items) {
            if (s.trim().startsWith("filename")) {
                return s.substring(s.indexOf("=") + 2, s.length() - 1);
            }
        }
        return "";
    }
}


