package com.umeng.analytics.process;

import android.content.Context;
import com.umeng.analytics.pro.o;
import com.umeng.commonsdk.framework.UMLogDataProtocol;
import com.umeng.commonsdk.utils.FileLockCallback;
import com.umeng.commonsdk.utils.FileLockUtil;
import java.io.File;
import java.util.List;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import org.json.JSONObject;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class UMProcessDBDatasSender implements UMLogDataProtocol {
    public static final int UM_PROCESS_CONSTRUCTMESSAGE = 36946;
    public static final int UM_PROCESS_EVENT_KEY = 36945;
    private static ScheduledThreadPoolExecutor executor;
    private static UMProcessDBDatasSender mInstance;
    private Context mContext;
    private List<Integer> mGeneralBodyIds;
    private FileLockUtil mLockUtil;
    private o.c mPolicySelector;

    /* renamed from: com.umeng.analytics.process.UMProcessDBDatasSender$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass1 implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ UMProcessDBDatasSender f15048a;

        public AnonymousClass1(UMProcessDBDatasSender uMProcessDBDatasSender) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class ConstructMessageCallback implements FileLockCallback {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ UMProcessDBDatasSender f15049a;

        private ConstructMessageCallback(UMProcessDBDatasSender uMProcessDBDatasSender) {
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

        public /* synthetic */ ConstructMessageCallback(UMProcessDBDatasSender uMProcessDBDatasSender, AnonymousClass1 anonymousClass1) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class ReplaceCallback implements FileLockCallback {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ UMProcessDBDatasSender f15050a;

        private ReplaceCallback(UMProcessDBDatasSender uMProcessDBDatasSender) {
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

        public /* synthetic */ ReplaceCallback(UMProcessDBDatasSender uMProcessDBDatasSender, AnonymousClass1 anonymousClass1) {
        }
    }

    private UMProcessDBDatasSender() {
    }

    public static /* synthetic */ Context access$000(UMProcessDBDatasSender uMProcessDBDatasSender) {
    }

    private void constructMessage() {
    }

    private int defconProcesserHandler() {
    }

    private JSONObject generalBody() {
    }

    private JSONObject generalHeader() {
    }

    public static UMProcessDBDatasSender getInstance(Context context) {
    }

    @Override // com.umeng.commonsdk.framework.UMLogDataProtocol
    public void removeCacheData(Object obj) {
    }

    @Override // com.umeng.commonsdk.framework.UMLogDataProtocol
    public JSONObject setupReportData(long j2) {
    }

    @Override // com.umeng.commonsdk.framework.UMLogDataProtocol
    public void workEvent(Object obj, int i2) {
    }
}
