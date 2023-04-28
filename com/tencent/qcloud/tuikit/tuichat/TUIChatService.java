package com.tencent.qcloud.tuikit.tuichat;

import android.content.Context;
import android.text.TextUtils;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.rxjava3.RxPreferenceDataStoreBuilder;
import androidx.datastore.rxjava3.RxDataStore;
import com.tencent.imsdk.v2.V2TIMAdvancedMsgListener;
import com.tencent.imsdk.v2.V2TIMFriendInfo;
import com.tencent.imsdk.v2.V2TIMFriendshipListener;
import com.tencent.imsdk.v2.V2TIMGroupTipsElem;
import com.tencent.imsdk.v2.V2TIMManager;
import com.tencent.imsdk.v2.V2TIMMessage;
import com.tencent.imsdk.v2.V2TIMMessageReceipt;
import com.tencent.imsdk.v2.V2TIMSDKListener;
import com.tencent.qcloud.tuicore.ServiceInitializer;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.tencent.qcloud.tuicore.TUICore;
import com.tencent.qcloud.tuicore.TUILogin;
import com.tencent.qcloud.tuikit.tuichat.TUIChatConstants;
import com.tencent.qcloud.tuikit.tuichat.bean.MessageReceiptInfo;
import com.tencent.qcloud.tuikit.tuichat.bean.message.CallingMessageBean;
import com.tencent.qcloud.tuikit.tuichat.bean.message.CustomEvaluationMessageBean;
import com.tencent.qcloud.tuikit.tuichat.bean.message.CustomLinkMessageBean;
import com.tencent.qcloud.tuikit.tuichat.bean.message.CustomOrderMessageBean;
import com.tencent.qcloud.tuikit.tuichat.bean.message.FaceMessageBean;
import com.tencent.qcloud.tuikit.tuichat.bean.message.FileMessageBean;
import com.tencent.qcloud.tuikit.tuichat.bean.message.ImageMessageBean;
import com.tencent.qcloud.tuikit.tuichat.bean.message.LocationMessageBean;
import com.tencent.qcloud.tuikit.tuichat.bean.message.MergeMessageBean;
import com.tencent.qcloud.tuikit.tuichat.bean.message.MessageTypingBean;
import com.tencent.qcloud.tuikit.tuichat.bean.message.QuoteMessageBean;
import com.tencent.qcloud.tuikit.tuichat.bean.message.ReplyMessageBean;
import com.tencent.qcloud.tuikit.tuichat.bean.message.SoundMessageBean;
import com.tencent.qcloud.tuikit.tuichat.bean.message.TUIMessageBean;
import com.tencent.qcloud.tuikit.tuichat.bean.message.TextAtMessageBean;
import com.tencent.qcloud.tuikit.tuichat.bean.message.TextMessageBean;
import com.tencent.qcloud.tuikit.tuichat.bean.message.TipsMessageBean;
import com.tencent.qcloud.tuikit.tuichat.bean.message.VideoMessageBean;
import com.tencent.qcloud.tuikit.tuichat.component.face.FaceManager;
import com.tencent.qcloud.tuikit.tuichat.config.TUIChatConfigs;
import com.tencent.qcloud.tuikit.tuichat.interfaces.C2CChatEventListener;
import com.tencent.qcloud.tuikit.tuichat.interfaces.GroupChatEventListener;
import com.tencent.qcloud.tuikit.tuichat.interfaces.IBaseMessageSender;
import com.tencent.qcloud.tuikit.tuichat.interfaces.NetworkConnectionListener;
import com.tencent.qcloud.tuikit.tuichat.interfaces.TotalUnreadCountListener;
import com.tencent.qcloud.tuikit.tuichat.ui.view.message.viewholder.CallingMessageHolder;
import com.tencent.qcloud.tuikit.tuichat.ui.view.message.viewholder.CustomEvaluationMessageHolder;
import com.tencent.qcloud.tuikit.tuichat.ui.view.message.viewholder.CustomLinkMessageHolder;
import com.tencent.qcloud.tuikit.tuichat.ui.view.message.viewholder.CustomOrderMessageHolder;
import com.tencent.qcloud.tuikit.tuichat.ui.view.message.viewholder.FaceMessageHolder;
import com.tencent.qcloud.tuikit.tuichat.ui.view.message.viewholder.FileMessageHolder;
import com.tencent.qcloud.tuikit.tuichat.ui.view.message.viewholder.ImageMessageHolder;
import com.tencent.qcloud.tuikit.tuichat.ui.view.message.viewholder.LocationMessageHolder;
import com.tencent.qcloud.tuikit.tuichat.ui.view.message.viewholder.MergeMessageHolder;
import com.tencent.qcloud.tuikit.tuichat.ui.view.message.viewholder.MessageBaseHolder;
import com.tencent.qcloud.tuikit.tuichat.ui.view.message.viewholder.QuoteMessageHolder;
import com.tencent.qcloud.tuikit.tuichat.ui.view.message.viewholder.ReplyMessageHolder;
import com.tencent.qcloud.tuikit.tuichat.ui.view.message.viewholder.SoundMessageHolder;
import com.tencent.qcloud.tuikit.tuichat.ui.view.message.viewholder.TextMessageHolder;
import com.tencent.qcloud.tuikit.tuichat.ui.view.message.viewholder.TipsMessageHolder;
import com.tencent.qcloud.tuikit.tuichat.ui.view.message.viewholder.VideoMessageHolder;
import com.tencent.qcloud.tuikit.tuichat.util.ChatMessageBuilder;
import com.tencent.qcloud.tuikit.tuichat.util.ChatMessageParser;
import com.tencent.qcloud.tuikit.tuichat.util.DataStoreUtil;
import com.tencent.qcloud.tuikit.tuichat.util.TUIChatLog;
import com.tencent.qcloud.tuikit.tuichat.util.TUIChatUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class TUIChatService extends ServiceInitializer implements ITUIChatService {
    public static final String TAG = TUIChatService.class.getSimpleName();
    private static TUIChatConfigs chatConfig;
    private static TUIChatService instance;
    private WeakReference<IBaseMessageSender> messageSender;
    private final List<WeakReference<GroupChatEventListener>> groupChatEventListenerList = new ArrayList();
    private final List<WeakReference<C2CChatEventListener>> c2CChatEventListenerList = new ArrayList();
    private final List<WeakReference<TotalUnreadCountListener>> unreadCountListenerList = new ArrayList();
    private final Map<String, Class<? extends TUIMessageBean>> messageBusinessIdMap = new HashMap();
    private final Map<Class<? extends TUIMessageBean>, Integer> messageViewTypeMap = new HashMap();
    public final Map<Integer, Class<? extends MessageBaseHolder>> messageViewHolderMap = new HashMap();
    private final List<WeakReference<NetworkConnectionListener>> connectListenerList = new ArrayList();
    private int viewType = 0;
    private RxDataStore<Preferences> mChatDataStore = null;

    private void addCustomMessageType(String str, Class<? extends TUIMessageBean> cls, Class<? extends MessageBaseHolder> cls2) {
        this.viewType++;
        this.messageBusinessIdMap.put(str, cls);
        this.messageViewTypeMap.put(cls, Integer.valueOf(this.viewType));
        this.messageViewHolderMap.put(Integer.valueOf(this.viewType), cls2);
    }

    private void addDefaultMessageType(Class<? extends TUIMessageBean> cls, Class<? extends MessageBaseHolder> cls2) {
        int i2 = this.viewType + 1;
        this.viewType = i2;
        this.messageViewTypeMap.put(cls, Integer.valueOf(i2));
        this.messageViewHolderMap.put(Integer.valueOf(this.viewType), cls2);
    }

    public static TUIChatConfigs getChatConfig() {
        if (chatConfig == null) {
            chatConfig = TUIChatConfigs.getConfigs();
        }
        return chatConfig;
    }

    public static TUIChatService getInstance() {
        return instance;
    }

    private Object getOrDefault(Object obj, Object obj2) {
        return obj != null ? obj : obj2;
    }

    private void initDataStore() {
        if (this.mChatDataStore == null) {
            this.mChatDataStore = new RxPreferenceDataStoreBuilder(ServiceInitializer.getAppContext(), TUIChatConstants.DataStore.DATA_STORE_NAME).build();
        }
        DataStoreUtil.getInstance().setDataStore(this.mChatDataStore);
    }

    private void initDefaultMessageType() {
        addDefaultMessageType(FaceMessageBean.class, FaceMessageHolder.class);
        addDefaultMessageType(FileMessageBean.class, FileMessageHolder.class);
        addDefaultMessageType(ImageMessageBean.class, ImageMessageHolder.class);
        addDefaultMessageType(LocationMessageBean.class, LocationMessageHolder.class);
        addDefaultMessageType(MergeMessageBean.class, MergeMessageHolder.class);
        addDefaultMessageType(SoundMessageBean.class, SoundMessageHolder.class);
        addDefaultMessageType(TextAtMessageBean.class, TextMessageHolder.class);
        addDefaultMessageType(TextMessageBean.class, TextMessageHolder.class);
        addDefaultMessageType(TipsMessageBean.class, TipsMessageHolder.class);
        addDefaultMessageType(VideoMessageBean.class, VideoMessageHolder.class);
        addDefaultMessageType(ReplyMessageBean.class, ReplyMessageHolder.class);
        addDefaultMessageType(QuoteMessageBean.class, QuoteMessageHolder.class);
        addDefaultMessageType(CallingMessageBean.class, CallingMessageHolder.class);
    }

    private void initEvent() {
        TUICore.registerEvent(TUIConstants.TUIGroup.EVENT_GROUP, TUIConstants.TUIGroup.EVENT_SUB_KEY_GROUP_INFO_CHANGED, this);
        TUICore.registerEvent(TUIConstants.TUIGroup.EVENT_GROUP, TUIConstants.TUIGroup.EVENT_SUB_KEY_EXIT_GROUP, this);
        TUICore.registerEvent(TUIConstants.TUIGroup.EVENT_GROUP, TUIConstants.TUIGroup.EVENT_SUB_KEY_MEMBER_KICKED_GROUP, this);
        TUICore.registerEvent(TUIConstants.TUIGroup.EVENT_GROUP, TUIConstants.TUIGroup.EVENT_SUB_KEY_GROUP_DISMISS, this);
        TUICore.registerEvent(TUIConstants.TUIGroup.EVENT_GROUP, TUIConstants.TUIGroup.EVENT_SUB_KEY_JOIN_GROUP, this);
        TUICore.registerEvent(TUIConstants.TUIGroup.EVENT_GROUP, TUIConstants.TUIGroup.EVENT_SUB_KEY_INVITED_GROUP, this);
        TUICore.registerEvent(TUIConstants.TUIGroup.EVENT_GROUP, TUIConstants.TUIGroup.EVENT_SUB_KEY_GROUP_RECYCLE, this);
        TUICore.registerEvent(TUIConstants.TUIContact.EVENT_FRIEND_INFO_CHANGED, TUIConstants.TUIContact.EVENT_SUB_KEY_FRIEND_REMARK_CHANGED, this);
        TUICore.registerEvent(TUIConstants.TUIGroup.EVENT_GROUP, TUIConstants.TUIGroup.EVENT_SUB_KEY_CLEAR_MESSAGE, this);
        TUICore.registerEvent(TUIConstants.TUIContact.EVENT_USER, TUIConstants.TUIContact.EVENT_SUB_KEY_CLEAR_MESSAGE, this);
        TUICore.registerEvent(TUIConstants.TUIConversation.EVENT_UNREAD, TUIConstants.TUIConversation.EVENT_SUB_KEY_UNREAD_CHANGED, this);
        TUICore.registerEvent(TUIConstants.TUILogin.EVENT_LOGIN_STATE_CHANGED, TUIConstants.TUILogin.EVENT_SUB_KEY_USER_LOGIN_SUCCESS, this);
        TUICore.registerEvent(TUIChatConstants.EVENT_KEY_MESSAGE_STATUS_CHANGED, TUIChatConstants.EVENT_SUB_KEY_MESSAGE_SEND, this);
    }

    private void initIMListener() {
        V2TIMManager.getMessageManager().addAdvancedMsgListener(new V2TIMAdvancedMsgListener() { // from class: com.tencent.qcloud.tuikit.tuichat.TUIChatService.1
            @Override // com.tencent.imsdk.v2.V2TIMAdvancedMsgListener
            public void onRecvMessageModified(V2TIMMessage v2TIMMessage) {
                TUIMessageBean parseMessage = ChatMessageParser.parseMessage(v2TIMMessage);
                if (parseMessage == null) {
                    return;
                }
                for (C2CChatEventListener c2CChatEventListener : TUIChatService.getInstance().getC2CChatEventListenerList()) {
                    c2CChatEventListener.onRecvMessageModified(parseMessage);
                }
                for (GroupChatEventListener groupChatEventListener : TUIChatService.getInstance().getGroupChatEventListenerList()) {
                    groupChatEventListener.onRecvMessageModified(parseMessage);
                }
                String str = TUIChatService.TAG;
                TUIChatLog.i(str, "onRecvMessageModified msgID:" + v2TIMMessage.getMsgID());
            }

            @Override // com.tencent.imsdk.v2.V2TIMAdvancedMsgListener
            public void onRecvMessageReadReceipts(List<V2TIMMessageReceipt> list) {
                List<C2CChatEventListener> c2CChatEventListenerList = TUIChatService.getInstance().getC2CChatEventListenerList();
                List<GroupChatEventListener> groupChatEventListenerList = TUIChatService.getInstance().getGroupChatEventListenerList();
                ArrayList arrayList = new ArrayList();
                for (V2TIMMessageReceipt v2TIMMessageReceipt : list) {
                    MessageReceiptInfo messageReceiptInfo = new MessageReceiptInfo();
                    messageReceiptInfo.setMessageReceipt(v2TIMMessageReceipt);
                    arrayList.add(messageReceiptInfo);
                }
                for (GroupChatEventListener groupChatEventListener : groupChatEventListenerList) {
                    groupChatEventListener.onReadReport(arrayList);
                }
                for (C2CChatEventListener c2CChatEventListener : c2CChatEventListenerList) {
                    c2CChatEventListener.onReadReport(arrayList);
                }
            }

            @Override // com.tencent.imsdk.v2.V2TIMAdvancedMsgListener
            public void onRecvMessageRevoked(String str) {
                for (C2CChatEventListener c2CChatEventListener : TUIChatService.getInstance().getC2CChatEventListenerList()) {
                    c2CChatEventListener.handleRevoke(str);
                }
                for (GroupChatEventListener groupChatEventListener : TUIChatService.getInstance().getGroupChatEventListenerList()) {
                    groupChatEventListener.handleRevoke(str);
                }
            }

            @Override // com.tencent.imsdk.v2.V2TIMAdvancedMsgListener
            public void onRecvNewMessage(V2TIMMessage v2TIMMessage) {
                String str;
                TUIMessageBean parseMessage = ChatMessageParser.parseMessage(v2TIMMessage);
                if (parseMessage == null) {
                    return;
                }
                V2TIMMessage v2TIMMessage2 = parseMessage.getV2TIMMessage();
                V2TIMGroupTipsElem groupTipsElem = v2TIMMessage2 != null ? v2TIMMessage2.getGroupTipsElem() : null;
                if (groupTipsElem != null && 8 == groupTipsElem.getType() && groupTipsElem.getMemberChangeInfoList().size() > 0) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(v2TIMMessage);
                    V2TIMManager.getMessageManager().deleteMessages(arrayList, null);
                    return;
                }
                HashMap hashMap = new HashMap();
                if (TextUtils.isEmpty(v2TIMMessage.getGroupID())) {
                    for (C2CChatEventListener c2CChatEventListener : TUIChatService.getInstance().getC2CChatEventListenerList()) {
                        c2CChatEventListener.onRecvNewMessage(parseMessage);
                    }
                    str = "c2c_" + v2TIMMessage.getUserID();
                    if (parseMessage instanceof MessageTypingBean) {
                        hashMap.put(TUIConstants.TUIChat.IS_TYPING_MESSAGE, Boolean.TRUE);
                    } else {
                        hashMap.put(TUIConstants.TUIChat.IS_TYPING_MESSAGE, Boolean.FALSE);
                    }
                } else {
                    for (GroupChatEventListener groupChatEventListener : TUIChatService.getInstance().getGroupChatEventListenerList()) {
                        groupChatEventListener.onRecvNewMessage(parseMessage);
                    }
                    str = "group_" + v2TIMMessage.getGroupID();
                }
                hashMap.put(TUIConstants.TUIChat.CONVERSATION_ID, str);
                TUICore.notifyEvent(TUIConstants.TUIChat.EVENT_KEY_RECEIVE_MESSAGE, TUIConstants.TUIChat.EVENT_SUB_KEY_CONVERSATION_ID, hashMap);
            }
        });
        V2TIMManager.getFriendshipManager().addFriendListener(new V2TIMFriendshipListener() { // from class: com.tencent.qcloud.tuikit.tuichat.TUIChatService.2
            @Override // com.tencent.imsdk.v2.V2TIMFriendshipListener
            public void onFriendInfoChanged(List<V2TIMFriendInfo> list) {
                for (C2CChatEventListener c2CChatEventListener : TUIChatService.getInstance().getC2CChatEventListenerList()) {
                    for (V2TIMFriendInfo v2TIMFriendInfo : list) {
                        if (TextUtils.isEmpty(v2TIMFriendInfo.getFriendRemark())) {
                            String nickName = v2TIMFriendInfo.getUserProfile().getNickName();
                            if (TextUtils.isEmpty(nickName)) {
                                c2CChatEventListener.onFriendNameChanged(v2TIMFriendInfo.getUserID(), v2TIMFriendInfo.getUserID());
                            } else {
                                c2CChatEventListener.onFriendNameChanged(v2TIMFriendInfo.getUserID(), nickName);
                            }
                        } else {
                            c2CChatEventListener.onFriendNameChanged(v2TIMFriendInfo.getUserID(), v2TIMFriendInfo.getFriendRemark());
                        }
                    }
                }
            }
        });
        V2TIMManager.getInstance().addIMSDKListener(new V2TIMSDKListener() { // from class: com.tencent.qcloud.tuikit.tuichat.TUIChatService.3
            @Override // com.tencent.imsdk.v2.V2TIMSDKListener
            public void onConnectSuccess() {
                for (WeakReference weakReference : TUIChatService.this.connectListenerList) {
                    NetworkConnectionListener networkConnectionListener = (NetworkConnectionListener) weakReference.get();
                    if (networkConnectionListener != null) {
                        networkConnectionListener.onConnected();
                    }
                }
            }
        });
    }

    private void initMessageType() {
        addCustomMessageType(TUIChatConstants.BUSINESS_ID_CUSTOM_HELLO, CustomLinkMessageBean.class, CustomLinkMessageHolder.class);
        addCustomMessageType(TUIChatConstants.BUSINESS_ID_CUSTOM_EVALUATION, CustomEvaluationMessageBean.class, CustomEvaluationMessageHolder.class);
        addCustomMessageType(TUIChatConstants.BUSINESS_ID_CUSTOM_ORDER, CustomOrderMessageBean.class, CustomOrderMessageHolder.class);
        addCustomMessageType(TUIChatConstants.BUSINESS_ID_CUSTOM_TYPING, MessageTypingBean.class, null);
    }

    private void initService() {
        TUICore.registerService("TUIChatService", this);
    }

    public void addC2CChatEventListener(C2CChatEventListener c2CChatEventListener) {
        if (c2CChatEventListener == null) {
            return;
        }
        for (WeakReference<C2CChatEventListener> weakReference : this.c2CChatEventListenerList) {
            if (weakReference.get() == c2CChatEventListener) {
                return;
            }
        }
        this.c2CChatEventListenerList.add(new WeakReference<>(c2CChatEventListener));
    }

    public void addGroupChatEventListener(GroupChatEventListener groupChatEventListener) {
        if (groupChatEventListener == null) {
            return;
        }
        for (WeakReference<GroupChatEventListener> weakReference : this.groupChatEventListenerList) {
            if (weakReference.get() == groupChatEventListener) {
                return;
            }
        }
        this.groupChatEventListenerList.add(new WeakReference<>(groupChatEventListener));
    }

    public void addUnreadCountListener(TotalUnreadCountListener totalUnreadCountListener) {
        if (totalUnreadCountListener == null) {
            return;
        }
        for (WeakReference<TotalUnreadCountListener> weakReference : this.unreadCountListenerList) {
            if (weakReference.get() == totalUnreadCountListener) {
                return;
            }
        }
        this.unreadCountListenerList.add(new WeakReference<>(totalUnreadCountListener));
    }

    public List<C2CChatEventListener> getC2CChatEventListenerList() {
        ArrayList arrayList = new ArrayList();
        ListIterator<WeakReference<C2CChatEventListener>> listIterator = this.c2CChatEventListenerList.listIterator();
        while (listIterator.hasNext()) {
            C2CChatEventListener c2CChatEventListener = listIterator.next().get();
            if (c2CChatEventListener == null) {
                listIterator.remove();
            } else {
                arrayList.add(c2CChatEventListener);
            }
        }
        return arrayList;
    }

    public RxDataStore<Preferences> getChatDataStore() {
        return this.mChatDataStore;
    }

    public List<GroupChatEventListener> getGroupChatEventListenerList() {
        ArrayList arrayList = new ArrayList();
        ListIterator<WeakReference<GroupChatEventListener>> listIterator = this.groupChatEventListenerList.listIterator();
        while (listIterator.hasNext()) {
            GroupChatEventListener groupChatEventListener = listIterator.next().get();
            if (groupChatEventListener == null) {
                listIterator.remove();
            } else {
                arrayList.add(groupChatEventListener);
            }
        }
        return arrayList;
    }

    @Override // com.tencent.qcloud.tuicore.ServiceInitializer
    public int getLightThemeResId() {
        return R.style.TUIChatLightTheme;
    }

    @Override // com.tencent.qcloud.tuicore.ServiceInitializer
    public int getLivelyThemeResId() {
        return R.style.TUIChatLivelyTheme;
    }

    public Class<? extends TUIMessageBean> getMessageBeanClass(String str) {
        return this.messageBusinessIdMap.get(str);
    }

    public IBaseMessageSender getMessageSender() {
        WeakReference<IBaseMessageSender> weakReference = this.messageSender;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public Class<? extends MessageBaseHolder> getMessageViewHolderClass(int i2) {
        return this.messageViewHolderMap.get(Integer.valueOf(i2));
    }

    @Override // com.tencent.qcloud.tuicore.ServiceInitializer
    public int getSeriousThemeResId() {
        return R.style.TUIChatSeriousTheme;
    }

    public List<TotalUnreadCountListener> getUnreadCountListenerList() {
        ArrayList arrayList = new ArrayList();
        ListIterator<WeakReference<TotalUnreadCountListener>> listIterator = this.unreadCountListenerList.listIterator();
        while (listIterator.hasNext()) {
            TotalUnreadCountListener totalUnreadCountListener = listIterator.next().get();
            if (totalUnreadCountListener == null) {
                listIterator.remove();
            } else {
                arrayList.add(totalUnreadCountListener);
            }
        }
        return arrayList;
    }

    public int getViewType(Class<? extends TUIMessageBean> cls) {
        Integer num = this.messageViewTypeMap.get(cls);
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    @Override // com.tencent.qcloud.tuicore.ServiceInitializer
    public void init(Context context) {
        instance = this;
        initDefaultMessageType();
        initMessageType();
        initService();
        initEvent();
        initIMListener();
        initDataStore();
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.ITUIChatService, com.tencent.qcloud.tuicore.interfaces.ITUIService
    public Object onCall(String str, Map<String, Object> map) {
        V2TIMMessage v2TIMMessage;
        if (TextUtils.equals(TUIConstants.TUIChat.METHOD_SEND_MESSAGE, str)) {
            String str2 = (String) map.get("chatId");
            int intValue = ((Integer) getOrDefault(map.get(TUIConstants.TUIChat.CHAT_TYPE), 0)).intValue();
            String str3 = (String) getOrDefault(map.get(TUIConstants.TUIChat.MESSAGE_CONTENT), "");
            String str4 = (String) getOrDefault(map.get(TUIConstants.TUIChat.MESSAGE_DESCRIPTION), "");
            String str5 = (String) getOrDefault(map.get(TUIConstants.TUIChat.MESSAGE_EXTENSION), "");
            IBaseMessageSender messageSender = getMessageSender();
            if (messageSender != null) {
                messageSender.sendMessage(ChatMessageBuilder.buildCustomMessage(str3, str4, str5.getBytes()), str2, TUIChatUtils.isGroupChat(intValue));
                return null;
            }
            return null;
        } else if (TextUtils.equals(TUIConstants.TUIChat.METHOD_EXIT_CHAT, str)) {
            String str6 = (String) map.get("chatId");
            if (((Boolean) map.get(TUIConstants.TUIChat.IS_GROUP_CHAT)).booleanValue()) {
                for (GroupChatEventListener groupChatEventListener : getGroupChatEventListenerList()) {
                    groupChatEventListener.exitGroupChat(str6);
                }
                return null;
            }
            for (C2CChatEventListener c2CChatEventListener : getC2CChatEventListenerList()) {
                c2CChatEventListener.exitC2CChat(str6);
            }
            return null;
        } else if (TextUtils.equals(TUIConstants.TUIChat.METHOD_GET_DISPLAY_STRING, str)) {
            if (map == null || (v2TIMMessage = (V2TIMMessage) map.get(TUIConstants.TUIChat.V2TIMMESSAGE)) == null) {
                return null;
            }
            return ChatMessageParser.getDisplayString(v2TIMMessage);
        } else if (TextUtils.equals(TUIConstants.TUIChat.METHOD_ADD_MESSAGE_TO_CHAT, str)) {
            TUIMessageBean tUIMessageBean = (TUIMessageBean) map.get("messageBean");
            String str7 = (String) map.get("chatId");
            if (((Boolean) map.get(TUIConstants.TUIChat.IS_GROUP_CHAT)).booleanValue()) {
                for (GroupChatEventListener groupChatEventListener2 : getGroupChatEventListenerList()) {
                    groupChatEventListener2.addMessage(tUIMessageBean, str7);
                }
                return null;
            }
            for (C2CChatEventListener c2CChatEventListener2 : getC2CChatEventListenerList()) {
                c2CChatEventListener2.addMessage(tUIMessageBean, str7);
            }
            return null;
        } else if (TextUtils.equals(TUIConstants.TUIChat.METHOD_GROUP_APPLICAITON_PROCESSED, str)) {
            int intValue2 = ((Integer) map.get(TUIConstants.TUIChat.GROUP_APPLY_NUM)).intValue();
            if (((Boolean) map.get(TUIConstants.TUIChat.IS_GROUP_CHAT)).booleanValue()) {
                for (GroupChatEventListener groupChatEventListener3 : getGroupChatEventListenerList()) {
                    groupChatEventListener3.onApplied(intValue2);
                }
                return null;
            }
            return null;
        } else if (TextUtils.equals(TUIConstants.TUIChat.METHOD_UPDATE_DATA_STORE_CHAT_URI, str)) {
            String str8 = (String) map.get(TUIConstants.TUIChat.CHAT_BACKGROUND_URI);
            String str9 = (String) map.get("chatId");
            if (TextUtils.isEmpty(str8)) {
                return null;
            }
            DataStoreUtil.getInstance().putValue(str9, str8);
            return null;
        } else {
            return null;
        }
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.ITUIChatService, com.tencent.qcloud.tuicore.interfaces.ITUINotification
    public void onNotifyEvent(String str, String str2, Map<String, Object> map) {
        if (TextUtils.equals(str, TUIConstants.TUIGroup.EVENT_GROUP)) {
            if (!TextUtils.equals(str2, TUIConstants.TUIGroup.EVENT_SUB_KEY_EXIT_GROUP) && !TextUtils.equals(str2, TUIConstants.TUIGroup.EVENT_SUB_KEY_GROUP_DISMISS) && !TextUtils.equals(str2, TUIConstants.TUIGroup.EVENT_SUB_KEY_GROUP_RECYCLE)) {
                if (TextUtils.equals(str2, TUIConstants.TUIGroup.EVENT_SUB_KEY_GROUP_INFO_CHANGED)) {
                    if (map == null) {
                        return;
                    }
                    String str3 = (String) getOrDefault(map.get("groupName"), null);
                    String str4 = (String) getOrDefault(map.get("groupId"), "");
                    if (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) {
                        return;
                    }
                    for (GroupChatEventListener groupChatEventListener : getGroupChatEventListenerList()) {
                        groupChatEventListener.onGroupNameChanged(str4, str3);
                    }
                    return;
                } else if (!TextUtils.equals(str2, TUIConstants.TUIGroup.EVENT_SUB_KEY_MEMBER_KICKED_GROUP)) {
                    if (TextUtils.equals(str2, TUIConstants.TUIGroup.EVENT_SUB_KEY_CLEAR_MESSAGE)) {
                        String str5 = (String) getOrDefault(map.get("groupId"), "");
                        for (GroupChatEventListener groupChatEventListener2 : getGroupChatEventListenerList()) {
                            groupChatEventListener2.clearGroupMessage(str5);
                        }
                        return;
                    }
                    return;
                } else if (map == null) {
                    return;
                } else {
                    String str6 = (String) getOrDefault(map.get("groupId"), "");
                    ArrayList arrayList = (ArrayList) map.get(TUIConstants.TUIGroup.GROUP_MEMBER_ID_LIST);
                    if (TextUtils.isEmpty(str6) || arrayList == null || arrayList.isEmpty() || !arrayList.contains(TUILogin.getLoginUser())) {
                        return;
                    }
                    for (GroupChatEventListener groupChatEventListener3 : getGroupChatEventListenerList()) {
                        groupChatEventListener3.onGroupForceExit(str6);
                    }
                    return;
                }
            }
            List<GroupChatEventListener> groupChatEventListenerList = getGroupChatEventListenerList();
            String str7 = map != null ? (String) getOrDefault(map.get("groupId"), "") : null;
            for (GroupChatEventListener groupChatEventListener4 : groupChatEventListenerList) {
                groupChatEventListener4.onGroupForceExit(str7);
            }
        } else if (str.equals(TUIConstants.TUIContact.EVENT_USER)) {
            if (!str2.equals(TUIConstants.TUIContact.EVENT_SUB_KEY_CLEAR_MESSAGE) || map == null || map.isEmpty()) {
                return;
            }
            String str8 = (String) getOrDefault(map.get(TUIConstants.TUIContact.FRIEND_ID), "");
            for (C2CChatEventListener c2CChatEventListener : getC2CChatEventListenerList()) {
                c2CChatEventListener.clearC2CMessage(str8);
            }
        } else if (str.equals(TUIConstants.TUIContact.EVENT_FRIEND_INFO_CHANGED)) {
            if (!str2.equals(TUIConstants.TUIContact.EVENT_SUB_KEY_FRIEND_REMARK_CHANGED) || map == null || map.isEmpty()) {
                return;
            }
            String str9 = (String) map.get(TUIConstants.TUIContact.FRIEND_ID);
            String str10 = (String) map.get(TUIConstants.TUIContact.FRIEND_REMARK);
            for (C2CChatEventListener c2CChatEventListener2 : getC2CChatEventListenerList()) {
                c2CChatEventListener2.onFriendNameChanged(str9, str10);
            }
        } else if (str.equals(TUIConstants.TUIConversation.EVENT_UNREAD)) {
            if (str2.equals(TUIConstants.TUIConversation.EVENT_SUB_KEY_UNREAD_CHANGED)) {
                long longValue = ((Long) map.get(TUIConstants.TUIConversation.TOTAL_UNREAD_COUNT)).longValue();
                for (TotalUnreadCountListener totalUnreadCountListener : getUnreadCountListenerList()) {
                    totalUnreadCountListener.onTotalUnreadCountChanged(longValue);
                }
            }
        } else if (TextUtils.equals(str, TUIConstants.TUILogin.EVENT_LOGIN_STATE_CHANGED)) {
            if (TextUtils.equals(str2, TUIConstants.TUILogin.EVENT_SUB_KEY_USER_LOGIN_SUCCESS)) {
                FaceManager.loadEmojis();
                HashMap hashMap = new HashMap();
                hashMap.put(TUIConstants.TUICalling.PARAM_NAME_ENABLE_FLOAT_WINDOW, Boolean.valueOf(getChatConfig().getGeneralConfig().isEnableFloatWindowForCall()));
                TUICore.callService("TUICallingService", TUIConstants.TUICalling.METHOD_NAME_ENABLE_FLOAT_WINDOW, hashMap);
                HashMap hashMap2 = new HashMap();
                hashMap2.put(TUIConstants.TUICalling.PARAM_NAME_ENABLE_MULTI_DEVICE, Boolean.valueOf(getChatConfig().getGeneralConfig().isEnableMultiDeviceForCall()));
                TUICore.callService("TUICallingService", TUIConstants.TUICalling.METHOD_NAME_ENABLE_MULTI_DEVICE, hashMap2);
            }
        } else if (TextUtils.equals(str, TUIChatConstants.EVENT_KEY_MESSAGE_STATUS_CHANGED) && TextUtils.equals(str2, TUIChatConstants.EVENT_SUB_KEY_MESSAGE_SEND)) {
            Object obj = map.get("messageBean");
            if (obj instanceof TUIMessageBean) {
                for (GroupChatEventListener groupChatEventListener5 : getGroupChatEventListenerList()) {
                    groupChatEventListener5.onMessageChanged((TUIMessageBean) obj);
                }
                for (C2CChatEventListener c2CChatEventListener3 : getC2CChatEventListenerList()) {
                    c2CChatEventListener3.onMessageChanged((TUIMessageBean) obj);
                }
            }
        }
    }

    public void registerNetworkListener(NetworkConnectionListener networkConnectionListener) {
        if (networkConnectionListener == null) {
            return;
        }
        for (WeakReference<NetworkConnectionListener> weakReference : this.connectListenerList) {
            if (weakReference.get() == networkConnectionListener) {
                return;
            }
        }
        this.connectListenerList.add(new WeakReference<>(networkConnectionListener));
    }

    public void setMessageSender(IBaseMessageSender iBaseMessageSender) {
        this.messageSender = new WeakReference<>(iBaseMessageSender);
    }
}
