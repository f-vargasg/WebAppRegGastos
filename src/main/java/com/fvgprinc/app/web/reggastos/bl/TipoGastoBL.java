/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fvgprinc.app.web.reggastos.bl;

import com.fvgprinc.app.web.reggastos.bean.Moneda;
import com.fvgprinc.app.web.reggastos.bean.TipoGasto;
import com.fvgprinc.app.web.reggastos.dao.TipoGastoDao;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author garfi
 */
public class TipoGastoBL {
    private TipoGastoDao tgDao;
    
    public TipoGastoBL() {
        this.tgDao = new TipoGastoDao();
    }
    
    public boolean insertar(TipoGasto ptipoGasto) throws SQLException {
        boolean res;
        
        res = tgDao.insertar(ptipoGasto);
        return res;
    }
    
    public boolean modificar(TipoGasto pmoneda) throws SQLException {
        boolean res ;
        res = tgDao.modificar(pmoneda);
        
        return res;
    }
    
    public boolean borrar(int pcodTipoGasto) throws SQLException {
        boolean res;
        
        res = tgDao.borrar(pcodTipoGasto);
        return res;
    }
    
    public ArrayList<TipoGasto> getList(int pcodTipoGasto) throws SQLException
    {
        ArrayList<TipoGasto> res = this.tgDao.getList(pcodTipoGasto);
        return res;
    }    
}
