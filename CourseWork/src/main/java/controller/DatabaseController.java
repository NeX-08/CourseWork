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
	
//	public int UserModel (UserModel userModel) {
//		try (Connection con = getConnection()){
//			PreparedStatement checkUsernameSt = con.prepareStatement(StringUtils.GET_USERNAME);
//			checkUsernameSt.setString(1, userModel.getUser_name());
//			ResultSet checkUsernameRs = checkUsernameSt.executeQuery();
//			checkUsernameRs.next();
//			if(checkUsernameRs.getInt(1) > 0) {
//				return -2;
//			}
//			
//			PreparedStatement checkPhoneSt = con.prepareStatement(StringUtils.GET_PHONE);
//			checkPhoneSt.setString(1, userModel.getPhoneNumber());
//			ResultSet checkPhoneRs = checkPhoneSt.executeQuery();
//			checkPhoneRs.next();
//			if(checkPhoneRs.getInt(1) > 0) {
//				return -4;
//			}
//			
//			PreparedStatement checkEmailSt = con.prepareStatement(StringUtils.GET_EMAIL);
//			checkEmailSt.setString(1, userModel.getEmail());
//			ResultSet checkEmailRs = checkEmailSt.executeQuery();
//			checkEmailRs.next();
//			if(checkEmailRs.getInt(1) > 0) {
//				return -3;
//			}
//			
//			PreparedStatement st = con.prepareStatement(StringUtils.INSERT_USERS);
//			
//			st.setInt(1, userModel.getUser_id());
//			st.setString(2,userModel.getUser_name());
//			st.setString(3, userModel.getFirst_name());
//			st.setString(4, userModel.getLast_name());
//			st.setDate(5, Date.valueOf(userModel.getDob()));
//			st.setString(6, userModel.getPhoneNumber());
//			st.setString(7, userModel.getEmail());
//			st.setString(8, userModel.getGender());
//			st.setString(9, userModel.getPassword());
//			
//			int result = st.executeUpdate();
//			return result > 0 ? 1 : 0;
//		} catch (SQLException | ClassNotFoundException ex) {
//			ex.printStackTrace(); // Log the exception for debugging
//			return -1;
//		}
//	}

	// goes for Product Page
	public ArrayList<ProductModel> getProducts(){
		ArrayList<ProductModel> productList = new ArrayList<>();
		try(Connection con = getConnection()){
			PreparedStatement st = con.prepareStatement(StringUtils.GET_PRODUCTS);
			ResultSet rs = st.executeQuery();
			while(rs.next()) {
				ProductModel product = new ProductModel(
						rs.getString("product_name"),
						rs.getDouble("product_price"),
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
						rs.getDouble("product_price"),
						rs.getString("vendor"),
						rs.getInt("category_id")
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
						rs.getString("order_date"),
						rs.getString("delivery_status"));
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