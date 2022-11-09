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
@Table(name = "ZGSPGOODSLICENSE")
public class GOODSLICENSE {
    /**
     * 主键
     */
    @Id
    @Column(name = "ID")
    private String id;

    /**
     *
     */
    @Column(name = "NAME")
    private String name;


    /**
     *
     */
    @Column(name = "CODE")
    private String code;


    /**
     *
     */
    @Column(name = "ISSYS")
    private String isSys;

    /**
     *
     */
    @Column(name = "DAY")
    private Integer day;

    /**
     *
     */
    @Column(name = "NOTE")
    private String note;


}
