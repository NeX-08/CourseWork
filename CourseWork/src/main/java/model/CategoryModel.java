package model;


import java.io.Serializable;


public class CategoryModel implements Serializable{
	private static final long serialVersionUID = 1L;
	private int category_id;
	private String category_name;
	
	// constructor
	public CategoryModel(int category_id, String category_name) {
		super();
		this.category_id = category_id;
		this.category_name = category_name;
	}


	//getter method
	public int getCategory_id() {
		return category_id;
	}


	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}


	
	// setter method
	public String getCategory_name() {
		return category_name;
	}


	public void setCategory_name(String category_name) {
		this.category_name = category_name;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	
}
