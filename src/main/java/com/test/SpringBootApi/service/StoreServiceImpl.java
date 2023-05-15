package com.test.SpringBootApi.service;

import com.test.SpringBootApi.domain.Store;
import com.test.SpringBootApi.dto.StoreReturnDto;
import com.test.SpringBootApi.respository.StoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StoreServiceImpl {

    @Autowired
    private StoreRepository storeRepository;
    public Store save(Store store){
        return storeRepository.save(store);
    }

    public StoreReturnDto findById(Long id){
        Optional<Store> _store = storeRepository.findById(id);
        StoreReturnDto storeReturnDto = new StoreReturnDto(_store.get());

        return storeReturnDto;
    }

}
