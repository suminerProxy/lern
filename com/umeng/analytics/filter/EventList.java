package com.umeng.analytics.filter;

import android.content.Context;
import com.umeng.commonsdk.utils.FileLockCallback;
import com.umeng.commonsdk.utils.FileLockUtil;
import java.io.File;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class EventList extends c implements FileLockCallback {
    private static final int DELETE_LIST_DATA = 2;
    private static final int LOAD_LIST_DATA = 1;
    private static final int SAVE_LIST_DATA = 0;
    private Context mAppContext;
    public String mEventList;
    public String mEventListKey;
    public String mEventListName;
    public String mEventListVersionKey;
    private FileLockUtil mFileLock;

    public EventList(String str, String str2) {
    }

    private void deleteDataFile(File file) {
    }

    private boolean loadEventListFromFile(Context context, File file) {
    }

    private void saveEventListToFile(Context context, File file) {
    }

    public boolean enabled() {
    }

    public void eventListChange() {
    }

    public boolean matchHit(String str) {
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

    @Override // com.umeng.analytics.filter.c, com.umeng.commonsdk.statistics.internal.UMImprintChangeCallback
    public void onImprintValueChanged(String str, String str2) {
    }

    @Override // com.umeng.analytics.filter.c, com.umeng.commonsdk.statistics.internal.UMImprintPreProcessCallback
    public boolean onPreProcessImprintKey(String str, String str2) {
    }

    public void register(Context context) {
    }

    public void setMD5ClearFlag(boolean z) {
    }

    public String toString() {
    }
}
