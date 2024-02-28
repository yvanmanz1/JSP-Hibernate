<%@page import="com.javatpoint.dao.UserDao, com.javatpoint.bean.User"%>
<jsp:useBean id="u" class="com.javatpoint.bean.User"></jsp:useBean>
<jsp:setProperty property="*" name="u"/>

<%
String id = request.getParameter("id");
if (id != null && !id.isEmpty()) {
    // Ensure that the 'id' parameter is valid
    int userId = Integer.parseInt(id);

    // Retrieve the user using Hibernate
    u = UserDao.getRecordById(userId);

    // Delete the user
    if (u != null) {
        UserDao.delete(u);
    }
}

response.sendRedirect("viewusers.jsp");
%>
