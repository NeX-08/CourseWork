package controller;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.OrderModel;
import model.ProductModel;
import model.UserModel;
//import model.UserModel;
//import model.PasswordEncryptionWithAes;
import utils.StringUtils;

public class DatabaseController {
	
	public Connection getConnection() throws SQLException, ClassNotFoundException { 
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/coursework";
		String user = "root";
		String pass = "";
		return DriverManager.getConnection(url, user, pass);
	}
	
	public void addProduct (ProductModel productModel) {
		try (Connection con = getConnection()){
			
			PreparedStatement st = con.prepareStatement(StringUtils.INSERT_PRODUCTS);
		
			st.setString(1, productModel.getProduct_name());
			st.setString(2, productModel.getProduct_price());
			st.setString(3, productModel.getProduct_desc());
			st.setString(4, productModel.getCategory_id());
			st.setString(5, productModel.getProduct_img());

			st.execute();
		}catch (SQLException | ClassNotFoundException ex) {
			ex.printStackTrace(); // Log the exception for debugging
		}
	}
	

	// goes for Product Page
	public ArrayList<ProductModel> getProducts(){
		ArrayList<ProductModel> productList = new ArrayList<>();
		try(Connection con = getConnection()){
			PreparedStatement st = con.prepareStatement(StringUtils.GET_PRODUCTS);
			ResultSet rs = st.executeQuery();
			while(rs.next()) {
				ProductModel product = new ProductModel(
						rs.getString("product_name"),
						rs.getString("product_price"),
						rs.getString("product_desc"),
						rs.getString("product_img"));
				productList.add(product);
			}
		}catch(SQLException | ClassNotFoundException ex){
			ex.printStackTrace();
		}
		return productList;
	}
	
	
	// goes for Admin Page
	public ArrayList<ProductModel> getAllProducts(){
		ArrayList<ProductModel> productList = new ArrayList<>();
		try(Connection con = getConnection()){
			PreparedStatement st = con.prepareStatement(StringUtils.GET_PRODUCTS_FOR_ADMIN);
			ResultSet rs = st.executeQuery();
			while(rs.next()) {
				ProductModel product = new ProductModel(
						rs.getInt("product_id"),
						rs.getString("product_name"),
						rs.getString("product_price"),
						rs.getString("category")
						);
				productList.add(product);
			}
		}catch(SQLException | ClassNotFoundException ex){
			ex.printStackTrace();
		}
		return productList;
	}
	
	
	public ArrayList<OrderModel> getOrders(){
		ArrayList<OrderModel> orderList = new ArrayList<>();
		try(Connection con = getConnection()){
			PreparedStatement st = con.prepareStatement(StringUtils.GET_ORDERS);
			ResultSet rs = st.executeQuery();
			while(rs.next()) {
				OrderModel order = new OrderModel(
						rs.getInt("order_id"),
						rs.getInt("user_id"),
						rs.getString("date_ordered"),
						rs.getString("order_status"));
				orderList.add(order);
			}
		}catch(SQLException | ClassNotFoundException ex){
			ex.printStackTrace();
		}
		return orderList;
	}
	
	
	public ArrayList<UserModel> getUsers(){
		ArrayList<UserModel> UserList = new ArrayList<>();
		try(Connection con = getConnection()){
			PreparedStatement st = con.prepareStatement(StringUtils.GET_USERS_FOR_ADMIN);
			ResultSet rs = st.executeQuery();
			while(rs.next()) {
				UserModel Users = new UserModel(
						rs.getInt("user_id"),
						rs.getString("user_name"),
						rs.getString("gender"),
						rs.getString("email"),
						rs.getString("phone_number")
						);
				UserList.add(Users);
			}
		}catch(SQLException | ClassNotFoundException ex){
			ex.printStackTrace();
		}
		return UserList;
	}
	
	
	public static void main(String[] args) {
		DatabaseController db = new DatabaseController();
		ArrayList<ProductModel> productList = new ArrayList<>();
		productList = db.getAllProducts();
		
		for (ProductModel products : productList) {
			System.out.println(products.getProduct_name());
		}
	}
}