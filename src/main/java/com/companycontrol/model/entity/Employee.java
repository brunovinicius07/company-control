package com.companycontrol.model.entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serial;
import java.io.Serializable;

@Builder
@Getter
@Setter
@EqualsAndHashCode
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "TB_PROVIDERS")
public class Employee implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEmployee;

    @JoinColumn(name = "idUser")
    @OneToOne
    private User user;

    @ManyToOne
    @JoinColumn(name = "idOwner")
    private Owner owner;
}