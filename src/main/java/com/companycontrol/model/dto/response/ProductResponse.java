package com.companycontrol.model.dto.response;

import com.companycontrol.model.entity.ProductMovement;
import com.companycontrol.model.entity.Stock;
import com.companycontrol.model.enums.UnitType;
import jakarta.persistence.*;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.*;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductResponse {

    private Long idProduct;

    private String nmProduct;

    private String dsProduct;

    private UnitType unityType;

    private BigDecimal costValue;

    private BigDecimal resaleValue;

    private int productQuantity;

    private Long idStock;

    private List<Long> idProductUsedList;
}
