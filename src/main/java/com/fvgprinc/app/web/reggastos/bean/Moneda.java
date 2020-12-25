/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fvgprinc.app.web.reggastos.bean;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;
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
@Table(name = "moneda")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Moneda.findAll", query = "SELECT m FROM Moneda m"),
    @NamedQuery(name = "Moneda.findByCodMonedaN", query = "SELECT m FROM Moneda m WHERE m.codMonedaN = :codMonedaN"),
    @NamedQuery(name = "Moneda.findByDesMoneda", query = "SELECT m FROM Moneda m WHERE m.desMoneda = :desMoneda"),
    @NamedQuery(name = "Moneda.findByUsuIngreso", query = "SELECT m FROM Moneda m WHERE m.usuIngreso = :usuIngreso"),
    @NamedQuery(name = "Moneda.findByFecIngreso", query = "SELECT m FROM Moneda m WHERE m.fecIngreso = :fecIngreso")})
public class Moneda implements Serializable {

    @Size(max = 100)
    @Column(name = "des_moneda")
    private String desMoneda;
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

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "cod_moneda_n")
    private Integer codMonedaN;

    public Moneda() {
    }

    public Moneda(Integer codMonedaN) {
        this.codMonedaN = codMonedaN;
    }

    public Moneda(Integer codMonedaN, String usuIngreso, Timestamp fecIngreso) {
        this.codMonedaN = codMonedaN;
        this.usuIngreso = usuIngreso;
        this.fecIngreso = fecIngreso;
    }

    public Integer getCodMonedaN() {
        return codMonedaN;
    }

    public void setCodMonedaN(Integer codMonedaN) {
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

    public Timestamp getFecIngreso() {
        return fecIngreso;
    }

    public void setFecIngreso(Timestamp fecIngreso) {
        this.fecIngreso = fecIngreso;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codMonedaN != null ? codMonedaN.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Moneda)) {
            return false;
        }
        Moneda other = (Moneda) object;
        if ((this.codMonedaN == null && other.codMonedaN != null) || (this.codMonedaN != null && !this.codMonedaN.equals(other.codMonedaN))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.fvgprinc.app.web.reggastos.bean.Moneda[ codMonedaN=" + codMonedaN + " ]";
    }
    
    
}
