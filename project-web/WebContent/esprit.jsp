<%@ page import="java.io.*, java.util.*"%>
<!DOCTYPE html>
<html>
	<head>
		<title>esprit</title>
	</head>
	<%!int visitCount = 0; %>
	<%String name = request.getParameter("name");	  
	  visitCount++;
	%>
	<body>
	<%for(int i = 0; i<3; i++) {%>
		<p>hello <%=new StringBuilder(name).reverse().toString()%>!</p>
	<%} %>	
	<p>visits: <%=visitCount%></p>
	</body>
</html>