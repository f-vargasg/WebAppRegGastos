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
import java.util.List;

/**
 *
 * @author garfi
 */
public class MonedaBL {

    private MonedaDao moneDao;
    
    public MonedaBL() {
        this.moneDao = new MonedaDao();
    }
    
    
    
    public ArrayList<Moneda> getList() throws SQLException
    {
        ArrayList<Moneda> res = this.moneDao.getList();
        return res;
    }
    
}
