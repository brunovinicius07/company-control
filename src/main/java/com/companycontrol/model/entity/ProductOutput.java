package com.companycontrol.model.entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;

@Builder
@Getter
@Setter
@EqualsAndHashCode
@ToString(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "TB_PRODUCT_OUTPUT")
public class ProductOutput implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProductOutput;

    @ManyToOne
    @JoinColumn(name = "idProduct")
    private Product product;

    private int quantityOutput;

    private LocalDateTime MovementTime;

    @OneToOne(mappedBy = "productOutput")
    private Employee employee;
}
