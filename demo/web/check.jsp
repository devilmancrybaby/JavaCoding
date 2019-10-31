<%
    String un = request.getParameter("userName");
    if (un.equals("mingYang")) {
        response.sendRedirect("main.html");
    } else {
        response.sendRedirect("error.html");
    }
%>