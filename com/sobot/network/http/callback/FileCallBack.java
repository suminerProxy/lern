package com.sobot.network.http.callback;

import java.io.File;
import java.io.IOException;
import okhttp3.Response;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public abstract class FileCallBack extends Callback<File> {
    private String destFileDir;
    private String destFileName;

    /* renamed from: com.sobot.network.http.callback.FileCallBack$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass1 implements Runnable {
        public final /* synthetic */ FileCallBack this$0;
        public final /* synthetic */ long val$finalSum;
        public final /* synthetic */ long val$total;

        public AnonymousClass1(FileCallBack fileCallBack, long j2, long j3) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    public FileCallBack(String str, String str2) {
    }

    public abstract void inProgress(float f2, long j2);

    @Override // com.sobot.network.http.callback.Callback
    public /* bridge */ /* synthetic */ File parseNetworkResponse(Response response) throws Exception {
    }

    public File saveFile(Response response) throws IOException {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.sobot.network.http.callback.Callback
    public File parseNetworkResponse(Response response) throws Exception {
    }

    public FileCallBack(String str) {
    }
}
