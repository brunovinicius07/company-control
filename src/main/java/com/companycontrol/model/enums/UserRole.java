package com.companycontrol.model.enums;

import lombok.Getter;

@Getter
public enum UserRole {
    OWNER("OWNER"),
    MANAGER("MANAGER"),
    EMPLOYEE("EMPLOYEE");

    private final String roleName;

    UserRole(String roleName) {
        this.roleName = roleName;
    }
}
