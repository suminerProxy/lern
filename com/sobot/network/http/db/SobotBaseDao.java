package com.sobot.network.http.db;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Pair;
import java.util.List;
import java.util.concurrent.locks.Lock;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public abstract class SobotBaseDao<T> {
    public static String TAG;
    private static final boolean isDebug = false;
    public SQLiteDatabase database;
    public SQLiteOpenHelper helper;
    public Lock lock;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public interface Action {
        void call(SQLiteDatabase sQLiteDatabase);
    }

    public SobotBaseDao(SQLiteOpenHelper sQLiteOpenHelper) {
    }

    public final void closeDatabase(SQLiteDatabase sQLiteDatabase, Cursor cursor) {
    }

    public boolean delete(String str, String[] strArr) {
    }

    public boolean deleteAll() {
    }

    public boolean deleteList(List<Pair<String, String[]>> list) {
    }

    public abstract ContentValues getContentValues(T t);

    public abstract String getTableName();

    public boolean insert(T t) {
    }

    public SQLiteDatabase openWriter() {
    }

    public abstract T parseCursorToBean(Cursor cursor);

    public List<T> query(SQLiteDatabase sQLiteDatabase, String str, String[] strArr) {
    }

    public List<T> queryAll(SQLiteDatabase sQLiteDatabase) {
    }

    public T queryOne(SQLiteDatabase sQLiteDatabase, String str, String[] strArr) {
    }

    public boolean replace(T t) {
    }

    public void startTransaction(Action action) {
    }

    public abstract void unInit();

    public boolean update(T t, String str, String[] strArr) {
    }

    public long deleteAll(SQLiteDatabase sQLiteDatabase) {
    }

    public List<T> query(SQLiteDatabase sQLiteDatabase, String[] strArr, String str, String[] strArr2, String str2, String str3, String str4, String str5) {
    }

    public List<T> queryAll() {
    }

    public T queryOne(String str, String[] strArr) {
    }

    public List<T> query(String str, String[] strArr) {
    }

    public List<T> query(String[] strArr, String str, String[] strArr2, String str2, String str3, String str4, String str5) {
    }

    public long delete(SQLiteDatabase sQLiteDatabase, String str, String[] strArr) {
    }

    public long insert(SQLiteDatabase sQLiteDatabase, T t) {
    }

    public long replace(SQLiteDatabase sQLiteDatabase, T t) {
    }

    public long update(SQLiteDatabase sQLiteDatabase, T t, String str, String[] strArr) {
    }

    public boolean insert(List<T> list) {
    }

    public boolean replace(ContentValues contentValues) {
    }

    public boolean update(ContentValues contentValues, String str, String[] strArr) {
    }

    public long replace(SQLiteDatabase sQLiteDatabase, ContentValues contentValues) {
    }

    public long update(SQLiteDatabase sQLiteDatabase, ContentValues contentValues, String str, String[] strArr) {
    }

    public boolean insert(SQLiteDatabase sQLiteDatabase, List<T> list) {
    }

    public boolean replace(List<T> list) {
    }

    public boolean replace(SQLiteDatabase sQLiteDatabase, List<T> list) {
    }
}
