package com.companycontrol.model.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.io.Serial;
import java.io.Serializable;

@Builder
@Getter
@Setter
@ToString(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "TB_CLIENTS")
public class Client implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idClient;

    @Size(min = 2, max = 70)
    @NotBlank
    private String nmClient;

    private boolean isPhysicalPerson;

    @Column(unique = true)
    @Size(min = 14, max = 14)
    private String cnpj;

    @Column(unique = true)
    @Size(min = 11, max = 11)
    private String cpf;

    @NotBlank

    @ManyToMany(mappedBy = "clients")
    private Company company;
}
