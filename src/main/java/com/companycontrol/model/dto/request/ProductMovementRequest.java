package com.companycontrol.model.dto.request;

import com.companycontrol.model.entity.Product;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductMovementRequest {

    private Long idProduct;

    private int quantityUsed;

    private BigDecimal buyValue;

    private BigDecimal saleValue;

    private List<Long> idProductInputs;

    private List<Long> idProductOutputs;
}
