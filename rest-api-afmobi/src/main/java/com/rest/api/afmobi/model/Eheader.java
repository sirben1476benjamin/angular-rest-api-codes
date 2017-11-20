/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rest.api.afmobi.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author AFMOBI
 */
@Entity
public class Eheader implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "username")
    private String username;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "Authentication")
    private String authentication;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "Ocp-Apim-Subscription-Key")
    private String ocpApimSubscriptionKey;

    public Eheader() {
    }

    public Eheader(String username) {
        this.username = username;
    }

    public Eheader(String username, String authentication, String ocpApimSubscriptionKey) {
        this.username = username;
        this.authentication = authentication;
        this.ocpApimSubscriptionKey = ocpApimSubscriptionKey;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAuthentication() {
        return authentication;
    }

    public void setAuthentication(String authentication) {
        this.authentication = authentication;
    }

    public String getOcpApimSubscriptionKey() {
        return ocpApimSubscriptionKey;
    }

    public void setOcpApimSubscriptionKey(String ocpApimSubscriptionKey) {
        this.ocpApimSubscriptionKey = ocpApimSubscriptionKey;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (username != null ? username.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Eheader)) {
            return false;
        }
        Eheader other = (Eheader) object;
        if ((this.username == null && other.username != null) || (this.username != null && !this.username.equals(other.username))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tour.of.heroes.model.Eheader[ username=" + username + " ]";
    }
    
}
