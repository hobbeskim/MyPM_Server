<%@ page import="java.sql.*"
        contentType="text/html;charset=utf-8"%>
<%
        String URL = "jdbc:mysql://localhost/mypm";
        String USER = "root";
        String PW = "1234";
        Connection conn;
        Statement stmt;
        try {
                Class.forName("com.mysql.jdbc.Driver");
                conn = DriverManager.getConnection(URL, USER, PW);
                stmt = conn.createStatement();
                conn.close();
                out.println("Mysql Connection Success!");
        }
        catch (Exception e) {
                out.println(e);
        }
%>