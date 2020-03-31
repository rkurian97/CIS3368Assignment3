package com.CIS3368.Assignment3;
import com.CIS3368.Assignment3.Inventory;
import org.springframework.data.repository.CrudRepository;

public interface InventoryRepo extends CrudRepository<Inventory,String> {
}