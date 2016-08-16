<%@ page import="java.util.*"%>
<html>
<body>
	<center>
		<br><br><br><br><br><br><br><br>
		<h3>Beer Recommendation</h3>
		<br> <b>Try:</b>
		<%
			List myMenu = (List) request.getAttribute("styles");
			Iterator it = myMenu.iterator();
			int count = 0;
			while (it.hasNext()) {
				out.println("<br><font color='blue'>" + (++count) + ". " + it.next());
			}
		%>
	</center>
</body>
</html>