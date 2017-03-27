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
        <h1>McKayla's Books</h1>
        
    <tr> 
        <th>BookID</th>
        <th>Title</th>
        <th>Author</th>
        <th>Publisher</th>
        <th>Personal Rating</th>
        <th>Own?</th>
        <th>Read?</th>
    </tr>
    
        
    <%= table %>   
        <br><br>
        
        <a href="add">Add A New Book</a>
        
    </body>
</html>
