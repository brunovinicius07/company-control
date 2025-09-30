package com.companycontrol.model.dto.response;

import com.companycontrol.model.entity.Client;
import com.companycontrol.model.entity.Employee;
import com.companycontrol.model.entity.ProductMovement;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductOutputResponse {

    private Long idProductOutput;

    private List<Long> idProductMovements;

    private LocalDateTime MovementTime;

    private Long idEmployee;

    private Long idClient;
}
