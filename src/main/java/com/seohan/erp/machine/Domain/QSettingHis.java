package com.seohan.erp.machine.Domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QSettingHis is a Querydsl query type for SettingHis
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QSettingHis extends EntityPathBase<SettingHis> {

    private static final long serialVersionUID = -1751561700L;

    public static final QSettingHis settingHis = new QSettingHis("settingHis");

    public final NumberPath<Double> aftspec = createNumber("aftspec", Double.class);

    public final StringPath class01 = createString("class01");

    public final StringPath class02 = createString("class02");

    public final StringPath class03 = createString("class03");

    public final StringPath confirmdate = createString("confirmdate");

    public final DateTimePath<java.util.Date> confirmdt = createDateTime("confirmdt", java.util.Date.class);

    public final StringPath confirmemp = createString("confirmemp");

    public final DateTimePath<java.util.Date> createdat = createDateTime("createdat", java.util.Date.class);

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final StringPath itmno = createString("itmno");

    public final NumberPath<Double> prespec = createNumber("prespec", Double.class);

    public final StringPath reason01 = createString("reason01");

    public final StringPath reason02 = createString("reason02");

    public final StringPath reason03 = createString("reason03");

    public final StringPath remark01 = createString("remark01");

    public final StringPath remark02 = createString("remark02");

    public final StringPath rut = createString("rut");

    public final StringPath stat = createString("stat");

    public final StringPath testcase = createString("testcase");

    public final NumberPath<Double> testdata = createNumber("testdata", Double.class);

    public final StringPath testdate = createString("testdate");

    public final DateTimePath<java.util.Date> testdt = createDateTime("testdt", java.util.Date.class);

    public final StringPath testemp = createString("testemp");

    public final StringPath testresult = createString("testresult");

    public final StringPath wrkct = createString("wrkct");

    public QSettingHis(String variable) {
        super(SettingHis.class, forVariable(variable));
    }

    public QSettingHis(Path<? extends SettingHis> path) {
        super(path.getType(), path.getMetadata());
    }

    public QSettingHis(PathMetadata metadata) {
        super(SettingHis.class, metadata);
    }

}

