package com.tencent.qcloud.tuikit.tuiconversation;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.tencent.imsdk.v2.V2TIMConversation;
import com.tencent.imsdk.v2.V2TIMConversationListener;
import com.tencent.imsdk.v2.V2TIMManager;
import com.tencent.imsdk.v2.V2TIMSDKListener;
import com.tencent.imsdk.v2.V2TIMUserStatus;
import com.tencent.qcloud.tuicore.ServiceInitializer;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.tencent.qcloud.tuicore.TUICore;
import com.tencent.qcloud.tuicore.TUILogin;
import com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback;
import com.tencent.qcloud.tuikit.tuiconversation.bean.ConversationInfo;
import com.tencent.qcloud.tuikit.tuiconversation.interfaces.ConversationEventListener;
import com.tencent.qcloud.tuikit.tuiconversation.util.ConversationUtils;
import com.tencent.qcloud.tuikit.tuiconversation.util.TUIConversationLog;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class TUIConversationService extends ServiceInitializer implements ITUIConversationService {
    public static final String TAG = TUIConversationService.class.getSimpleName();
    private static TUIConversationService instance;
    private WeakReference<ConversationEventListener> conversationEventListener;
    private boolean syncFinished = false;
    private final List<WeakReference<ConversationEventListener>> conversationEventListenerList = new ArrayList();

    public static TUIConversationService getInstance() {
        return instance;
    }

    private Object getOrDefault(Object obj, Object obj2) {
        return obj != null ? obj : obj2;
    }

    private void initEvent() {
        TUICore.registerEvent(TUIConstants.TUIGroup.EVENT_GROUP, TUIConstants.TUIGroup.EVENT_SUB_KEY_EXIT_GROUP, this);
        TUICore.registerEvent(TUIConstants.TUIGroup.EVENT_GROUP, TUIConstants.TUIGroup.EVENT_SUB_KEY_MEMBER_KICKED_GROUP, this);
        TUICore.registerEvent(TUIConstants.TUIGroup.EVENT_GROUP, TUIConstants.TUIGroup.EVENT_SUB_KEY_GROUP_DISMISS, this);
        TUICore.registerEvent(TUIConstants.TUIGroup.EVENT_GROUP, TUIConstants.TUIGroup.EVENT_SUB_KEY_GROUP_RECYCLE, this);
        TUICore.registerEvent(TUIConstants.TUIContact.EVENT_FRIEND_INFO_CHANGED, TUIConstants.TUIContact.EVENT_SUB_KEY_FRIEND_REMARK_CHANGED, this);
        TUICore.registerEvent(TUIConstants.TUIGroup.EVENT_GROUP, TUIConstants.TUIGroup.EVENT_SUB_KEY_CLEAR_MESSAGE, this);
        TUICore.registerEvent(TUIConstants.TUIContact.EVENT_USER, TUIConstants.TUIContact.EVENT_SUB_KEY_CLEAR_MESSAGE, this);
        TUICore.registerEvent(TUIConstants.TUIChat.EVENT_KEY_RECEIVE_MESSAGE, TUIConstants.TUIChat.EVENT_SUB_KEY_CONVERSATION_ID, this);
    }

    private void initIMListener() {
        V2TIMManager.getConversationManager().addConversationListener(new V2TIMConversationListener() { // from class: com.tencent.qcloud.tuikit.tuiconversation.TUIConversationService.2
            @Override // com.tencent.imsdk.v2.V2TIMConversationListener
            public void onConversationChanged(List<V2TIMConversation> list) {
                ConversationEventListener conversationEventListener = TUIConversationService.getInstance().getConversationEventListener();
                List<ConversationInfo> convertV2TIMConversationList = ConversationUtils.convertV2TIMConversationList(list);
                if (conversationEventListener != null) {
                    conversationEventListener.onConversationChanged(convertV2TIMConversationList);
                }
                for (ConversationEventListener conversationEventListener2 : TUIConversationService.this.getConversationEventListenerList()) {
                    conversationEventListener2.onConversationChanged(convertV2TIMConversationList);
                }
            }

            @Override // com.tencent.imsdk.v2.V2TIMConversationListener
            public void onNewConversation(List<V2TIMConversation> list) {
                ConversationEventListener conversationEventListener = TUIConversationService.getInstance().getConversationEventListener();
                List<ConversationInfo> convertV2TIMConversationList = ConversationUtils.convertV2TIMConversationList(list);
                if (conversationEventListener != null) {
                    conversationEventListener.onNewConversation(convertV2TIMConversationList);
                }
                for (ConversationEventListener conversationEventListener2 : TUIConversationService.this.getConversationEventListenerList()) {
                    conversationEventListener2.onNewConversation(convertV2TIMConversationList);
                }
            }

            @Override // com.tencent.imsdk.v2.V2TIMConversationListener
            public void onSyncServerFailed() {
                TUIConversationService.this.syncFinished = false;
            }

            @Override // com.tencent.imsdk.v2.V2TIMConversationListener
            public void onSyncServerFinish() {
                ConversationEventListener conversationEventListener = TUIConversationService.getInstance().getConversationEventListener();
                if (conversationEventListener != null) {
                    conversationEventListener.onSyncServerFinish();
                }
                for (ConversationEventListener conversationEventListener2 : TUIConversationService.this.getConversationEventListenerList()) {
                    conversationEventListener2.onSyncServerFinish();
                }
                TUIConversationService.this.syncFinished = true;
            }

            @Override // com.tencent.imsdk.v2.V2TIMConversationListener
            public void onSyncServerStart() {
                TUIConversationService.this.syncFinished = false;
            }

            @Override // com.tencent.imsdk.v2.V2TIMConversationListener
            public void onTotalUnreadMessageCountChanged(long j2) {
                ConversationEventListener conversationEventListener = TUIConversationService.getInstance().getConversationEventListener();
                if (conversationEventListener != null) {
                    conversationEventListener.updateTotalUnreadMessageCount(j2);
                }
                for (ConversationEventListener conversationEventListener2 : TUIConversationService.this.getConversationEventListenerList()) {
                    conversationEventListener2.updateTotalUnreadMessageCount(j2);
                }
                HashMap hashMap = new HashMap();
                hashMap.put(TUIConstants.TUIConversation.TOTAL_UNREAD_COUNT, Long.valueOf(j2));
                TUICore.notifyEvent(TUIConstants.TUIConversation.EVENT_UNREAD, TUIConstants.TUIConversation.EVENT_SUB_KEY_UNREAD_CHANGED, hashMap);
            }
        });
        V2TIMManager.getInstance().addIMSDKListener(new V2TIMSDKListener() { // from class: com.tencent.qcloud.tuikit.tuiconversation.TUIConversationService.3
            @Override // com.tencent.imsdk.v2.V2TIMSDKListener
            public void onUserStatusChanged(List<V2TIMUserStatus> list) {
                ConversationEventListener conversationEventListener = TUIConversationService.getInstance().getConversationEventListener();
                if (conversationEventListener != null) {
                    conversationEventListener.onUserStatusChanged(list);
                }
                for (ConversationEventListener conversationEventListener2 : TUIConversationService.this.getConversationEventListenerList()) {
                    conversationEventListener2.onUserStatusChanged(list);
                }
            }
        });
    }

    private void initService() {
        TUICore.registerService("TUIConversationService", this);
    }

    public void addConversationEventListener(ConversationEventListener conversationEventListener) {
        if (conversationEventListener == null) {
            return;
        }
        for (WeakReference<ConversationEventListener> weakReference : this.conversationEventListenerList) {
            if (weakReference.get() == conversationEventListener) {
                return;
            }
        }
        this.conversationEventListenerList.add(new WeakReference<>(conversationEventListener));
    }

    public void addMessageListener() {
    }

    public ConversationEventListener getConversationEventListener() {
        WeakReference<ConversationEventListener> weakReference = this.conversationEventListener;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public List<ConversationEventListener> getConversationEventListenerList() {
        ArrayList arrayList = new ArrayList();
        ListIterator<WeakReference<ConversationEventListener>> listIterator = this.conversationEventListenerList.listIterator();
        while (listIterator.hasNext()) {
            ConversationEventListener conversationEventListener = listIterator.next().get();
            if (conversationEventListener == null) {
                listIterator.remove();
            } else {
                arrayList.add(conversationEventListener);
            }
        }
        return arrayList;
    }

    @Override // com.tencent.qcloud.tuicore.ServiceInitializer
    public void init(Context context) {
        instance = this;
        initService();
        initEvent();
        initIMListener();
    }

    @Override // com.tencent.qcloud.tuikit.tuiconversation.ITUIConversationService, com.tencent.qcloud.tuicore.interfaces.ITUIService
    public Object onCall(String str, Map<String, Object> map) {
        Bundle bundle = new Bundle();
        ConversationEventListener conversationEventListener = getInstance().getConversationEventListener();
        if (conversationEventListener == null) {
            String str2 = TAG;
            TUIConversationLog.e(str2, "execute " + str + " failed , conversationEvent listener is null");
            return bundle;
        }
        if (TextUtils.equals(TUIConstants.TUIConversation.METHOD_IS_TOP_CONVERSATION, str)) {
            String str3 = (String) map.get("chatId");
            if (!TextUtils.isEmpty(str3)) {
                bundle.putBoolean(TUIConstants.TUIConversation.IS_TOP, conversationEventListener.isTopConversation(str3));
            }
        } else if (TextUtils.equals(TUIConstants.TUIConversation.METHOD_SET_TOP_CONVERSATION, str)) {
            String str4 = (String) map.get("chatId");
            boolean booleanValue = ((Boolean) map.get(TUIConstants.TUIConversation.IS_SET_TOP)).booleanValue();
            if (!TextUtils.isEmpty(str4)) {
                conversationEventListener.setConversationTop(str4, booleanValue, new IUIKitCallback<Void>() { // from class: com.tencent.qcloud.tuikit.tuiconversation.TUIConversationService.1
                    @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
                    public void onError(String str5, int i2, String str6) {
                    }

                    @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
                    public void onSuccess(Void r1) {
                    }
                });
            }
        } else if (TextUtils.equals(TUIConstants.TUIConversation.METHOD_GET_TOTAL_UNREAD_COUNT, str)) {
            return Long.valueOf(conversationEventListener.getUnreadTotal());
        } else {
            if (TextUtils.equals(TUIConstants.TUIConversation.METHOD_UPDATE_TOTAL_UNREAD_COUNT, str)) {
                HashMap hashMap = new HashMap();
                hashMap.put(TUIConstants.TUIConversation.TOTAL_UNREAD_COUNT, Long.valueOf(conversationEventListener.getUnreadTotal()));
                TUICore.notifyEvent(TUIConstants.TUIConversation.EVENT_UNREAD, TUIConstants.TUIConversation.EVENT_SUB_KEY_UNREAD_CHANGED, hashMap);
            } else if (TextUtils.equals(TUIConstants.TUIConversation.METHOD_DELETE_CONVERSATION, str)) {
                String str5 = (String) map.get(TUIConstants.TUIConversation.CONVERSATION_ID);
                conversationEventListener.clearFoldMarkAndDeleteConversation(str5);
                for (ConversationEventListener conversationEventListener2 : getConversationEventListenerList()) {
                    conversationEventListener2.clearFoldMarkAndDeleteConversation(str5);
                }
            }
        }
        return bundle;
    }

    @Override // com.tencent.qcloud.tuikit.tuiconversation.ITUIConversationService, com.tencent.qcloud.tuicore.interfaces.ITUINotification
    public void onNotifyEvent(String str, String str2, Map<String, Object> map) {
        ConversationEventListener conversationEventListener;
        if (TextUtils.equals(str, TUIConstants.TUIGroup.EVENT_GROUP)) {
            if (!TextUtils.equals(str2, TUIConstants.TUIGroup.EVENT_SUB_KEY_EXIT_GROUP) && !TextUtils.equals(str2, TUIConstants.TUIGroup.EVENT_SUB_KEY_GROUP_DISMISS) && !TextUtils.equals(str2, TUIConstants.TUIGroup.EVENT_SUB_KEY_GROUP_RECYCLE)) {
                if (!TextUtils.equals(str2, TUIConstants.TUIGroup.EVENT_SUB_KEY_MEMBER_KICKED_GROUP)) {
                    if (TextUtils.equals(str2, TUIConstants.TUIGroup.EVENT_SUB_KEY_CLEAR_MESSAGE)) {
                        String str3 = (String) getOrDefault(map.get("groupId"), "");
                        ConversationEventListener conversationEventListener2 = getConversationEventListener();
                        if (conversationEventListener2 != null) {
                            conversationEventListener2.clearConversationMessage(str3, true);
                        }
                        for (ConversationEventListener conversationEventListener3 : getConversationEventListenerList()) {
                            conversationEventListener3.clearConversationMessage(str3, true);
                        }
                        return;
                    }
                    return;
                } else if (map == null) {
                    return;
                } else {
                    String str4 = (String) getOrDefault(map.get("groupId"), "");
                    ArrayList arrayList = (ArrayList) map.get(TUIConstants.TUIGroup.GROUP_MEMBER_ID_LIST);
                    if (TextUtils.isEmpty(str4) || arrayList == null || arrayList.isEmpty()) {
                        return;
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (TextUtils.equals((String) it.next(), TUILogin.getLoginUser())) {
                            ConversationEventListener conversationEventListener4 = getConversationEventListener();
                            if (conversationEventListener4 != null) {
                                conversationEventListener4.deleteConversation(str4, true);
                            }
                            for (ConversationEventListener conversationEventListener5 : getConversationEventListenerList()) {
                                conversationEventListener5.deleteConversation(str4, true);
                            }
                            return;
                        }
                    }
                    return;
                }
            }
            ConversationEventListener conversationEventListener6 = getConversationEventListener();
            String str5 = map != null ? (String) getOrDefault(map.get("groupId"), "") : null;
            if (conversationEventListener6 != null) {
                conversationEventListener6.deleteConversation(str5, true);
            }
            for (ConversationEventListener conversationEventListener7 : getConversationEventListenerList()) {
                conversationEventListener7.deleteConversation(str5, true);
            }
            return;
        }
        if (str.equals(TUIConstants.TUIContact.EVENT_USER)) {
            if (!str2.equals(TUIConstants.TUIContact.EVENT_SUB_KEY_CLEAR_MESSAGE) || map == null || map.isEmpty()) {
                return;
            }
            String str6 = (String) getOrDefault(map.get(TUIConstants.TUIContact.FRIEND_ID), "");
            ConversationEventListener conversationEventListener8 = getConversationEventListener();
            if (conversationEventListener8 != null) {
                conversationEventListener8.clearConversationMessage(str6, false);
            }
            for (ConversationEventListener conversationEventListener9 : getConversationEventListenerList()) {
                conversationEventListener9.clearConversationMessage(str6, false);
            }
        } else if (str.equals(TUIConstants.TUIContact.EVENT_FRIEND_INFO_CHANGED)) {
            if (!str2.equals(TUIConstants.TUIContact.EVENT_SUB_KEY_FRIEND_REMARK_CHANGED) || map == null || map.isEmpty() || (conversationEventListener = getInstance().getConversationEventListener()) == null) {
                return;
            }
            String str7 = (String) map.get(TUIConstants.TUIContact.FRIEND_ID);
            String str8 = (String) map.get(TUIConstants.TUIContact.FRIEND_REMARK);
            conversationEventListener.onFriendRemarkChanged(str7, str8);
            for (ConversationEventListener conversationEventListener10 : getConversationEventListenerList()) {
                conversationEventListener10.onFriendRemarkChanged(str7, str8);
            }
        } else if (str.equals(TUIConstants.TUIChat.EVENT_KEY_RECEIVE_MESSAGE) && str2.equals(TUIConstants.TUIChat.EVENT_SUB_KEY_CONVERSATION_ID) && map != null && !map.isEmpty()) {
            String str9 = (String) map.get(TUIConstants.TUIChat.CONVERSATION_ID);
            boolean booleanValue = map.containsKey(TUIConstants.TUIChat.IS_TYPING_MESSAGE) ? ((Boolean) map.get(TUIConstants.TUIChat.IS_TYPING_MESSAGE)).booleanValue() : false;
            ConversationEventListener conversationEventListener11 = getInstance().getConversationEventListener();
            if (conversationEventListener11 != null) {
                conversationEventListener11.onReceiveMessage(str9, booleanValue);
            }
            for (ConversationEventListener conversationEventListener12 : getConversationEventListenerList()) {
                conversationEventListener12.onReceiveMessage(str9, booleanValue);
            }
        }
    }

    public void setConversationEventListener(ConversationEventListener conversationEventListener) {
        this.conversationEventListener = new WeakReference<>(conversationEventListener);
        if (this.syncFinished) {
            conversationEventListener.onSyncServerFinish();
        }
    }
}
