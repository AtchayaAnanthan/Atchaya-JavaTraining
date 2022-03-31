<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ page import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>My Web page</title>

</head>
<body bgcolor="aqua">


<form method="post" action=" MyServletClass">

<center>
<marquee direction="down" height="100" width="200"><h1 style="font-family:Brush Script MT">WELCOME</h1></marquee>
 <table>
 <tr>
 <td>
 Product id
 </td>
 <td> <input type="text" name="productid" values="P001"></td>
 </tr>
 <tr>
 <td>
 Product Name
 </td>
 <td> <input type="text" name="productname" values="AAA"></td>
 </tr>
 <tr>
 <td>
 Product Price
 </td>
 <td> <input type="text" name="productprice" values="1000"></td>
 </tr>
 <tr>
 <td>
 Product Quantity
 </td>
 <td> <input type="text" name="productQuantity" values="2"></td>
 </tr>
 
 <tr>
 <td>
 Product page
 <td><input type="submit" name="productpage"></td>
 </tr>
 </table>
 </center>
 </form>
 </body>
 </html>
 