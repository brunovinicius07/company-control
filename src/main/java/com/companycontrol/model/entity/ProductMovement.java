package com.companycontrol.model.entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

@Builder
@Getter
@Setter
@EqualsAndHashCode
@ToString(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "TB_PRODUCT_MOVEMENT")
public class ProductMovement implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProductMovement;

    @ManyToOne
    @JoinColumn(name = "cdProduct")
    private Product product;

    private int quantityUsed;

    private BigDecimal buyValue;

    private BigDecimal saleValue;

    @ManyToMany(mappedBy = "productInputs")
    @ToString.Exclude
    private List<ProductInput> productInputs;

    @ManyToMany(mappedBy = "productOutputs")
    @ToString.Exclude
    private List<ProductOutput> productOutputs;
}
