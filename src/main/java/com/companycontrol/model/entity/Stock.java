package com.companycontrol.model.entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Builder
@Getter
@Setter
@EqualsAndHashCode
@ToString(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "TB_STOCK")
public class Stock implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idStock;

    @OneToMany(mappedBy = "stock")
    @ToString.Exclude
    private List<Product> products = new ArrayList<>();

    @JoinColumn(name = "idCompany")
    @OneToOne
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private Company company;
}
