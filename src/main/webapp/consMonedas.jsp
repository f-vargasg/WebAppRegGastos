<%-- Document : lstmonedas Created on : 28/12/2020, 05:16:28 PM Author : garfi --%>
<%@taglib uri="/struts-tags" prefix="s" %>
<%@page contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>

    <body>
        <h1>Mantenimiento de Monedas</h1>
        <a href="index.html">Volver al inicio</a> <br />
        <a href="insMoneda.jsp">Ingresar moneda</a> <br />
        <table>
            <tr>
                <td></td>
                <td></td>
                <td>Cod.Moneda</td>
                <td>Des.Moneda</td>
                <td>Ing. por</td>
                <td>Fec.ingreso</td>
            </tr>
            <s:iterator value="lstMonedas">
                <tr>
                    <td><s:form action="showModMoneda.action">
                            <s:hidden name="codMonedaN" value="%{codMonedaN}" />
                            <s:submit value="Modif." />
                        </s:form></td>
                    <td><s:form action="showDelMoneda.action">
                            <s:hidden name="codMonedaN" value="%{codMonedaN}" />
                            <s:submit value="Borrar" />
                        </s:form></td>
                    <td><s:property value="codMonedaN"></s:property></td>
                    <td><s:property value="desMoneda"></s:property></td>
                    <td><s:property value="usuIngreso"></s:property></td>
                    <td><s:property value="fecIngreso"></s:property></td>
                    </tr>
            </s:iterator>
        </table>
    </body>

</html>