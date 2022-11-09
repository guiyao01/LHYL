package com.insp.cloudtest.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author XBB
 * @createTime 05.09 009 上午 09:59
 * @description
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "QUALIFIEDWHITEM")
public class ZgspPrepareWarehouseItemEntity {
    /**
     * 主键
     */
    @Id
    @Column(name = "ID")
    private String id;

    /**
     *
     */
    @Column(name = "alreadynum")
    private Integer alreadynum;
    /**
     *
     */
    @Column(name = "approvalnum")
    private String approvalnum;
    /**
     *
     */
    @Column(name = "arrivalnum")
    private Integer arrivalnum;
    /**
     *
     */
    @Column(name = "availableamount")
    private Integer availableamount;
    /**
     *
     */
    @Column(name = "batchid")
    private String batchid;

    /**
     *
     */
    @Column(name = "buyer")
    private String buyer;

    /**
     *
     */
    @Column(name = "commonname")
    private String commonname;
    /**
     *
     */
    @Column(name = "currentnum")
    private Integer currentnum;
    /**
     *
     */
    @Column(name = "disabledate")
    private String disabledate;
    /**
     *
     */
    @Column(name = "helpamount")
    private Integer helpamount;
    /**
     *
     */
    @Column(name = "mah")
    private String mah;
    /**
     *
     */
    @Column(name = "officalnum")
    private Integer officalnum;
    /**
     *
     */
    @Column(name = "origin")
    private String origin;
    /**
     *
     */
    @Column(name = "parentid")
    private String parentid;
    /**
     *
     */
    @Column(name = "spec")
    private String spec;
    /**
     *
     */
    @Column(name = "specmodel")
    private String specmodel;

    /**
     *
     */
    @Column(name = "storagecode")
    private String storagecode;

    /**
     *
     */
    @Column(name = "storetype")
    private String storetype;


    /**
     *
     */
    @Column(name = "temptange")
    private String temptange;


    /**
     *
     */
    @Column(name = "unit")
    private String unit;



    /**
     *
     */
    @Column(name = "verifyenter")
    private String verifyenter;
    /**
     *
     */
    @Column(name = "vouchercode")
    private String vouchercode;
    /**
     *
     */
    @Column(name = "waitenterwh")
    private String waitenterwh;


    /**
     *
     */
    @Column(name = "whname")
    private String whname;


}
