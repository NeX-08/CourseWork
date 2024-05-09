package utils;

public class StringUtils {
	public static final String INSERT_USERS = "insert into user" + 
			("user_name, first_name, last_name, dob, phone_number, email, gender, password") + 
			"values(?,?,?,?,?,?,?,?)";
	public static final String GET_USERNAME = "SELECT user_name FROM user";
	public static final String GET_PHONE = "SELECT phone_number FROM user";
	public static final String GET_EMAIL = "SELECT email FROM user";
	public static final String GET_PRODUCTS = "SELECT product_name, product_price, product_desc, product_img FROM products";
	public static final String GET_PRODUCTS_FOR_ADMIN = "SELECT product_id, product_name, product_price, product_desc, category FROM products";
	public static final String GET_ORDERS = "SELECT * FROM orders";
	public static final String GET_USERS_FOR_ADMIN = "SELECT user_id, user_name, gender, email, phone_number FROM user";;
	public static final String INSERT_PRODUCTS = "INSERT INTO products (product_name, product_price, product_desc, category, product_img) values (?, ?, ?, ?, ?)";


	// Messages
	public static final String PRODUCTS_MSG = "Error";
	
	
	// path
	public static final String ADD_PRODUCTS = "/jsp_pages/adminAddProduct.jsp";
}
