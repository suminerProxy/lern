package com.umeng.analytics.process;

import android.content.Context;
import com.umeng.analytics.process.DBFileTraversalUtil;
import com.umeng.commonsdk.utils.FileLockCallback;
import com.umeng.commonsdk.utils.FileLockUtil;
import java.io.File;
import java.io.Serializable;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class UMProcessDBHelper {
    private static UMProcessDBHelper mInstance;
    private InsertEventCallback ekvCallBack;
    private Context mContext;
    private FileLockUtil mFileLock;

    /* renamed from: com.umeng.analytics.process.UMProcessDBHelper$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass1 implements DBFileTraversalUtil.a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ UMProcessDBHelper f15051a;

        public AnonymousClass1(UMProcessDBHelper uMProcessDBHelper) {
        }

        @Override // com.umeng.analytics.process.DBFileTraversalUtil.a
        public void a() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class InsertEventCallback implements FileLockCallback {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ UMProcessDBHelper f15052a;

        private InsertEventCallback(UMProcessDBHelper uMProcessDBHelper) {
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

        public /* synthetic */ InsertEventCallback(UMProcessDBHelper uMProcessDBHelper, AnonymousClass1 anonymousClass1) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class ProcessToMainCallback implements FileLockCallback {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ UMProcessDBHelper f15053a;

        private ProcessToMainCallback(UMProcessDBHelper uMProcessDBHelper) {
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

        public /* synthetic */ ProcessToMainCallback(UMProcessDBHelper uMProcessDBHelper, AnonymousClass1 anonymousClass1) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class a implements Serializable {

        /* renamed from: a  reason: collision with root package name */
        public int f15054a;
        public String b;
        public String c;

        /* renamed from: d  reason: collision with root package name */
        public String f15055d;

        /* renamed from: e  reason: collision with root package name */
        public int f15056e;

        /* renamed from: f  reason: collision with root package name */
        public String f15057f;

        /* renamed from: g  reason: collision with root package name */
        public String f15058g;

        /* renamed from: h  reason: collision with root package name */
        public String f15059h;

        /* renamed from: i  reason: collision with root package name */
        public final /* synthetic */ UMProcessDBHelper f15060i;

        private a(UMProcessDBHelper uMProcessDBHelper) {
        }

        public /* synthetic */ a(UMProcessDBHelper uMProcessDBHelper, AnonymousClass1 anonymousClass1) {
        }
    }

    private UMProcessDBHelper() {
    }

    public static /* synthetic */ void access$200(UMProcessDBHelper uMProcessDBHelper, String str) {
    }

    public static /* synthetic */ Context access$400(UMProcessDBHelper uMProcessDBHelper) {
    }

    private List<a> datasAdapter(String str, JSONArray jSONArray) {
    }

    private boolean dbIsExists(String str) {
    }

    private int getDataSource() {
    }

    public static UMProcessDBHelper getInstance(Context context) {
    }

    private boolean insertEvents_(String str, List<a> list) {
    }

    private boolean processIsService(Context context) {
    }

    private void processToMain(String str) {
    }

    private List<a> readEventByProcess(String str) {
    }

    public void createDBByProcess(String str) {
    }

    public void deleteEventDatas(String str, String str2, List<a> list) {
    }

    public void deleteMainProcessEventDatasByIds(List<Integer> list) {
    }

    public void insertEvents(String str, JSONArray jSONArray) {
    }

    public void insertEventsInSubProcess(String str, JSONArray jSONArray) {
    }

    public void processDBToMain() {
    }

    public JSONObject readMainEvents(long j2, List<Integer> list) {
    }

    public JSONObject readVersionInfoFromColumId(Integer num) {
    }

    private UMProcessDBHelper(Context context) {
    }
}
