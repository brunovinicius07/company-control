package com.companycontrol.model.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.*;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;

@Builder
@Getter
@Setter
@EqualsAndHashCode
@ToString(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "TB_PRODUCT")
public class Product implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProduct;

    private String nmProduct;

    private String dsProduct;

    @Digits(integer = 5, fraction = 2)
    @PositiveOrZero
    private BigDecimal costValue;

    @Digits(integer = 5, fraction = 2)
    @PositiveOrZero
    private BigDecimal resaleValue;

    private int productQuantity;

    @JoinColumn(name = "idStock")
    @ManyToOne
    private Stock stock;
}
