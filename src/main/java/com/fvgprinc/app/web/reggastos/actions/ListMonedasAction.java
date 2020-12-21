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
import java.sql.Date;
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
@Action(value = "listmonedasaction", results = {
    @Result(name = SUCCESS, location = "/listmonedas.jsp")})
public class ListMonedasAction extends ActionSupport {
    // private static final long serialVersionUID = -7591893545033222898L;

    private ListMonedasAction dto = null;
    
    
    private int codMonedaN;
    private String desMoneda;
    private String usuIngreso;
    private Date fecIngreso;

    private List<ListMonedasAction> lstMonAction = null;

    @Override
    public String execute() throws Exception {
        // ResultSet rs = DisplayDao.Report();
        MonedaBL monBL = new MonedaBL();
        ArrayList<Moneda> lstMon = monBL.getList();
        lstMonAction = new ArrayList<ListMonedasAction>();

        if (lstMon.size() > 0) {
            for (Moneda mon : lstMon) {
                dto = new ListMonedasAction();
                dto.setCodMonedaN(mon.getCodMonedaN());
                dto.setDesMoneda(mon.getDesMoneda());
                dto.setUsuIngreso(mon.getUsuIngreso());
                dto.setFecIngreso(mon.getFecIngreso());
                lstMonAction.add(dto);
            }

        }

        return SUCCESS;
    }

    public int getCodMonedaN() {
        return codMonedaN;
    }

    public void setCodMonedaN(int codMonedaN) {
        this.codMonedaN = codMonedaN;
    }

    public String getDesMoneda() {
        return desMoneda;
    }

    public void setDesMoneda(String desMoneda) {
        this.desMoneda = desMoneda;
    }



    public String getUsuIngreso() {
        return usuIngreso;
    }

    public void setUsuIngreso(String usuIngreso) {
        this.usuIngreso = usuIngreso;
    }

    public Date getFecIngreso() {
        return fecIngreso;
    }

    public void setFecIngreso(Date fecIngreso) {
        this.fecIngreso = fecIngreso;
    }

    public List<ListMonedasAction> getMonedaLst() {
        return lstMonAction;
    }

    public void setMonedaLst(List<ListMonedasAction> monedaLst) {
        this.lstMonAction = monedaLst;
    }

    
}
