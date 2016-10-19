<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
  
       <form:form method="post" action="save">    
        <table >    
         <tr>    
          <td>Brand : </td>   
          <td><form:input path="brand"  /></td>  
         </tr>    
         <tr>    
          <td>Model :</td>    
          <td><form:input path="model" /></td>  
         </tr>   
         <tr>    
          <td>OS :</td>    
          <td><form:input path="os" /></td>  
         </tr>   
         <tr> 
         <tr>    
          <td>Version :</td>    
          <td><form:input path="version" /></td>  
         </tr>   
         <tr> 
         <tr>    
          <td>Price :</td>    
          <td><form:input path="price" /></td>  
         </tr>   
         <tr>  
          <td colspan="2"><input type="submit" value="View" /></td> 
          <td colspan="2"><input type="submit" value="Add" /></td>
          <td colspan="2"><input type="submit" value="Save" /></td>
          <td colspan="2"><input type="submit" value="Delete" /></td>
          <td colspan="2"><input type="submit" value="Submit" /></td>    
         </tr>    
        </table>    
       </form:form>    