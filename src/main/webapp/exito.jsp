<%-- 
    Document   : exito
    Created on : 28/12/2020, 08:32:18 PM
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
        <p><strong>Transacción realizada con exito</strong></p>
    <s:form action="/consMonedas.action">
        <s:submit value="Consultar"></s:submit>
    </s:form>
</body>
</html>
