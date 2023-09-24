package com.cemal.hibersapdemo;

import com.cemal.hibersapdemo.model.sap.bapi.Material;
import org.hibersap.configuration.AnnotationConfiguration;
import org.hibersap.session.Session;
import org.hibersap.session.SessionManager;

public class TestMain {
    public static void main(String[] args) {

        AnnotationConfiguration configuration = new AnnotationConfiguration("ABC");
        SessionManager sm = configuration.buildSessionManager();
        Session session = sm.openSession();

        try {
            Material material = new Material();
            material.setMaterialNumber("PC210LC11");
            material.setProduceArea("C3");
            session.execute(material);
            System.out.println(material.getDetails().toString());
        }finally {
            session.close();
        }
    }
}
