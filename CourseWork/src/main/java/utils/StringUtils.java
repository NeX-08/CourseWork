package utils;

public class StringUtils {
	public static final String INSERT_USERS = "insert into users_info" + 
			("user_name, first_name, last_name, dob, phone_number, email, gender, password") + 
			"values(?,?,?,?,?,?,?,?)";
	public static final String GET_USERNAME = "SELECT user_name FROM user_info";
	public static final String GET_PHONE = "SELECT phone_number FROM user_info";
	public static final String GET_EMAIL = "SELECT email FROM user_info";
	public static final String GET_PRODUCTS = "SELECT product_name, product_price, product_desc, product_img FROM product";
	public static final String GET_PRODUCTS_FOR_ADMIN = "SELECT product_id, product_name, product_price, product_desc, vendor, category_id FROM product";
	public static final String GET_ORDERS = "SELECT order_id, user_id, order_date, delivery_status FROM order";
	public static final String GET_USERS_FOR_ADMIN = "SELECT user_id, user_name, gender, email, phone_number FROM user_info";;
	
}
