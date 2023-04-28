package com.tencent.imsdk.common;

import com.tencent.imsdk.v2.V2TIMCallback;
import com.tencent.imsdk.v2.V2TIMCompleteCallback;
import com.tencent.imsdk.v2.V2TIMValueCallback;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public abstract class IMCallback<T> {
    public V2TIMCallback callback;
    public V2TIMCompleteCallback<T> completeCallback;
    public V2TIMValueCallback<T> valueCallback;

    public IMCallback(V2TIMCallback v2TIMCallback) {
        this.callback = v2TIMCallback;
    }

    public void fail(int i2, String str) {
        IMContext.getInstance().runOnMainThread(new Runnable(this, i2, str) { // from class: com.tencent.imsdk.common.IMCallback.2
            public final /* synthetic */ IMCallback this$0;
            public final /* synthetic */ int val$code;
            public final /* synthetic */ String val$errorMessage;

            @Override // java.lang.Runnable
            public void run() {
            }
        });
    }

    public void success(T t) {
        IMContext.getInstance().runOnMainThread(new Runnable(this, t) { // from class: com.tencent.imsdk.common.IMCallback.1
            public final /* synthetic */ IMCallback this$0;
            public final /* synthetic */ Object val$data;

            @Override // java.lang.Runnable
            public void run() {
            }
        });
    }

    public void fail(int i2, String str, T t) {
        IMContext.getInstance().runOnMainThread(new Runnable(this, i2, str, t) { // from class: com.tencent.imsdk.common.IMCallback.3
            public final /* synthetic */ IMCallback this$0;
            public final /* synthetic */ int val$code;
            public final /* synthetic */ Object val$data;
            public final /* synthetic */ String val$errorMessage;

            @Override // java.lang.Runnable
            public void run() {
            }
        });
    }

    public IMCallback(V2TIMValueCallback<T> v2TIMValueCallback) {
        this.valueCallback = v2TIMValueCallback;
    }

    public IMCallback(V2TIMCompleteCallback<T> v2TIMCompleteCallback) {
        this.completeCallback = v2TIMCompleteCallback;
    }
}
