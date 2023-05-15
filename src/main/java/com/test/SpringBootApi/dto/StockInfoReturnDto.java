package com.test.SpringBootApi.dto;

import com.test.SpringBootApi.domain.StockInfo;
import lombok.Data;

@Data
public class StockInfoReturnDto {
    private ProductReturnDto product;

    private int stockCnt;

    public StockInfoReturnDto(StockInfo stockInfo) {
        this.product = new ProductReturnDto(stockInfo.getProduct());
        this.stockCnt = stockInfo.getStockCount();
    }
}
