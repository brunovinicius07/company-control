package com.companycontrol.model.dto.request;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClientRequest {

    private String nmClient;

    private boolean isPhysicalPerson;

    private String cnpj;

    private String cpf;
}
