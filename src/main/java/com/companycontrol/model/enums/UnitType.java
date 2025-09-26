package com.companycontrol.model.enums;

import lombok.Getter;

@Getter
public enum UnitType {
    KG("KG"),
    G("G"),
    UNIDADE("UNIDADE"),
    LITRO("LITRO"),
    PACOTE("PACOTE"),
    FARDO("FARDO"),
    CAIXA("CAIXA"),
    TONELADA("TONELADA");

    private final String unitType;

    UnitType(String unitType) {
        this.unitType = unitType;
    }
}
