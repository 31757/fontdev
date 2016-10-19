<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>
<nav class="navbar navbar-inverse navbar-fixed-top">

  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">VanuShopping</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="<c:url value="/index"/>">Home</a></li>
      <li><a href="<c:url value="/about"/>">About</a></li>
      <li><a href="<c:url value="/product"/>">Products</a></li>
      <li><a href="<c:url value="/contact"/>">Contact</a></li>
      <li><a href="<c:url value="/viewall"/>">View All</a></li>
      <li><a href="<c:url value="/admin"/>">Admin</a></li>    
    </ul>
    <ul class="nav navbar-nav navbar-right">
     
     <li><a href="<c:url value="/sign"/>"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
      <li><a href="<c:url value="/adminlogin"/>"><span class="glyphicon glyphicon-log-in"></span> Admin</a></li>
    </ul>
  </div>
</nav>