package com.tencent.imsdk.message;

import com.tencent.imsdk.BaseConstants;
import com.tencent.imsdk.common.IMCallback;
import com.tencent.imsdk.common.IMContext;
import com.tencent.imsdk.common.IMLog;
import com.tencent.imsdk.manager.BaseManager;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class MessageCenter {
    private static final String TAG = "MessageCenter";
    private MessageListener mMessageListener;
    private Object mLockObject = new Object();
    private CopyOnWriteArrayList<MessageListener> mMessageProxyListenerList = new CopyOnWriteArrayList<>();

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class MessageCenterHolder {
        private static final MessageCenter messageCenter = new MessageCenter();

        private MessageCenterHolder() {
        }
    }

    public static MessageCenter getInstance() {
        return MessageCenterHolder.messageCenter;
    }

    private void initMessageListener() {
        MessageListener messageListener = new MessageListener() { // from class: com.tencent.imsdk.message.MessageCenter.1
            @Override // com.tencent.imsdk.message.MessageListener
            public void onReceiveC2CMessageReceipt(List<C2CMessageReceipt> list) {
                IMContext.getInstance().runOnMainThread(new Runnable(this, list) { // from class: com.tencent.imsdk.message.MessageCenter.1.2
                    public final /* synthetic */ AnonymousClass1 this$1;
                    public final /* synthetic */ List val$receiptList;

                    @Override // java.lang.Runnable
                    public void run() {
                    }
                });
            }

            @Override // com.tencent.imsdk.message.MessageListener
            public void onReceiveGroupMessageReceipt(List<GroupMessageReceipt> list) {
                IMContext.getInstance().runOnMainThread(new Runnable(this, list) { // from class: com.tencent.imsdk.message.MessageCenter.1.3
                    public final /* synthetic */ AnonymousClass1 this$1;
                    public final /* synthetic */ List val$receiptList;

                    @Override // java.lang.Runnable
                    public void run() {
                    }
                });
            }

            @Override // com.tencent.imsdk.message.MessageListener
            public void onReceiveMessageExtensionsChanged(MessageKey messageKey, List<MessageExtension> list) {
                IMContext.getInstance().runOnMainThread(new Runnable(this, messageKey, list) { // from class: com.tencent.imsdk.message.MessageCenter.1.6
                    public final /* synthetic */ AnonymousClass1 this$1;
                    public final /* synthetic */ List val$extensions;
                    public final /* synthetic */ MessageKey val$messageKey;

                    @Override // java.lang.Runnable
                    public void run() {
                    }
                });
            }

            @Override // com.tencent.imsdk.message.MessageListener
            public void onReceiveMessageExtensionsDeleted(MessageKey messageKey, List<MessageExtension> list) {
                IMContext.getInstance().runOnMainThread(new Runnable(this, messageKey, list) { // from class: com.tencent.imsdk.message.MessageCenter.1.7
                    public final /* synthetic */ AnonymousClass1 this$1;
                    public final /* synthetic */ List val$extensions;
                    public final /* synthetic */ MessageKey val$messageKey;

                    @Override // java.lang.Runnable
                    public void run() {
                    }
                });
            }

            @Override // com.tencent.imsdk.message.MessageListener
            public void onReceiveMessageModified(List<Message> list) {
                IMContext.getInstance().runOnMainThread(new Runnable(this, list) { // from class: com.tencent.imsdk.message.MessageCenter.1.5
                    public final /* synthetic */ AnonymousClass1 this$1;
                    public final /* synthetic */ List val$messageList;

                    @Override // java.lang.Runnable
                    public void run() {
                    }
                });
            }

            @Override // com.tencent.imsdk.message.MessageListener
            public void onReceiveMessageRevoked(List<MessageKey> list) {
                IMContext.getInstance().runOnMainThread(new Runnable(this, list) { // from class: com.tencent.imsdk.message.MessageCenter.1.4
                    public final /* synthetic */ AnonymousClass1 this$1;
                    public final /* synthetic */ List val$keyList;

                    @Override // java.lang.Runnable
                    public void run() {
                    }
                });
            }

            @Override // com.tencent.imsdk.message.MessageListener
            public void onReceiveNewMessage(List<Message> list) {
                IMContext.getInstance().runOnMainThread(new Runnable(this, list) { // from class: com.tencent.imsdk.message.MessageCenter.1.1
                    public final /* synthetic */ AnonymousClass1 this$1;
                    public final /* synthetic */ List val$messageList;

                    @Override // java.lang.Runnable
                    public void run() {
                    }
                });
            }
        };
        this.mMessageListener = messageListener;
        nativeSetMessageListener(messageListener);
    }

    public void addMessageListener(MessageListener messageListener) {
        synchronized (this.mLockObject) {
            this.mMessageProxyListenerList.add(messageListener);
        }
    }

    public void clearC2CHistoryMessage(String str, IMCallback iMCallback) {
        if (BaseManager.getInstance().isInited()) {
            nativeClearC2CHistoryMessage(str, iMCallback);
        } else if (iMCallback != null) {
            iMCallback.fail(BaseConstants.ERR_SDK_NOT_INITIALIZED, "sdk not init");
        }
    }

    public void clearC2CLocalMessage(String str, IMCallback iMCallback) {
        if (BaseManager.getInstance().isInited()) {
            nativeClearC2CLocalMessage(str, iMCallback);
        } else if (iMCallback != null) {
            iMCallback.fail(BaseConstants.ERR_SDK_NOT_INITIALIZED, "sdk not init");
        }
    }

    public void clearGroupHistoryMessage(String str, IMCallback iMCallback) {
        if (BaseManager.getInstance().isInited()) {
            nativeClearGroupHistoryMessage(str, iMCallback);
        } else if (iMCallback != null) {
            iMCallback.fail(BaseConstants.ERR_SDK_NOT_INITIALIZED, "sdk not init");
        }
    }

    public void clearGroupLocalMessage(String str, IMCallback iMCallback) {
        if (BaseManager.getInstance().isInited()) {
            nativeClearGroupLocalMessage(str, iMCallback);
        } else if (iMCallback != null) {
            iMCallback.fail(BaseConstants.ERR_SDK_NOT_INITIALIZED, "sdk not init");
        }
    }

    public void deleteCloudMessageList(List<MessageKey> list, IMCallback iMCallback) {
        if (BaseManager.getInstance().isInited()) {
            nativeDeleteCloudMessageList(list, iMCallback);
        } else if (iMCallback != null) {
            iMCallback.fail(BaseConstants.ERR_SDK_NOT_INITIALIZED, "sdk not init");
        }
    }

    public void deleteLocalMessage(MessageKey messageKey, IMCallback iMCallback) {
        if (BaseManager.getInstance().isInited()) {
            nativeDeleteLocalMessage(messageKey, iMCallback);
        } else if (iMCallback != null) {
            iMCallback.fail(BaseConstants.ERR_SDK_NOT_INITIALIZED, "sdk not init");
        }
    }

    public void deleteMessageExtensions(Message message, List<String> list, IMCallback iMCallback) {
        if (BaseManager.getInstance().isInited()) {
            nativeDeleteMessageExtensions(message, list, iMCallback);
        } else if (iMCallback != null) {
            iMCallback.fail(BaseConstants.ERR_SDK_NOT_INITIALIZED, "sdk not init");
        }
    }

    public void downloadMessageElement(DownloadParam downloadParam, IMCallback<DownloadProgressInfo> iMCallback, IMCallback iMCallback2) {
        if (BaseManager.getInstance().isInited()) {
            nativeDownloadMessageElement(downloadParam, iMCallback, iMCallback2);
        } else if (iMCallback2 != null) {
            iMCallback2.fail(BaseConstants.ERR_SDK_NOT_INITIALIZED, "sdk not init");
        }
    }

    public void downloadRelayMessageList(Message message, IMCallback iMCallback) {
        if (BaseManager.getInstance().isInited()) {
            nativeDownloadRelayMessageList(message, iMCallback);
        } else if (iMCallback != null) {
            iMCallback.fail(BaseConstants.ERR_SDK_NOT_INITIALIZED, "sdk not init");
        }
    }

    public void findMessageByMessageId(List<String> list, IMCallback iMCallback) {
        if (BaseManager.getInstance().isInited()) {
            nativeFindMessageByMessageID(list, iMCallback);
        } else if (iMCallback != null) {
            iMCallback.fail(BaseConstants.ERR_SDK_NOT_INITIALIZED, "sdk not init");
        }
    }

    public void findMessageBySearchKey(MessageSearchParam messageSearchParam, IMCallback iMCallback) {
        if (BaseManager.getInstance().isInited()) {
            nativeFindMessageBySearchKey(messageSearchParam, iMCallback);
        } else if (iMCallback != null) {
            iMCallback.fail(BaseConstants.ERR_SDK_NOT_INITIALIZED, "sdk not init");
        }
    }

    public void getC2CHistoryMessageList(String str, MessageListGetOption messageListGetOption, IMCallback iMCallback) {
        if (BaseManager.getInstance().isInited()) {
            nativeGetC2CHistoryMessageList(str, messageListGetOption, iMCallback);
        } else if (iMCallback != null) {
            iMCallback.fail(BaseConstants.ERR_SDK_NOT_INITIALIZED, "sdk not init");
        }
    }

    public void getDownloadUrl(DownloadParam downloadParam, IMCallback iMCallback) {
        if (BaseManager.getInstance().isInited()) {
            nativeGetDownloadUrl(downloadParam, iMCallback);
        } else if (iMCallback != null) {
            iMCallback.fail(BaseConstants.ERR_SDK_NOT_INITIALIZED, "sdk not init");
        }
    }

    public void getGroupHistoryMessageList(String str, MessageListGetOption messageListGetOption, IMCallback iMCallback) {
        if (BaseManager.getInstance().isInited()) {
            nativeGetGroupHistoryMessageList(str, messageListGetOption, iMCallback);
        } else if (iMCallback != null) {
            iMCallback.fail(BaseConstants.ERR_SDK_NOT_INITIALIZED, "sdk not init");
        }
    }

    public void getGroupMessageReadMembers(Message message, int i2, long j2, int i3, IMCallback iMCallback) {
        if (BaseManager.getInstance().isInited()) {
            nativeGetGroupMessageReadMembers(message, i2, j2, i3, iMCallback);
        } else if (iMCallback != null) {
            iMCallback.fail(BaseConstants.ERR_SDK_NOT_INITIALIZED, "sdk not init");
        }
    }

    public void getGroupMessageReceipts(List<MessageKey> list, IMCallback iMCallback) {
        if (BaseManager.getInstance().isInited()) {
            nativeGetGroupMessageReceipts(list, iMCallback);
        } else if (iMCallback != null) {
            iMCallback.fail(BaseConstants.ERR_SDK_NOT_INITIALIZED, "sdk not init");
        }
    }

    public void getMessageExtensions(Message message, IMCallback iMCallback) {
        if (BaseManager.getInstance().isInited()) {
            nativeGetMessageExtensions(message, iMCallback);
        } else if (iMCallback != null) {
            iMCallback.fail(BaseConstants.ERR_SDK_NOT_INITIALIZED, "sdk not init");
        }
    }

    public void init() {
        initMessageListener();
    }

    public String insertLocalMessage(Message message, IMCallback iMCallback) {
        if (BaseManager.getInstance().isInited()) {
            return nativeInsertLocalMessage(message, iMCallback);
        }
        if (iMCallback != null) {
            iMCallback.fail(BaseConstants.ERR_SDK_NOT_INITIALIZED, "sdk not init");
            return null;
        }
        return null;
    }

    public boolean isMessagePeerRead(MessageKey messageKey) {
        if (!BaseManager.getInstance().isInited()) {
            IMLog.e(TAG, "sdk not ini");
            return false;
        }
        return nativeIsMessagePeerRead(messageKey);
    }

    public boolean isMessageSelfRead(MessageKey messageKey) {
        if (!BaseManager.getInstance().isInited()) {
            IMLog.e(TAG, "sdk not ini");
            return false;
        }
        return nativeIsMessageSelfRead(messageKey);
    }

    public void modifyMessage(Message message, IMCallback iMCallback) {
        if (BaseManager.getInstance().isInited()) {
            nativeModifyMessage(message, iMCallback);
        } else if (iMCallback != null) {
            iMCallback.fail(BaseConstants.ERR_SDK_NOT_INITIALIZED, "sdk not init");
        }
    }

    public native void nativeClearC2CHistoryMessage(String str, IMCallback iMCallback);

    public native void nativeClearC2CLocalMessage(String str, IMCallback iMCallback);

    public native void nativeClearGroupHistoryMessage(String str, IMCallback iMCallback);

    public native void nativeClearGroupLocalMessage(String str, IMCallback iMCallback);

    public native void nativeDeleteCloudMessageList(List<MessageKey> list, IMCallback iMCallback);

    public native void nativeDeleteLocalMessage(MessageKey messageKey, IMCallback iMCallback);

    public native void nativeDeleteMessageExtensions(Message message, List<String> list, IMCallback iMCallback);

    public native void nativeDownloadMessageElement(DownloadParam downloadParam, IMCallback iMCallback, IMCallback iMCallback2);

    public native void nativeDownloadRelayMessageList(Message message, IMCallback iMCallback);

    public native void nativeFindMessageByMessageID(List<String> list, IMCallback iMCallback);

    public native void nativeFindMessageBySearchKey(MessageSearchParam messageSearchParam, IMCallback iMCallback);

    public native void nativeGetC2CHistoryMessageList(String str, MessageListGetOption messageListGetOption, IMCallback iMCallback);

    public native void nativeGetDownloadUrl(DownloadParam downloadParam, IMCallback iMCallback);

    public native void nativeGetGroupHistoryMessageList(String str, MessageListGetOption messageListGetOption, IMCallback iMCallback);

    public native void nativeGetGroupMessageReadMembers(Message message, int i2, long j2, int i3, IMCallback iMCallback);

    public native void nativeGetGroupMessageReceipts(List<MessageKey> list, IMCallback iMCallback);

    public native void nativeGetMessageExtensions(Message message, IMCallback iMCallback);

    public native String nativeInsertLocalMessage(Message message, IMCallback iMCallback);

    public native boolean nativeIsMessagePeerRead(MessageKey messageKey);

    public native boolean nativeIsMessageSelfRead(MessageKey messageKey);

    public native void nativeModifyMessage(Message message, IMCallback iMCallback);

    public native void nativeRevokeMessage(MessageKey messageKey, IMCallback iMCallback);

    public native String nativeSendMessage(Message message, MessageUploadProgressCallback messageUploadProgressCallback, IMCallback iMCallback);

    public native void nativeSendMessageReceipts(List<MessageKey> list, IMCallback iMCallback);

    public native void nativeSetC2CMessageRead(String str, long j2, IMCallback iMCallback);

    public native void nativeSetGroupMessageRead(String str, long j2, IMCallback iMCallback);

    public native void nativeSetLocalCustomNumber(Message message, int i2);

    public native void nativeSetLocalCustomString(Message message, String str);

    public native void nativeSetMessageExtensions(Message message, List<MessageExtension> list, IMCallback iMCallback);

    public native void nativeSetMessageListener(MessageListener messageListener);

    public void revokeMessage(MessageKey messageKey, IMCallback iMCallback) {
        if (BaseManager.getInstance().isInited()) {
            nativeRevokeMessage(messageKey, iMCallback);
        } else if (iMCallback != null) {
            iMCallback.fail(BaseConstants.ERR_SDK_NOT_INITIALIZED, "sdk not init");
        }
    }

    public String sendMessage(Message message, MessageUploadProgressCallback messageUploadProgressCallback, IMCallback iMCallback) {
        if (BaseManager.getInstance().isInited()) {
            return nativeSendMessage(message, messageUploadProgressCallback, iMCallback);
        }
        if (iMCallback != null) {
            iMCallback.fail(BaseConstants.ERR_SDK_NOT_INITIALIZED, "sdk not init");
            return null;
        }
        return null;
    }

    public void sendMessageReceipts(List<MessageKey> list, IMCallback iMCallback) {
        if (BaseManager.getInstance().isInited()) {
            nativeSendMessageReceipts(list, iMCallback);
        } else if (iMCallback != null) {
            iMCallback.fail(BaseConstants.ERR_SDK_NOT_INITIALIZED, "sdk not init");
        }
    }

    public void setC2CMessageRead(String str, long j2, IMCallback iMCallback) {
        if (BaseManager.getInstance().isInited()) {
            nativeSetC2CMessageRead(str, j2, iMCallback);
        } else if (iMCallback != null) {
            iMCallback.fail(BaseConstants.ERR_SDK_NOT_INITIALIZED, "sdk not init");
        }
    }

    public void setGroupMessageRead(String str, long j2, IMCallback iMCallback) {
        if (BaseManager.getInstance().isInited()) {
            nativeSetGroupMessageRead(str, j2, iMCallback);
        } else if (iMCallback != null) {
            iMCallback.fail(BaseConstants.ERR_SDK_NOT_INITIALIZED, "sdk not init");
        }
    }

    public void setLocalCustomNumber(Message message, int i2) {
        nativeSetLocalCustomNumber(message, i2);
    }

    public void setLocalCustomString(Message message, String str) {
        nativeSetLocalCustomString(message, str);
    }

    public void setMessageExtensions(Message message, List<MessageExtension> list, IMCallback iMCallback) {
        if (BaseManager.getInstance().isInited()) {
            nativeSetMessageExtensions(message, list, iMCallback);
        } else if (iMCallback != null) {
            iMCallback.fail(BaseConstants.ERR_SDK_NOT_INITIALIZED, "sdk not init");
        }
    }
}
