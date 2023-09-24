package com.cemal.hibersapdemo.repository;

import com.cemal.hibersapdemo.model.sap.bapi.Material;

public interface SapRepositoryI {

    Material findMaterial(String materialNumber,String produceArea);
}
