package com.rohithdev.TikiHutInventory.services;

import com.rohithdev.TikiHutInventory.dtos.Response;
import com.rohithdev.TikiHutInventory.dtos.SupplierDTO;

public interface SupplierService {

    Response addSupplier(SupplierDTO supplierDTO);

    Response updateSupplier(Long id, SupplierDTO supplierDTO);

    Response getAllSupplier();

    Response getSupplierById(Long id);

    Response deleteSupplier(Long id);

}

