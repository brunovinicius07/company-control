package com.companycontrol.model.dto.request;

import com.companycontrol.model.entity.Client;
import com.companycontrol.model.entity.Owner;
import com.companycontrol.model.entity.Stock;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CompanyRequest {

    private String nmCompany;

    private String cnpj;

    private Stock stock;
}
