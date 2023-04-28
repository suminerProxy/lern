package com.tencent.bugly.idasc.crashreport.crash.anr;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Map;
import java.util.regex.Pattern;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class TraceFileHelper {

    /* renamed from: com.tencent.bugly.idasc.crashreport.crash.anr.TraceFileHelper$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public final class AnonymousClass1 implements b {

        /* renamed from: a  reason: collision with root package name */
        private /* synthetic */ a f9372a;
        private /* synthetic */ String b;
        private /* synthetic */ boolean c;

        public AnonymousClass1(a aVar, String str, boolean z) {
        }

        @Override // com.tencent.bugly.idasc.crashreport.crash.anr.TraceFileHelper.b
        public final boolean a(long j2) {
        }

        @Override // com.tencent.bugly.idasc.crashreport.crash.anr.TraceFileHelper.b
        public final boolean a(long j2, long j3, String str) {
        }

        @Override // com.tencent.bugly.idasc.crashreport.crash.anr.TraceFileHelper.b
        public final boolean a(String str, int i2, String str2, String str3) {
        }
    }

    /* renamed from: com.tencent.bugly.idasc.crashreport.crash.anr.TraceFileHelper$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public final class AnonymousClass2 implements b {

        /* renamed from: a  reason: collision with root package name */
        private /* synthetic */ a f9373a;
        private /* synthetic */ boolean b;

        public AnonymousClass2(a aVar, boolean z) {
        }

        @Override // com.tencent.bugly.idasc.crashreport.crash.anr.TraceFileHelper.b
        public final boolean a(long j2) {
        }

        @Override // com.tencent.bugly.idasc.crashreport.crash.anr.TraceFileHelper.b
        public final boolean a(long j2, long j3, String str) {
        }

        @Override // com.tencent.bugly.idasc.crashreport.crash.anr.TraceFileHelper.b
        public final boolean a(String str, int i2, String str2, String str3) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public long f9374a;
        public String b;
        public long c;

        /* renamed from: d  reason: collision with root package name */
        public Map<String, String[]> f9375d;
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public interface b {
        boolean a(long j2);

        boolean a(long j2, long j3, String str);

        boolean a(String str, int i2, String str2, String str3);
    }

    private static String a(BufferedReader bufferedReader) throws IOException {
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
}
