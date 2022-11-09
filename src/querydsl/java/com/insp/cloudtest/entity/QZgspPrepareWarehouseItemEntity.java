package com.insp.cloudtest.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QZgspPrepareWarehouseItemEntity is a Querydsl query type for ZgspPrepareWarehouseItemEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QZgspPrepareWarehouseItemEntity extends EntityPathBase<ZgspPrepareWarehouseItemEntity> {

    private static final long serialVersionUID = 218907425L;

    public static final QZgspPrepareWarehouseItemEntity zgspPrepareWarehouseItemEntity = new QZgspPrepareWarehouseItemEntity("zgspPrepareWarehouseItemEntity");

    public final NumberPath<Integer> alreadynum = createNumber("alreadynum", Integer.class);

    public final StringPath approvalnum = createString("approvalnum");

    public final NumberPath<Integer> arrivalnum = createNumber("arrivalnum", Integer.class);

    public final NumberPath<Integer> availableamount = createNumber("availableamount", Integer.class);

    public final StringPath batchid = createString("batchid");

    public final StringPath buyer = createString("buyer");

    public final StringPath commonname = createString("commonname");

    public final NumberPath<Integer> currentnum = createNumber("currentnum", Integer.class);

    public final StringPath disabledate = createString("disabledate");

    public final NumberPath<Integer> helpamount = createNumber("helpamount", Integer.class);

    public final StringPath id = createString("id");

    public final StringPath mah = createString("mah");

    public final NumberPath<Integer> officalnum = createNumber("officalnum", Integer.class);

    public final StringPath origin = createString("origin");

    public final StringPath parentid = createString("parentid");

    public final StringPath spec = createString("spec");

    public final StringPath specmodel = createString("specmodel");

    public final StringPath storagecode = createString("storagecode");

    public final StringPath storetype = createString("storetype");

    public final StringPath temptange = createString("temptange");

    public final StringPath unit = createString("unit");

    public final StringPath verifyenter = createString("verifyenter");

    public final StringPath vouchercode = createString("vouchercode");

    public final StringPath waitenterwh = createString("waitenterwh");

    public final StringPath whname = createString("whname");

    public QZgspPrepareWarehouseItemEntity(String variable) {
        super(ZgspPrepareWarehouseItemEntity.class, forVariable(variable));
    }

    public QZgspPrepareWarehouseItemEntity(Path<? extends ZgspPrepareWarehouseItemEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QZgspPrepareWarehouseItemEntity(PathMetadata metadata) {
        super(ZgspPrepareWarehouseItemEntity.class, metadata);
    }

}

