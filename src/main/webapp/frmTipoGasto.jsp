<%-- 
    Document   : insTipoGasto
    Created on : 29/12/2020, 11:46:10 AM
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
        <a href="consTipoGastos.action">Listado de Monedas</a> <br />
        <s:form action="postTipoGasto.action">
            <s:hidden name="codTipogastoN" value="%{tipoGasto.codTipogastoN}" />
            <s:hidden name="exitoAction" value="consTipoGastos" />
            <s:hidden name="modeForm" value="%{modeForm}" />
            <s:textfield label="Codigo" name="tipoGasto.codTipogastoN" disabled="%{disableKeyFld}"></s:textfield>    
            <s:textfield label="Descripcion" name="tipoGasto.desTipogasto" disabled="%{disableFld}"></s:textfield>
            <s:submit value="Post Data"></s:submit>
        </s:form>
        <s:form action="consTipoGastos.action">
            <s:submit value="Cancelar"></s:submit>
        </s:form>
    </body>
</html>
