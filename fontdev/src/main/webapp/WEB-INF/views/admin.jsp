<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<c:set var="cp" value="${pageContext.request.contextPath}" />
<jsp:include page="header.jsp" > <jsp:param name="" value=""/> </jsp:include>

<form:form method="GET" action="/all" modelAttribute="sub">

<table class="table">

<tr>
<td><label path="name">Product Name</label></td><td><input path="name" /><errors path="name" cssclass="error"/>
</td>
</tr>
<tr>
<td><label path="name">Version</label></td><td><input path="desc" /><errors path="desc" cssclass="error"/>
</td>
</tr>
<tr>
<td><label path="name">Price</label></td><td><input path="price" /><errors path="price" cssclass="error"/>
</td>
</tr>
<tr>
<td><label path="name">Supplier</label></td><td><input path="Supplier" /><errors path="Supplier" cssclass="error"/>
</td>
</tr>
<td><input type="submit" value="Submit" /></td>
<td><input type="reset" value="Reset" /></td>
</tr>
</table>
</form:form>


<c:forEach items="${products}" var="product">

<table class="table">
<tr>
</tr>
<tr>
<td>${products.id}</td>
<td>${products.name}</td>
<td>${products.price}</td>
 <td>${products.desc}</td>  
<td>${products.Supplier}</td>
<td><a href="${cp}/admin/edit/${products.id}">Edit</a></td>
<td><a href="${cp}/admin/delete/${products.id}">delete</a></td>
</tr>
</table>

</c:forEach>

<jsp:include page="footer.jsp">
	<jsp:param name="" value="" />
</jsp:include>

