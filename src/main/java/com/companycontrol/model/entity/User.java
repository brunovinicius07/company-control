package com.companycontrol.model.entity;

import com.companycontrol.model.enums.UserRole;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.io.Serial;
import java.io.Serializable;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Entity
@Table(name = "TB_USER")
public class User implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUser;

    @Size(min = 2, max = 70)
    @NotBlank
    private String nmUser;

    @Column(unique = true)
    @Size(min = 11, max = 11)
    private String cpf;

    @Column(unique = true)
    @NotBlank
    @Email
    private String email;

    @Size(min = 8)
    @NotBlank
    private String password;

    @Enumerated(EnumType.STRING)
    @NotNull
    private UserRole role;

}
