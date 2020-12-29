<%-- 
    Document   : modMoneda
    Created on : 28/12/2020, 06:38:58 PM
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

    <h2>Modificar</h2>
    <a href="consMonedas.action">Listado de Monedas</a> <br/>
    <s:form action="modiMoneda.action">
        <s:hidden name="codMonedaN" value="%{moneda.codMonedaN}" />
        <s:textfield label="Codigo" name="moneda.codMonedaN" disabled="true" ></s:textfield>    
        <s:textfield label="Descripcion" name="moneda.desMoneda"></s:textfield>
        <s:submit value="Modificar"></s:submit>
    </s:form>
    <s:form action="consMonedas.action">
        <s:submit value="Cancelar"></s:submit>
    </s:form>
</html>

