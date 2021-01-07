/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fvgprinc.app.web.reggastos.dao;

import com.fvgprinc.app.web.reggastos.bean.Moneda;
import com.fvgprinc.app.web.reggastos.bean.TipoGasto;
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
public class TipoGastoDao {
    private final String nomEntity = "tipogasto";
    
    private final String  keyCond = "cod_tipogasto_n = ?" ;

    private final String stmInsert = "Insert into  " + nomEntity
            + " (cod_tipogasto_n,\n" +
                "des_tipogasto,\n" +
                "usu_ingreso,\n" +
                "fec_ingreso) "
            + "values (?, ?, ? ,?)";
    private final String stmUpdate = "Update " + nomEntity
            + " set des_tipogasto = ?"
            + " where  " + keyCond;
    private final String stmDelete = "Delete from  " + nomEntity
                                     + " where " + keyCond;

    private final String sql2 = "Select * "
                                + "from " + nomEntity;

    public boolean insertar(TipoGasto tipoGasto) throws SQLException {
        boolean resultado = false;

        Connection con = ConexionSQL.getConnetion();
        PreparedStatement ps = con.prepareStatement(stmInsert);

        ps.setInt(1, tipoGasto.getCodTipogastoN());
        ps.setString(2, tipoGasto.getDesTipogasto());
        ps.setString(3, tipoGasto.getUsuIngreso());
        ps.setTimestamp(4, tipoGasto.getFecIngreso());

        if (ps.executeUpdate() == 1) {
            resultado = true;
            ps.close();
            con.close();
        }
        return resultado;
    }

    public boolean modificar(TipoGasto tipoGasto) throws SQLException {
        boolean resultado = false;

        Connection con = ConexionSQL.getConnetion();
        PreparedStatement ps = con.prepareStatement(stmUpdate);

        ps.setString(1, tipoGasto.getDesTipogasto());
        ps.setInt(2, tipoGasto.getCodTipogastoN());

        if (ps.executeUpdate() == 1) {
            resultado = true;
            ps.close();
            con.close();
        }
        return resultado;
    }
    
    public boolean borrar(int pcodTipoGasto) throws SQLException {
        boolean resultado = false;

        Connection con = ConexionSQL.getConnetion();
        PreparedStatement ps = con.prepareStatement(stmDelete);
        ps.setInt(1, pcodTipoGasto);

        if (ps.executeUpdate() == 1) {
            resultado = true;
            ps.close();
            con.close();
        }
        return resultado;
    }

    public ArrayList<TipoGasto> getList(int pcodTipoGasto) throws SQLException {
        ArrayList<TipoGasto> lista = new ArrayList<>();
        Connection conn = ConexionSQL.getConnetion();
        PreparedStatement ps = conn.prepareStatement(sql2);
        String sql = sql2;
        String cond = (pcodTipoGasto  > 0 ? " WHERE cod_tipogasto_n = " + 
                       Integer.toString(pcodTipoGasto)
                : "");
        ResultSet res = ps.executeQuery(sql2 + cond);

        while (res.next()) {
            TipoGasto tg=  new TipoGasto();
            tg.setCodTipogastoN(res.getInt(1));
            tg.setDesTipogasto(res.getString(2));
            tg.setUsuIngreso(res.getString(3));
            tg.setFecIngreso(res.getTimestamp(4));
            lista.add(tg);
        }
        ps.close();
        res.close();
        conn.close();
        return lista;

    }    
}
