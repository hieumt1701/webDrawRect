<%-- 
    Document   : rect.jsp
    Created on : Sep 21, 2020, 9:28:23 AM
    Author     : sonnt
--%>

<%@page import="model.Rect"%>
<%@page import="model.Circle"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <body>
        <%
            ArrayList<Rect> rect = (ArrayList<Rect>) request.getAttribute("Rect");
        %>

        <canvas id="myCanvas" width="500" height="500" style="border:1px solid #d3d3d3;">
            Your browser does not support the HTML5 canvas tag.</canvas>

        <script>
            var c = document.getElementById("myCanvas");
            var ctx = c.getContext("2d");
            <% for (Rect c : rect) {
            %>
            ctx.beginPath();
            ctx.rect(<%=c.getX()%>, <%=c.getY()%>, <%=c.getWidth()%>,<%=c.getHeight()%>);
//            ctx.fillStyle = "rgb(<%=c.getRed()%>,<%=c.getGreen()%>,<%=c.getBlue()%>)";
//            ctx.fill();
            ctx.stroke();
            <%}%>
        </script> 
    </body>
</html>
