package com.mobile.auth.o;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.mobile.auth.ad.d;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class c<T extends com.mobile.auth.ad.d> {

    /* renamed from: a  reason: collision with root package name */
    private static final String f5152a = "com.mobile.auth.o.c";
    private e b;
    private SQLiteDatabase c;

    /* renamed from: d  reason: collision with root package name */
    private String f5153d;

    public c(String str, e eVar) {
    }

    private long a(Cursor cursor) {
    }

    public int a(SQLiteDatabase sQLiteDatabase) {
    }

    public abstract ContentValues a(T t);

    public SQLiteDatabase a() {
    }

    public String a(List<Long> list) {
    }

    public synchronized List<T> a(int i2, int i3, String str) {
    }

    public synchronized List<T> a(long j2, long j3, int i2) {
    }

    public synchronized void a(long j2) {
    }

    public synchronized void a(SQLiteDatabase sQLiteDatabase, int i2) {
    }

    public synchronized void a(List<T> list, long j2, int i2) {
    }

    public SQLiteDatabase b() {
    }

    public abstract T b(Cursor cursor);

    public synchronized void b(T t) {
    }

    public synchronized void b(List<T> list) {
    }

    public void c() {
    }

    public synchronized void c(List<Long> list) {
    }

    public synchronized long d() {
    }

    public synchronized long e() {
    }
}
