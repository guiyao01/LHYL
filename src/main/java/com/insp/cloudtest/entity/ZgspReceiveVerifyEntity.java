package com.insp.cloudtest.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

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
@Table(name = "zgspreceivevirify")
public class ZgspReceiveVerifyEntity {
    /**
     * 主键
     */
    @Id
    @Column(name = "ID")
    private String id;

    /**
     *
     */
    @Column(name = "CHECKDATE")
    private String checkdate;

    /**
     *
     */
    @Column(name = "TRANSPORTTEMP")
    private String transporttemp;
    /**
     *
     */
    @Column(name = "ARRIVETEMP")
    private String arrivetemp;
    /**
     *
     */
    @Column(name = "BUSINESSDATE")
    private String businessdate;
    /**
     *
     */
    @Column(name = "DEPARTMENT")
    private String department;
    /**
     *
     */
    @Column(name = "BILLCODE")
    private String billcode;
    /**
     *
     */
    @Column(name = "SUPPLIER")
    private String supplier;
    /**
     *
     */
    @Column(name = "ARRIVECODE")
    private String arrivecode;
    /**
     *
     */
    @Column(name = "ARRIVEDATE")
    private String arrivedate;
    /**
     *
     */
    @Column(name = "TRANSPORTMODE")
    private String transportmode;
    /**
     *
     */
    @Column(name = "acceptor")
    private String acceptor;
    /**
     *
     */
    @Column(name = "NOTE")
    private String note;
    /**
     *
     */
    @Column(name = "SupplierRegAddr")
    private String supplierregaddr;
    /**
     *
     */
    @Column(name = "billstatus")
    private String billstatus;
    /**
     *
     */
    @Column(name = "INSTANCEID")
    private String instanceid;
    /**
     *
     */
    @Column(name = "TRANSTIME")
    private String transtime;

    /**
     *
     */
    @Column(name = "checkdateend")
    private String checkdateend;


}
