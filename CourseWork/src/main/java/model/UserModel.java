package model;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * 
 */
public class UserModel implements Serializable {
	private static final long serialVersionUID = 1L;
	private int user_id;
	private String user_name;
	private String first_name;
	private String last_name;
	private LocalDate dob;
	private String phoneNumber;
	private String email;
	private String gender;
	private String password;
	private String retypePassword;
	
	// constructor
	public UserModel(int user_id, String user_name, String first_name, String last_name, LocalDate dob,
			String phoneNumber, String email, String gender, String password, String retypePassword) {
		super();
		this.user_id = user_id;
		this.user_name = user_name;
		this.first_name = first_name;
		this.last_name = last_name;
		this.dob = dob;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.gender = gender;
		this.password = password;
		this.retypePassword = retypePassword;
	}

	
	// getter and setter method
	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRetypePassword() {
		return retypePassword;
	}

	public void setRetypePassword(String retypePassword) {
		this.retypePassword = retypePassword;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	
}