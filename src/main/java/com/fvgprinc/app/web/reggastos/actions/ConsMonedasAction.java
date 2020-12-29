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
import java.util.ArrayList;
import java.util.List;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;

/**
 *
 * @author garfi
 */
@Namespace(value = "/")
@Action(value = "consMonedas", results = {
    @Result(name = SUCCESS, location = "/consMonedas.jsp")})
public class ConsMonedasAction extends ActionSupport {

     private List<Moneda> lstMonedas = new ArrayList<>();
    //private List<Moneda> lista = null;

    @Override
    public String execute() throws Exception {
        MonedaBL monedaBL = new MonedaBL();

        lstMonedas = monedaBL.getList(-1);

        return SUCCESS;
    }

    public List<Moneda> getLstMonedas() {
        return lstMonedas;
    }

    
    
    

}
