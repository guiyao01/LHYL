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
public class ZgspReceiveVerifyItemEntity {
    /**
     * 主键
     */
    @Id
    @Column(name = "ID")
    private String id;

    /**
     *
     */
    @Column(name = "MEASURE")
    private String measure;

    /**
     *
     */
    @Column(name = "POCODE")
    private String pocode;
    /**
     *
     */
    @Column(name = "SPEC")
    private String spec;
    /**
     *
     */
    @Column(name = "MEDICIALITEMNAME")
    private String medicialitemname;
    /**
     *
     */
    @Column(name = "COMMONNAME")
    private String commonname;
    /**
     *                              num
     */
    @Column(name = "DOUBTQAT")
    private Integer doubtqat;
    /**
     *
     */
    @Column(name = "APPROVALNUM")
    private String approvalnum;
    /**
     *
     */
    @Column(name = "APPSTATE")
    private String appstate;
    /**
     *
     */
    @Column(name = "TEMPCONTROLMODEL")
    private String tempcontrolmodel;
    /**
     *
     */
    @Column(name = "DISABLEDATE")
    private String disabledate;
    /**
     *
     */
    @Column(name = "BATCHID")
    private String batchid;
    /**
     *
     */
    @Column(name = "MFVERIFYREPORT")
    private String mfverifyreport;
    /**
     *
     */
    @Column(name = "VALIDTIME")
    private String validtime;
    /**
     *                      num
     */
    @Column(name = "VERIFYQAT")
    private Integer verifyqat;
    /**
     *                      num
     */
    @Column(name = "RECEIVEQAT")
    private Integer receiveqat;
    /**
     *
     */
    @Column(name = "WAREHOUSE")
    private String warehouse;
    /**
     *
     */
    @Column(name = "PRODENTER")
    private String prodenter;
    /**
     *
     */
    @Column(name = "MAH")
    private String mah;
    /**
     *
     */
    @Column(name = "PARENTID")
    private String parentid;
    /**
     *
     */
    @Column(name = "SPECMODEL")
    private String specmodel;
    /**
     *
     */
    @Column(name = "VERIFYRESULT")
    private String verifyresult;
    /**
     *
     */
    @Column(name = "STORAGECOND")
    private String storagecond;
    /**
     *
     */
    @Column(name = "MDREGISTER")
    private String mdregister;
    /**
     *
     */
    @Column(name = "SPECPACKAGE")
    private String specpackage;
    /**
     *
     */
    @Column(name = "DOSETYPE")
    private String dostype;
    /**
     *                          num
     */
    @Column(name = "VERIFYPASSQAT")
    private Integer verifypassqat;
    /**
     *                          num
     */
    @Column(name = "VERIFYREJECTQAT")
    private Integer verifyrejectqat;
    /**
     *
     */
    @Column(name = "REJECTREASON")
    private String rejectreason;
    /**
     *
     */
    @Column(name = "ISTRACECODE")
    private String istracecode;

    /**
     *
     */
    @Column(name = "UNIT")
    private String unit;

    /**
     *
     */
    @Column(name = "EFFICIENTDATE")
    private String efficientdate;



    /**
     *
     */
    @Column(name = "BFMATERIALSID")
    private String bfmaterialid;


    /**
     *
     */
    @Column(name = "INSTANCEID")
    private String instanceid;


    /**
     *
     */
    @Column(name = "BILLSTATUS")
    private String billstatus;



}
