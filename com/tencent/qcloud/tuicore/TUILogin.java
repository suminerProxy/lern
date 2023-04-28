package com.tencent.qcloud.tuicore;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.tencent.imsdk.v2.V2TIMCallback;
import com.tencent.imsdk.v2.V2TIMLogListener;
import com.tencent.imsdk.v2.V2TIMManager;
import com.tencent.imsdk.v2.V2TIMSDKConfig;
import com.tencent.imsdk.v2.V2TIMSDKListener;
import com.tencent.imsdk.v2.V2TIMUserFullInfo;
import com.tencent.imsdk.v2.V2TIMValueCallback;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.tencent.qcloud.tuicore.interfaces.TUICallback;
import com.tencent.qcloud.tuicore.interfaces.TUILogListener;
import com.tencent.qcloud.tuicore.interfaces.TUILoginConfig;
import com.tencent.qcloud.tuicore.interfaces.TUILoginListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class TUILogin {
    private static final String TAG = "TUILogin";
    private Context appContext;
    private boolean hasLoginSuccess;
    private final V2TIMSDKListener imSdkListener;
    private final List<TUILoginListener> listenerList;
    private int sdkAppId;
    private String userId;
    private String userSig;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class TUILoginHolder {
        private static final TUILogin loginInstance = null;

        private TUILoginHolder() {
        }

        public static /* synthetic */ TUILogin access$100() {
        }
    }

    public static void addLoginListener(TUILoginListener tUILoginListener) {
        getInstance().internalAddLoginListener(tUILoginListener);
    }

    public static Context getAppContext() {
        return getInstance().appContext;
    }

    public static String getFaceUrl() {
        return TUIConfig.getSelfFaceUrl();
    }

    public static TUILogin getInstance() {
        return TUILoginHolder.access$100();
    }

    public static String getLoginUser() {
        return V2TIMManager.getInstance().getLoginUser();
    }

    public static String getNickName() {
        return TUIConfig.getSelfNickName();
    }

    public static int getSdkAppId() {
        return getInstance().sdkAppId;
    }

    public static String getUserId() {
        return getInstance().userId;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void getUserInfo(String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        V2TIMManager.getInstance().getUsersInfo(arrayList, new V2TIMValueCallback<List<V2TIMUserFullInfo>>() { // from class: com.tencent.qcloud.tuicore.TUILogin.8
            @Override // com.tencent.imsdk.v2.V2TIMValueCallback
            public void onError(int i2, String str2) {
            }

            @Override // com.tencent.imsdk.v2.V2TIMValueCallback
            public /* bridge */ /* synthetic */ void onSuccess(List<V2TIMUserFullInfo> list) {
            }

            /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
            public void onSuccess2(List<V2TIMUserFullInfo> list) {
            }
        });
    }

    public static String getUserSig() {
        return getInstance().userSig;
    }

    @Deprecated
    public static boolean init(@NonNull Context context, int i2, @Nullable V2TIMSDKConfig v2TIMSDKConfig, @Nullable V2TIMSDKListener v2TIMSDKListener) {
        if (getInstance().sdkAppId != 0 && i2 != getInstance().sdkAppId) {
            logout((V2TIMCallback) null);
            unInit();
        }
        getInstance().appContext = context.getApplicationContext();
        getInstance().sdkAppId = i2;
        V2TIMManager.getInstance().addIMSDKListener(new V2TIMSDKListener(v2TIMSDKListener) { // from class: com.tencent.qcloud.tuicore.TUILogin.5
            public final /* synthetic */ V2TIMSDKListener val$listener;

            @Override // com.tencent.imsdk.v2.V2TIMSDKListener
            public void onConnectFailed(int i3, String str) {
            }

            @Override // com.tencent.imsdk.v2.V2TIMSDKListener
            public void onConnectSuccess() {
            }

            @Override // com.tencent.imsdk.v2.V2TIMSDKListener
            public void onConnecting() {
            }

            @Override // com.tencent.imsdk.v2.V2TIMSDKListener
            public void onKickedOffline() {
            }

            @Override // com.tencent.imsdk.v2.V2TIMSDKListener
            public void onSelfInfoUpdated(V2TIMUserFullInfo v2TIMUserFullInfo) {
            }

            @Override // com.tencent.imsdk.v2.V2TIMSDKListener
            public void onUserSigExpired() {
            }
        });
        TUICore.notifyEvent(TUIConstants.TUILogin.EVENT_IMSDK_INIT_STATE_CHANGED, TUIConstants.TUILogin.EVENT_SUB_KEY_START_INIT, null);
        return V2TIMManager.getInstance().initSDK(context, i2, v2TIMSDKConfig);
    }

    private void internalAddLoginListener(TUILoginListener tUILoginListener) {
        String str = "addLoginListener listener : " + tUILoginListener;
        if (tUILoginListener == null || this.listenerList.contains(tUILoginListener)) {
            return;
        }
        this.listenerList.add(tUILoginListener);
    }

    private void internalLogin(Context context, int i2, String str, String str2, TUILoginConfig tUILoginConfig, TUICallback tUICallback) {
        int i3 = this.sdkAppId;
        V2TIMSDKConfig v2TIMSDKConfig = null;
        if (i3 != 0 && i2 != i3) {
            logout((TUICallback) null);
        }
        this.appContext = context.getApplicationContext();
        this.sdkAppId = i2;
        V2TIMManager.getInstance().addIMSDKListener(this.imSdkListener);
        TUICore.notifyEvent(TUIConstants.TUILogin.EVENT_IMSDK_INIT_STATE_CHANGED, TUIConstants.TUILogin.EVENT_SUB_KEY_START_INIT, null);
        if (tUILoginConfig != null) {
            v2TIMSDKConfig = new V2TIMSDKConfig();
            v2TIMSDKConfig.setLogLevel(tUILoginConfig.getLogLevel());
            TUILogListener logListener = tUILoginConfig.getLogListener();
            if (logListener != null) {
                v2TIMSDKConfig.setLogListener(new V2TIMLogListener(this, logListener) { // from class: com.tencent.qcloud.tuicore.TUILogin.2
                    public final /* synthetic */ TUILogin this$0;
                    public final /* synthetic */ TUILogListener val$logListener;

                    @Override // com.tencent.imsdk.v2.V2TIMLogListener
                    public void onLog(int i4, String str3) {
                    }
                });
            }
        }
        if (V2TIMManager.getInstance().initSDK(context, i2, v2TIMSDKConfig)) {
            this.userId = str;
            this.userSig = str2;
            if (TextUtils.equals(str, V2TIMManager.getInstance().getLoginUser()) && !TextUtils.isEmpty(str)) {
                TUICallback.onSuccess(tUICallback);
                getUserInfo(str);
                return;
            }
            V2TIMManager.getInstance().login(str, str2, new V2TIMCallback(this, str, tUICallback) { // from class: com.tencent.qcloud.tuicore.TUILogin.3
                public final /* synthetic */ TUILogin this$0;
                public final /* synthetic */ TUICallback val$callback;
                public final /* synthetic */ String val$userId;

                @Override // com.tencent.imsdk.v2.V2TIMCallback
                public void onError(int i4, String str3) {
                }

                @Override // com.tencent.imsdk.v2.V2TIMCallback
                public void onSuccess() {
                }
            });
            return;
        }
        TUICallback.onError(tUICallback, -1, "init failed");
    }

    private void internalLogout(TUICallback tUICallback) {
        TUICore.notifyEvent(TUIConstants.TUILogin.EVENT_IMSDK_INIT_STATE_CHANGED, TUIConstants.TUILogin.EVENT_SUB_KEY_START_UNINIT, null);
        V2TIMManager.getInstance().logout(new V2TIMCallback(this, tUICallback) { // from class: com.tencent.qcloud.tuicore.TUILogin.4
            public final /* synthetic */ TUILogin this$0;
            public final /* synthetic */ TUICallback val$callback;

            @Override // com.tencent.imsdk.v2.V2TIMCallback
            public void onError(int i2, String str) {
            }

            @Override // com.tencent.imsdk.v2.V2TIMCallback
            public void onSuccess() {
            }
        });
    }

    private void internalRemoveLoginListener(TUILoginListener tUILoginListener) {
        String str = "removeLoginListener listener : " + tUILoginListener;
        if (tUILoginListener == null) {
            return;
        }
        this.listenerList.remove(tUILoginListener);
    }

    public static boolean isUserLogined() {
        return getInstance().hasLoginSuccess && V2TIMManager.getInstance().getLoginStatus() == 1;
    }

    public static void login(@NonNull Context context, int i2, String str, String str2, TUICallback tUICallback) {
        getInstance().internalLogin(context, i2, str, str2, null, tUICallback);
    }

    public static void logout(TUICallback tUICallback) {
        getInstance().internalLogout(tUICallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void notifyUserInfoChanged(V2TIMUserFullInfo v2TIMUserFullInfo) {
        HashMap hashMap = new HashMap();
        hashMap.put(TUIConstants.TUILogin.SELF_ID, v2TIMUserFullInfo.getUserID());
        hashMap.put(TUIConstants.TUILogin.SELF_SIGNATURE, v2TIMUserFullInfo.getSelfSignature());
        hashMap.put(TUIConstants.TUILogin.SELF_NICK_NAME, v2TIMUserFullInfo.getNickName());
        hashMap.put(TUIConstants.TUILogin.SELF_FACE_URL, v2TIMUserFullInfo.getFaceUrl());
        hashMap.put(TUIConstants.TUILogin.SELF_BIRTHDAY, Long.valueOf(v2TIMUserFullInfo.getBirthday()));
        hashMap.put(TUIConstants.TUILogin.SELF_ROLE, Integer.valueOf(v2TIMUserFullInfo.getRole()));
        hashMap.put(TUIConstants.TUILogin.SELF_GENDER, Integer.valueOf(v2TIMUserFullInfo.getGender()));
        hashMap.put(TUIConstants.TUILogin.SELF_LEVEL, Integer.valueOf(v2TIMUserFullInfo.getLevel()));
        hashMap.put(TUIConstants.TUILogin.SELF_ALLOW_TYPE, Integer.valueOf(v2TIMUserFullInfo.getAllowType()));
        TUICore.notifyEvent(TUIConstants.TUILogin.EVENT_LOGIN_STATE_CHANGED, TUIConstants.TUILogin.EVENT_SUB_KEY_USER_INFO_UPDATED, hashMap);
    }

    public static void removeLoginListener(TUILoginListener tUILoginListener) {
        getInstance().internalRemoveLoginListener(tUILoginListener);
    }

    @Deprecated
    public static void unInit() {
        getInstance().sdkAppId = 0;
        TUICore.notifyEvent(TUIConstants.TUILogin.EVENT_IMSDK_INIT_STATE_CHANGED, TUIConstants.TUILogin.EVENT_SUB_KEY_START_UNINIT, null);
        V2TIMManager.getInstance().unInitSDK();
        TUIConfig.clearSelfInfo();
    }

    private TUILogin() {
        this.sdkAppId = 0;
        this.hasLoginSuccess = false;
        this.listenerList = new CopyOnWriteArrayList();
        this.imSdkListener = new V2TIMSDKListener(this) { // from class: com.tencent.qcloud.tuicore.TUILogin.1
            public final /* synthetic */ TUILogin this$0;

            @Override // com.tencent.imsdk.v2.V2TIMSDKListener
            public void onConnectFailed(int i2, String str) {
            }

            @Override // com.tencent.imsdk.v2.V2TIMSDKListener
            public void onConnectSuccess() {
            }

            @Override // com.tencent.imsdk.v2.V2TIMSDKListener
            public void onConnecting() {
            }

            @Override // com.tencent.imsdk.v2.V2TIMSDKListener
            public void onKickedOffline() {
            }

            @Override // com.tencent.imsdk.v2.V2TIMSDKListener
            public void onSelfInfoUpdated(V2TIMUserFullInfo v2TIMUserFullInfo) {
            }

            @Override // com.tencent.imsdk.v2.V2TIMSDKListener
            public void onUserSigExpired() {
            }
        };
    }

    public static void login(@NonNull Context context, int i2, String str, String str2, TUILoginConfig tUILoginConfig, TUICallback tUICallback) {
        getInstance().internalLogin(context, i2, str, str2, tUILoginConfig, tUICallback);
    }

    @Deprecated
    public static void logout(@Nullable V2TIMCallback v2TIMCallback) {
        V2TIMManager.getInstance().logout(new V2TIMCallback(v2TIMCallback) { // from class: com.tencent.qcloud.tuicore.TUILogin.7
            public final /* synthetic */ V2TIMCallback val$callback;

            @Override // com.tencent.imsdk.v2.V2TIMCallback
            public void onError(int i2, String str) {
            }

            @Override // com.tencent.imsdk.v2.V2TIMCallback
            public void onSuccess() {
            }
        });
    }

    @Deprecated
    public static void login(@NonNull String str, @NonNull String str2, @Nullable V2TIMCallback v2TIMCallback) {
        getInstance().userId = str;
        getInstance().userSig = str2;
        if (TextUtils.equals(str, V2TIMManager.getInstance().getLoginUser()) && !TextUtils.isEmpty(str)) {
            if (v2TIMCallback != null) {
                v2TIMCallback.onSuccess();
            }
            getUserInfo(str);
            return;
        }
        V2TIMManager.getInstance().login(str, str2, new V2TIMCallback(v2TIMCallback, str) { // from class: com.tencent.qcloud.tuicore.TUILogin.6
            public final /* synthetic */ V2TIMCallback val$callback;
            public final /* synthetic */ String val$userId;

            @Override // com.tencent.imsdk.v2.V2TIMCallback
            public void onError(int i2, String str3) {
            }

            @Override // com.tencent.imsdk.v2.V2TIMCallback
            public void onSuccess() {
            }
        });
    }
}
