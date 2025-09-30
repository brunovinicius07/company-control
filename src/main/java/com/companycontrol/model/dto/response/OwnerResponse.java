package com.companycontrol.model.dto.response;

import com.companycontrol.model.entity.Company;
import com.companycontrol.model.entity.Employee;
import com.companycontrol.model.entity.User;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OwnerResponse {

    private Long idOwner;

    private String nmUser;

    private String email;

    private Long idUser;

    private List<Long> idCompanies;

    private List<Long> idEmployees;
}
