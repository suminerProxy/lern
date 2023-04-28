package com.tencent.qcloud.tuikit.tuichat.bean.message;

import android.text.TextUtils;
import com.tencent.imsdk.v2.V2TIMGroupMemberInfo;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class TipsMessageBean extends TUIMessageBean {
    public static final int MSG_TYPE_GROUP_CREATE = 257;
    public static final int MSG_TYPE_GROUP_DELETE = 258;
    public static final int MSG_TYPE_GROUP_JOIN = 259;
    public static final int MSG_TYPE_GROUP_KICK = 261;
    public static final int MSG_TYPE_GROUP_MODIFY_NAME = 262;
    public static final int MSG_TYPE_GROUP_MODIFY_NOTICE = 263;
    public static final int MSG_TYPE_GROUP_QUITE = 260;
    private String text;
    private int tipType;

    private static String getDisplayName(V2TIMGroupMemberInfo v2TIMGroupMemberInfo) {
        if (v2TIMGroupMemberInfo == null) {
            return null;
        }
        if (!TextUtils.isEmpty(v2TIMGroupMemberInfo.getNameCard())) {
            return v2TIMGroupMemberInfo.getNameCard();
        }
        if (!TextUtils.isEmpty(v2TIMGroupMemberInfo.getFriendRemark())) {
            return v2TIMGroupMemberInfo.getFriendRemark();
        }
        if (!TextUtils.isEmpty(v2TIMGroupMemberInfo.getNickName())) {
            return v2TIMGroupMemberInfo.getNickName();
        }
        return v2TIMGroupMemberInfo.getUserID();
    }

    public String getText() {
        return this.text;
    }

    public int getTipType() {
        return this.tipType;
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.bean.message.TUIMessageBean
    public String onGetDisplayString() {
        return getExtra();
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0333 A[SYNTHETIC] */
    @Override // com.tencent.qcloud.tuikit.tuichat.bean.message.TUIMessageBean
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onProcessMessage(com.tencent.imsdk.v2.V2TIMMessage r18) {
        /*
            Method dump skipped, instructions count: 933
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.qcloud.tuikit.tuichat.bean.message.TipsMessageBean.onProcessMessage(com.tencent.imsdk.v2.V2TIMMessage):void");
    }

    public void setText(String str) {
        this.text = str;
    }

    public void setTipType(int i2) {
        this.tipType = i2;
    }
}
