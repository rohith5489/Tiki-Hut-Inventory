package com.rohithdev.TikiHutInventory.repositories;

import com.rohithdev.TikiHutInventory.models.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SupplierRepository extends JpaRepository<Supplier, Long> {
}

