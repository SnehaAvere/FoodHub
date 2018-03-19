<%-- 
    Document   : Home
    Created on : 15 Mar, 2018, 5:03:42 PM
    Author     : SNEHA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
     <!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" >
          <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <title>JSP Page</title>
    </head>
    <body>
         <%@include file="navbar.jsp" %>
         <!--<nav class="navbar navbar-inverse navbar-fixed-top" id="my-navbar">
        <div class="container">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#navbar-collapse">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>                        
      </button>
        
        <a href="" class="navbar-brand"><img src="images/logo2.jpg" style="max-width:200px;" alt="logo"</a>
    </div>
        <div class="collapse navbar-collapse" id="navbar-collapse">
      <ul class="nav navbar-nav">
          <li class="active"><a href="#">Home</a></li>
          <li><a href="#">Menu</a></li>
        <li><a href="#">Reservation</a></li>
        <li><a href="#">About Us</a></li>
        <li><a href="#">Contact Us</a></li>
      </ul>
            <ul class="nav navbar-nav navbar-right">
        <li><a href="login.jsp"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
        <li><a href="register.jsp"><span class="glyphicon glyphicon-user"></span> Register</a></li>
      </ul>
            </div>
  </div><!--end Container 
</nav>-->
        <div class="container">
        <div id="myCarousel" class="carousel slide" data-ride="carousel">
      <!-- Indicators -->
      <ol class="carousel-indicators">
        <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
        <li data-target="#myCarousel" data-slide-to="1"></li>
        <li data-target="#myCarousel" data-slide-to="2"></li>
      </ol>
      <div class="carousel-inner" role="listbox">
        <div class="item active">
          <img class="first-slide" src="images/title.jpg" alt="First slide">
         
        </div>
        <div class="item">
          <img class="second-slide" src="images/food.jpg" alt="Second slide">
          <div class="container">
            <div class="carousel-caption">
              <h1>WELCOME TO FOODHUB</h1>
              <p>Serving Classic Indian cuisine to the greater New Orleans area since 2010</p>
              <p><a class="btn btn-lg btn-primary" href="#" role="button">Learn more</a></p>
            </div>
          </div>
        </div>
        <div class="item">
          <img class="third-slide" src="images/img1.jpg" alt="Third slide">
          <div class="container">
            <div class="carousel-caption">
              <h1>WELCOME TO FOODHUB</h1>
              <p>Serving Classic Indian cuisine to the greater New Orleans area since 2010</p>
              <p><a class="btn btn-lg btn-primary" href="#" role="button">Browse gallery</a></p>
            </div>
          </div>
        </div>
      </div>
      <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
        <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
        <span class="sr-only">Previous</span>
      </a>
      <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
        <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
        <span class="sr-only">Next</span>
      </a>
    </div><!-- /.carousel -->
        </div>
       
     <div class="container marketing text-center">
  <h1>welcome to FoodHub Indian Cuisine</h1><br>
  <h2>Enjoy your piece of FoodHub!</h2>
  
      <!-- Three columns of text below the carousel -->
      <div class="row">
        <div class="col-lg-4">
          <img class="img-circle" src="images/title.jpg" alt="Generic placeholder image" width="140" height="140">
          <h2>EXPERINCE</h2>
          <h6>THE ULTIMATE INDIAN DINING EXPERIENCE IN NEW ORLEANS</h6>
          <p>FoodHub offers New Orleans the most diverse, authentic Indian menu. From samosas, pakoras and mulligatawny soup to chicken tikka masala, tandoori chicken, butter chicken and a range of vegetarian dishes, our menu is sure to satisfy the most discerning palate and Indian gourmand.</p>
          <p><a class="btn btn-default" href="#" role="button">View details &raquo;</a></p>
        </div><!-- /.col-lg-4 -->
        <div class="col-lg-4">
          <img class="img-circle" src="images/event.jpg" alt="Generic placeholder image" width="140" height="140">
          <h2>Reservation</h2>
          <p>Our restaurants prefer or even require reservations on special holidays when they are likely to be crowded. This helps them plan, schedule enough staff, and ensure a steady flow of customers.</p>
          <b>Please note we also have function room and outdoor area that can be booked for parties. Please call us on (08) 9272 3459 to find out more.</b>
          <p><a class="btn btn-default" href="#" role="button">View details &raquo;</a></p>
        </div><!-- /.col-lg-4 -->
        <div class="col-lg-4">
          <img class="img-circle" src="images/food1.jpg" alt="Generic placeholder image" width="140" height="140">
          <h2>food</h2>
          <p>The passion you put into your restaurant - from the great food, the personality of the decor, and the staff you’ve hired - is the same kind of passion that we bring to you as your restaurant food supplier.</p>
          <p><a class="btn btn-default" href="#" role="button">View details &raquo;</a></p>
        </div><!-- /.col-lg-4 -->
      </div><!-- /.row -->

     </div>
      <!-- START THE FEATURETTES -->
    
    
   <!--     <div class="container text-center">    
  <h1>welcome</h1><br>
  <div class="row">
    <div class="col-sm-4">
      <img src="images/table.jpg" class="img-responsive" style="width:100%" alt="Image">
      <p>Current Project</p>
    </div>
    <div class="col-sm-4"> 
      <img src="images/food.jpg" class="img-responsive" style="width:100%" alt="Image">
      <p>Project 2</p>    
    </div>
    <div class="col-sm-4">
      <div class="well">
       <p>Some text..</p>
      </div>
      <div class="well">
       <p>Some text..</p>
      </div>
    </div>
  </div>
</div><br>-->
    <%@include file="footer.jsp" %>
<!--
<footer class="container text-center">
    <div class="row" style="background-color:#F7DC6F; ">
        <section id="hours" class="col-sm-4">
            <span>Hours:</span><br>
            mon-fri: 10:00am-10:00pm<br>
            sat-sun: 8:00am-12:00am
            <hr class="visible-xs">
        </section>
        <section id="address" class="col-sm-4">
            <span>Address:</span><br>
            7015 Reisterstown Road<br>
            Baltimore,MD 21215
             <hr class="visible-xs">
        </section>
        <section id="testimonials" class="col-sm-4">
            <p>"The best indian restaurant I've been to! and that's saying a lot, since I've been to many!"</p>
            <p>"Amazing food! Great service! Couldn't ask for more!
            I'll be back again and again!"</p>
        </section>
    </div>
    <div class="text-center">&copy;Copyright FoodHub india 2010</div>
 
</footer>-->
         <script src="http://code.jquery.com/jquery-2.1.1.min.js"></script>
        <!-- Latest compiled and minified JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    </body>
</html>
