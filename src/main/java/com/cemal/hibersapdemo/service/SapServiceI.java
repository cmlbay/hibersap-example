package com.cemal.hibersapdemo.service;

import com.cemal.hibersapdemo.model.sap.bapi.Material;

public interface SapServiceI {

    Material findMaterial(String materialNumber, String produceArea);
}
