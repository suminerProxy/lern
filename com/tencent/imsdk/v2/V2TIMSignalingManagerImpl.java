package com.tencent.imsdk.v2;

import android.text.TextUtils;
import com.tencent.imsdk.BaseConstants;
import com.tencent.imsdk.common.IMCallback;
import com.tencent.imsdk.common.IMLog;
import com.tencent.imsdk.manager.BaseManager;
import com.tencent.imsdk.signaling.SignalingInfo;
import com.tencent.imsdk.signaling.SignalingListener;
import com.tencent.imsdk.signaling.SignalingManager;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class V2TIMSignalingManagerImpl extends V2TIMSignalingManager {
    private final String TAG;
    private boolean mHasValidSignalingListener;
    private SignalingListener mInternalSignalingListener;
    private CopyOnWriteArrayList<V2TIMSignalingListener> mSignalingListenerList;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class V2TIMSignalingManagerImplHolder {
        private static final V2TIMSignalingManagerImpl v2TIMSignalingManagerImpl = null;

        private V2TIMSignalingManagerImplHolder() {
        }

        public static /* synthetic */ V2TIMSignalingManagerImpl access$100() {
        }
    }

    private void checkSignalingListener() {
        BaseManager.getInstance().enableSignaling(this.mHasValidSignalingListener);
    }

    public static V2TIMSignalingManagerImpl getInstance() {
        return V2TIMSignalingManagerImplHolder.access$100();
    }

    private void initSignalingListener() {
        if (this.mInternalSignalingListener == null) {
            this.mInternalSignalingListener = new SignalingListener(this) { // from class: com.tencent.imsdk.v2.V2TIMSignalingManagerImpl.1
                public final /* synthetic */ V2TIMSignalingManagerImpl this$0;

                @Override // com.tencent.imsdk.signaling.SignalingListener
                public void onInvitationCancelled(String str, String str2, String str3) {
                }

                @Override // com.tencent.imsdk.signaling.SignalingListener
                public void onInvitationModified(String str, String str2) {
                }

                @Override // com.tencent.imsdk.signaling.SignalingListener
                public void onInvitationTimeout(String str, List<String> list) {
                }

                @Override // com.tencent.imsdk.signaling.SignalingListener
                public void onInviteeAccepted(String str, String str2, String str3) {
                }

                @Override // com.tencent.imsdk.signaling.SignalingListener
                public void onInviteeRejected(String str, String str2, String str3) {
                }

                @Override // com.tencent.imsdk.signaling.SignalingListener
                public void onReceiveNewInvitation(String str, String str2, String str3, List<String> list, String str4) {
                }
            };
        }
        SignalingManager.getInstance().setSignalingListener(this.mInternalSignalingListener);
    }

    @Override // com.tencent.imsdk.v2.V2TIMSignalingManager
    public void accept(String str, String str2, V2TIMCallback v2TIMCallback) {
        if (TextUtils.isEmpty(str)) {
            IMLog.e("V2TIMSigMgrImpl", "signaling accept failed, inviteID is empty");
            if (v2TIMCallback != null) {
                v2TIMCallback.onError(BaseConstants.ERR_INVALID_PARAMETERS, "inviteID is null");
                return;
            }
            return;
        }
        SignalingManager.getInstance().accept(str, str2, new IMCallback(this, v2TIMCallback) { // from class: com.tencent.imsdk.v2.V2TIMSignalingManagerImpl.5
            public final /* synthetic */ V2TIMSignalingManagerImpl this$0;

            @Override // com.tencent.imsdk.common.IMCallback
            public void fail(int i2, String str3) {
            }

            @Override // com.tencent.imsdk.common.IMCallback
            public void success(Object obj) {
            }
        });
    }

    @Override // com.tencent.imsdk.v2.V2TIMSignalingManager
    public void addInvitedSignaling(V2TIMSignalingInfo v2TIMSignalingInfo, V2TIMCallback v2TIMCallback) {
        if (v2TIMSignalingInfo != null && !TextUtils.isEmpty(v2TIMSignalingInfo.getInviteID()) && !TextUtils.isEmpty(v2TIMSignalingInfo.getInviter()) && v2TIMSignalingInfo.getInviteeList() != null && !v2TIMSignalingInfo.getInviteeList().isEmpty()) {
            SignalingManager.getInstance().addInvitedSignaling(v2TIMSignalingInfo.getSignalingInfo(), new IMCallback(this, v2TIMCallback) { // from class: com.tencent.imsdk.v2.V2TIMSignalingManagerImpl.7
                public final /* synthetic */ V2TIMSignalingManagerImpl this$0;

                @Override // com.tencent.imsdk.common.IMCallback
                public void fail(int i2, String str) {
                }

                @Override // com.tencent.imsdk.common.IMCallback
                public void success(Object obj) {
                }
            });
            return;
        }
        IMLog.e("V2TIMSigMgrImpl", "addInvitedSignaling, info is invalid");
        if (v2TIMCallback != null) {
            v2TIMCallback.onError(BaseConstants.ERR_INVALID_PARAMETERS, "V2TIMSignalingInfo is invalid");
        }
    }

    @Override // com.tencent.imsdk.v2.V2TIMSignalingManager
    public void addSignalingListener(V2TIMSignalingListener v2TIMSignalingListener) {
        synchronized (this) {
            if (this.mSignalingListenerList.contains(v2TIMSignalingListener)) {
                return;
            }
            this.mSignalingListenerList.add(v2TIMSignalingListener);
            this.mHasValidSignalingListener = true;
            checkSignalingListener();
        }
    }

    @Override // com.tencent.imsdk.v2.V2TIMSignalingManager
    public void cancel(String str, String str2, V2TIMCallback v2TIMCallback) {
        if (!TextUtils.isEmpty(str)) {
            SignalingManager.getInstance().cancel(str, str2, new IMCallback(this, v2TIMCallback) { // from class: com.tencent.imsdk.v2.V2TIMSignalingManagerImpl.4
                public final /* synthetic */ V2TIMSignalingManagerImpl this$0;

                @Override // com.tencent.imsdk.common.IMCallback
                public void fail(int i2, String str3) {
                }

                @Override // com.tencent.imsdk.common.IMCallback
                public void success(Object obj) {
                }
            });
        } else if (v2TIMCallback != null) {
            IMLog.e("V2TIMSigMgrImpl", "signaling cancel error, inviteID is empty");
            v2TIMCallback.onError(BaseConstants.ERR_INVALID_PARAMETERS, "inviteID is empty");
        }
    }

    @Override // com.tencent.imsdk.v2.V2TIMSignalingManager
    public V2TIMSignalingInfo getSignalingInfo(V2TIMMessage v2TIMMessage) {
        if (v2TIMMessage == null || v2TIMMessage.getElemType() != 2) {
            return null;
        }
        SignalingInfo signalingInfo = SignalingManager.getInstance().getSignalingInfo(v2TIMMessage.getMessage());
        V2TIMSignalingInfo v2TIMSignalingInfo = new V2TIMSignalingInfo();
        v2TIMSignalingInfo.setSignalingInfo(signalingInfo);
        return v2TIMSignalingInfo;
    }

    @Override // com.tencent.imsdk.v2.V2TIMSignalingManager
    public String invite(String str, String str2, boolean z, V2TIMOfflinePushInfo v2TIMOfflinePushInfo, int i2, V2TIMCallback v2TIMCallback) {
        if (TextUtils.isEmpty(str)) {
            if (v2TIMCallback != null) {
                v2TIMCallback.onError(BaseConstants.ERR_INVALID_PARAMETERS, "invitee is empty");
            }
            IMLog.e("V2TIMSigMgrImpl", "signaling invite error, invitee is empty");
            return null;
        } else if (i2 >= 0) {
            return SignalingManager.getInstance().invite(str, str2, z, v2TIMOfflinePushInfo != null ? v2TIMOfflinePushInfo.getMessageOfflinePushInfo() : null, i2, new IMCallback(this, v2TIMCallback) { // from class: com.tencent.imsdk.v2.V2TIMSignalingManagerImpl.2
                public final /* synthetic */ V2TIMSignalingManagerImpl this$0;

                @Override // com.tencent.imsdk.common.IMCallback
                public void fail(int i3, String str3) {
                }

                @Override // com.tencent.imsdk.common.IMCallback
                public void success(Object obj) {
                }
            });
        } else {
            if (v2TIMCallback != null) {
                IMLog.e("V2TIMSigMgrImpl", "signaling invite error, timeout invalid");
                v2TIMCallback.onError(BaseConstants.ERR_INVALID_PARAMETERS, "timeout invalid");
            }
            return null;
        }
    }

    @Override // com.tencent.imsdk.v2.V2TIMSignalingManager
    public String inviteInGroup(String str, List<String> list, String str2, boolean z, int i2, V2TIMCallback v2TIMCallback) {
        if (TextUtils.isEmpty(str)) {
            if (v2TIMCallback != null) {
                v2TIMCallback.onError(BaseConstants.ERR_INVALID_PARAMETERS, "groupID is empty");
            }
            IMLog.e("V2TIMSigMgrImpl", "signaling invite error, groupID is empty");
            return null;
        } else if (list == null || list.size() == 0) {
            if (v2TIMCallback != null) {
                IMLog.e("V2TIMSigMgrImpl", "signaling invite error, inviteeList is empty");
                v2TIMCallback.onError(BaseConstants.ERR_INVALID_PARAMETERS, "inviteeList is empty");
            }
            return null;
        } else if (i2 < 0) {
            if (v2TIMCallback != null) {
                IMLog.e("V2TIMSigMgrImpl", "signaling invite error, timeout invalid");
                v2TIMCallback.onError(BaseConstants.ERR_INVALID_PARAMETERS, "timeout invalid");
            }
            return null;
        } else {
            return SignalingManager.getInstance().inviteInGroup(str, list, str2, z, i2, new IMCallback(this, v2TIMCallback) { // from class: com.tencent.imsdk.v2.V2TIMSignalingManagerImpl.3
                public final /* synthetic */ V2TIMSignalingManagerImpl this$0;

                @Override // com.tencent.imsdk.common.IMCallback
                public void fail(int i3, String str3) {
                }

                @Override // com.tencent.imsdk.common.IMCallback
                public void success(Object obj) {
                }
            });
        }
    }

    @Override // com.tencent.imsdk.v2.V2TIMSignalingManager
    public void modifyInvitation(String str, String str2, V2TIMCallback v2TIMCallback) {
        if (!TextUtils.isEmpty(str)) {
            SignalingManager.getInstance().modifyInvitation(str, str2, new IMCallback(this, v2TIMCallback) { // from class: com.tencent.imsdk.v2.V2TIMSignalingManagerImpl.8
                public final /* synthetic */ V2TIMSignalingManagerImpl this$0;

                @Override // com.tencent.imsdk.common.IMCallback
                public void fail(int i2, String str3) {
                }

                @Override // com.tencent.imsdk.common.IMCallback
                public void success(Object obj) {
                }
            });
        } else if (v2TIMCallback != null) {
            IMLog.e("V2TIMSigMgrImpl", "modifyInvitation error, inviteID is empty");
            v2TIMCallback.onError(BaseConstants.ERR_INVALID_PARAMETERS, "inviteID is empty");
        }
    }

    @Override // com.tencent.imsdk.v2.V2TIMSignalingManager
    public void reject(String str, String str2, V2TIMCallback v2TIMCallback) {
        if (TextUtils.isEmpty(str)) {
            IMLog.e("V2TIMSigMgrImpl", "signaling reject invite, inviteID is empty");
            if (v2TIMCallback != null) {
                v2TIMCallback.onError(BaseConstants.ERR_INVALID_PARAMETERS, "inviteID is null");
                return;
            }
            return;
        }
        SignalingManager.getInstance().reject(str, str2, new IMCallback(this, v2TIMCallback) { // from class: com.tencent.imsdk.v2.V2TIMSignalingManagerImpl.6
            public final /* synthetic */ V2TIMSignalingManagerImpl this$0;

            @Override // com.tencent.imsdk.common.IMCallback
            public void fail(int i2, String str3) {
            }

            @Override // com.tencent.imsdk.common.IMCallback
            public void success(Object obj) {
            }
        });
    }

    @Override // com.tencent.imsdk.v2.V2TIMSignalingManager
    public void removeSignalingListener(V2TIMSignalingListener v2TIMSignalingListener) {
        synchronized (this) {
            this.mSignalingListenerList.remove(v2TIMSignalingListener);
            if (this.mSignalingListenerList.size() == 0) {
                this.mHasValidSignalingListener = false;
            }
            checkSignalingListener();
        }
    }

    public void unInit() {
        synchronized (this) {
            this.mSignalingListenerList.clear();
            this.mHasValidSignalingListener = false;
        }
    }

    private V2TIMSignalingManagerImpl() {
        this.TAG = "V2TIMSigMgrImpl";
        this.mHasValidSignalingListener = false;
        this.mSignalingListenerList = new CopyOnWriteArrayList<>();
        initSignalingListener();
    }
}
