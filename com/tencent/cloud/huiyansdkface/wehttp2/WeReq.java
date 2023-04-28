package com.tencent.cloud.huiyansdkface.wehttp2;

import java.io.IOException;
import java.lang.reflect.Type;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public interface WeReq {

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public interface Callback<T> extends InnerCallback<T> {
        @Override // com.tencent.cloud.huiyansdkface.wehttp2.WeReq.InnerCallback
        void onFailed(WeReq weReq, ErrType errType, int i2, String str, IOException iOException);

        @Override // com.tencent.cloud.huiyansdkface.wehttp2.WeReq.InnerCallback
        void onFinish();

        @Override // com.tencent.cloud.huiyansdkface.wehttp2.WeReq.InnerCallback
        void onStart(WeReq weReq);

        @Override // com.tencent.cloud.huiyansdkface.wehttp2.WeReq.InnerCallback
        void onSuccess(WeReq weReq, T t);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class ErrType {
        private static final /* synthetic */ ErrType[] $VALUES = null;
        public static final ErrType HTTP = null;
        public static final ErrType LOCAL = null;
        public static final ErrType NETWORK = null;
        public static final ErrType SERVER = null;
        private final int type;

        private ErrType(String str, int i2, int i3) {
        }

        public static ErrType valueOf(String str) {
        }

        public static ErrType[] values() {
        }

        public final int type() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public interface InnerCallback<T> {
        void onFailed(WeReq weReq, ErrType errType, int i2, String str, IOException iOException);

        void onFinish();

        void onStart(WeReq weReq);

        void onSuccess(WeReq weReq, T t);
    }

    void cancel();

    WeConfig context();

    <T> WeReq execute(Callback<T> callback);

    <T> T execute(Class<T> cls) throws ReqFailException;

    <T> T execute(Type type) throws ReqFailException;

    Observable subscribe();
}
