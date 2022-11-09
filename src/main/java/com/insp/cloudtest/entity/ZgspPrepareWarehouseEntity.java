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
@Table(name = "QUALIFIEDWH")
public class ZgspPrepareWarehouseEntity {
    /**
     * 主键
     */
    @Id
    @Column(name = "ID")
    private String id;

    /**
     *
     */
    @Column(name = "acceptancetype")
    private String acceptancetype;

    /**
     *
     */
    @Column(name = "billcode")
    private String billcode;
    /**
     *
     */
    @Column(name = "checkdate")
    private String checkdate;

    /**
     *
     */
    @Column(name = "supplier")
    private String supplier;
    /**
     *
     */
    @Column(name = "transportmode")
    private String transportmode;
    /**
     *
     */
    @Column(name = "whmark")
    private String whmark;
    /**
     *
     */
    @Column(name = "checkdateend")
    private String checkdateend;


}
