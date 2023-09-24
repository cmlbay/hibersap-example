package com.cemal.hibersapdemo.model.sap.bapi;

import com.cemal.hibersapdemo.model.sap.structure.MaterialDetail;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibersap.annotations.*;

@Bapi(value = "ZPORTAL_GET_MAT_DETAIL")
@Getter
@Setter
@ToString
public class Material {
    @Import
    @Parameter("IV_MATNR")
    private String materialNumber;

    @Import
    @Parameter("IV_WERKS")
    private String produceArea;

    @Export
    @Parameter(value = "ES_DETAIL",type = ParameterType.STRUCTURE)
    private MaterialDetail details = new MaterialDetail();
}
