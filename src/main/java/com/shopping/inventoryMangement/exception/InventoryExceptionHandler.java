package com.shopping.inventoryMangement.exception;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class InventoryExceptionHandler {


    @ExceptionHandler(Exception.class)
    protected ResponseEntity<InventoryException> handleApplicationException(Exception exception){
        InventoryException inventoryException= new InventoryException(exception.getMessage(),exception.getMessage());
        return new ResponseEntity<>(inventoryException, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(InventoryException.class)
    protected ResponseEntity<InventoryException> handleApplicationException(InventoryException exception){
        InventoryException inventoryException= new InventoryException(exception.getMessage(),exception.getMessage());
        return new ResponseEntity<>(inventoryException, HttpStatus.INTERNAL_SERVER_ERROR);
    }


}
