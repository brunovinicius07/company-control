package com.companycontrol.model.dto.response;

import com.companycontrol.model.entity.Company;
import com.companycontrol.model.entity.Product;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class StockResponse {

    private Long idStock;

    private List<Long> idProducts;

    private Long idCompany;
}
