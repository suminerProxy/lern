package com.tencent.qcloud.tuikit.tuichat.util;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import com.tencent.imsdk.v2.V2TIMImageElem;
import com.tencent.imsdk.v2.V2TIMManager;
import com.tencent.imsdk.v2.V2TIMMessage;
import com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback;
import com.tencent.qcloud.tuicore.util.ErrorMessageConverter;
import com.tencent.qcloud.tuicore.util.ImageUtil;
import com.tencent.qcloud.tuicore.util.SPUtils;
import com.tencent.qcloud.tuicore.util.SoftKeyBoardUtil;
import com.tencent.qcloud.tuikit.tuichat.R;
import com.tencent.qcloud.tuikit.tuichat.TUIChatConstants;
import com.tencent.qcloud.tuikit.tuichat.bean.message.TUIMessageBean;
import com.tencent.qcloud.tuikit.tuichat.component.BeginnerGuidePage;
import java.io.File;
import java.util.Iterator;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class TUIChatUtils {
    public static <T> void callbackOnError(IUIKitCallback<T> iUIKitCallback, String str, int i2, String str2) {
        if (iUIKitCallback != null) {
            iUIKitCallback.onError(str, i2, ErrorMessageConverter.convertIMError(i2, str2));
        }
    }

    public static void callbackOnProgress(IUIKitCallback iUIKitCallback, Object obj) {
        if (iUIKitCallback != null) {
            iUIKitCallback.onProgress(obj);
        }
    }

    public static <T> void callbackOnSuccess(IUIKitCallback<T> iUIKitCallback, T t) {
        if (iUIKitCallback != null) {
            iUIKitCallback.onSuccess(t);
        }
    }

    public static String getConversationIdByUserId(String str, boolean z) {
        String str2 = z ? "group_" : "c2c_";
        return str2 + str;
    }

    public static String getGroupIDFromTopicID(String str) {
        return str.substring(0, str.indexOf("@TOPIC#_"));
    }

    public static String getOriginImagePath(TUIMessageBean tUIMessageBean) {
        V2TIMMessage v2TIMMessage;
        V2TIMImageElem imageElem;
        String str = null;
        if (tUIMessageBean == null || (v2TIMMessage = tUIMessageBean.getV2TIMMessage()) == null || (imageElem = v2TIMMessage.getImageElem()) == null) {
            return null;
        }
        String localImagePath = ChatMessageParser.getLocalImagePath(tUIMessageBean);
        if (localImagePath == null) {
            Iterator<V2TIMImageElem.V2TIMImage> it = imageElem.getImageList().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                V2TIMImageElem.V2TIMImage next = it.next();
                if (next.getType() == 0) {
                    str = next.getUUID();
                    break;
                }
            }
            String generateImagePath = ImageUtil.generateImagePath(str, 0);
            return new File(generateImagePath).exists() ? generateImagePath : localImagePath;
        }
        return localImagePath;
    }

    public static long getServerTime() {
        return V2TIMManager.getInstance().getServerTime();
    }

    public static boolean isC2CChat(int i2) {
        return i2 == 1;
    }

    public static boolean isCommunityGroup(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith("@TGS#_");
    }

    public static boolean isGroupChat(int i2) {
        return i2 == 2;
    }

    public static boolean isTopicGroup(String str) {
        if (isCommunityGroup(str)) {
            return str.contains("@TOPIC#_");
        }
        return false;
    }

    public static void showBeginnerGuideThen(View view, Runnable runnable) {
        if (SPUtils.getInstance(TUIChatConstants.CHAT_SETTINGS_SP_NAME).getBoolean(TUIChatConstants.CHAT_REPLY_GUIDE_SHOW_SP_KEY, true)) {
            SoftKeyBoardUtil.hideKeyBoard(view.getWindowToken());
            SPUtils.getInstance(TUIChatConstants.CHAT_SETTINGS_SP_NAME).put(TUIChatConstants.CHAT_REPLY_GUIDE_SHOW_SP_KEY, false);
            BeginnerGuidePage beginnerGuidePage = new BeginnerGuidePage((Activity) view.getContext());
            beginnerGuidePage.setPagesResIDs(R.drawable.chat_reply_guide, R.drawable.chat_quote_guide);
            beginnerGuidePage.setOnFinishListener(new BeginnerGuidePage.OnFinishListener(runnable) { // from class: com.tencent.qcloud.tuikit.tuichat.util.TUIChatUtils.1
                public final /* synthetic */ Runnable val$runnable;

                @Override // com.tencent.qcloud.tuikit.tuichat.component.BeginnerGuidePage.OnFinishListener
                public void onFinish() {
                }
            });
            beginnerGuidePage.show(view, 0);
            return;
        }
        runnable.run();
    }

    public static <T> void callbackOnError(IUIKitCallback<T> iUIKitCallback, int i2, String str, T t) {
        if (iUIKitCallback != null) {
            iUIKitCallback.onError(i2, ErrorMessageConverter.convertIMError(i2, str), (String) t);
        }
    }

    public static <T> void callbackOnError(IUIKitCallback<T> iUIKitCallback, int i2, String str) {
        if (iUIKitCallback != null) {
            iUIKitCallback.onError((String) null, i2, ErrorMessageConverter.convertIMError(i2, str));
        }
    }
}
