package com.tencent.imsdk.conversation;

import com.tencent.imsdk.BaseConstants;
import com.tencent.imsdk.common.IMCallback;
import com.tencent.imsdk.common.IMContext;
import com.tencent.imsdk.manager.BaseManager;
import com.tencent.imsdk.message.DraftMessage;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class ConversationManager {
    private static final String TAG = "ConversationManager";
    private ConversationListener mConversationListener;
    private ConversationListener mInternalConversationListener;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class ConversationManagerHolder {
        private static final ConversationManager conversationManager = new ConversationManager();

        private ConversationManagerHolder() {
        }
    }

    public static ConversationManager getInstance() {
        return ConversationManagerHolder.conversationManager;
    }

    private void initInternalConversationListener() {
        if (this.mInternalConversationListener == null) {
            this.mInternalConversationListener = new ConversationListener() { // from class: com.tencent.imsdk.conversation.ConversationManager.1
                @Override // com.tencent.imsdk.conversation.ConversationListener
                public void onConversationChanged(List<Conversation> list) {
                    IMContext.getInstance().runOnMainThread(new Runnable(this, list) { // from class: com.tencent.imsdk.conversation.ConversationManager.1.5
                        public final /* synthetic */ AnonymousClass1 this$1;
                        public final /* synthetic */ List val$conversationList;

                        @Override // java.lang.Runnable
                        public void run() {
                        }
                    });
                }

                @Override // com.tencent.imsdk.conversation.ConversationListener
                public void onConversationGroupCreated(String str, List<Conversation> list) {
                    IMContext.getInstance().runOnMainThread(new Runnable(this, str, list) { // from class: com.tencent.imsdk.conversation.ConversationManager.1.7
                        public final /* synthetic */ AnonymousClass1 this$1;
                        public final /* synthetic */ List val$conversationList;
                        public final /* synthetic */ String val$groupName;

                        @Override // java.lang.Runnable
                        public void run() {
                        }
                    });
                }

                @Override // com.tencent.imsdk.conversation.ConversationListener
                public void onConversationGroupDeleted(String str) {
                    IMContext.getInstance().runOnMainThread(new Runnable(this, str) { // from class: com.tencent.imsdk.conversation.ConversationManager.1.8
                        public final /* synthetic */ AnonymousClass1 this$1;
                        public final /* synthetic */ String val$groupName;

                        @Override // java.lang.Runnable
                        public void run() {
                        }
                    });
                }

                @Override // com.tencent.imsdk.conversation.ConversationListener
                public void onConversationGroupNameChanged(String str, String str2) {
                    IMContext.getInstance().runOnMainThread(new Runnable(this, str, str2) { // from class: com.tencent.imsdk.conversation.ConversationManager.1.9
                        public final /* synthetic */ AnonymousClass1 this$1;
                        public final /* synthetic */ String val$newName;
                        public final /* synthetic */ String val$oldName;

                        @Override // java.lang.Runnable
                        public void run() {
                        }
                    });
                }

                @Override // com.tencent.imsdk.conversation.ConversationListener
                public void onConversationsAddedToGroup(String str, List<Conversation> list) {
                    IMContext.getInstance().runOnMainThread(new Runnable(this, str, list) { // from class: com.tencent.imsdk.conversation.ConversationManager.1.10
                        public final /* synthetic */ AnonymousClass1 this$1;
                        public final /* synthetic */ List val$conversationList;
                        public final /* synthetic */ String val$groupName;

                        @Override // java.lang.Runnable
                        public void run() {
                        }
                    });
                }

                @Override // com.tencent.imsdk.conversation.ConversationListener
                public void onConversationsDeletedFromGroup(String str, List<Conversation> list) {
                    IMContext.getInstance().runOnMainThread(new Runnable(this, str, list) { // from class: com.tencent.imsdk.conversation.ConversationManager.1.11
                        public final /* synthetic */ AnonymousClass1 this$1;
                        public final /* synthetic */ List val$conversationList;
                        public final /* synthetic */ String val$groupName;

                        @Override // java.lang.Runnable
                        public void run() {
                        }
                    });
                }

                @Override // com.tencent.imsdk.conversation.ConversationListener
                public void onNewConversation(List<Conversation> list) {
                    IMContext.getInstance().runOnMainThread(new Runnable(this, list) { // from class: com.tencent.imsdk.conversation.ConversationManager.1.4
                        public final /* synthetic */ AnonymousClass1 this$1;
                        public final /* synthetic */ List val$conversationList;

                        @Override // java.lang.Runnable
                        public void run() {
                        }
                    });
                }

                @Override // com.tencent.imsdk.conversation.ConversationListener
                public void onSyncServerFailed() {
                    IMContext.getInstance().runOnMainThread(new Runnable(this) { // from class: com.tencent.imsdk.conversation.ConversationManager.1.3
                        public final /* synthetic */ AnonymousClass1 this$1;

                        @Override // java.lang.Runnable
                        public void run() {
                        }
                    });
                }

                @Override // com.tencent.imsdk.conversation.ConversationListener
                public void onSyncServerFinish() {
                    IMContext.getInstance().runOnMainThread(new Runnable(this) { // from class: com.tencent.imsdk.conversation.ConversationManager.1.2
                        public final /* synthetic */ AnonymousClass1 this$1;

                        @Override // java.lang.Runnable
                        public void run() {
                        }
                    });
                }

                @Override // com.tencent.imsdk.conversation.ConversationListener
                public void onSyncServerStart() {
                    IMContext.getInstance().runOnMainThread(new Runnable(this) { // from class: com.tencent.imsdk.conversation.ConversationManager.1.1
                        public final /* synthetic */ AnonymousClass1 this$1;

                        @Override // java.lang.Runnable
                        public void run() {
                        }
                    });
                }

                @Override // com.tencent.imsdk.conversation.ConversationListener
                public void onTotalUnreadMessageCountChanged(long j2) {
                    IMContext.getInstance().runOnMainThread(new Runnable(this, j2) { // from class: com.tencent.imsdk.conversation.ConversationManager.1.6
                        public final /* synthetic */ AnonymousClass1 this$1;
                        public final /* synthetic */ long val$totalUnreadCount;

                        @Override // java.lang.Runnable
                        public void run() {
                        }
                    });
                }
            };
        }
        nativeSetConversationListener(this.mInternalConversationListener);
    }

    public void addConversationsToGroup(String str, List<ConversationKey> list, IMCallback iMCallback) {
        if (BaseManager.getInstance().isInited()) {
            nativeAddConversationsToGroup(str, list, iMCallback);
        } else if (iMCallback != null) {
            iMCallback.fail(BaseConstants.ERR_SDK_NOT_INITIALIZED, "sdk not init");
        }
    }

    public void clearUnreadMessage(boolean z, boolean z2, IMCallback iMCallback) {
        if (BaseManager.getInstance().isInited()) {
            nativeClearUnreadMessage(z, z2, iMCallback);
        } else if (iMCallback != null) {
            iMCallback.fail(BaseConstants.ERR_SDK_NOT_INITIALIZED, "sdk not init");
        }
    }

    public void createConversationGroup(String str, List<ConversationKey> list, IMCallback iMCallback) {
        if (BaseManager.getInstance().isInited()) {
            nativeCreateConversationGroup(str, list, iMCallback);
        } else if (iMCallback != null) {
            iMCallback.fail(BaseConstants.ERR_SDK_NOT_INITIALIZED, "sdk not init");
        }
    }

    public void deleteConversation(ConversationKey conversationKey, boolean z, IMCallback iMCallback) {
        if (BaseManager.getInstance().isInited()) {
            nativeDeleteConversation(conversationKey, z, iMCallback);
        } else if (iMCallback != null) {
            iMCallback.fail(BaseConstants.ERR_SDK_NOT_INITIALIZED, "sdk not init");
        }
    }

    public void deleteConversationGroup(String str, IMCallback iMCallback) {
        if (BaseManager.getInstance().isInited()) {
            nativeDeleteConversationGroup(str, iMCallback);
        } else if (iMCallback != null) {
            iMCallback.fail(BaseConstants.ERR_SDK_NOT_INITIALIZED, "sdk not init");
        }
    }

    public void deleteConversationsFromGroup(String str, List<ConversationKey> list, IMCallback iMCallback) {
        if (BaseManager.getInstance().isInited()) {
            nativeDeleteConversationsFromGroup(str, list, iMCallback);
        } else if (iMCallback != null) {
            iMCallback.fail(BaseConstants.ERR_SDK_NOT_INITIALIZED, "sdk not init");
        }
    }

    public void getConversationGroupList(IMCallback iMCallback) {
        if (BaseManager.getInstance().isInited()) {
            nativeGetConversationGroupList(iMCallback);
        } else if (iMCallback != null) {
            iMCallback.fail(BaseConstants.ERR_SDK_NOT_INITIALIZED, "sdk not init");
        }
    }

    public void getConversationInfo(ConversationKey conversationKey, IMCallback<Conversation> iMCallback) {
        if (BaseManager.getInstance().isInited()) {
            nativeGetConversationInfo(conversationKey, iMCallback);
        } else if (iMCallback != null) {
            iMCallback.fail(BaseConstants.ERR_SDK_NOT_INITIALIZED, "sdk not init");
        }
    }

    public void getConversationList(long j2, int i2, IMCallback<ConversationResult> iMCallback) {
        if (BaseManager.getInstance().isInited()) {
            nativeGetConversationList(j2, i2, iMCallback);
        } else if (iMCallback != null) {
            iMCallback.fail(BaseConstants.ERR_SDK_NOT_INITIALIZED, "sdk not init");
        }
    }

    public void getConversationListByFilter(ConversationListFilter conversationListFilter, IMCallback<ConversationResult> iMCallback) {
        if (BaseManager.getInstance().isInited()) {
            nativeGetConversationListByFilter(conversationListFilter, iMCallback);
        } else if (iMCallback != null) {
            iMCallback.fail(BaseConstants.ERR_SDK_NOT_INITIALIZED, "sdk not init");
        }
    }

    public void getTotalUnreadMessageCount(IMCallback<Long> iMCallback) {
        if (BaseManager.getInstance().isInited()) {
            nativeGetTotalUnreadMessageCount(iMCallback);
        } else if (iMCallback != null) {
            iMCallback.fail(BaseConstants.ERR_SDK_NOT_INITIALIZED, "sdk not init");
        }
    }

    public void init() {
        initInternalConversationListener();
    }

    public void markConversation(List<ConversationKey> list, long j2, boolean z, IMCallback iMCallback) {
        if (BaseManager.getInstance().isInited()) {
            nativeMarkConversation(list, j2, z, iMCallback);
        } else if (iMCallback != null) {
            iMCallback.fail(BaseConstants.ERR_SDK_NOT_INITIALIZED, "sdk not init");
        }
    }

    public native void nativeAddConversationsToGroup(String str, List<ConversationKey> list, IMCallback iMCallback);

    public native void nativeClearUnreadMessage(boolean z, boolean z2, IMCallback iMCallback);

    public native void nativeCreateConversationGroup(String str, List<ConversationKey> list, IMCallback iMCallback);

    public native void nativeDeleteConversation(ConversationKey conversationKey, boolean z, IMCallback iMCallback);

    public native void nativeDeleteConversationGroup(String str, IMCallback iMCallback);

    public native void nativeDeleteConversationsFromGroup(String str, List<ConversationKey> list, IMCallback iMCallback);

    public native void nativeGetConversationGroupList(IMCallback iMCallback);

    public native void nativeGetConversationInfo(ConversationKey conversationKey, IMCallback iMCallback);

    public native void nativeGetConversationList(long j2, int i2, IMCallback iMCallback);

    public native void nativeGetConversationListByFilter(ConversationListFilter conversationListFilter, IMCallback iMCallback);

    public native void nativeGetConversations(List<ConversationKey> list, IMCallback iMCallback);

    public native void nativeGetTotalUnreadMessageCount(IMCallback iMCallback);

    public native void nativeMarkConversation(List<ConversationKey> list, long j2, boolean z, IMCallback iMCallback);

    public native void nativePinConversation(ConversationKey conversationKey, boolean z, IMCallback iMCallback);

    public native void nativeRenameConversationGroup(String str, String str2, IMCallback iMCallback);

    public native void nativeSetConversationCustomData(List<ConversationKey> list, String str, IMCallback iMCallback);

    public native void nativeSetConversationDraft(ConversationKey conversationKey, DraftMessage draftMessage, IMCallback iMCallback);

    public native void nativeSetConversationListener(ConversationListener conversationListener);

    public native void nativeSetCosSaveRegionForConversation(ConversationKey conversationKey, String str, IMCallback iMCallback);

    public void pinConversation(ConversationKey conversationKey, boolean z, IMCallback iMCallback) {
        if (BaseManager.getInstance().isInited()) {
            nativePinConversation(conversationKey, z, iMCallback);
        } else if (iMCallback != null) {
            iMCallback.fail(BaseConstants.ERR_SDK_NOT_INITIALIZED, "sdk not init");
        }
    }

    public void renameConversationGroup(String str, String str2, IMCallback iMCallback) {
        if (BaseManager.getInstance().isInited()) {
            nativeRenameConversationGroup(str, str2, iMCallback);
        } else if (iMCallback != null) {
            iMCallback.fail(BaseConstants.ERR_SDK_NOT_INITIALIZED, "sdk not init");
        }
    }

    public void setConversationCustomData(List<ConversationKey> list, String str, IMCallback iMCallback) {
        if (BaseManager.getInstance().isInited()) {
            nativeSetConversationCustomData(list, str, iMCallback);
        } else if (iMCallback != null) {
            iMCallback.fail(BaseConstants.ERR_SDK_NOT_INITIALIZED, "sdk not init");
        }
    }

    public void setConversationDraft(ConversationKey conversationKey, DraftMessage draftMessage, IMCallback iMCallback) {
        if (BaseManager.getInstance().isInited()) {
            nativeSetConversationDraft(conversationKey, draftMessage, iMCallback);
        } else if (iMCallback != null) {
            iMCallback.fail(BaseConstants.ERR_SDK_NOT_INITIALIZED, "sdk not init");
        }
    }

    public void setConversationListener(ConversationListener conversationListener) {
        this.mConversationListener = conversationListener;
    }

    public void setCosSaveRegionForConversation(ConversationKey conversationKey, String str, IMCallback iMCallback) {
        if (BaseManager.getInstance().isInited()) {
            nativeSetCosSaveRegionForConversation(conversationKey, str, iMCallback);
        } else if (iMCallback != null) {
            iMCallback.fail(BaseConstants.ERR_SDK_NOT_INITIALIZED, "sdk not init");
        }
    }

    public void getConversationList(List<ConversationKey> list, IMCallback<List<Conversation>> iMCallback) {
        if (BaseManager.getInstance().isInited()) {
            nativeGetConversations(list, iMCallback);
        } else if (iMCallback != null) {
            iMCallback.fail(BaseConstants.ERR_SDK_NOT_INITIALIZED, "sdk not init");
        }
    }
}
