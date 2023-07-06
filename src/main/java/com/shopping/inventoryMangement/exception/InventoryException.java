package com.shopping.inventoryMangement.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class InventoryException extends  RuntimeException{
    private String errorMessage;
    private String description;
}
