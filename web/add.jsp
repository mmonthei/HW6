<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add A New Book</title>
    </head>
    <body>
        <h1>Add A New Book</h1>
        
        <form name="addForm" action="addBook" method="get">
            
            <label>Book Title:</label>
            <input type="text" name="title" value="" />
            <br>
            <label>Book Author:</label>
            <input type="text" name="author" value="" />
            <br>
            <label>Book Publisher:</label>
            <input type="text" name="publisher" value="" />
            <br>
            <label>Personal Rating:</label>
            <input type="text" name="rating" value="" />
            <br>
            <label>Own:</label>
            <input type="text" name="own" value="" />
            <br>
            <label>Read:</label>
            <input type="text" name="read" value="" />
            <br>
            <input type="submit" name="submit" value="Submit" />
        </form>
        
    </body>
</html>
