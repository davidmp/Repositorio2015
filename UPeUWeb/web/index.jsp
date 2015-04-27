<%-- 
    Document   : index
    Created on : 10/04/2015, 12:23:37 AM
    Author     : Intel
--%>

<%@page import="pe.edu.upeu.to.Personas"%>
<%@page import="java.util.ArrayList"%>
<%@page import="pe.edu.upeu.dao.PersonaDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <h1>Hola Mundo!</h1>
        <h1>Hola David!</h1>
        <h1>Hola David!</h1>
        <%
        PersonaDAO dao=new PersonaDAO();
        
        ArrayList<Personas> persona=null;
        
        try{
            persona=(ArrayList<Personas>)dao.reportarPersonasDos();
            for(Personas per: persona){
            out.println(per.getNombre());
            }
            
        }catch(Exception e){}
        
        
        %>
        
    </body>
</html>
