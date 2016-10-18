<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="/WEB-INF/jsp/includes.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Products Management</title>
</head>
<body>
 <h1>Products Data</h1>
 <form:form action="products.do" method=POST commandName="products"> 
 
 <table>
 <tr>
 <td>Product ID</td>
 <td><form:input path="productid"/></td>
 </tr>
 <tr>
 <td>Brand</td>
 <td><form:input path="brand"/></td>
 </tr>
 <tr>
 <td>Model</td>
 <td><form:input path="model"/></td>
 </tr>
 <tr>
 <td>OS</td>
 <td><form:input path="os"/></td>
 </tr>
 <tr>
 <td>Version</td>
 <td><form:input path="version"/></td>
 </tr>
 <tr>
 <td>Price</td>
 <td><form:input path="price"/></td>
 </tr>
 <tr>
 <td colspan="2">
 <input type="button" name="action" value="Add">
 <input type="button" name="action" value="Edit">
 <input type="button" name="action" value="Delete">
 <input type="button" name="action" value="Search">
 </td>
 </tr>
  </table>
    </form:form>
 
 <table border="1">
 <thead>Id</thead>
 <thead>Brand</thead>
 <thead>Model</thead>
 <thead>Os</thead>
 <thead>Version</thead>
 <thead>Price</thead>
 <c:forEach items="${productsList}" var="products">
 <tr>
 <td>${Products.productid}</td>
 <td>${Products.brand}</td>
 <td>${Products.model}</td>
 <td>${Products.os}</td>
 <td>${Products.version}</td>
 <td>${Products.price}</td>
 </tr>
 </c:forEach>
 </table>

</body>
</html>