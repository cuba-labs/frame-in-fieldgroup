package com.company.sample.web.screens;

import com.company.sample.entity.Address;
import com.haulmont.cuba.gui.WindowParam;
import com.haulmont.cuba.gui.components.AbstractFrame;
import com.haulmont.cuba.gui.components.HBoxLayout;
import com.haulmont.cuba.gui.components.Label;
import com.haulmont.cuba.gui.components.TextField;
import com.haulmont.cuba.gui.data.Datasource;

import javax.inject.Inject;
import java.util.Map;

public class AddressFrame extends AbstractFrame {

    @WindowParam
    private Datasource<Address> datasource;

    @Inject
    private TextField cityField;
    @Inject
    private HBoxLayout fieldsBox;
    @Inject
    private Label label;
    @Inject
    private HBoxLayout labelBox;
    @Inject
    private TextField line1Field;
    @Inject
    private TextField line2Field;
    @Inject
    private TextField zipField;

    @Override
    public void init(Map<String, Object> params) {
        Address address = datasource.getItem();
        label.setValue(address.getLine1() + " " + address.getLine2() + " " + address.getCity() + " " + address.getZip());

        line1Field.setDatasource(datasource, "line1");
        line2Field.setDatasource(datasource, "line2");
        cityField.setDatasource(datasource, "city");
        zipField.setDatasource(datasource, "zip");
    }

    public void onEditBtnClick() {
        labelBox.setVisible(false);
        fieldsBox.setVisible(true);
    }
}