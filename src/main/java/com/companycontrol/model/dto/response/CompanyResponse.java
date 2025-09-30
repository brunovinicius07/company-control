package com.companycontrol.model.dto.response;

import com.companycontrol.model.entity.Client;
import com.companycontrol.model.entity.Owner;
import com.companycontrol.model.entity.Stock;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CompanyResponse {

    private Long idCompany;

    private String nmCompany;

    private String cnpj;

    private Long idStock;

    private Long idOwner;

    private List<Long> idClients = new ArrayList<>();
}
