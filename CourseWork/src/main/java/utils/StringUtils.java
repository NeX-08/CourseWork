package utils;

public class StringUtils {
	public static final String INSERT_USERS = "insert into users_info" + 
			("user_name, first_name, last_name, dob, phone_number, email, gender, password") + 
			"values(?,?,?,?,?,?,?,?)";
	public static final String GET_USERNAME = "SELECT user_name FROM user_info";
	
	
}
