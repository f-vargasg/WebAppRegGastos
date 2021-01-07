/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fvgprinc.app.web.reggastos.actions.catalogs;

import com.fvgprinc.app.web.reggastos.bean.Moneda;
import com.fvgprinc.app.web.reggastos.bl.MonedaBL;
import com.fvgprinc.app.web.reggastos.common.GlobalConst;
import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionSupport;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;

/**
 *
 * @author garfi
 */
@Namespace(value = "/")
@Action(value = "insMoneda", results = {
    @Result(name = SUCCESS, location = "/exito.jsp")})
public class InsMonedaAction extends ActionSupport {

    private Moneda moneda = new Moneda();

    @Override
    public String execute() throws Exception {
        java.sql.Timestamp ts;
        MonedaBL monedaBL = new MonedaBL();
        this.moneda.setUsuIngreso(GlobalConst.USER_GLOBAL);
        LocalDateTime ldt = LocalDateTime.now();
        ts = Timestamp.valueOf(ldt);
        this.moneda.setFecIngreso(ts);
        monedaBL.insertar(moneda);
        return SUCCESS;
    }

    public Moneda getMoneda() {
        return moneda;
    }

}
