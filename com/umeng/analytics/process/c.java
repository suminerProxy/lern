package com.umeng.analytics.process;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: UMProcessDBManager.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private static c f15073a;
    private ConcurrentHashMap<String, a> b;
    private Context c;

    private c() {
    }

    public static c a(Context context) {
    }

    private a c(String str) {
    }

    public synchronized void b(String str) {
    }

    /* compiled from: UMProcessDBManager.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private AtomicInteger f15074a;
        private SQLiteOpenHelper b;
        private SQLiteDatabase c;

        private a() {
        }

        public static a a(Context context, String str) {
        }

        public synchronized void b() {
        }

        public synchronized SQLiteDatabase a() {
        }
    }

    public synchronized SQLiteDatabase a(String str) {
    }
}
