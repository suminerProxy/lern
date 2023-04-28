package com.alibaba.fastjson.parser;

import com.alibaba.fastjson.parser.deserializer.ObjectDeserializer;
import java.lang.reflect.Type;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class EnumDeserializer implements ObjectDeserializer {
    private final Class<?> enumClass;
    public long[] enumNameHashCodes;
    public final Enum[] enums;
    public final Enum[] ordinalEnums;

    public EnumDeserializer(Class<?> cls) {
    }

    @Override // com.alibaba.fastjson.parser.deserializer.ObjectDeserializer
    public <T> T deserialze(DefaultJSONParser defaultJSONParser, Type type, Object obj) {
    }
}
