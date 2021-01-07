<%-- Document : consTipoGastos Created on : 29/12/2020, 11:42:34 AM Author : garfi --%>
<%@taglib uri="/struts-tags" prefix="s" %>
<%@page contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>

    <body>
        <h1>Mantenimineto de Tipos de Gasto</h1>
        <table style="border-collapse: collapse; width: 48.4666%; height: 71px;" border="1">
            <tbody>
                <tr>
                    <td>
                        <s:form action="showFrmTipoGasto.action">
                            <s:hidden name="actionForm" value="insTipoGasto" />
                            <s:hidden name="modeForm" value="1" />
                            <s:hidden name="disableKeyFld" value="false" />
                            <s:submit value="Incluir" />
                        </s:form>
                    </td>
                    <td><a href="index.html">Volver al inicio</a> </td>
                </tr>
            </tbody>
        </table>


        <table>
            <tr>
                <td></td>
                <td></td>
                <td>Cod.Tipo Gasto</td>
                <td>Des.Tipo Gasto</td>
                <td>Ing. por</td>
                <td>Fec.ingreso</td>
            </tr>
            <s:iterator value="lstEntidades">
                <tr>
                    <td>
                        <s:form action="showFrmTipoGasto.action">
                            <s:hidden name="codTipogastoN" value="%{codTipogastoN}" />
                            <s:hidden name="actionForm" value="modTipoGasto" />
                            <s:hidden name="modeForm" value="2" />
                            <s:hidden name="disableKeyFld" value="true" />
                            <s:hidden name="disableFld" value="false" />
                            <s:submit value="Modificar" />
                        </s:form>
                    </td>
                    <td>
                        <s:form action="showFrmTipoGasto.action">
                            <s:hidden name="codTipoGastoN" value="%{codTipoGastoN}" />
                            <s:hidden name="actionForm" value="delTipoGasto" />                                    
                            <s:hidden name="modeForm" value="3" />
                            <s:hidden name="disableKeyFld" value="true" />
                            <s:hidden name="disableFld" value="true" />
                            <s:submit value="Borrar" />
                        </s:form>
                    </td>
                    <td>
                        <s:property value="codTipogastoN"></s:property>
                        </td>
                        <td>
                        <s:property value="desTipogasto"></s:property>
                        </td>
                        <td>
                        <s:property value="usuIngreso"></s:property>
                        </td>
                        <td>
                        <s:property value="fecIngreso"></s:property>
                        </td>
                    </tr>
            </s:iterator>
        </table>
    </body>

</html>