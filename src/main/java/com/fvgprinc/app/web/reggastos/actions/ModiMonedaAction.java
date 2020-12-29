/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fvgprinc.app.web.reggastos.actions;

import com.fvgprinc.app.web.reggastos.bean.Moneda;
import com.fvgprinc.app.web.reggastos.bl.MonedaBL;
import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;

/**
 *
 * @author garfi
 */

@Namespace(value = "/")
@Action(value = "modiMoneda", results = {
    @Result(name = SUCCESS, location = "/exito.jsp")})
public class ModiMonedaAction extends ActionSupport {
    Moneda moneda = new Moneda();
    int codMonedaN;

    public int getCodMonedaN() {
        return codMonedaN;
    }

    public void setCodMonedaN(int codMonedaN) {
        this.codMonedaN = codMonedaN;
    }
    
    
    
    @Override
    public String execute() throws Exception {
        MonedaBL monedaBL = new MonedaBL();
        moneda.setCodMonedaN(this.codMonedaN);
        monedaBL.modificar(moneda);
        return SUCCESS;
    }

    public Moneda getMoneda() {
        return moneda;
    }
    
    
    
}
