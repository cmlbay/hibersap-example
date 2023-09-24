package com.cemal.hibersapdemo.model.sap.structure;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibersap.annotations.BapiStructure;
import org.hibersap.annotations.Parameter;

import java.math.BigDecimal;

@BapiStructure
@Getter
@Setter
@ToString
public class MaterialDetail {
    @Parameter("MAKTX")
    private String materialName;

    @Parameter("VERPR")
    private BigDecimal price;

    @Parameter("WAERS")
    private String currency;

    @Parameter("SUM_ATP")
    private BigDecimal count;

    @Parameter("MEINS")
    private String unitText;
}
