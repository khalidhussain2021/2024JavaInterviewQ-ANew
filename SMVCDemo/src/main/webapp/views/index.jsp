<%@page import="java.util.*"%>
<HTML>
<BODY>
<%!
Date theDate = new Date(); // Corrected the unwanted space in the declaration
Date getDate() {
    System.out.println("In getDate() method");
    return theDate;
}
%>
Hello! The time is now <%=getDate()%>
<h2>${msg}</h2>
</BODY>
</HTML>