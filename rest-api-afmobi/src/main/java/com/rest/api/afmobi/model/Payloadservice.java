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
public class Payloadservice implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "serviceName")
    private String serviceName;
    @Basic(optional = false)
    @NotNull
    @Column(name = "serviceCost")
    private int serviceCost;
    @Basic(optional = false)
    @NotNull
    @Column(name = "servicedetailid")
    private long servicedetailid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "epayloadDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date epayloadDate;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "msisdn")
    private String msisdn;

    public Payloadservice() {
    }

    public Payloadservice(Long id) {
        this.id = id;
    }

    public Payloadservice(Long id, String serviceName, int serviceCost, long servicedetailid, Date epayloadDate, String msisdn) {
        this.id = id;
        this.serviceName = serviceName;
        this.serviceCost = serviceCost;
        this.servicedetailid = servicedetailid;
        this.epayloadDate = epayloadDate;
        this.msisdn = msisdn;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public int getServiceCost() {
        return serviceCost;
    }

    public void setServiceCost(int serviceCost) {
        this.serviceCost = serviceCost;
    }

    public long getServicedetailid() {
        return servicedetailid;
    }

    public void setServicedetailid(long servicedetailid) {
        this.servicedetailid = servicedetailid;
    }

    public Date getEpayloadDate() {
        return epayloadDate;
    }

    public void setEpayloadDate(Date epayloadDate) {
        this.epayloadDate = epayloadDate;
    }

    public String getMsisdn() {
        return msisdn;
    }

    public void setMsisdn(String msisdn) {
        this.msisdn = msisdn;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Payloadservice)) {
            return false;
        }
        Payloadservice other = (Payloadservice) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tour.of.heroes.model.Payloadservice[ id=" + id + " ]";
    }
    
}
