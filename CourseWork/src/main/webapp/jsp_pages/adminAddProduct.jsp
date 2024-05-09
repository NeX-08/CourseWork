<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>UI/UX</title>
  <link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Material+Symbols+Sharp:opsz,wght,FILL,GRAD@48,400,0,0" />
  <link rel="stylesheet" href="../stylesheets/admin.css">
</head>
<body>
   <div class="container">
      <aside>
           
         <div class="top">
           <div class="logo">
             <img src="images/logo.png" alt="NeX">
           </div>
           <div class="close" id="close_btn">
            <span class="material-symbols-sharp">
              close
              </span>
           </div>
         </div>
         <!-- end top -->
          <div class="sidebar">

            <a href="#">
              <span class="material-symbols-sharp">grid_view </span>
              <h3>Dashbord</h3>
            </a>
            <a href="adminUsers.jsp">
              <span class="material-symbols-sharp">person_outline </span>
              <h3>Users</h3>
            </a>
            <a href="adminOrders.jsp">
              <span class="material-symbols-sharp">receipt_long </span>
              <h3>Orders</h3>
            </a>
            <a href="adminProducts.jsp">
              <span class="material-symbols-sharp">receipt_long </span>
              <h3>Products</h3>
            </a>
            <a href="#">
              <span class="material-symbols-sharp">report_gmailerrorred </span>
              <h3>Reports</h3>
            </a>
            <a href="#" class="active">
              <span class="material-symbols-sharp">add </span>
              <h3>Add Product</h3>
            </a>
            <a href="#">
              <span class="material-symbols-sharp">logout </span>
              <h3>logout</h3>
            </a>
             


          </div>

      </aside>
      <!--end left-->

      <!--start center-->

      <main>
           <h1>Dashbord</h1>

           <div class="date">
             <input type="date" >
           </div>

      <div class="add_product">
         <h2>Add Product</h2>
<!-- action="/AddProduct.java" method="post" -->
        <form id="productForm" action="../AddProductServlet" method="post" enctype="multipart/form-data">
          <label for="product_name">Product Name:</label><br>
          <input type="text" id="productName" name="product_name" required><br><br>
  
          <label for="product_price">Product Price:</label><br>
          <input type="number" id="productPrice" name="product_price" required><br><br>
  
          <label for="product_desc">Product Description:</label><br>
          <textarea id="product_desc" name="product_desc" rows="4" cols="50" maxlength="155" required></textarea><br><br>
          
          <label for="category_id">Category</label><br>
          <input type="text" id="category_id" name="category_id" required><br><br>
  
          <label for="product_img">Product Image:</label><br>
          <input type="file" id="product_img" name="product_img" required><br><br>
  
          <input type="submit" value="Submit">
         </form>
      </div>

      </main>
      <!------------------
         end main
        ------------------->

      <!----------------
        start right main 
      ---------------------->
    <div class="right">

<div class="top">
   <button id="menu_bar">
     <span class="material-symbols-sharp">menu</span>
   </button>

   <div class="theme-toggler">
     <span class="material-symbols-sharp active">light_mode</span>
     <span class="material-symbols-sharp">dark_mode</span>
   </div>
    <div class="profile">
       <div class="info">
           <p><b>Babin</b></p>
           <p>Admin</p>
           <small class="text-muted"></small>
       </div>
       <div class="profile-photo">
         <img src="./images/profile-1.jpg" alt=""/>
       </div>
    </div>
</div>

  <div class="recent_updates">
     <h2>Recent Update</h2>
   <div class="updates">
      <div class="update">
         <div class="profile-photo">
            <img src="./images/profile-4.jpg" alt=""/>
         </div>
        <div class="message">
           <p><b>Random</b>StringUtils.Message</p>
        </div>
      </div>
      <div class="update">
        <div class="profile-photo">
        <img src="./images/profile-3.jpg" alt=""/>
        </div>
       <div class="message">
          <p><b>Random2</b>StringUtils.Message</p>
       </div>
     </div>
     <div class="update">
      <div class="profile-photo">
         <img src="./images/profile-2.jpg" alt=""/>
      </div>
     <div class="message">
        <p><b>Random3</b>StringUtils.Message</p>
     </div>
   </div>
  </div>
  </div>


   <div class="sales-analytics">
     <h2>Sales Analytics</h2>

      <div class="item onlion">
        <div class="icon">
          <span class="material-symbols-sharp">shopping_cart</span>
        </div>
        <div class="right_text">
          <div class="info">
            <h3>Onlion Orders</h3>
            <small class="text-muted">Last seen 2 Hours</small>
          </div>
          <h5 class="danger">-17%</h5>
          <h3>3849</h3>
        </div>
      </div>
      <div class="item onlion">
        <div class="icon">
          <span class="material-symbols-sharp">shopping_cart</span>
        </div>
        <div class="right_text">
          <div class="info">
            <h3>Onlion Orders</h3>
            <small class="text-muted">Last seen 2 Hours</small>
          </div>
          <h5 class="success">-17%</h5>
          <h3>3849</h3>
        </div>
      </div>
      <div class="item onlion">
        <div class="icon">
          <span class="material-symbols-sharp">shopping_cart</span>
        </div>
        <div class="right_text">
          <div class="info">
            <h3>Onlion Orders</h3>
            <small class="text-muted">Last seen 2 Hours</small>
          </div>
          <h5 class="danger">-17%</h5>
          <h3>3849</h3>
        </div>
      </div>
   
  

</div>

      <div class="item add_product">
            <div>
            <span class="material-symbols-sharp">add</span>
            </div>
     </div>
</div>


   </div>



   <script src="../script/admin.js"></script>
</body>
</html>