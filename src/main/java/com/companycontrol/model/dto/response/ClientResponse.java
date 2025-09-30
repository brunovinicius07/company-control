package com.companycontrol.model.dto.response;

import com.companycontrol.model.entity.Company;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ClientResponse {

    private Long idClient;

    private String nmClient;

    private boolean isPhysicalPerson;

    private String cnpj;

    private String cpf;

    private Company company;
}
