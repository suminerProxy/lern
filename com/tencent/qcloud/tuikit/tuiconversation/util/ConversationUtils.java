package com.tencent.qcloud.tuikit.tuiconversation.util;

import android.text.TextUtils;
import android.view.View;
import android.widget.ListView;
import com.tencent.imsdk.v2.V2TIMConversation;
import com.tencent.imsdk.v2.V2TIMGroupAtInfo;
import com.tencent.imsdk.v2.V2TIMMessage;
import com.tencent.qcloud.tuicore.ServiceInitializer;
import com.tencent.qcloud.tuicore.TUIConfig;
import com.tencent.qcloud.tuicore.component.action.PopDialogAdapter;
import com.tencent.qcloud.tuicore.util.DateTimeUtil;
import com.tencent.qcloud.tuikit.tuiconversation.R;
import com.tencent.qcloud.tuikit.tuiconversation.bean.ConversationInfo;
import com.tencent.qcloud.tuikit.tuiconversation.bean.DraftInfo;
import h.y.a.n.d1;
import java.util.ArrayList;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class ConversationUtils {
    private static final String TAG = "ConversationUtils";

    public static ConversationInfo convertV2TIMConversation(V2TIMConversation v2TIMConversation) {
        if (v2TIMConversation == null) {
            return null;
        }
        String str = TAG;
        TUIConversationLog.i(str, "TIMConversation2ConversationInfo id:" + v2TIMConversation.getConversationID() + "|name:" + v2TIMConversation.getShowName() + "|unreadNum:" + v2TIMConversation.getUnreadCount());
        ConversationInfo conversationInfo = new ConversationInfo();
        conversationInfo.setConversation(v2TIMConversation);
        int type = v2TIMConversation.getType();
        if (type == 1 || type == 2) {
            boolean z = type == 2;
            String draftText = v2TIMConversation.getDraftText();
            if (!TextUtils.isEmpty(draftText)) {
                DraftInfo draftInfo = new DraftInfo();
                draftInfo.setDraftText(draftText);
                draftInfo.setDraftTime(v2TIMConversation.getDraftTimestamp());
                conversationInfo.setDraft(draftInfo);
            }
            V2TIMMessage lastMessage = v2TIMConversation.getLastMessage();
            if (lastMessage == null) {
                conversationInfo.setLastMessageTime(DateTimeUtil.getStringToDate("0001-01-01 00:00:00", d1.f26281e));
            } else {
                conversationInfo.setLastMessageTime(lastMessage.getTimestamp());
                conversationInfo.setLastMessage(lastMessage);
            }
            int atInfoType = getAtInfoType(v2TIMConversation);
            if (atInfoType == 1) {
                conversationInfo.setAtInfoText(ServiceInitializer.getAppContext().getString(R.string.ui_at_me));
            } else if (atInfoType == 2) {
                conversationInfo.setAtInfoText(ServiceInitializer.getAppContext().getString(R.string.ui_at_all));
            } else if (atInfoType != 3) {
                conversationInfo.setAtInfoText("");
            } else {
                conversationInfo.setAtInfoText(ServiceInitializer.getAppContext().getString(R.string.ui_at_all_me));
            }
            conversationInfo.setTitle(v2TIMConversation.getShowName());
            ArrayList arrayList = new ArrayList();
            if (z) {
                if (!TextUtils.isEmpty(v2TIMConversation.getFaceUrl())) {
                    arrayList.add(v2TIMConversation.getFaceUrl());
                }
            } else if (TextUtils.isEmpty(v2TIMConversation.getFaceUrl())) {
                arrayList.add(Integer.valueOf(TUIConfig.getDefaultAvatarImage()));
            } else {
                arrayList.add(v2TIMConversation.getFaceUrl());
            }
            conversationInfo.setIconPath(v2TIMConversation.getFaceUrl());
            conversationInfo.setIconUrlList(arrayList);
            if (z) {
                conversationInfo.setId(v2TIMConversation.getGroupID());
                conversationInfo.setGroupType(v2TIMConversation.getGroupType());
            } else {
                conversationInfo.setId(v2TIMConversation.getUserID());
            }
            if ("Meeting".equals(v2TIMConversation.getGroupType())) {
                conversationInfo.setShowDisturbIcon(false);
            } else {
                conversationInfo.setShowDisturbIcon(v2TIMConversation.getRecvOpt() == 2);
            }
            conversationInfo.setConversationId(v2TIMConversation.getConversationID());
            conversationInfo.setGroup(z);
            if (!"AVChatRoom".equals(v2TIMConversation.getGroupType())) {
                conversationInfo.setUnRead(v2TIMConversation.getUnreadCount());
            }
            conversationInfo.setTop(v2TIMConversation.isPinned());
            conversationInfo.setOrderKey(v2TIMConversation.getOrderKey());
            if (v2TIMConversation.getMarkList() != null) {
                if (v2TIMConversation.getMarkList().contains(Long.valueOf(V2TIMConversation.V2TIM_CONVERSATION_MARK_TYPE_FOLD))) {
                    conversationInfo.setMarkFold(true);
                } else {
                    conversationInfo.setMarkFold(false);
                }
                if (v2TIMConversation.getMarkList().contains(Long.valueOf(V2TIMConversation.V2TIM_CONVERSATION_MARK_TYPE_UNREAD))) {
                    conversationInfo.setMarkUnread(true);
                } else {
                    conversationInfo.setMarkUnread(false);
                }
                if (v2TIMConversation.getMarkList().contains(Long.valueOf(V2TIMConversation.V2TIM_CONVERSATION_MARK_TYPE_HIDE))) {
                    conversationInfo.setMarkHidden(true);
                } else {
                    conversationInfo.setMarkHidden(false);
                }
            }
            return conversationInfo;
        }
        return null;
    }

    public static List<ConversationInfo> convertV2TIMConversationList(List<V2TIMConversation> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (V2TIMConversation v2TIMConversation : list) {
                arrayList.add(convertV2TIMConversation(v2TIMConversation));
            }
        }
        return arrayList;
    }

    private static int getAtInfoType(V2TIMConversation v2TIMConversation) {
        boolean z;
        List<V2TIMGroupAtInfo> groupAtInfoList = v2TIMConversation.getGroupAtInfoList();
        if (groupAtInfoList == null || groupAtInfoList.isEmpty()) {
            return 0;
        }
        boolean z2 = false;
        loop0: while (true) {
            z = z2;
            for (V2TIMGroupAtInfo v2TIMGroupAtInfo : groupAtInfoList) {
                if (v2TIMGroupAtInfo.getAtType() == 1) {
                    z = true;
                } else if (v2TIMGroupAtInfo.getAtType() == 2) {
                    z2 = true;
                } else if (v2TIMGroupAtInfo.getAtType() == 3) {
                    break;
                }
            }
            z2 = true;
        }
        if (z2 && z) {
            return 3;
        }
        if (z2) {
            return 2;
        }
        return z ? 1 : 0;
    }

    public static int getListUnspecifiedWidth(PopDialogAdapter popDialogAdapter, ListView listView) {
        if (popDialogAdapter == null || listView == null) {
            return 0;
        }
        View view = null;
        int count = popDialogAdapter.getCount();
        if (count <= 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < count; i3++) {
            view = popDialogAdapter.getView(i3, view, listView);
            view.measure(0, 0);
            i2 = Math.max(i2, view.getMeasuredWidth() + view.getPaddingLeft() + view.getPaddingRight());
        }
        return i2;
    }

    public static boolean isIgnored(ConversationInfo conversationInfo) {
        return "AVChatRoom".equals(conversationInfo.getGroupType());
    }
}
