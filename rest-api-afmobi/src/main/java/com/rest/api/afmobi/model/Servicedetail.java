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
public class Servicedetail implements Serializable {

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
    @Column(name = "servicedetailid")
    private long servicedetailid;
    @Column(name = "serviceDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date serviceDate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "serviceCost")
    private int serviceCost;

    public Servicedetail() {
    }

    public Servicedetail(Long id) {
        this.id = id;
    }

    public Servicedetail(Long id, String serviceName, long serviceid, Date serviceDate, int serviceCost) {
        this.id = id;
        this.serviceName = serviceName;
        this.servicedetailid = serviceid;
        this.serviceDate = serviceDate;
        this.serviceCost = serviceCost;
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

    public long getServiceid() {
        return servicedetailid;
    }

    public void setServiceid(long serviceid) {
        this.servicedetailid = serviceid;
    }

    public Date getServiceDate() {
        return serviceDate;
    }

    public void setServiceDate(Date serviceDate) {
        this.serviceDate = serviceDate;
    }

    public int getServiceCost() {
        return serviceCost;
    }

    public void setServiceCost(int serviceCost) {
        this.serviceCost = serviceCost;
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
        if (!(object instanceof Servicedetail)) {
            return false;
        }
        Servicedetail other = (Servicedetail) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tour.of.heroes.model.Servicedetail[ id=" + id + " ]";
    }
    
}
