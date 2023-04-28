package com.sobot.network.http.db;

import android.content.ContentValues;
import android.database.Cursor;
import com.sobot.network.http.model.SobotProgress;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class SobotDownloadManager extends SobotBaseDao<SobotProgress> {
    private static SobotDownloadManager instance;

    private SobotDownloadManager() {
    }

    public static SobotDownloadManager getInstance() {
    }

    public boolean clear() {
    }

    public void delete(String str) {
    }

    public SobotProgress get(String str) {
    }

    public List<SobotProgress> getAll() {
    }

    @Override // com.sobot.network.http.db.SobotBaseDao
    public /* bridge */ /* synthetic */ ContentValues getContentValues(SobotProgress sobotProgress) {
    }

    public List<SobotProgress> getDownloading() {
    }

    public List<SobotProgress> getFinished() {
    }

    @Override // com.sobot.network.http.db.SobotBaseDao
    public String getTableName() {
    }

    @Override // com.sobot.network.http.db.SobotBaseDao
    public /* bridge */ /* synthetic */ SobotProgress parseCursorToBean(Cursor cursor) {
    }

    @Override // com.sobot.network.http.db.SobotBaseDao
    public void unInit() {
    }

    public boolean update(SobotProgress sobotProgress) {
    }

    public void updateDownloading2None() {
    }

    /* renamed from: getContentValues  reason: avoid collision after fix types in other method */
    public ContentValues getContentValues2(SobotProgress sobotProgress) {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.sobot.network.http.db.SobotBaseDao
    public SobotProgress parseCursorToBean(Cursor cursor) {
    }

    public boolean update(ContentValues contentValues, String str) {
    }
}
