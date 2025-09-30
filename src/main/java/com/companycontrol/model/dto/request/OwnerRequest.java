package com.companycontrol.model.dto.request;

import com.companycontrol.model.enums.UserRole;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OwnerRequest {

    private String nmUser;

    private String email;

    private String password;

    private UserRole role;
}
