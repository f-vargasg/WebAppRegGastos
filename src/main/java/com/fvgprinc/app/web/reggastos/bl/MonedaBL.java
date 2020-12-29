/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fvgprinc.app.web.reggastos.bl;

import com.fvgprinc.app.web.reggastos.bean.Moneda;
import com.fvgprinc.app.web.reggastos.dao.MonedaDao;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author garfi
 */
public class MonedaBL {

    private MonedaDao moneDao;
    
    public MonedaBL() {
        this.moneDao = new MonedaDao();
    }
    
    public boolean insertar(Moneda pmoneda) throws SQLException {
        boolean res;
        
        res = moneDao.insertar(pmoneda);
        return res;
    }
    
    public boolean modificar(Moneda pmoneda) throws SQLException {
        boolean res ;
        res = moneDao.modificar(pmoneda);
        
        return res;
    }
    
    public boolean borrar(int pCodMonedaN) throws SQLException {
        boolean res;
        
        res = moneDao.borrar(pCodMonedaN);
        return res;
    }
    
    public ArrayList<Moneda> getList(int pcodMonedaN) throws SQLException
    {
        ArrayList<Moneda> res = this.moneDao.getList(pcodMonedaN);
        return res;
    }
    
}
