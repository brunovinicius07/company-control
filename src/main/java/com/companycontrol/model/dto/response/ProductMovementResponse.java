package com.companycontrol.model.dto.response;

import com.companycontrol.model.entity.Product;
import com.companycontrol.model.entity.ProductInput;
import com.companycontrol.model.entity.ProductOutput;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductMovementResponse{

    private Long idProductMovement;

    private Product product;

    private int quantityUsed;

    private BigDecimal buyValue;

    private BigDecimal saleValue;

    private List<Long> idProductInputs;

    private List<Long> idProductOutputs;
}
