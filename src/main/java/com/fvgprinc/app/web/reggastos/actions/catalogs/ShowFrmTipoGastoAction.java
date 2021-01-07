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
import java.util.ArrayList;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;

/**
 *
 * @author garfi
 */
@Namespace(value = "/")
@Action(value = "showFrmTipoGasto", results = {
    @Result(name = SUCCESS, location = "/frmTipoGasto.jsp")})
public class ShowFrmTipoGastoAction extends ActionSupport {

    private int codTipogastoN;

    public int getCodTipogastoN() {
        return codTipogastoN;
    }

    public void setCodTipogastoN(int codTipogastoN) {
        this.codTipogastoN = codTipogastoN;
    }
    
    private TipoGasto tipoGasto;

    public TipoGasto getTipoGasto() {
        return tipoGasto;
    }
    
    private String actionForm;

    public String getActionForm() {
        return actionForm;
    }

    public void setActionForm(String actionForm) {
        this.actionForm = actionForm;
    }

    private String modeForm;

    public String getModeForm() {
        return modeForm;
    }

    public void setModeForm(String modeForm) {
        this.modeForm = modeForm;
    }

    private boolean disableKeyFld;

    public boolean isDisableKeyFld() {
        return disableKeyFld;
    }

    public void setDisableKeyFld(boolean disableKeyFld) {
        this.disableKeyFld = disableKeyFld;
    }
    
    private boolean disableFld;

    public boolean isDisableFld() {
        return disableFld;
    }

    public void setDisableFld(boolean disableFld) {
        this.disableFld = disableFld;
    }
    
    @Override
    public String execute() throws Exception {
        if (modeForm.compareTo(GlobalConst.MOD_MODEFORM) == 0 ||
            modeForm.compareTo(GlobalConst.DEL_MODEFORM) == 0) {
            TipoGastoBL tipoGastoBL = new TipoGastoBL();
            ArrayList<TipoGasto> lstEntity = tipoGastoBL.getList(codTipogastoN);
            
            for (TipoGasto tipoGasto1 : lstEntity) {
                this.tipoGasto = tipoGasto1;
            }
        }
        return SUCCESS;
    }

}
