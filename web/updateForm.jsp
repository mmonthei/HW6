<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="model.Books" %>
<% Books book = (Books) request.getAttribute("book"); %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="./style.css">
        <title>Update A Book</title>
    </head>
    <body>
        <h1>Update Book Record</h1>
        
        <form name="updateForm" action="updateBook" method="get">
            
            <table class="update">
                
            <tr>
                    <td class="right">Book ID:</td>
                    <td><input type="text" name="id" value="<%= book.getBookID() %>" /></td>
            </tr>
            
            <tr>
                    <td class="right">Book Title:</td>
                    <td><input type="text" name="title" value="<%= book.getBookTitle() %>" /></td>
            </tr>
            
            <tr>
                    <td class="right">Book Author</td>
                    <td><input type="text" name="author" value="<%= book.getBookAuthor() %>" /></td>
            </tr>
            
            <tr>
                    <td class="right">Book Publisher</td>
                    <td><input type="text" name="publisher" value="<%= book.getBookPublisher() %>" /></td>
            </tr>
            
            <tr>
                    <td class="right">Book Rating</td>
                    <td><input type="text" name="rating" value="<%= book.getBookRating() %>" /></td>
            </tr>
            
            <tr>
                    <td class="right">Book Own</td>
                    <td><input type="text" name="own" value="<%= book.getBookOwn() %>" /></td>
            </tr>
            
            <tr>
                    <td class="right">Book Read</td>
                    <td><input type="text" name="read" value="<%= book.getBookRead() %>" /></td>
            </tr>
            
            <input type="reset" value="Clear" id="clear">
            <input type="submit" name="submit" value="Update" />
        </form>        
    </body>
</html>
