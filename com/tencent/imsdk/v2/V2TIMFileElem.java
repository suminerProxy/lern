package com.tencent.imsdk.v2;

import com.tencent.imsdk.common.IMCallback;
import com.tencent.imsdk.message.DownloadProgressInfo;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class V2TIMFileElem extends V2TIMElem {

    /* renamed from: com.tencent.imsdk.v2.V2TIMFileElem$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass1 implements V2TIMValueCallback<DownloadProgressInfo> {
        public final /* synthetic */ V2TIMFileElem this$0;
        public final /* synthetic */ V2TIMDownloadCallback val$v2TIMDownloadCallback;

        public AnonymousClass1(V2TIMFileElem v2TIMFileElem, V2TIMDownloadCallback v2TIMDownloadCallback) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMValueCallback
        public void onError(int i2, String str) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMValueCallback
        public /* bridge */ /* synthetic */ void onSuccess(DownloadProgressInfo downloadProgressInfo) {
        }

        /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
        public void onSuccess2(DownloadProgressInfo downloadProgressInfo) {
        }
    }

    /* renamed from: com.tencent.imsdk.v2.V2TIMFileElem$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass2 implements V2TIMCallback {
        public final /* synthetic */ V2TIMFileElem this$0;
        public final /* synthetic */ V2TIMDownloadCallback val$v2TIMDownloadCallback;

        public AnonymousClass2(V2TIMFileElem v2TIMFileElem, V2TIMDownloadCallback v2TIMDownloadCallback) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMCallback
        public void onError(int i2, String str) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMCallback
        public void onSuccess() {
        }
    }

    /* renamed from: com.tencent.imsdk.v2.V2TIMFileElem$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass3 extends IMCallback<DownloadProgressInfo> {
        public final /* synthetic */ V2TIMFileElem this$0;

        public AnonymousClass3(V2TIMFileElem v2TIMFileElem, V2TIMValueCallback v2TIMValueCallback) {
        }

        @Override // com.tencent.imsdk.common.IMCallback
        public void fail(int i2, String str) {
        }

        @Override // com.tencent.imsdk.common.IMCallback
        public /* bridge */ /* synthetic */ void success(DownloadProgressInfo downloadProgressInfo) {
        }

        /* renamed from: success  reason: avoid collision after fix types in other method */
        public void success2(DownloadProgressInfo downloadProgressInfo) {
        }
    }

    /* renamed from: com.tencent.imsdk.v2.V2TIMFileElem$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass4 extends IMCallback {
        public final /* synthetic */ V2TIMFileElem this$0;

        public AnonymousClass4(V2TIMFileElem v2TIMFileElem, V2TIMCallback v2TIMCallback) {
        }

        @Override // com.tencent.imsdk.common.IMCallback
        public void fail(int i2, String str) {
        }

        @Override // com.tencent.imsdk.common.IMCallback
        public void success(Object obj) {
        }
    }

    /* renamed from: com.tencent.imsdk.v2.V2TIMFileElem$5  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass5 extends IMCallback<String> {
        public final /* synthetic */ V2TIMFileElem this$0;

        public AnonymousClass5(V2TIMFileElem v2TIMFileElem, V2TIMValueCallback v2TIMValueCallback) {
        }

        @Override // com.tencent.imsdk.common.IMCallback
        public void fail(int i2, String str) {
        }

        @Override // com.tencent.imsdk.common.IMCallback
        public /* bridge */ /* synthetic */ void success(String str) {
        }

        /* renamed from: success  reason: avoid collision after fix types in other method */
        public void success2(String str) {
        }
    }

    public void downloadFile(String str, V2TIMDownloadCallback v2TIMDownloadCallback) {
    }

    public String getFileName() {
    }

    public int getFileSize() {
    }

    public String getPath() {
    }

    public String getUUID() {
    }

    public void getUrl(V2TIMValueCallback<String> v2TIMValueCallback) {
    }

    public String toString() {
    }
}
