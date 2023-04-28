package com.aliyun.identity.platform.network;

import android.content.Context;
import h.a.a.a.a.b;
import h.a.a.a.a.f;
import h.a.a.a.a.h.a;
import h.a.a.a.a.l.y1;
import h.a.a.a.a.l.z1;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class OssClientHelper {
    private static OssClientHelper s_Instance;
    private ExecutorService executorService;
    private final Object ossLock;
    private ArrayList<FileItem> ossUploadItems;

    /* renamed from: com.aliyun.identity.platform.network.OssClientHelper$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass1 implements Runnable {
        public final /* synthetic */ OssClientHelper this$0;
        public final /* synthetic */ String val$accessKey;
        public final /* synthetic */ String val$accessSecret;
        public final /* synthetic */ Context val$ctx;
        public final /* synthetic */ String val$endPoint;
        public final /* synthetic */ OssClientUploadListener val$ossClientUploadListener;
        public final /* synthetic */ String val$stsToken;

        public AnonymousClass1(OssClientHelper ossClientHelper, Context context, String str, String str2, String str3, String str4, OssClientUploadListener ossClientUploadListener) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.aliyun.identity.platform.network.OssClientHelper$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass2 implements a<y1, z1> {
        public final /* synthetic */ OssClientHelper this$0;
        public final /* synthetic */ String val$bucketName;
        public final /* synthetic */ String val$fileNanme;
        public final /* synthetic */ OssInteralCB val$ossInteralCB;

        public AnonymousClass2(OssClientHelper ossClientHelper, String str, String str2, OssInteralCB ossInteralCB) {
        }

        @Override // h.a.a.a.a.h.a
        public /* bridge */ /* synthetic */ void onFailure(y1 y1Var, b bVar, f fVar) {
        }

        @Override // h.a.a.a.a.h.a
        public /* bridge */ /* synthetic */ void onSuccess(y1 y1Var, z1 z1Var) {
        }

        /* renamed from: onFailure  reason: avoid collision after fix types in other method */
        public void onFailure2(y1 y1Var, b bVar, f fVar) {
        }

        /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
        public void onSuccess2(y1 y1Var, z1 z1Var) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class FileItem {
        public String bucketName;
        public byte[] fileContent;
        public int fileIdx;
        public String fileName;

        public FileItem(int i2, String str, String str2, byte[] bArr) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface OssClientUploadListener {
        void onFinish(int i2, int i3);

        boolean onUploadError(int i2, String str, String str2, String str3);

        boolean onUploadSuccess(int i2, String str, String str2);
    }

    public static /* synthetic */ ArrayList access$000(OssClientHelper ossClientHelper) {
    }

    public static OssClientHelper getInstance() {
    }

    public void addUploadFile(int i2, String str, String str2, byte[] bArr) {
    }

    public String getUploadFileName(int i2) {
    }

    public void init() {
    }

    public boolean ossUploadFile(Context context, String str, String str2, String str3, String str4, String str5, String str6, byte[] bArr) {
    }

    public void release() {
    }

    public void startUploadFiles(Context context, String str, String str2, String str3, String str4, OssClientUploadListener ossClientUploadListener) {
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class OssInteralCB {
        public boolean success;

        private OssInteralCB() {
        }

        public /* synthetic */ OssInteralCB(AnonymousClass1 anonymousClass1) {
        }
    }
}
