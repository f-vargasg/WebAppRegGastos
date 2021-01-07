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
import org.apache.struts2.convention.annotation.Result;

/**
 *
 * @author garfi
 */

@Action(value = "showDelMoneda", results = {
    @Result(name = SUCCESS, location = "/confdelmoneda.jsp")})
public class ShowDelMonedaAction extends ActionSupport {
    
    int codMonedaN;

    public int getCodMonedaN() {
        return codMonedaN;
    }

    public void setCodMonedaN(int codMonedaN) {
        this.codMonedaN = codMonedaN;
    }
    
    Moneda moneda;

    public Moneda getMoneda() {
        return moneda;
    }

    @Override
    public String execute() throws Exception {
        MonedaBL monedaBL = new MonedaBL();
        
        List<Moneda> lsMoneda = monedaBL.getList(this.codMonedaN);
        
        lsMoneda.forEach(moneda1 -> {
            this.moneda = moneda1;
        });
        
        
        return SUCCESS;
    }
    
    
    
    
    
}
