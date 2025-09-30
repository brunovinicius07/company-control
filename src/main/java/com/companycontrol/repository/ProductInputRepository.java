package com.companycontrol.repository;

import com.companycontrol.model.entity.ProductInput;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductInputRepository extends JpaRepository<ProductInput, Long> {
}
