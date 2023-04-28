package com.tencent.imsdk.v2;

import com.tencent.imsdk.common.IMCallback;
import com.tencent.imsdk.message.DownloadProgressInfo;
import com.tencent.imsdk.message.ImageElement;
import java.io.Serializable;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class V2TIMImageElem extends V2TIMElem {
    public static final int V2TIM_IMAGE_TYPE_LARGE = 2;
    public static final int V2TIM_IMAGE_TYPE_ORIGIN = 0;
    public static final int V2TIM_IMAGE_TYPE_THUMB = 1;
    private ImageElement timImageElem;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class V2TIMImage implements Serializable {
        private int height;
        private int size;
        public final /* synthetic */ V2TIMImageElem this$0;
        private int type;
        private String url;
        private String uuid;
        private int width;

        /* renamed from: com.tencent.imsdk.v2.V2TIMImageElem$V2TIMImage$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public class AnonymousClass1 implements V2TIMValueCallback<DownloadProgressInfo> {
            public final /* synthetic */ V2TIMImage this$1;
            public final /* synthetic */ V2TIMDownloadCallback val$v2TIMDownloadCallback;

            public AnonymousClass1(V2TIMImage v2TIMImage, V2TIMDownloadCallback v2TIMDownloadCallback) {
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

        /* renamed from: com.tencent.imsdk.v2.V2TIMImageElem$V2TIMImage$2  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public class AnonymousClass2 implements V2TIMCallback {
            public final /* synthetic */ V2TIMImage this$1;
            public final /* synthetic */ V2TIMDownloadCallback val$v2TIMDownloadCallback;

            public AnonymousClass2(V2TIMImage v2TIMImage, V2TIMDownloadCallback v2TIMDownloadCallback) {
            }

            @Override // com.tencent.imsdk.v2.V2TIMCallback
            public void onError(int i2, String str) {
            }

            @Override // com.tencent.imsdk.v2.V2TIMCallback
            public void onSuccess() {
            }
        }

        /* renamed from: com.tencent.imsdk.v2.V2TIMImageElem$V2TIMImage$3  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public class AnonymousClass3 extends IMCallback<DownloadProgressInfo> {
            public final /* synthetic */ V2TIMImage this$1;

            public AnonymousClass3(V2TIMImage v2TIMImage, V2TIMValueCallback v2TIMValueCallback) {
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

        /* renamed from: com.tencent.imsdk.v2.V2TIMImageElem$V2TIMImage$4  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public class AnonymousClass4 extends IMCallback {
            public final /* synthetic */ V2TIMImage this$1;

            public AnonymousClass4(V2TIMImage v2TIMImage, V2TIMCallback v2TIMCallback) {
            }

            @Override // com.tencent.imsdk.common.IMCallback
            public void fail(int i2, String str) {
            }

            @Override // com.tencent.imsdk.common.IMCallback
            public void success(Object obj) {
            }
        }

        public V2TIMImage(V2TIMImageElem v2TIMImageElem) {
        }

        public void downloadImage(String str, V2TIMDownloadCallback v2TIMDownloadCallback) {
        }

        public int getHeight() {
        }

        public int getSize() {
        }

        public int getType() {
        }

        public String getUUID() {
        }

        public String getUrl() {
        }

        public int getWidth() {
        }

        public void setHeight(int i2) {
        }

        public void setSize(int i2) {
        }

        public void setType(int i2) {
        }

        public void setUUID(String str) {
        }

        public void setUrl(String str) {
        }

        public void setWidth(int i2) {
        }
    }

    public List<V2TIMImage> getImageList() {
    }

    public String getPath() {
    }

    public String toString() {
    }
}
