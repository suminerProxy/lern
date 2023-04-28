package com.tencent.qcloud.tuikit.tuigroup.util;

import com.tencent.imsdk.v2.V2TIMGroupInfoResult;
import com.tencent.imsdk.v2.V2TIMManager;
import com.tencent.imsdk.v2.V2TIMValueCallback;
import com.tencent.qcloud.tuicore.ServiceInitializer;
import com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback;
import com.tencent.qcloud.tuicore.util.ToastUtil;
import com.tencent.qcloud.tuikit.tuigroup.R;
import java.util.ArrayList;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class TUIGroupUtils {
    public static final int GROUP_EVENT_TIP_DISBANDED = 4;
    public static final int GROUP_EVENT_TIP_INVITED = 2;
    public static final int GROUP_EVENT_TIP_JOINED = 1;
    public static final int GROUP_EVENT_TIP_KICKED = 3;
    private static final String TAG = "TUIGroupUtils";

    public static <T> void callbackOnError(IUIKitCallback<T> iUIKitCallback, String str, int i2, String str2) {
        if (iUIKitCallback != null) {
            iUIKitCallback.onError(str, i2, str2);
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

    public static void toastGroupEvent(int i2, String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        V2TIMManager.getGroupManager().getGroupsInfo(arrayList, new V2TIMValueCallback<List<V2TIMGroupInfoResult>>(str, i2) { // from class: com.tencent.qcloud.tuikit.tuigroup.util.TUIGroupUtils.1
            public final /* synthetic */ String val$groupID;
            public final /* synthetic */ int val$type;

            @Override // com.tencent.imsdk.v2.V2TIMValueCallback
            public void onError(int i3, String str2) {
            }

            @Override // com.tencent.imsdk.v2.V2TIMValueCallback
            public /* bridge */ /* synthetic */ void onSuccess(List<V2TIMGroupInfoResult> list) {
            }

            /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
            public void onSuccess2(List<V2TIMGroupInfoResult> list) {
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void toastGroupEventByName(int i2, String str) {
        String str2;
        if (i2 == 1) {
            str2 = ServiceInitializer.getAppContext().getString(R.string.joined_tip) + str;
        } else if (i2 == 2) {
            str2 = ServiceInitializer.getAppContext().getString(R.string.join_group_tip) + str;
        } else if (i2 == 3) {
            str2 = ServiceInitializer.getAppContext().getString(R.string.kick_group) + str;
        } else if (i2 == 4) {
            str2 = ServiceInitializer.getAppContext().getString(R.string.dismiss_tip_before) + str + ServiceInitializer.getAppContext().getString(R.string.dismiss_tip_after);
        } else {
            str2 = null;
        }
        if (str2 != null) {
            ToastUtil.toastLongMessage(str2);
        }
    }

    public static <T> void callbackOnError(IUIKitCallback<T> iUIKitCallback, int i2, String str) {
        if (iUIKitCallback != null) {
            iUIKitCallback.onError((String) null, i2, str);
        }
    }
}
