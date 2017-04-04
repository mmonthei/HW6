<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="./style.css">
        <title>McKayla's Books</title>
    </head>
    
    <% String table = (String) request.getAttribute("table"); %>
    
    
    <body>
        
        <div class="wrap"> <!--div to hold all other divs -->
        
        <!-- Header -->
        <%@include file="includes/header.jsp" %>

        <!-- Menu -->
        <%@include file="includes/menu.jsp" %>
        
        <div class="main"> <!-- main div -->
        
        
        <h1>McKayla's Books</h1>
        
    
    <table class="readTable">   
    <%= table %>   
        <br><br>
        
        <a href="add">Add A New Book</a>
        
        <br><br>
        
        <a href="search.jsp">Search All Books</a>
        
         </div> <!-- close main div -->
    
        <!-- Footer -->
        <%@include file="includes/footer.jsp" %>
        
        </div> <!-- close the wrap div -->  
        
    </body>
</html>
