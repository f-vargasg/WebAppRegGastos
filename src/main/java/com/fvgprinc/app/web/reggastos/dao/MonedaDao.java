/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fvgprinc.app.web.reggastos.dao;

import com.fvgprinc.app.web.reggastos.bean.Moneda;
import com.fvgprinc.app.web.reggastos.conexion.ConexionSQL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author garfi
 */
public class MonedaDao {

    private String sql2 = "Select * "
            + "from moneda";

    public ArrayList<Moneda> getList() throws SQLException {
        ArrayList<Moneda> lista = new ArrayList<>();
        Connection conn = ConexionSQL.getConnetion();
        PreparedStatement ps = conn.prepareStatement(sql2);
        ResultSet res = ps.executeQuery(sql2);

        while (res.next()) {
            Moneda mon = new Moneda();
            mon.setCodMonedaN(res.getInt(1));
            mon.setDesMoneda(res.getString(2));
            mon.setUsuIngreso(res.getString(3));
            mon.setFecIngreso(res.getTimestamp(4));
            lista.add(mon);
        }
        ps.close();
        res.close();
        conn.close();
        return lista;

    }
}
