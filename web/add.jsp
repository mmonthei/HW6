<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="./style.css">
        <title>Add A New Book</title>
    </head>
    <body>
        
        <div class="wrap"> <!--div to hold all other divs -->
        
        <!-- Header -->
        <%@include file="includes/header.jsp" %>

        <!-- Menu -->
        <%@include file="includes/menu.jsp" %>
            
        <div class="main"> <!-- main div -->
        
        <h1>Add A New Book</h1>
        
        <form name="addForm" action="addBook" method="get">
            
            <table class="add">
            
            <tr>
                    <td class="right">Book Title:</td>
                    <td><input type="text" name="title" value="" /></td>
            </tr>
            
            <tr>
                    <td class="right">Book Author</td>
                    <td><input type="text" name="author" value="" /></td>
            </tr>
            
            <tr>
                    <td class="right">Book Publisher</td>
                    <td><input type="text" name="publisher" value="" /></td>
            </tr>
            
            <tr>
                    <td class="right">Book Rating</td>
                    <td><input type="text" name="rating" value="" /></td>
            </tr>
            
            <tr>
                    <td class="right">Book Own</td>
                    <td><input type="text" name="own" value="" /></td>
            </tr>
            
            <tr>
                    <td class="right">Book Read</td>
                    <td><input type="text" name="read" value="" /></td>
            </tr>
            </table>
            
            <input type="reset" value="Clear" id="clear">
            <input type="submit" name="submit" value="Submit" />
        </form>
        
        </div> <!-- close main div -->
    
        <!-- Footer -->
        <%@include file="includes/footer.jsp" %>
        
        </div> <!-- close the wrap div -->   
        
    </body>
</html>
