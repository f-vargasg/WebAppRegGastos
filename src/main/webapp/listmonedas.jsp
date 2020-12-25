<%-- 
    Document   : listmonedas
    Created on : Dec 20, 2020, 10:28:31 AM
    Author     : garfi
--%>

<%@taglib prefix="s" uri="/struts-tags"%>
<%@taglib prefix="display" uri="http://displaytag.sf.net"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <style type="text/css">
            table, th, td {
                border: 1px solid black;
            }

            table {
                width: 38%;
            }
        </style>
    </head>
    <body>
       <h2>Struts 2 pagination using display tag</h2>
	<display:table name="lstMonedas" pagesize="12" requestURI="listmonedasaction.action">

		<display:caption>Lista de Monedas</display:caption>

		<display:column property="codMonedaN" title="Cod.Moneda" />
		<display:column property="desMoneda" title="Desc.Moneda" />
		<display:column property="usuIngreso" title="Ing. Por" />
                <display:column property="fecIngreso" title="Fec.Ingreso" />

		<display:setProperty name="paging.banner.placement" value="bottom" />
	</display:table>

    </body>
</html>
