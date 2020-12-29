<%-- 
    Document   : insMoneda
    Created on : 28/12/2020, 09:50:43 PM
    Author     : garfi
--%>
<%@taglib uri="/struts-tags" prefix="s" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h2>Insertar</h2>
        <a href="consMonedas.action">Listado de Monedas</a> <br />
    <s:form action="insMoneda.action">
        <s:textfield label="Codigo" name="moneda.codMonedaN" disabled="false" ></s:textfield>    
        <s:textfield label="Descripcion" name="moneda.desMoneda"></s:textfield>
        <s:submit value="Registrar"></s:submit>
    </s:form>
    <s:form action="consMonedas.action">
        <s:submit value="Cancelar"></s:submit>
    </s:form>
</body>
</html>
