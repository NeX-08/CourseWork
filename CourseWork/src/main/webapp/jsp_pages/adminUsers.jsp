<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import = "jservlets.AdminServlet" %>
<%@ page import = "model.UserModel"%>
<%@ page import = "controller.DatabaseController" %>
<%@ page import = "java.util.ArrayList" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>UI/UX</title>
  <link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Material+Symbols+Sharp:opsz,wght,FILL,GRAD@48,400,0,0" />
  <link rel="stylesheet" type="text/css" href="../stylesheets/admin.css">
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
            <a href="#" class="active">
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
            <a href="adminAddProduct.jsp">
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

      <div class="display_table">
         <h2>Users</h2>
         <table> 
             <thead>
              <tr>
                <th>User Name</th>
                <th>User ID</th>
                <th>Gender</th>
                <th>Email</th>
                <th>Phone Number</th>
              </tr>
             </thead>
              <tbody>
                 <% 	
                 DatabaseController db = new DatabaseController();
         		 ArrayList<UserModel> userList = new ArrayList<>();
         		 userList = db.getUsers();
                 
                 for(UserModel user : userList) {
                 %>
                 <tr> 
                 	<td><%=user.getUser_id()%></td>
                 	<td><%=user.getUser_name()%><td>
                 	<td><%=user.getGender()%></td>
                 	<td><%=user.getEmail()%></td>
 					<td><%=user.getPhoneNumber() %></td>  
 					<td><button id="delete_btn">Delete</button>    
 				</tr>
 				<% } %>   
              </tbody>
         </table>
         <a href="#">Show All</a>
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
           <p><b>Babar</b></p>
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



   <script src="admin.js"></script>
</body>
</html>