package com.test.SpringBootApi.domain;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
public class StockInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long stockInfoId;

    @ManyToOne
    private Product product;

    @ManyToOne
    private Store store;

    private int stockCount;
}
