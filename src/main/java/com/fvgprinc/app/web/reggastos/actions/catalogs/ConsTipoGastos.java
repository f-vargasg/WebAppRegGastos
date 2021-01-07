/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fvgprinc.app.web.reggastos.actions.catalogs;

import com.fvgprinc.app.web.reggastos.bean.TipoGasto;
import com.fvgprinc.app.web.reggastos.bl.TipoGastoBL;
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
@Action(value = "consTipoGastos", results = {
    @Result(name = SUCCESS, location = "/consTipoGastos.jsp")})

public class ConsTipoGastos extends ActionSupport {

    private List<TipoGasto> lstEntidades = null;

    public List<TipoGasto> getLstEntidades() {
        return lstEntidades;
    }

    @Override
    public String execute() throws Exception {
        TipoGastoBL tipoGastoBL = new TipoGastoBL();

        lstEntidades = tipoGastoBL.getList(-1);
        return SUCCESS;
    }

}
