package com.test.SpringBootApi.service;

import com.test.SpringBootApi.domain.StockInfo;
import com.test.SpringBootApi.dto.StockInfoReturnDto;
import com.test.SpringBootApi.respository.StockInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class StockInfoService {
    @Autowired
    private StockInfoRepository stockInfoRepository;

    public List<StockInfoReturnDto> findByStoreId(Long storeId){
        List<StockInfo> stockInfoList = stockInfoRepository.findAllByStoreId(storeId);

//        stockInfoList.stream().map(stockInfo -> new StockInfoReturnDto(stockInfo))
//        .collect(Collectors.toList());
        List<StockInfoReturnDto> returnDtoList =
                stockInfoList.stream().map(StockInfoReturnDto::new).collect(Collectors.toList());

        return returnDtoList;
    }
}
