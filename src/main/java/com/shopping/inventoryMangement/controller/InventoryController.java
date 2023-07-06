package com.shopping.inventoryMangement.controller;


import com.shopping.inventoryMangement.dto.Inventory;
import com.shopping.inventoryMangement.service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/v1")
@Validated
public class InventoryController {
    @Autowired
    private InventoryService inventoryService;
    @PostMapping("/inventories/{itemName}/{quantity}")
    public Inventory addItemToInventory(@PathVariable String itemName,  @PathVariable  Integer quantity){
       return inventoryService.addItemInventory(itemName,quantity);
    }

    @GetMapping("/inventories/{itemName}/{quantity}")
    public Inventory pickItemFromInventory(@PathVariable String itemName,  @PathVariable Integer quantity){
       return inventoryService.pickItemFromInventory(itemName,quantity);
    }

    @DeleteMapping("/inventories/{itemName}")
    public Inventory deleteItemFromInventory(@PathVariable String itemName){
        return inventoryService.deleteItemFromInventory(itemName);
    }

    @GetMapping("/inventories")
    public List<Inventory> getAvailableInventory(){
       return inventoryService.getAvailableInventory();
    }

    @GetMapping("/hello")
    public String hello(){
        return  "hello";
    }

}
