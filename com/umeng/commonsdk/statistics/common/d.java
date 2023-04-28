package com.umeng.commonsdk.statistics.common;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.File;
import java.io.FilenameFilter;

/* compiled from: StoreHelper.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    private static d f15297a = null;
    private static Context b = null;
    private static String c = null;

    /* renamed from: e  reason: collision with root package name */
    private static final String f15298e = "mobclick_agent_user_";

    /* renamed from: f  reason: collision with root package name */
    private static final String f15299f = "mobclick_agent_header_";

    /* renamed from: g  reason: collision with root package name */
    private static final String f15300g = "mobclick_agent_cached_";

    /* renamed from: d  reason: collision with root package name */
    private a f15301d;

    /* compiled from: StoreHelper.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private final int f15302a;
        private File b;
        private FilenameFilter c;

        /* compiled from: StoreHelper.java */
        /* renamed from: com.umeng.commonsdk.statistics.common.d$a$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public class AnonymousClass1 implements FilenameFilter {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ a f15303a;

            public AnonymousClass1(a aVar) {
            }

            @Override // java.io.FilenameFilter
            public boolean accept(File file, String str) {
            }
        }

        public a(Context context) {
        }

        public boolean a() {
        }

        public void b() {
        }

        public int c() {
        }

        public a(Context context, String str) {
        }

        public void a(b bVar) {
        }

        public void a(byte[] bArr) {
        }
    }

    /* compiled from: StoreHelper.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public interface b {
        void a(File file);

        boolean b(File file);

        void c(File file);
    }

    public d(Context context) {
    }

    public static synchronized d a(Context context) {
    }

    private SharedPreferences f() {
    }

    public String b() {
    }

    public boolean c() {
    }

    public String[] d() {
    }

    public void e() {
    }

    public void a(int i2) {
    }

    public int a() {
    }

    public void a(String str) {
    }

    public void a(String str, String str2) {
    }
}
