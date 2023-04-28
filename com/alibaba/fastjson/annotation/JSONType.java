package com.alibaba.fastjson.annotation;

import com.alibaba.fastjson.PropertyNamingStrategy;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.serializer.SerializerFeature;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public @interface JSONType {
    boolean alphabetic() default true;

    boolean asm() default true;

    String[] ignores() default {};

    Class<?> mappingTo() default Void.class;

    PropertyNamingStrategy naming() default PropertyNamingStrategy.CamelCase;

    String[] orders() default {};

    Feature[] parseFeatures() default {};

    Class<?>[] seeAlso() default {};

    SerializerFeature[] serialzeFeatures() default {};

    String typeKey() default "";

    String typeName() default "";
}
