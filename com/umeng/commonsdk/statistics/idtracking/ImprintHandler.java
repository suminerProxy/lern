package com.umeng.commonsdk.statistics.idtracking;

import android.content.Context;
import com.umeng.commonsdk.statistics.internal.UMImprintChangeCallback;
import com.umeng.commonsdk.statistics.internal.UMImprintPreProcessCallback;
import com.umeng.commonsdk.utils.FileLockCallback;
import com.umeng.commonsdk.utils.FileLockUtil;
import java.io.File;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class ImprintHandler implements FileLockCallback {

    /* renamed from: a  reason: collision with root package name */
    private static final String f15304a = "ImprintHandler";
    private static Object b = null;
    private static final String c = ".imprint";

    /* renamed from: d  reason: collision with root package name */
    private static final byte[] f15305d = null;

    /* renamed from: f  reason: collision with root package name */
    private static Map<String, ArrayList<UMImprintChangeCallback>> f15306f = null;

    /* renamed from: g  reason: collision with root package name */
    private static Object f15307g = null;

    /* renamed from: j  reason: collision with root package name */
    private static ImprintHandler f15308j = null;

    /* renamed from: k  reason: collision with root package name */
    private static Context f15309k = null;

    /* renamed from: l  reason: collision with root package name */
    private static FileLockUtil f15310l = null;

    /* renamed from: m  reason: collision with root package name */
    private static final int f15311m = 0;

    /* renamed from: n  reason: collision with root package name */
    private static final int f15312n = 1;

    /* renamed from: o  reason: collision with root package name */
    private static Map<String, UMImprintPreProcessCallback> f15313o;

    /* renamed from: p  reason: collision with root package name */
    private static Object f15314p;

    /* renamed from: e  reason: collision with root package name */
    private com.umeng.commonsdk.statistics.internal.d f15315e;

    /* renamed from: h  reason: collision with root package name */
    private a f15316h;

    /* renamed from: i  reason: collision with root package name */
    private com.umeng.commonsdk.statistics.proto.d f15317i;

    private ImprintHandler(Context context) {
    }

    private static void a(String str, UMImprintChangeCallback uMImprintChangeCallback) {
    }

    private static void b(String str, UMImprintChangeCallback uMImprintChangeCallback) {
    }

    private boolean c(com.umeng.commonsdk.statistics.proto.d dVar) {
    }

    private com.umeng.commonsdk.statistics.proto.d d(com.umeng.commonsdk.statistics.proto.d dVar) {
    }

    private com.umeng.commonsdk.statistics.proto.d e(com.umeng.commonsdk.statistics.proto.d dVar) {
    }

    public static synchronized ImprintHandler getImprintService(Context context) {
    }

    @Override // com.umeng.commonsdk.utils.FileLockCallback
    public boolean onFileLock(File file, int i2) {
    }

    @Override // com.umeng.commonsdk.utils.FileLockCallback
    public boolean onFileLock(String str) {
    }

    @Override // com.umeng.commonsdk.utils.FileLockCallback
    public boolean onFileLock(String str, Object obj) {
    }

    public void registImprintCallback(String str, UMImprintChangeCallback uMImprintChangeCallback) {
    }

    public void registPreProcessCallback(String str, UMImprintPreProcessCallback uMImprintPreProcessCallback) {
    }

    public void unregistImprintCallback(String str, UMImprintChangeCallback uMImprintChangeCallback) {
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private Map<String, String> f15318a;

        public a() {
        }

        private synchronized void b(com.umeng.commonsdk.statistics.proto.d dVar) {
        }

        public synchronized void a(String str) {
        }

        public a(com.umeng.commonsdk.statistics.proto.d dVar) {
        }

        public void a(com.umeng.commonsdk.statistics.proto.d dVar) {
        }

        public synchronized String a(String str, String str2) {
        }
    }

    public void d() {
    }

    public a c() {
    }

    public void b(com.umeng.commonsdk.statistics.proto.d dVar) {
    }

    public void a(String str) {
    }

    private void e() {
    }

    public void a(com.umeng.commonsdk.statistics.internal.d dVar) {
    }

    public String a(com.umeng.commonsdk.statistics.proto.d dVar) {
    }

    public byte[] a(com.umeng.commonsdk.statistics.proto.e eVar) {
    }

    public byte[] a() {
    }

    public synchronized com.umeng.commonsdk.statistics.proto.d b() {
    }

    private boolean a(String str, String str2) {
    }

    private com.umeng.commonsdk.statistics.proto.d a(com.umeng.commonsdk.statistics.proto.d dVar, com.umeng.commonsdk.statistics.proto.d dVar2, Map<String, String> map) {
    }

    private void a(File file) {
    }
}
