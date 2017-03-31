<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="./style.css">
        <title>Search for a Book</title>
    </head>
    <body>
        <h1>Search for a Book</h1>
        
        <form name="searchForm" action="search" method="get">
        
            <input type="text" name="searchVal" value="" />
            
            <br>
            
            <input type="submit" name="submit" value="Search" />
            <input type="reset" value="Clear" id="clear">
            
        </form>
    </body>
</html>
