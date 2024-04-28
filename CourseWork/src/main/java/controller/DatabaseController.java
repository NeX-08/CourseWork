package controller;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.PasswordEncryptionWithAes;
//import model.PasswordEncryptionWithAes;
import model.UserModel;
import utils.StringUtils;

public class DatabaseController {
	
	public Connection getConnection() throws SQLException, ClassNotFoundException { 
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/coursework";
		String user = "root";
		String pass = "";
		return DriverManager.getConnection(url, user, pass);
	}
	
	public int UserModel (UserModel userModel) {
		try (Connection con = getConnection()){
			PreparedStatement checkUsernameSt = con.prepareStatement(StringUtils.GET_USERNAME);
			checkUsernameSt.setString(1, userModel.getUser_name());
			ResultSet checkUsernameRs = checkUsernameSt.executeQuery();
			checkUsernameRs.next();
			if(checkUsernameRs.getInt(1) > 0) {
				return -2;
			}
			
			PreparedStatement checkPhoneSt = con.prepareStatement(StringUtils.GET_PHONE);
			checkPhoneSt.setString(1, userModel.getPhoneNumber());
			ResultSet checkPhoneRs = checkPhoneSt.executeQuery();
			checkPhoneRs.next();
			if(checkPhoneRs.getInt(1) > 0) {
				return -4;
			}
			
			PreparedStatement checkEmailSt = con.prepareStatement(StringUtils.GET_EMAIL);
			checkEmailSt.setString(1, userModel.getEmail());
			ResultSet checkEmailRs = checkEmailSt.executeQuery();
			checkEmailRs.next();
			if(checkEmailRs.getInt(1) > 0) {
				return -3;
			}
			
			PreparedStatement st = con.prepareStatement(StringUtils.INSERT_USERDATA);
			
			st.setInt(1, userModel.getUser_id());
			st.setString(2,userModel.getUser_name());
			st.setString(3, userModel.getFirst_name());
			st.setString(4, userModel.getLast_name());
			st.setDate(5, Date.valueOf(userModel.getDob()));
			st.setString(6, userModel.getPhoneNumber());
			st.setString(7, userModel.getEmail());
			st.setString(8, userModel.getGender());
			st.setString(9, userModel.getPassword());
			
			int result = st.executeUpdate();
			return result > 0 ? 1 : 0;
		} catch (SQLException | ClassNotFoundException ex) {
			ex.printStackTrace(); // Log the exception for debugging
			return -1;
		}
		
	}

}