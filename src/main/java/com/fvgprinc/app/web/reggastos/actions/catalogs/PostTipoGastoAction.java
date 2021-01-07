/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fvgprinc.app.web.reggastos.actions.catalogs;

import com.fvgprinc.app.web.reggastos.bean.TipoGasto;
import com.fvgprinc.app.web.reggastos.bl.TipoGastoBL;
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
@Action(value = "postTipoGasto", results = {
    @Result(name = SUCCESS, location = "/exito.jsp")})
public class PostTipoGastoAction extends ActionSupport {

    private TipoGasto tipoGasto = new TipoGasto();

    public TipoGasto getTipoGasto() {
        return tipoGasto;
    }
    
    int codTipogastoN;

    public int getCodTipogastoN() {
        return codTipogastoN;
    }

    public void setCodTipogastoN(int codTipogastoN) {
        this.codTipogastoN = codTipogastoN;
    }
    

    private String exitoAction;

    public String getExitoAction() {
        return exitoAction;
    }

    public void setExitoAction(String exitoAction) {
        this.exitoAction = exitoAction;
    }

    String modeForm;

    public String getModeForm() {
        return modeForm;
    }

    public void setModeForm(String modeForm) {
        this.modeForm = modeForm;
    }

    @Override
    public String execute() throws Exception {
        java.sql.Timestamp ts;
        LocalDateTime ldt = LocalDateTime.now();
        ts = Timestamp.valueOf(ldt);
        TipoGastoBL tipoGastoBL = new TipoGastoBL();

        if (this.modeForm.compareTo(GlobalConst.INS_MODEFORM) == 0) {
            this.tipoGasto.setUsuIngreso(GlobalConst.USER_GLOBAL);
            this.tipoGasto.setFecIngreso(ts);
            tipoGastoBL.insertar(tipoGasto);
        } else if (this.modeForm.compareTo(GlobalConst.MOD_MODEFORM) == 0) {
            tipoGasto.setCodTipogastoN(codTipogastoN);
            tipoGastoBL.modificar(tipoGasto);
        } else {
              tipoGastoBL.borrar(codTipogastoN);  
        }
        return SUCCESS;
    }

}
