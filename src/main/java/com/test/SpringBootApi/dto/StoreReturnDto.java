package com.test.SpringBootApi.dto;

import com.test.SpringBootApi.domain.StockInfo;
import com.test.SpringBootApi.domain.Store;
import lombok.Data;

import java.util.List;
import java.util.stream.Collectors;

@Data
public class StoreReturnDto {
    private Long storeId;

    private String storeName;

    private List<StockInfoReturnDto> stockInfos;

    public StoreReturnDto(Store store) {
        this.storeId = store.getStoreId();
        this.storeName = store.getStoreName();
        this.stockInfos = store.getStockInfos()
                .stream().map(StockInfoReturnDto::new)
                .collect(Collectors.toList());
    }
}
