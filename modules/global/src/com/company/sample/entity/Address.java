package com.company.sample.entity;

import javax.persistence.Embeddable;
import com.haulmont.chile.core.annotations.MetaClass;
import javax.persistence.Column;
import com.haulmont.cuba.core.entity.EmbeddableEntity;

@MetaClass(name = "sample$Address")
@Embeddable
public class Address extends EmbeddableEntity {
    private static final long serialVersionUID = -5167282909012478608L;

    @Column(name = "LINE1")
    protected String line1;

    @Column(name = "LINE2")
    protected String line2;

    @Column(name = "CITY")
    protected String city;

    @Column(name = "ZIP", length = 20)
    protected String zip;

    public void setLine1(String line1) {
        this.line1 = line1;
    }

    public String getLine1() {
        return line1;
    }

    public void setLine2(String line2) {
        this.line2 = line2;
    }

    public String getLine2() {
        return line2;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getZip() {
        return zip;
    }


}