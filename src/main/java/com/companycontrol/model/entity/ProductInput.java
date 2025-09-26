package com.companycontrol.model.entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

@Builder
@Getter
@Setter
@EqualsAndHashCode
@ToString(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "TB_PRODUCT_INPUT")
public class ProductInput implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProductInput;

    @ManyToMany(cascade = CascadeType.REMOVE)
    @JoinTable(
            name = "TB_PRODUCT_INPUT_PRODUCT_MOVEMENT",
            joinColumns = @JoinColumn(name = "idProductInput"),
            inverseJoinColumns = @JoinColumn(name = "idProductMovement")
    )
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private List<ProductMovement> productMovements;

    private LocalDateTime MovementTime;

    @ManyToOne
    @JoinColumn(name = "idEmployee")
    private Employee employee;
}
