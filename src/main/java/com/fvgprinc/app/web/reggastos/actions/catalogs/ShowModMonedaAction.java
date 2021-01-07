/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fvgprinc.app.web.reggastos.actions.catalogs;

import com.fvgprinc.app.web.reggastos.bean.Moneda;
import com.fvgprinc.app.web.reggastos.bl.MonedaBL;
import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionSupport;
import java.util.List;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;

/**
 *
 * @author garfi
 */

@Namespace(value = "/")
@Action(value = "showModMoneda", results = {
    @Result(name = SUCCESS, location = "/modMoneda.jsp")})
public class ShowModMonedaAction extends ActionSupport  {

    private Moneda moneda;
    private int codMonedaN;
    
    
    @Override
    public String execute() throws Exception {
        MonedaBL monedaBL = new MonedaBL();
        List<Moneda> lstMon = monedaBL.getList(this.codMonedaN);
        
        lstMon.forEach(moneda1 -> {
            this.moneda = moneda1;
        });
        
        return SUCCESS;
    }

    public Moneda getMoneda() {
        return moneda;
    }
    
    

    public int getCodMonedaN() {
        return codMonedaN;
    }

    public void setCodMonedaN(int codMonedaN) {
        this.codMonedaN = codMonedaN;
    }
    
    
}
