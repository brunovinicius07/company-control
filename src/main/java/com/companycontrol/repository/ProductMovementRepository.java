package com.companycontrol.repository;

import com.companycontrol.model.entity.ProductMovement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductMovementRepository extends JpaRepository<ProductMovement, Long> {
}
