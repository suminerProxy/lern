package com.umeng.umzid;

import android.content.Context;
import org.json.JSONObject;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class ZIDManager {

    /* renamed from: d  reason: collision with root package name */
    public static ZIDManager f15501d;

    /* renamed from: a  reason: collision with root package name */
    public boolean f15502a;
    public boolean b;
    public boolean c;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f15503a;
        public final /* synthetic */ IZIDCompletionCallback b;
        public final /* synthetic */ ZIDManager c;

        public a(ZIDManager zIDManager, Context context, IZIDCompletionCallback iZIDCompletionCallback) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f15504a;
        public final /* synthetic */ ZIDManager b;

        public b(ZIDManager zIDManager, Context context) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f15505a;
        public final /* synthetic */ ZIDManager b;

        public c(ZIDManager zIDManager, Context context) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    public static /* synthetic */ String a(ZIDManager zIDManager, Context context) {
    }

    public static synchronized ZIDManager getInstance() {
    }

    public static String getSDKVersion() {
    }

    public synchronized String getZID(Context context) {
    }

    public synchronized void init(Context context, String str, IZIDCompletionCallback iZIDCompletionCallback) {
    }

    public final JSONObject a(Context context, JSONObject jSONObject) {
    }

    public final String a(Context context) {
    }
}
