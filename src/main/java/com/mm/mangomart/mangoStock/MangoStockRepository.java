package com.mm.mangomart.mangoStock;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface MangoStockRepository extends JpaRepository<MangoStock, UUID> {

}
