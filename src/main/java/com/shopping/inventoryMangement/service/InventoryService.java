package com.shopping.inventoryMangement.service;

import com.shopping.inventoryMangement.dto.Inventory;

import java.util.List;

public interface InventoryService {
    Inventory addItemInventory(String itemName, int quantity);

    Inventory pickItemFromInventory(String itemName, int quantity);

    Inventory deleteItemFromInventory(String itemName);

    List<Inventory> getAvailableInventory();
}
