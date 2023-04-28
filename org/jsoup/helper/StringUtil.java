package org.jsoup.helper;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class StringUtil {
    private static final int MaxCachedBuilderSize = 8192;
    public static final String[] padding = null;
    private static final ThreadLocal<StringBuilder> stringLocal = null;

    /* renamed from: org.jsoup.helper.StringUtil$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public class AnonymousClass1 extends ThreadLocal<StringBuilder> {
        @Override // java.lang.ThreadLocal
        public /* bridge */ /* synthetic */ StringBuilder initialValue() {
        }

        @Override // java.lang.ThreadLocal
        /* renamed from: initialValue  reason: avoid collision after fix types in other method */
        public StringBuilder initialValue2() {
        }
    }

    public static void appendNormalisedWhitespace(StringBuilder sb, String str, boolean z) {
    }

    public static boolean in(String str, String... strArr) {
    }

    public static boolean inSorted(String str, String[] strArr) {
    }

    public static boolean isActuallyWhitespace(int i2) {
    }

    public static boolean isBlank(String str) {
    }

    public static boolean isInvisibleChar(int i2) {
    }

    public static boolean isNumeric(String str) {
    }

    public static boolean isWhitespace(int i2) {
    }

    public static String join(Collection collection, String str) {
    }

    public static String normaliseWhitespace(String str) {
    }

    public static String padding(int i2) {
    }

    public static URL resolve(URL url, String str) throws MalformedURLException {
    }

    public static StringBuilder stringBuilder() {
    }

    public static String join(Iterator it, String str) {
    }

    public static String resolve(String str, String str2) {
    }

    public static String join(String[] strArr, String str) {
    }
}
