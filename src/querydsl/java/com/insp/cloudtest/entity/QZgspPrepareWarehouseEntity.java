package com.insp.cloudtest.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QZgspPrepareWarehouseEntity is a Querydsl query type for ZgspPrepareWarehouseEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QZgspPrepareWarehouseEntity extends EntityPathBase<ZgspPrepareWarehouseEntity> {

    private static final long serialVersionUID = -110455890L;

    public static final QZgspPrepareWarehouseEntity zgspPrepareWarehouseEntity = new QZgspPrepareWarehouseEntity("zgspPrepareWarehouseEntity");

    public final StringPath acceptancetype = createString("acceptancetype");

    public final StringPath billcode = createString("billcode");

    public final StringPath checkdate = createString("checkdate");

    public final StringPath checkdateend = createString("checkdateend");

    public final StringPath id = createString("id");

    public final StringPath supplier = createString("supplier");

    public final StringPath transportmode = createString("transportmode");

    public final StringPath whmark = createString("whmark");

    public QZgspPrepareWarehouseEntity(String variable) {
        super(ZgspPrepareWarehouseEntity.class, forVariable(variable));
    }

    public QZgspPrepareWarehouseEntity(Path<? extends ZgspPrepareWarehouseEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QZgspPrepareWarehouseEntity(PathMetadata metadata) {
        super(ZgspPrepareWarehouseEntity.class, metadata);
    }

}

