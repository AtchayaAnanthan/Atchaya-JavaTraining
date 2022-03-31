<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<p>
Now timeis:
<%=new java.util.Date() %></p>

<c:set var="String" value="Welcome to Atchu's Session"/>  
  
<c:if test="${fn:contains(String, 'Session')}">  
   <p>yes.....String contains the word session<p>  
</c:if>  
  
<c:if test="${fn:contains(String, 'Welcome')}">  
   <p>yes.....String contains the word Welcome also<p>  
</c:if> 
<c.out value=${"<h2>Adding Product</h2>"}></c.out>
<c.forEach var="j" begin="1" end="3"> Item
<c.out value="${j}" />
</c.forEach>
<%
out.println(request.getClass());
out.println("\n<h5>"+application.getContextPath()+"\n<h5>");
out.println("\n<h5>"+page.getClass()+"\n from page<h5>");
out.println("\n<h5>"+config.getClass()+"\n from config<h5>");
int len=request.getContentLength();
out.println("\n getContentLength()" +len+"\n");
String s=page.toString();
out.println("toString():"+s+"\n");
int hashc=page.hashCode();
out.println("\n hashcode() :"+hashc+"\n");
String s1=application.getServerInfo();
out.println("\n getServerInfo():"+s1+"\n");
out.println("getEffectiveMajorVersion()"+application.getEffectiveMajorVersion()+"\n from application");
int mv=application.getMinorVersion();
out.println("\n getMinnorVersion():"+mv+"\n");
out.println("getServletContextName()"+application.getServletContextName()+"\n from application");
out.println("getRequestCharacterEncoding()"+application.getRequestCharacterEncoding()+"\n from application");
out.println("getVirtualServername()"+application.getVirtualServerName()+"\n from application");
out.println("From config getInitParameter()"+config.getInitParameter(""));
%>
<a href="<c:url value="/Welcome.jsp"/>">ClickMe</a>

</body>
</html>