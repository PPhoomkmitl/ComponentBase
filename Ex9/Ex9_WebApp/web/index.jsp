<%-- 
    Document   : index
    Created on : Sep 29, 2023, 2:38:18 PM
    Author     : Phoom1645
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       <form name="main" action="appServlet" method="Post">
            Radius:<input type="text" name="number" value="" size="70">
            <input type="submit" name="type" value="Area" size="70">
            <input type="submit" name="type" value="Perimeter" size="70">
        </form>   
    </body>
</html>
