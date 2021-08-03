package com.ict;


import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

public interface InventoryRepository extends CrudRepository<Inventory, Integer> {

	public Optional<Inventory> findById(Integer id);
	
}
