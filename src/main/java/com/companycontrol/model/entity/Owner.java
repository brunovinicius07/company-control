package com.companycontrol.model.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Builder
@Getter
@Setter
@ToString(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Entity
@Table(name = "TB_OWNER")
public class Owner implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idOwner;

    @JoinColumn(name = "idUser")
    @OneToOne
    @NotNull
    private User user;

    @OneToMany(mappedBy = "owner")
    @ToString.Exclude
    private List<Company> companies = new ArrayList();

    @OneToMany(mappedBy = "owner")
    @ToString.Exclude
    private List<Employee> employees = new ArrayList();
}
