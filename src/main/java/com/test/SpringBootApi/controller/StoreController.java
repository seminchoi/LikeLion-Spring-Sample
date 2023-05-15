package com.test.SpringBootApi.controller;

import com.test.SpringBootApi.domain.Store;
import com.test.SpringBootApi.dto.StoreReturnDto;
import com.test.SpringBootApi.service.StoreServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class StoreController {
    @Autowired
    private StoreServiceImpl storeService;

    @PostMapping("/api/stores")
    public ResponseEntity<Store> storeCreate(@RequestBody Store store){
        Store store1 = storeService.save(store);
        return ResponseEntity.ok(store1);
    }

    @GetMapping("/api/stores/{id}")
    public ResponseEntity<StoreReturnDto> findById(@PathVariable(value = "id") Long storeId){
        StoreReturnDto store = storeService.findById(storeId);
        return ResponseEntity.ok(store);
    }

}
