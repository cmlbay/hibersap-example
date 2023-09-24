package com.cemal.hibersapdemo.repository.impl;

import com.cemal.hibersapdemo.model.sap.bapi.Material;
import com.cemal.hibersapdemo.repository.SapRepositoryI;
import org.hibersap.session.Session;
import org.hibersap.session.SessionManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class SapRepository implements SapRepositoryI {
    @Autowired
    SessionManager sessionManager;

    @Override
    public Material findMaterial(String materialNumber, String produceArea) {
        Session session = null;
        Material material = new Material();

        if (sessionManager != null) {
            session = sessionManager.openSession();

            try {
                material.setMaterialNumber(materialNumber);
                material.setProduceArea(produceArea);
                session.execute(material);

            }finally {
                session.close();
            }
        }

        return material;
    }
}
