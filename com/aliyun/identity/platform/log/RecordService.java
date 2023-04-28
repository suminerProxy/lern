package com.aliyun.identity.platform.log;

import android.content.Context;
import com.aliyun.identity.platform.network.UploadLogCallback;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class RecordService {
    private static String LOG_FILE_NAME = null;
    private static final int MAX_RECORD_COUNT = 10;
    private static RecordService s_instance;
    private int clientIdx;
    private List<RecordBase> records;

    /* renamed from: com.aliyun.identity.platform.log.RecordService$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass1 implements UploadLogCallback {
        public final /* synthetic */ RecordService this$0;

        public AnonymousClass1(RecordService recordService) {
        }

        @Override // com.aliyun.identity.platform.network.UploadLogCallback
        public void onFail(List<String> list) {
        }

        @Override // com.aliyun.identity.platform.network.UploadLogCallback
        public void onSuccess() {
        }
    }

    public static /* synthetic */ void access$000(RecordService recordService, List list) {
    }

    private void cacheLogs(List<String> list) {
    }

    private void deleteLogFile() {
    }

    public static RecordService getInstance() {
    }

    private List<String> readCacheLogs() {
    }

    private void recordEventEx(RecordLevel recordLevel, String str, String... strArr) {
    }

    private void tryUpload(boolean z) {
    }

    public void flush() {
    }

    public void init(Context context, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
    }

    public void recordEvent(RecordLevel recordLevel, String str, String... strArr) {
    }
}
