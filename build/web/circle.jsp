<%-- 
    Document   : rect.jsp
    Created on : Sep 21, 2020, 9:28:23 AM
    Author     : sonnt
--%>

<%@page import="model.Circle"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <body>
        <%
            ArrayList<Circle> circles = (ArrayList<Circle>) request.getAttribute("circles");
        %>

        <canvas id="myCanvas" width="500" height="500" style="border:1px solid #d3d3d3;">
            Your browser does not support the HTML5 canvas tag.</canvas>

        <script>
            var c = document.getElementById("myCanvas");
            var ctx = c.getContext("2d");
            <% for (Circle c : circles) {
            %>
            ctx.beginPath();
            ctx.arc(<%=c.getX()%>, <%=c.getY()%>, <%=c.getRadius()%>, 0, 2 * Math.PI);
//            ctx.fillStyle = "rgb(<%=c.getRed()%>,<%=c.getGreen()%>,<%=c.getBlue()%>)";
//            ctx.fill();
            ctx.stroke();
            <%}%>
        </script> 
    </body>
</html>
