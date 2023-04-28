package com.mob;

import com.mob.tools.network.NetCommunicator;
import com.mob.tools.proguard.PublicMemberKeeper;
import java.util.HashMap;
import java.util.concurrent.ThreadPoolExecutor;

@Deprecated
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class MobCommunicator implements PublicMemberKeeper {

    /* renamed from: a  reason: collision with root package name */
    private NetCommunicator f3373a;

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: com.mob.MobCommunicator$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass1<T> extends NetCommunicator.Callback<T> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Callback f3374a;
        public final /* synthetic */ MobCommunicator b;

        public AnonymousClass1(MobCommunicator mobCommunicator, Callback callback) {
        }

        @Override // com.mob.tools.network.NetCommunicator.Callback
        public void onResultError(Throwable th) {
        }

        @Override // com.mob.tools.network.NetCommunicator.Callback
        public void onResultOk(T t) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class Callback<T> implements PublicMemberKeeper {
        public void onResultError(Throwable th) {
        }

        public void onResultOk(T t) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class NetworkError extends Exception implements PublicMemberKeeper {
        private static final long serialVersionUID = -8447657431687664787L;

        public NetworkError(String str) {
        }
    }

    public MobCommunicator(int i2, String str, String str2) {
    }

    public static HashMap<String, String> getCommonDefaultHeaders() throws Throwable {
    }

    public <T> void request(HashMap<String, Object> hashMap, String str, boolean z, Callback<T> callback) {
    }

    public <T> T requestSynchronized(HashMap<String, Object> hashMap, String str, boolean z) throws Throwable {
    }

    public void setThreadPool(ThreadPoolExecutor threadPoolExecutor) {
    }

    public <T> void request(HashMap<String, String> hashMap, HashMap<String, Object> hashMap2, String str, boolean z, Callback<T> callback) {
    }

    public <T> T requestSynchronized(HashMap<String, String> hashMap, HashMap<String, Object> hashMap2, String str, boolean z) throws Throwable {
    }

    public <T> void request(boolean z, HashMap<String, String> hashMap, HashMap<String, Object> hashMap2, String str, boolean z2, Callback<T> callback) {
    }

    public <T> T requestSynchronized(String str, String str2, boolean z) throws Throwable {
    }

    public <T> T requestSynchronized(HashMap<String, String> hashMap, String str, String str2, boolean z) throws Throwable {
    }

    public <T> T requestSynchronized(boolean z, HashMap<String, String> hashMap, HashMap<String, Object> hashMap2, String str, boolean z2) throws Throwable {
    }

    public <T> T requestSynchronized(boolean z, HashMap<String, String> hashMap, String str, String str2, boolean z2) throws Throwable {
    }
}
