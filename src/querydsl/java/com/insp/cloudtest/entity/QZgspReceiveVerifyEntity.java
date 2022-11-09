package com.insp.cloudtest.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QZgspReceiveVerifyEntity is a Querydsl query type for ZgspReceiveVerifyEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QZgspReceiveVerifyEntity extends EntityPathBase<ZgspReceiveVerifyEntity> {

    private static final long serialVersionUID = -1604419728L;

    public static final QZgspReceiveVerifyEntity zgspReceiveVerifyEntity = new QZgspReceiveVerifyEntity("zgspReceiveVerifyEntity");

    public final StringPath acceptor = createString("acceptor");

    public final StringPath arrivecode = createString("arrivecode");

    public final StringPath arrivedate = createString("arrivedate");

    public final StringPath arrivetemp = createString("arrivetemp");

    public final StringPath billcode = createString("billcode");

    public final StringPath billstatus = createString("billstatus");

    public final StringPath businessdate = createString("businessdate");

    public final StringPath checkdate = createString("checkdate");

    public final StringPath checkdateend = createString("checkdateend");

    public final StringPath department = createString("department");

    public final StringPath id = createString("id");

    public final StringPath instanceid = createString("instanceid");

    public final StringPath note = createString("note");

    public final StringPath supplier = createString("supplier");

    public final StringPath supplierregaddr = createString("supplierregaddr");

    public final StringPath transportmode = createString("transportmode");

    public final StringPath transporttemp = createString("transporttemp");

    public final StringPath transtime = createString("transtime");

    public QZgspReceiveVerifyEntity(String variable) {
        super(ZgspReceiveVerifyEntity.class, forVariable(variable));
    }

    public QZgspReceiveVerifyEntity(Path<? extends ZgspReceiveVerifyEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QZgspReceiveVerifyEntity(PathMetadata metadata) {
        super(ZgspReceiveVerifyEntity.class, metadata);
    }

}

