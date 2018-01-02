package com.company.sample.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import com.haulmont.cuba.core.entity.annotation.EmbeddedParameters;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;

@NamePattern("%s|name")
@Table(name = "SAMPLE_PERSON")
@Entity(name = "sample$Person")
public class Person extends StandardEntity {
    private static final long serialVersionUID = 2122437326363146711L;

    @Column(name = "NAME")
    protected String name;

    @Embedded
    @EmbeddedParameters(nullAllowed = false)
    @AttributeOverrides({
        @AttributeOverride(name = "line1", column = @Column(name = "ADDRESS_LINE1")),
        @AttributeOverride(name = "line2", column = @Column(name = "ADDRESS_LINE2")),
        @AttributeOverride(name = "city", column = @Column(name = "ADDRESS_CITY")),
        @AttributeOverride(name = "zip", column = @Column(name = "ADDRESS_ZIP"))
    })
    protected Address address;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }


}