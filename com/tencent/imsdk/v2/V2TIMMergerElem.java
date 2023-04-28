package com.tencent.imsdk.v2;

import com.tencent.imsdk.common.IMCallback;
import com.tencent.imsdk.message.Message;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class V2TIMMergerElem extends V2TIMElem {

    /* renamed from: com.tencent.imsdk.v2.V2TIMMergerElem$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass1 implements V2TIMValueCallback<List<Message>> {
        public final /* synthetic */ V2TIMMergerElem this$0;
        public final /* synthetic */ V2TIMValueCallback val$callback;

        public AnonymousClass1(V2TIMMergerElem v2TIMMergerElem, V2TIMValueCallback v2TIMValueCallback) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMValueCallback
        public void onError(int i2, String str) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMValueCallback
        public /* bridge */ /* synthetic */ void onSuccess(List<Message> list) {
        }

        /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
        public void onSuccess2(List<Message> list) {
        }
    }

    /* renamed from: com.tencent.imsdk.v2.V2TIMMergerElem$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass2 extends IMCallback<List<Message>> {
        public final /* synthetic */ V2TIMMergerElem this$0;

        public AnonymousClass2(V2TIMMergerElem v2TIMMergerElem, V2TIMValueCallback v2TIMValueCallback) {
        }

        @Override // com.tencent.imsdk.common.IMCallback
        public void fail(int i2, String str) {
        }

        @Override // com.tencent.imsdk.common.IMCallback
        public /* bridge */ /* synthetic */ void success(List<Message> list) {
        }

        /* renamed from: success  reason: avoid collision after fix types in other method */
        public void success2(List<Message> list) {
        }
    }

    public void downloadMergerMessage(V2TIMValueCallback<List<V2TIMMessage>> v2TIMValueCallback) {
    }

    public List<String> getAbstractList() {
    }

    public String getTitle() {
    }

    public boolean isLayersOverLimit() {
    }

    public String toString() {
    }
}
