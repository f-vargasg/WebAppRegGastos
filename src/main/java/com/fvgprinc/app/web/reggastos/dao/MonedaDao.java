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

    private final String nomEntity = "moneda";

    private final String stmInsert = "Insert into  " + nomEntity
            + " (cod_moneda_n, des_moneda, usu_ingreso, fec_ingreso) "
            + "values (?, ?, ? ,?);";
    private final String stmUpdate = "Update " + nomEntity
            + " set des_moneda = ?"
            + " where cod_moneda_n = ? ";
    private final String stmDelete = "Delete from  " + nomEntity
                                     + " where cod_moneda_n = ?";

    private final String sql2 = "Select * "
            + "from moneda";

    public boolean insertar(Moneda moneda) throws SQLException {
        boolean resultado = false;

        Connection con = ConexionSQL.getConnetion();
        PreparedStatement ps = con.prepareStatement(stmInsert);

        ps.setInt(1, moneda.getCodMonedaN());
        ps.setString(2, moneda.getDesMoneda());
        ps.setString(3, moneda.getUsuIngreso());
        ps.setTimestamp(4, moneda.getFecIngreso());

        if (ps.executeUpdate() == 1) {
            resultado = true;
            ps.close();
            con.close();
        }
        return resultado;
    }

    public boolean modificar(Moneda moneda) throws SQLException {
        boolean resultado = false;

        Connection con = ConexionSQL.getConnetion();
        PreparedStatement ps = con.prepareStatement(stmUpdate);

        ps.setString(1, moneda.getDesMoneda());
        ps.setInt(2, moneda.getCodMonedaN());

        if (ps.executeUpdate() == 1) {
            resultado = true;
            ps.close();
            con.close();
        }
        return resultado;
    }
    
    public boolean borrar(int pcodMonedaN) throws SQLException {
        boolean resultado = false;

        Connection con = ConexionSQL.getConnetion();
        PreparedStatement ps = con.prepareStatement(stmDelete);
        ps.setInt(1, pcodMonedaN);

        if (ps.executeUpdate() == 1) {
            resultado = true;
            ps.close();
            con.close();
        }
        return resultado;
    }

    public ArrayList<Moneda> getList(int pcodMonedaN) throws SQLException {
        ArrayList<Moneda> lista = new ArrayList<>();
        Connection conn = ConexionSQL.getConnetion();
        PreparedStatement ps = conn.prepareStatement(sql2);
        String sql = sql2;
        String cond = (pcodMonedaN  > 0 ? " WHERE cod_moneda_n = " + Integer.toString(pcodMonedaN)
                : "");
        ResultSet res = ps.executeQuery(sql2 + cond);

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
