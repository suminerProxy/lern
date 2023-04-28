package org.libpag;

import android.content.res.AssetManager;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public class PAGFont {

    /* renamed from: a  reason: collision with root package name */
    private static final String[] f29817a = null;
    private static final Pattern b = null;
    private static boolean c;
    public String fontFamily;
    public String fontStyle;

    public PAGFont() {
    }

    private static void RegisterFallbackFonts() {
    }

    public static native PAGFont RegisterFont(AssetManager assetManager, String str, int i2, String str2, String str3);

    public static PAGFont RegisterFont(String str) {
    }

    public static native PAGFont RegisterFont(String str, int i2, String str2, String str3);

    private static native PAGFont RegisterFontBytes(byte[] bArr, int i2, int i3, String str, String str2);

    private static native void SetFallbackFontPaths(String[] strArr, int[] iArr);

    private static native void UnregisterFont(String str, String str2);

    public static void UnregisterFont(PAGFont pAGFont) {
    }

    private static a[] a(XmlPullParser xmlPullParser) {
    }

    private static a[] b() {
    }

    private static a c(XmlPullParser xmlPullParser) {
    }

    private static void d(XmlPullParser xmlPullParser) {
    }

    public static PAGFont RegisterFont(AssetManager assetManager, String str) {
    }

    public static PAGFont RegisterFont(AssetManager assetManager, String str, int i2) {
    }

    public PAGFont(String str, String str2) {
    }

    public static PAGFont RegisterFont(String str, int i2) {
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f29818a;
        public String b;
        public int c;

        /* renamed from: d  reason: collision with root package name */
        public int f29819d;

        private a() {
        }

        public /* synthetic */ a(e eVar) {
        }
    }

    private static a[] b(XmlPullParser xmlPullParser) {
    }

    private static void a(XmlPullParser xmlPullParser, ArrayList<a> arrayList) {
    }

    private static void b(XmlPullParser xmlPullParser, ArrayList<a> arrayList) {
    }

    private static a[] a() {
    }

    private static a a(a[] aVarArr, String str) {
    }

    private static void a(a aVar, ArrayList<String> arrayList, ArrayList<Integer> arrayList2) {
    }
}
