package com.insp.cloudtest.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QZgspReceiveVerifyItemEntity is a Querydsl query type for ZgspReceiveVerifyItemEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QZgspReceiveVerifyItemEntity extends EntityPathBase<ZgspReceiveVerifyItemEntity> {

    private static final long serialVersionUID = -54493725L;

    public static final QZgspReceiveVerifyItemEntity zgspReceiveVerifyItemEntity = new QZgspReceiveVerifyItemEntity("zgspReceiveVerifyItemEntity");

    public final StringPath approvalnum = createString("approvalnum");

    public final StringPath appstate = createString("appstate");

    public final StringPath batchid = createString("batchid");

    public final StringPath bfmaterialid = createString("bfmaterialid");

    public final StringPath billstatus = createString("billstatus");

    public final StringPath commonname = createString("commonname");

    public final StringPath disabledate = createString("disabledate");

    public final StringPath dostype = createString("dostype");

    public final NumberPath<Integer> doubtqat = createNumber("doubtqat", Integer.class);

    public final StringPath efficientdate = createString("efficientdate");

    public final StringPath id = createString("id");

    public final StringPath instanceid = createString("instanceid");

    public final StringPath istracecode = createString("istracecode");

    public final StringPath mah = createString("mah");

    public final StringPath mdregister = createString("mdregister");

    public final StringPath measure = createString("measure");

    public final StringPath medicialitemname = createString("medicialitemname");

    public final StringPath mfverifyreport = createString("mfverifyreport");

    public final StringPath parentid = createString("parentid");

    public final StringPath pocode = createString("pocode");

    public final StringPath prodenter = createString("prodenter");

    public final NumberPath<Integer> receiveqat = createNumber("receiveqat", Integer.class);

    public final StringPath rejectreason = createString("rejectreason");

    public final StringPath spec = createString("spec");

    public final StringPath specmodel = createString("specmodel");

    public final StringPath specpackage = createString("specpackage");

    public final StringPath storagecond = createString("storagecond");

    public final StringPath tempcontrolmodel = createString("tempcontrolmodel");

    public final StringPath unit = createString("unit");

    public final StringPath validtime = createString("validtime");

    public final NumberPath<Integer> verifypassqat = createNumber("verifypassqat", Integer.class);

    public final NumberPath<Integer> verifyqat = createNumber("verifyqat", Integer.class);

    public final NumberPath<Integer> verifyrejectqat = createNumber("verifyrejectqat", Integer.class);

    public final StringPath verifyresult = createString("verifyresult");

    public final StringPath warehouse = createString("warehouse");

    public QZgspReceiveVerifyItemEntity(String variable) {
        super(ZgspReceiveVerifyItemEntity.class, forVariable(variable));
    }

    public QZgspReceiveVerifyItemEntity(Path<? extends ZgspReceiveVerifyItemEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QZgspReceiveVerifyItemEntity(PathMetadata metadata) {
        super(ZgspReceiveVerifyItemEntity.class, metadata);
    }

}

