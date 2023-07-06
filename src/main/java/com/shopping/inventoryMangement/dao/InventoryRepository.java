package com.shopping.inventoryMangement.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InventoryRepository extends JpaRepository<InventoryItem, Long> {
    InventoryItem findByItemNameAndQuantity(String itemName, int quantity);

    int deleteByItemName(String itemName);

    InventoryItem findByItemName(String itemName);
}
