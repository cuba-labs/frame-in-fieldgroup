package com.company.sample.web.person;

import com.company.sample.entity.Address;
import com.haulmont.bali.util.ParamsMap;
import com.haulmont.cuba.gui.components.AbstractEditor;
import com.company.sample.entity.Person;
import com.haulmont.cuba.gui.components.FieldGroup;
import com.haulmont.cuba.gui.components.VBoxLayout;
import com.haulmont.cuba.gui.data.Datasource;
import com.haulmont.cuba.gui.xml.layout.ComponentsFactory;

import javax.inject.Inject;
import java.util.Map;

public class PersonEdit extends AbstractEditor<Person> {

    @Inject
    private FieldGroup fieldGroup;

    @Inject
    private ComponentsFactory componentsFactory;

    @Inject
    private Datasource<Address> addressDs;

    @Override
    protected void postInit() {
        VBoxLayout placeholder = componentsFactory.createComponent(VBoxLayout.class);
        openFrame(placeholder, "address-frame", ParamsMap.of("datasource", addressDs));
        fieldGroup.getField("address").setComponent(placeholder);
    }
}