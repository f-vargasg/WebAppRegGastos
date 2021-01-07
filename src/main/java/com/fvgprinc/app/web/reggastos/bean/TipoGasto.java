/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fvgprinc.app.web.reggastos.bean;

import java.io.Serializable;
import java.sql.Timestamp;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author garfi
 */
@Entity
@Table(name = "tipogasto")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tipogasto.findAll", query = "SELECT t FROM Tipogasto t"),
    @NamedQuery(name = "Tipogasto.findByCodTipogastoN", query = "SELECT t FROM Tipogasto t WHERE t.codTipogastoN = :codTipogastoN"),
    @NamedQuery(name = "Tipogasto.findByDesTipogasto", query = "SELECT t FROM Tipogasto t WHERE t.desTipogasto = :desTipogasto"),
    @NamedQuery(name = "Tipogasto.findByUsuIngreso", query = "SELECT t FROM Tipogasto t WHERE t.usuIngreso = :usuIngreso"),
    @NamedQuery(name = "Tipogasto.findByFecIngreso", query = "SELECT t FROM Tipogasto t WHERE t.fecIngreso = :fecIngreso")})
public class TipoGasto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "cod_tipogasto_n")
    private Integer codTipogastoN;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "des_tipogasto")
    private String desTipogasto;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 80)
    @Column(name = "usu_ingreso")
    private String usuIngreso;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fec_ingreso")
    @Temporal(TemporalType.TIMESTAMP)
    private Timestamp fecIngreso;

    public TipoGasto() {
    }

    public TipoGasto(Integer codTipogastoN) {
        this.codTipogastoN = codTipogastoN;
    }

    public TipoGasto(Integer codTipogastoN, String desTipogasto, String usuIngreso, Timestamp fecIngreso) {
        this.codTipogastoN = codTipogastoN;
        this.desTipogasto = desTipogasto;
        this.usuIngreso = usuIngreso;
        this.fecIngreso = fecIngreso;
    }

    public Integer getCodTipogastoN() {
        return codTipogastoN;
    }

    public void setCodTipogastoN(Integer codTipogastoN) {
        this.codTipogastoN = codTipogastoN;
    }

    public String getDesTipogasto() {
        return desTipogasto;
    }

    public void setDesTipogasto(String desTipogasto) {
        this.desTipogasto = desTipogasto;
    }

    public String getUsuIngreso() {
        return usuIngreso;
    }

    public void setUsuIngreso(String usuIngreso) {
        this.usuIngreso = usuIngreso;
    }

    public Timestamp getFecIngreso() {
        return fecIngreso;
    }

    public void setFecIngreso(Timestamp fecIngreso) {
        this.fecIngreso = fecIngreso;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codTipogastoN != null ? codTipogastoN.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoGasto)) {
            return false;
        }
        TipoGasto other = (TipoGasto) object;
        if ((this.codTipogastoN == null && other.codTipogastoN != null) || (this.codTipogastoN != null && !this.codTipogastoN.equals(other.codTipogastoN))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.fvgprinc.app.web.reggastos.bean.Tipogasto[ codTipogastoN=" + codTipogastoN + " ]";
    }
    
}
