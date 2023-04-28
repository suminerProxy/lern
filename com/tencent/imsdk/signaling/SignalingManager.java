package com.tencent.imsdk.signaling;

import com.tencent.imsdk.common.IMCallback;
import com.tencent.imsdk.message.Message;
import com.tencent.imsdk.message.MessageOfflinePushInfo;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class SignalingManager {
    private static String TAG = "SignalingManager";
    private SignalingListener mInternalSignalingListener;
    private SignalingListener mSignalingListener;

    /* renamed from: com.tencent.imsdk.signaling.SignalingManager$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass1 extends SignalingListener {
        public final /* synthetic */ SignalingManager this$0;

        /* renamed from: com.tencent.imsdk.signaling.SignalingManager$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public class RunnableC01841 implements Runnable {
            public final /* synthetic */ AnonymousClass1 this$1;
            public final /* synthetic */ String val$data;
            public final /* synthetic */ String val$groupID;
            public final /* synthetic */ String val$inviteID;
            public final /* synthetic */ List val$inviteeList;
            public final /* synthetic */ String val$inviter;

            public RunnableC01841(AnonymousClass1 anonymousClass1, String str, String str2, String str3, List list, String str4) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        /* renamed from: com.tencent.imsdk.signaling.SignalingManager$1$2  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public class AnonymousClass2 implements Runnable {
            public final /* synthetic */ AnonymousClass1 this$1;
            public final /* synthetic */ String val$data;
            public final /* synthetic */ String val$inviteID;
            public final /* synthetic */ String val$invitee;

            public AnonymousClass2(AnonymousClass1 anonymousClass1, String str, String str2, String str3) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        /* renamed from: com.tencent.imsdk.signaling.SignalingManager$1$3  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public class AnonymousClass3 implements Runnable {
            public final /* synthetic */ AnonymousClass1 this$1;
            public final /* synthetic */ String val$data;
            public final /* synthetic */ String val$inviteID;
            public final /* synthetic */ String val$invitee;

            public AnonymousClass3(AnonymousClass1 anonymousClass1, String str, String str2, String str3) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        /* renamed from: com.tencent.imsdk.signaling.SignalingManager$1$4  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public class AnonymousClass4 implements Runnable {
            public final /* synthetic */ AnonymousClass1 this$1;
            public final /* synthetic */ String val$data;
            public final /* synthetic */ String val$inviteID;
            public final /* synthetic */ String val$inviter;

            public AnonymousClass4(AnonymousClass1 anonymousClass1, String str, String str2, String str3) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        /* renamed from: com.tencent.imsdk.signaling.SignalingManager$1$5  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public class AnonymousClass5 implements Runnable {
            public final /* synthetic */ AnonymousClass1 this$1;
            public final /* synthetic */ String val$inviteID;
            public final /* synthetic */ List val$inviteeList;

            public AnonymousClass5(AnonymousClass1 anonymousClass1, String str, List list) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        /* renamed from: com.tencent.imsdk.signaling.SignalingManager$1$6  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public class AnonymousClass6 implements Runnable {
            public final /* synthetic */ AnonymousClass1 this$1;
            public final /* synthetic */ String val$data;
            public final /* synthetic */ String val$inviteID;

            public AnonymousClass6(AnonymousClass1 anonymousClass1, String str, String str2) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        public AnonymousClass1(SignalingManager signalingManager) {
        }

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
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class SignalingManagerHolder {
        private static final SignalingManager signalingManager = null;

        private SignalingManagerHolder() {
        }

        public static /* synthetic */ SignalingManager access$000() {
        }
    }

    public static /* synthetic */ SignalingListener access$100(SignalingManager signalingManager) {
    }

    public static SignalingManager getInstance() {
    }

    private void initSignalingListener() {
    }

    public void accept(String str, String str2, IMCallback iMCallback) {
    }

    public void addInvitedSignaling(SignalingInfo signalingInfo, IMCallback iMCallback) {
    }

    public void cancel(String str, String str2, IMCallback iMCallback) {
    }

    public SignalingInfo getSignalingInfo(Message message) {
    }

    public void init() {
    }

    public String invite(String str, String str2, boolean z, MessageOfflinePushInfo messageOfflinePushInfo, int i2, IMCallback iMCallback) {
    }

    public String inviteInGroup(String str, List<String> list, String str2, boolean z, int i2, IMCallback iMCallback) {
    }

    public void modifyInvitation(String str, String str2, IMCallback iMCallback) {
    }

    public native void nativeAccept(String str, String str2, IMCallback iMCallback);

    public native void nativeAddInvitedSignaling(SignalingInfo signalingInfo, IMCallback iMCallback);

    public native void nativeCancel(String str, String str2, IMCallback iMCallback);

    public native SignalingInfo nativeGetSignalingInfo(Message message);

    public native String nativeInvite(String str, String str2, boolean z, MessageOfflinePushInfo messageOfflinePushInfo, int i2, IMCallback iMCallback);

    public native String nativeInviteInGroup(String str, List<String> list, String str2, boolean z, int i2, IMCallback iMCallback);

    public native void nativeModifyInvitation(String str, String str2, IMCallback iMCallback);

    public native void nativeReject(String str, String str2, IMCallback iMCallback);

    public native void nativeSetSignalingObserver(SignalingListener signalingListener);

    public void reject(String str, String str2, IMCallback iMCallback) {
    }

    public void setSignalingListener(SignalingListener signalingListener) {
    }
}
