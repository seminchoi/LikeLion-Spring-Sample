package com.test.SpringBootApi.domain;

import lombok.Getter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
public class Store {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long storeId;

    private String storeName;

    private String address;

    @OneToMany(mappedBy = "store")
    private List<StockInfo> stockInfos;

}
