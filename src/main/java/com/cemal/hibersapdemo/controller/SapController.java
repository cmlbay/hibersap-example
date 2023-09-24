package com.cemal.hibersapdemo.controller;

import com.cemal.hibersapdemo.model.sap.bapi.Material;
import com.cemal.hibersapdemo.service.SapServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/1.0/sap")
public class SapController {
    @Autowired
    private SapServiceI sapService;


    @GetMapping("/find-material/{materialNumber}/{produceArea}")
    ResponseEntity<Material> findMaterialDetail(@PathVariable String materialNumber, @PathVariable String produceArea){
        Material material = sapService.findMaterial(materialNumber, produceArea);
        return ResponseEntity.ok(material);
    }
}
