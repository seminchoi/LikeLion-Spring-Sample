package com.test.SpringBootApi.domain;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
public class StockInfo {
    @Id
    @Column(name = "stock_info_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Product product;
    @ManyToOne
    private Store store;
    private Integer StockQuantity;

}
