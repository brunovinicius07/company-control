package com.companycontrol.model.dto.request;

import com.companycontrol.model.enums.UserRole;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserRequest {

    private String nmUser;

    private String cpf;

    private String email;

    private String password;

    private UserRole role;

}
