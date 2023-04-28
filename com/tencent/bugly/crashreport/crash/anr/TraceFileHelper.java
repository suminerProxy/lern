package com.tencent.bugly.crashreport.crash.anr;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Map;
import java.util.regex.Pattern;

/* compiled from: BUGLY */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class TraceFileHelper {

    /* compiled from: BUGLY */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public long f9237a;
        public String b;
        public long c;

        /* renamed from: d  reason: collision with root package name */
        public Map<String, String[]> f9238d;
    }

    /* compiled from: BUGLY */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public interface b {
        boolean a(long j2);

        boolean a(long j2, long j3, String str);

        boolean a(String str, int i2, String str2, String str3);
    }

    private static Object[] a(BufferedReader bufferedReader, Pattern... patternArr) throws IOException {
    }

    private static String b(BufferedReader bufferedReader) throws IOException {
    }

    public static a readFirstDumpInfo(String str, boolean z) {
    }

    public static a readTargetDumpInfo(String str, String str2, boolean z) {
    }

    public static void readTraceFile(String str, b bVar) {
    }

    /* compiled from: BUGLY */
    /* renamed from: com.tencent.bugly.crashreport.crash.anr.TraceFileHelper$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class AnonymousClass2 implements b {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ a f9236a;
        public final /* synthetic */ boolean b;

        public AnonymousClass2(a aVar, boolean z) {
        }

        @Override // com.tencent.bugly.crashreport.crash.anr.TraceFileHelper.b
        public final boolean a(String str, int i2, String str2, String str3) {
        }

        @Override // com.tencent.bugly.crashreport.crash.anr.TraceFileHelper.b
        public final boolean a(long j2, long j3, String str) {
        }

        @Override // com.tencent.bugly.crashreport.crash.anr.TraceFileHelper.b
        public final boolean a(long j2) {
        }
    }

    /* compiled from: BUGLY */
    /* renamed from: com.tencent.bugly.crashreport.crash.anr.TraceFileHelper$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class AnonymousClass1 implements b {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ a f9235a;
        public final /* synthetic */ String b;
        public final /* synthetic */ boolean c;

        public AnonymousClass1(a aVar, String str, boolean z) {
        }

        @Override // com.tencent.bugly.crashreport.crash.anr.TraceFileHelper.b
        public final boolean a(String str, int i2, String str2, String str3) {
        }

        @Override // com.tencent.bugly.crashreport.crash.anr.TraceFileHelper.b
        public final boolean a(long j2, long j3, String str) {
        }

        @Override // com.tencent.bugly.crashreport.crash.anr.TraceFileHelper.b
        public final boolean a(long j2) {
        }
    }

    private static String a(BufferedReader bufferedReader) throws IOException {
    }
}
