<%-- 
    Document   : delmoneda
    Created on : 28/12/2020, 10:46:45 PM
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
        <h3>Confirmación de Borrado</h3>
        <s:hidden name="id" value="%{moneda.codMonedaN}" />
        <table>
            <tbody>
                <tr>
                    <td>cod.moneda:</td>
                    <td><s:property value="moneda.codMonedaN"/></td>
                </tr>
                <tr>
                    <td>descripcion:</td>
                    <td><s:property value="moneda.desMoneda"/></td>
                </tr>
                <tr>
                    <td>Ing.Por:</td>
                    <td><s:property value="moneda.usuIngreso"/> </td>
                </tr>
                <tr>
                    <td>Fec.Ingreso</td>
                    <td><s:property value="moneda.fecIngreso"/></td>
                </tr>
            </tbody>
        </table>

        <table >
            <tbody>
                <tr>
                    <td><s:form action="delMoneda.action">
                            <s:hidden name="codMonedaN" value="%{moneda.codMonedaN}" />
                            <s:submit value="Eliminar"></s:submit>
                        </s:form></td>
                    <td><s:form action="consMonedas.action">
                            <s:submit value="Cancelar"></s:submit>
                        </s:form></td>
                </tr>
            </tbody>
        </table>
    </body>
</html>
