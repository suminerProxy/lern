package com.tencent.qcloud.tuikit.tuichat.component.imagevideoscan;

import com.tencent.imsdk.v2.V2TIMMessage;
import com.tencent.imsdk.v2.V2TIMValueCallback;
import com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback;
import com.tencent.qcloud.tuikit.tuichat.bean.message.TUIMessageBean;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class ImageVideoScanProvider {
    public static final int SCAN_MESSAGE_NUM = 10;
    public static final int SCAN_MESSAGE_REQUEST_NUM = 20;
    private static final String TAG = "ImageVideoScanProvider";

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.component.imagevideoscan.ImageVideoScanProvider$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass1 extends IUIKitCallback<List<TUIMessageBean>> {
        public final /* synthetic */ ImageVideoScanProvider this$0;
        public final /* synthetic */ IUIKitCallback val$callBack;
        public final /* synthetic */ String val$chatId;
        public final /* synthetic */ boolean val$isGroup;
        public final /* synthetic */ TUIMessageBean val$locateMessageInfo;

        /* renamed from: com.tencent.qcloud.tuikit.tuichat.component.imagevideoscan.ImageVideoScanProvider$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public class C02141 extends IUIKitCallback<List<TUIMessageBean>> {
            public final /* synthetic */ AnonymousClass1 this$1;
            public final /* synthetic */ List val$firstData;

            public C02141(AnonymousClass1 anonymousClass1, List list) {
            }

            @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
            public void onError(String str, int i2, String str2) {
            }

            @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
            public /* bridge */ /* synthetic */ void onSuccess(List<TUIMessageBean> list) {
            }

            /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
            public void onSuccess2(List<TUIMessageBean> list) {
            }
        }

        public AnonymousClass1(ImageVideoScanProvider imageVideoScanProvider, TUIMessageBean tUIMessageBean, String str, boolean z, IUIKitCallback iUIKitCallback) {
        }

        @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
        public void onError(String str, int i2, String str2) {
        }

        @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
        public /* bridge */ /* synthetic */ void onSuccess(List<TUIMessageBean> list) {
        }

        /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
        public void onSuccess2(List<TUIMessageBean> list) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.component.imagevideoscan.ImageVideoScanProvider$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass2 extends IUIKitCallback<List<TUIMessageBean>> {
        public final /* synthetic */ ImageVideoScanProvider this$0;
        public final /* synthetic */ IUIKitCallback val$callBack;

        public AnonymousClass2(ImageVideoScanProvider imageVideoScanProvider, IUIKitCallback iUIKitCallback) {
        }

        @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
        public void onError(String str, int i2, String str2) {
        }

        @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
        public /* bridge */ /* synthetic */ void onSuccess(List<TUIMessageBean> list) {
        }

        /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
        public void onSuccess2(List<TUIMessageBean> list) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.component.imagevideoscan.ImageVideoScanProvider$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass3 extends IUIKitCallback<List<TUIMessageBean>> {
        public final /* synthetic */ ImageVideoScanProvider this$0;
        public final /* synthetic */ IUIKitCallback val$callBack;

        public AnonymousClass3(ImageVideoScanProvider imageVideoScanProvider, IUIKitCallback iUIKitCallback) {
        }

        @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
        public void onError(String str, int i2, String str2) {
        }

        @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
        public /* bridge */ /* synthetic */ void onSuccess(List<TUIMessageBean> list) {
        }

        /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
        public void onSuccess2(List<TUIMessageBean> list) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.component.imagevideoscan.ImageVideoScanProvider$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass4 implements V2TIMValueCallback<List<V2TIMMessage>> {
        public final /* synthetic */ ImageVideoScanProvider this$0;
        public final /* synthetic */ IUIKitCallback val$callBack;
        public final /* synthetic */ int val$getType;

        public AnonymousClass4(ImageVideoScanProvider imageVideoScanProvider, IUIKitCallback iUIKitCallback, int i2) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMValueCallback
        public void onError(int i2, String str) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMValueCallback
        public /* bridge */ /* synthetic */ void onSuccess(List<V2TIMMessage> list) {
        }

        /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
        public void onSuccess2(List<V2TIMMessage> list) {
        }
    }

    public static /* synthetic */ String access$000() {
    }

    public void MessageProvider() {
    }

    public void initMessageList(String str, boolean z, TUIMessageBean tUIMessageBean, IUIKitCallback<List<TUIMessageBean>> iUIKitCallback) {
    }

    public void loadLocalMediaMessageBackward(String str, boolean z, TUIMessageBean tUIMessageBean, IUIKitCallback<List<TUIMessageBean>> iUIKitCallback) {
    }

    public void loadLocalMediaMessageForward(String str, boolean z, TUIMessageBean tUIMessageBean, IUIKitCallback<List<TUIMessageBean>> iUIKitCallback) {
    }

    public void loadLocalMediaMessageList(String str, boolean z, int i2, TUIMessageBean tUIMessageBean, int i3, IUIKitCallback<List<TUIMessageBean>> iUIKitCallback) {
    }
}
