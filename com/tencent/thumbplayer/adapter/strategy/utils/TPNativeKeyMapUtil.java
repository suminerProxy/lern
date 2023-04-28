package com.tencent.thumbplayer.adapter.strategy.utils;

import android.util.SparseArray;
import com.tencent.thumbplayer.adapter.a.b.c;
import com.tencent.thumbplayer.api.TPCommonEnum;
import java.lang.annotation.Annotation;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class TPNativeKeyMapUtil {
    private static final String REVERSE_MAP_NAME_SUFFIX = ".reverseMap";
    private static final String TAG = "TPNativeKeyMapUtil";
    private static final AtomicBoolean sHasOptionalIdMapInit = null;
    private static final Map<Class<?>, AtomicBoolean> sHasThisAnnotationInitMap = null;
    private static final Map<String, Map<Number, Number>> sNameToMap = null;
    private static final SparseArray<String> sOptionalIdKeyToNameMap = null;
    private static final SparseArray<c.a> sToNativeOptionalIdMap = null;

    private static <T extends Annotation> void buildBiDirectionMapForAnnotation(Class<T> cls) {
    }

    private static void buildNativeInitConfigMap() {
    }

    private static void buildNativeOptionalIdToMapInternal(Class<?> cls) {
    }

    private static void buildOptionalIdMap() {
    }

    private static void buildPrivateToNativeOptionalIdMap() {
    }

    private static void buildPublicToNativeOptionalIdMap() {
    }

    private static <T extends Annotation> void checkFillMapValidity(Class<T> cls, Map<Number, Number> map, Map<Number, Number> map2, Class<?> cls2, Number number, Number number2) {
    }

    public static c.a convertToNativeOptionalId(@TPCommonEnum.TPOptionalId int i2) {
    }

    public static <T extends Annotation> Set<Map.Entry<Number, Number>> getEntrySetOfToNativeMap(Class<T> cls) {
    }

    public static <T extends Annotation> Set<Map.Entry<Number, Number>> getEntrySetOfToTPMap(Class<T> cls) {
    }

    private static <T extends Annotation> Map<Number, Number> getMapForAnnotation(Class<T> cls, boolean z) {
    }

    private static <T extends Annotation> String getMapKey(Class<T> cls, boolean z) {
    }

    public static String getOptionalIdName(int i2) {
    }

    public static void init() {
    }

    private static <T extends Annotation> void searchClassToFillMap(Class<T> cls) {
    }

    public static <T extends Annotation> int toNativeIntValue(Class<T> cls, int i2) {
    }

    public static <T extends Annotation> long toNativeLongValue(Class<T> cls, long j2) {
    }

    public static <T extends Annotation> int toTPIntValue(Class<T> cls, int i2) {
    }

    public static <T extends Annotation> long toTPLongValue(Class<T> cls, long j2) {
    }
}
