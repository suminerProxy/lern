package com.tencent.bugly.idasc;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.tencent.bugly.idasc.crashreport.common.strategy.StrategyBean;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public abstract class a {
    public int id;
    public String moduleName;
    public String version;
    public String versionKey;

    public abstract String[] getTables();

    public abstract void init(Context context, boolean z, BuglyStrategy buglyStrategy);

    public void onDbCreate(SQLiteDatabase sQLiteDatabase) {
    }

    public void onDbDowngrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
    }

    public void onDbUpgrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
    }

    public void onServerStrategyChanged(StrategyBean strategyBean) {
    }
}
