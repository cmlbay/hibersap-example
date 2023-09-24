package com.cemal.hibersapdemo.service.impl;

import com.cemal.hibersapdemo.model.sap.bapi.Material;
import com.cemal.hibersapdemo.repository.SapRepositoryI;
import com.cemal.hibersapdemo.service.SapServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SapService implements SapServiceI {
    @Autowired
    private SapRepositoryI sapRepository;

    @Override
    public Material findMaterial(String materialNumber, String produceArea) {
        return sapRepository.findMaterial(materialNumber,produceArea);
    }
}
