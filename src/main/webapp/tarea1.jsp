<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%
  int num =0;
  int esprimo=0, exponente = 0;
%>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Hello World - JSP tutorial</title>
</head>
<body>
<table border=1>
<%
	for (int i = 1; i <= 100; i++) {
		int counter=0;
		for(num =i; num>=1; num--) {
			if(i%num==0) {
				counter = counter + 1;
	    	}
		}
	 	if (counter ==2) {
	    	esprimo = i;
	    	exponente = i*i;
%>
<tr><td>
	Numero primo <%=esprimo %>
	</td><td>
	El Exponenete del primo es <%=exponente %>
	</td>
<%
		}
	}
%>
</table>
</body>
</html>