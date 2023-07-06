package com.shopping.inventoryMangement.service;

import com.shopping.inventoryMangement.dao.InventoryItem;
import com.shopping.inventoryMangement.dao.InventoryRepository;
import com.shopping.inventoryMangement.dto.Inventory;
import com.shopping.inventoryMangement.exception.InventoryException;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class InventoryServiceImpl implements InventoryService {

    @Autowired
    private InventoryRepository inventoryRepository;
    @Autowired
    private  ModelMapper modelMapper;
    @Override
    public Inventory addItemInventory(String itemName, int quantity) {
        Inventory inventory;
        try {
            InventoryItem inventoryItem = new InventoryItem(itemName, quantity);
            inventoryRepository.save(inventoryItem);
            inventory=modelMapper.map(inventoryItem, Inventory.class);
        }catch (Exception ex){
            throw new InventoryException(ex.getMessage(), ex.toString());
        }
        return inventory;
    }

    @Override
    public Inventory pickItemFromInventory(String itemName, int quantity) {

        Inventory inventory;
        try {
            InventoryItem inventoryItem = inventoryRepository.findByItemNameAndQuantity(itemName, quantity);
            inventoryRepository.save(inventoryItem);
            inventory=modelMapper.map(inventoryItem, Inventory.class);
        }catch (Exception ex){
            throw new InventoryException(ex.getMessage(), ex.toString());
        }
        return inventory;
    }
    @Transactional
    @Override
    public Inventory deleteItemFromInventory(String itemName) {
        Inventory inventory;
        try {
            InventoryItem inventoryItem= inventoryRepository.findByItemName(itemName);
            inventoryRepository.deleteByItemName(itemName);
            inventory=modelMapper.map(inventoryItem, Inventory.class);
        }catch (Exception ex){
            throw new InventoryException(ex.getMessage(), ex.toString());
        }
        return inventory;
    }

    @Override
    public List<Inventory> getAvailableInventory() {
        return modelMapper.map(inventoryRepository.findAll(),  new TypeToken<List<Inventory>>() {}.getType());
    }
}
