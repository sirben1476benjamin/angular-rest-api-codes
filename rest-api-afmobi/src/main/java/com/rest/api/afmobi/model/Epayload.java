/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rest.api.afmobi.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author AFMOBI
 */
@Entity
public class Epayload implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Basic(optional = false)
    @Column(name = "pid")
    private Long pid;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "msisdn")
    private String msisdn;
    @Column(name = "epayloadDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date epayloadDate;
    @Column(name = "serviceId")
    private Long serviceId;

    public Epayload() {
    }

    public Epayload(Long pid) {
        this.pid = pid;
    }

    public Epayload(Long pid, String msisdn, Date epayloadDate) {
        this.pid = pid;
        this.msisdn = msisdn;
        this.epayloadDate = epayloadDate;
    }

    public Long getPid() {
        return pid;
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }

    public String getMsisdn() {
        return msisdn;
    }

    public void setMsisdn(String msisdn) {
        this.msisdn = msisdn;
    }

    public Date getEpayloadDate() {
        return epayloadDate;
    }

    public void setEpayloadDate(Date epayloadDate) {
        this.epayloadDate = epayloadDate;
    }

    public Long getServiceId() {
        return serviceId;
    }

    public void setServiceId(Long serviceId) {
        this.serviceId = serviceId;
    }
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pid != null ? pid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Epayload)) {
            return false;
        }
        Epayload other = (Epayload) object;
        if ((this.pid == null && other.pid != null) || (this.pid != null && !this.pid.equals(other.pid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tour.of.heroes.model.Epayload[ pid=" + pid + " ]";
    }
    
}
