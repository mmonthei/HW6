<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>McKayla's Books</title>
    </head>
    
    <% String table = (String) request.getAttribute("table"); %>
    
    
    <body>
        <h1>McKayla's Books</h1>
        
        <%= table %>
        
        <br><br>
        
        <a href="add">Add A New Book</a>
        
    </body>
</html>
