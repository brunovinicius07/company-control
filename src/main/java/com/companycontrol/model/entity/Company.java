package com.companycontrol.model.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Builder
@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "TB_COMPANY")
public class Company implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCompany;

    private String nmCompany;

    @Column(unique = true)
    @Size(min = 14, max = 14)
    private String cnpj;

    @OneToOne(mappedBy = "company")
    private Stock stock;

    @JoinColumn(name = "idOwner")
    @ManyToOne
    @NotNull
    private Owner owner;

    @ManyToMany(cascade = CascadeType.REMOVE)
    @JoinTable(
            name = "TB_PROVIDERS_CLIENTS",
            joinColumns = @JoinColumn(name = "idProvider"),
            inverseJoinColumns = @JoinColumn(name = "idClient")
    )
    @ToString.Exclude
    private List<Client> clients = new ArrayList<>();
}
