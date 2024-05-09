<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import = "model.ProductModel"%>
<%@ page import = "controller.DatabaseController" %>
<%@ page import = "java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
    .product-grid {
      display: grid;
      grid-template-columns: repeat(4, 1fr);
      gap: 20px;
    }
    .product {
      border: 1px solid #ccc;
      padding: 20px;
      text-align: center;
    }
    .product img {
      max-width: 100%;
      height: auto;
    }
  </style>
</head>
<body>
<div>
<% 	
	DatabaseController db = new DatabaseController();
	ArrayList<ProductModel> productList = new ArrayList<>();
	productList = db.getProducts();
                 
	for(ProductModel product : productList) {
%>
<div class="product">
    <img src=<%= product.getProduct_img() %> alt="Product 1">
    <h3><%= product.getProduct_name() %></h3>
    <p><%= product.getProduct_price() %></p>
    <p><%= product.getProduct_desc() %></p>
  </div>
<%} %>  
</div>
</body>
</html>