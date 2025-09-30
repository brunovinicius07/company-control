package com.companycontrol.model.dto.request;

import com.companycontrol.model.enums.UnitType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductRequest {

    private String nmProduct;

    private String dsProduct;

    private UnitType unityType;

    private BigDecimal costValue;

    private BigDecimal resaleValue;

    private int productQuantity;

}
