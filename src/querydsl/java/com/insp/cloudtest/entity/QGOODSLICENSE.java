package com.insp.cloudtest.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QGOODSLICENSE is a Querydsl query type for GOODSLICENSE
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QGOODSLICENSE extends EntityPathBase<GOODSLICENSE> {

    private static final long serialVersionUID = -1745900272L;

    public static final QGOODSLICENSE gOODSLICENSE = new QGOODSLICENSE("gOODSLICENSE");

    public final StringPath code = createString("code");

    public final NumberPath<Integer> day = createNumber("day", Integer.class);

    public final StringPath id = createString("id");

    public final StringPath isSys = createString("isSys");

    public final StringPath name = createString("name");

    public final StringPath note = createString("note");

    public QGOODSLICENSE(String variable) {
        super(GOODSLICENSE.class, forVariable(variable));
    }

    public QGOODSLICENSE(Path<? extends GOODSLICENSE> path) {
        super(path.getType(), path.getMetadata());
    }

    public QGOODSLICENSE(PathMetadata metadata) {
        super(GOODSLICENSE.class, metadata);
    }

}

