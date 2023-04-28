package com.tencent.thumbplayer.api;

import com.tencent.thumbplayer.api.TPCommonEnum;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class TPOptionalParam {
    public static final int TP_OPTIONAL_PARAM_TYPE_BOOLEAN = 1;
    public static final int TP_OPTIONAL_PARAM_TYPE_FLOAT = 6;
    public static final int TP_OPTIONAL_PARAM_TYPE_LONG = 2;
    public static final int TP_OPTIONAL_PARAM_TYPE_OBJECT = 7;
    public static final int TP_OPTIONAL_PARAM_TYPE_QUEUE_INT = 4;
    public static final int TP_OPTIONAL_PARAM_TYPE_QUEUE_STRING = 5;
    public static final int TP_OPTIONAL_PARAM_TYPE_STRING = 3;
    public static final int TP_OPTIONAL_PARAM_TYPE_UNKNOWN = -1;
    @TPCommonEnum.TPOptionalId
    private int key;
    private OptionalParamBoolean paramBoolean;
    private OptionalParamFloat paramFloat;
    private OptionalParamLong paramLong;
    private OptionalParamObject paramObject;
    private OptionalParamQueueInt paramQueueInt;
    private OptionalParamQueueString paramQueueString;
    private OptionalParamString paramString;
    private int paramType;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class OptionalParamBoolean {
        public boolean value;
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class OptionalParamFloat {
        public float param1;
        public float param2;
        public float value;
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class OptionalParamLong {
        public long param1;
        public long param2;
        public long value;
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class OptionalParamObject {
        public Object objectValue;
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class OptionalParamQueueInt {
        public int[] queueValue;
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class OptionalParamQueueString {
        public String[] queueValue;
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class OptionalParamString {
        public String param1;
        public String param2;
        public String value;
    }

    public TPOptionalParam buildBoolean(@TPCommonEnum.TPOptionalId int i2, boolean z) {
    }

    public TPOptionalParam buildFloat(@TPCommonEnum.TPOptionalId int i2, float f2) {
    }

    public TPOptionalParam buildFloat(@TPCommonEnum.TPOptionalId int i2, float f2, float f3, float f4) {
    }

    public TPOptionalParam buildLong(@TPCommonEnum.TPOptionalId int i2, long j2) {
    }

    public TPOptionalParam buildLong(@TPCommonEnum.TPOptionalId int i2, long j2, long j3, long j4) {
    }

    public TPOptionalParam buildObject(int i2, Object obj) {
    }

    public TPOptionalParam buildQueueInt(@TPCommonEnum.TPOptionalId int i2, int[] iArr) {
    }

    public TPOptionalParam buildQueueString(@TPCommonEnum.TPOptionalId int i2, String[] strArr) {
    }

    public TPOptionalParam buildString(@TPCommonEnum.TPOptionalId int i2, String str) {
    }

    public TPOptionalParam buildString(@TPCommonEnum.TPOptionalId int i2, String str, String str2, String str3) {
    }

    @TPCommonEnum.TPOptionalId
    public int getKey() {
    }

    public OptionalParamBoolean getParamBoolean() {
    }

    public OptionalParamFloat getParamFloat() {
    }

    public OptionalParamLong getParamLong() {
    }

    public OptionalParamObject getParamObject() {
    }

    public OptionalParamQueueInt getParamQueueInt() {
    }

    public OptionalParamQueueString getParamQueueString() {
    }

    public OptionalParamString getParamString() {
    }

    public int getParamType() {
    }

    public String toString() {
    }
}
