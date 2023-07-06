package com.shopping.inventoryMangement.dao;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;


@Entity
@Getter
@Setter
@RequiredArgsConstructor
public class InventoryItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @NotNull
    private String itemName;
    @NotNull
    private int quantity;

    public InventoryItem(String itemName, int quantity) {
        this.itemName= itemName;
        this.quantity=quantity;
    }
}
