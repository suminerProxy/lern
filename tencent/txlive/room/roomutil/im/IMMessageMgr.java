package tencent.txlive.room.roomutil.im;

import android.content.Context;
import android.os.Handler;
import androidx.annotation.NonNull;
import com.google.gson.reflect.TypeToken;
import com.tencent.imsdk.v2.V2TIMAdvancedMsgListener;
import com.tencent.imsdk.v2.V2TIMCallback;
import com.tencent.imsdk.v2.V2TIMGroupInfoResult;
import com.tencent.imsdk.v2.V2TIMGroupListener;
import com.tencent.imsdk.v2.V2TIMMessage;
import com.tencent.imsdk.v2.V2TIMSDKConfig;
import com.tencent.imsdk.v2.V2TIMSendCallback;
import com.tencent.imsdk.v2.V2TIMValueCallback;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import tencent.txlive.room.roomutil.commondef.AudienceInfo;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public class IMMessageMgr extends V2TIMAdvancedMsgListener {
    private static final String TAG = "IMMessageMgr";
    private Context mContext;
    private String mGroupID;
    private Handler mHandler;
    private boolean mLoginSuccess;
    private IMMessageCallback mMessageListener;
    private String mSelfUserID;
    private String mSelfUserSig;
    private V2TIMSDKConfig mTIMSdkConfig;

    /* renamed from: tencent.txlive.room.roomutil.im.IMMessageMgr$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public class AnonymousClass1 extends V2TIMGroupListener {
        public final /* synthetic */ IMMessageMgr this$0;

        public AnonymousClass1(IMMessageMgr iMMessageMgr) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMGroupListener
        public void onReceiveRESTCustomData(String str, byte[] bArr) {
        }
    }

    /* renamed from: tencent.txlive.room.roomutil.im.IMMessageMgr$10  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public class AnonymousClass10 implements V2TIMValueCallback<List<V2TIMGroupInfoResult>> {
        public final /* synthetic */ IMMessageMgr this$0;
        public final /* synthetic */ Callback val$callback;

        public AnonymousClass10(IMMessageMgr iMMessageMgr, Callback callback) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMValueCallback
        public void onError(int i2, String str) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMValueCallback
        public /* bridge */ /* synthetic */ void onSuccess(List<V2TIMGroupInfoResult> list) {
        }

        /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
        public void onSuccess2(List<V2TIMGroupInfoResult> list) {
        }
    }

    /* renamed from: tencent.txlive.room.roomutil.im.IMMessageMgr$11  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public class AnonymousClass11 extends TypeToken<CommonJson<UserInfo>> {
        public final /* synthetic */ IMMessageMgr this$0;

        public AnonymousClass11(IMMessageMgr iMMessageMgr) {
        }
    }

    /* renamed from: tencent.txlive.room.roomutil.im.IMMessageMgr$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public class AnonymousClass2 implements V2TIMCallback {
        public final /* synthetic */ IMMessageMgr this$0;
        public final /* synthetic */ Callback val$callback;
        public final /* synthetic */ String val$groupId;

        public AnonymousClass2(IMMessageMgr iMMessageMgr, String str, Callback callback) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMCallback
        public void onError(int i2, String str) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMCallback
        public void onSuccess() {
        }
    }

    /* renamed from: tencent.txlive.room.roomutil.im.IMMessageMgr$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public class AnonymousClass3 implements V2TIMCallback {
        public final /* synthetic */ IMMessageMgr this$0;
        public final /* synthetic */ Callback val$callback;
        public final /* synthetic */ String val$groupId;

        public AnonymousClass3(IMMessageMgr iMMessageMgr, String str, Callback callback) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMCallback
        public void onError(int i2, String str) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMCallback
        public void onSuccess() {
        }
    }

    /* renamed from: tencent.txlive.room.roomutil.im.IMMessageMgr$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public class AnonymousClass4 extends TypeToken<CommonJson<UserInfo>> {
        public final /* synthetic */ IMMessageMgr this$0;

        public AnonymousClass4(IMMessageMgr iMMessageMgr) {
        }
    }

    /* renamed from: tencent.txlive.room.roomutil.im.IMMessageMgr$5  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public class AnonymousClass5 implements V2TIMSendCallback<V2TIMMessage> {
        public final /* synthetic */ IMMessageMgr this$0;
        public final /* synthetic */ Callback val$callback;

        public AnonymousClass5(IMMessageMgr iMMessageMgr, Callback callback) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMValueCallback
        public void onError(int i2, String str) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMSendCallback
        public void onProgress(int i2) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMValueCallback
        public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        }

        public void onSuccess(V2TIMMessage v2TIMMessage) {
        }
    }

    /* renamed from: tencent.txlive.room.roomutil.im.IMMessageMgr$6  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public class AnonymousClass6 implements V2TIMSendCallback<V2TIMMessage> {
        public final /* synthetic */ IMMessageMgr this$0;
        public final /* synthetic */ Callback val$callback;

        public AnonymousClass6(IMMessageMgr iMMessageMgr, Callback callback) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMValueCallback
        public void onError(int i2, String str) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMSendCallback
        public void onProgress(int i2) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMValueCallback
        public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        }

        public void onSuccess(V2TIMMessage v2TIMMessage) {
        }
    }

    /* renamed from: tencent.txlive.room.roomutil.im.IMMessageMgr$7  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public class AnonymousClass7 implements V2TIMCallback {
        public final /* synthetic */ IMMessageMgr this$0;

        public AnonymousClass7(IMMessageMgr iMMessageMgr) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMCallback
        public void onError(int i2, String str) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMCallback
        public void onSuccess() {
        }
    }

    /* renamed from: tencent.txlive.room.roomutil.im.IMMessageMgr$8  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public class AnonymousClass8 implements V2TIMValueCallback<List<V2TIMGroupInfoResult>> {
        public final /* synthetic */ IMMessageMgr this$0;
        public final /* synthetic */ Callback val$callback;
        public final /* synthetic */ boolean val$silenceAll;

        /* renamed from: tencent.txlive.room.roomutil.im.IMMessageMgr$8$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
        public class AnonymousClass1 implements V2TIMCallback {
            public final /* synthetic */ AnonymousClass8 this$1;

            public AnonymousClass1(AnonymousClass8 anonymousClass8) {
            }

            @Override // com.tencent.imsdk.v2.V2TIMCallback
            public void onError(int i2, String str) {
            }

            @Override // com.tencent.imsdk.v2.V2TIMCallback
            public void onSuccess() {
            }
        }

        public AnonymousClass8(IMMessageMgr iMMessageMgr, Callback callback, boolean z) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMValueCallback
        public void onError(int i2, String str) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMValueCallback
        public /* bridge */ /* synthetic */ void onSuccess(List<V2TIMGroupInfoResult> list) {
        }

        /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
        public void onSuccess2(List<V2TIMGroupInfoResult> list) {
        }
    }

    /* renamed from: tencent.txlive.room.roomutil.im.IMMessageMgr$9  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public class AnonymousClass9 implements V2TIMCallback {
        public final /* synthetic */ IMMessageMgr this$0;
        public final /* synthetic */ Callback val$callback;

        public AnonymousClass9(IMMessageMgr iMMessageMgr, Callback callback) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMCallback
        public void onError(int i2, String str) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMCallback
        public void onSuccess() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public interface Callback {
        void onError(int i2, String str);

        void onSuccess(Object... objArr);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static class CommonJson<T> implements Serializable {
        public String cmd;
        public T data;
        public int forbidSendMsg;
        public int liveStatus;
        public String msg;
        public int onlineNum;
        public String popularityStr;
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public class IMMessageCallback implements IMMessageListener {
        private IMMessageListener listener;
        public final /* synthetic */ IMMessageMgr this$0;

        public IMMessageCallback(IMMessageMgr iMMessageMgr, IMMessageListener iMMessageListener) {
        }

        private /* synthetic */ void A(String str, int i2, String str2) {
        }

        private /* synthetic */ void C(String str, int i2) {
        }

        private /* synthetic */ void E() {
        }

        private /* synthetic */ void a(String str, String str2, String str3) {
        }

        private /* synthetic */ void c() {
        }

        private /* synthetic */ void e(String str) {
        }

        private /* synthetic */ void g() {
        }

        private /* synthetic */ void i() {
        }

        private /* synthetic */ void k(String str, int i2) {
        }

        private /* synthetic */ void m(String str, String str2, String str3) {
        }

        private /* synthetic */ void o(String str) {
        }

        private /* synthetic */ void q(String str, ArrayList arrayList) {
        }

        private /* synthetic */ void s(String str, ArrayList arrayList) {
        }

        private /* synthetic */ void u(String str, String str2, String str3, String str4, int i2, String str5) {
        }

        private /* synthetic */ void w(String str) {
        }

        private /* synthetic */ void y(String str, String str2) {
        }

        public /* synthetic */ void B(String str, int i2, String str2) {
        }

        public /* synthetic */ void D(String str, int i2) {
        }

        public /* synthetic */ void F() {
        }

        public /* synthetic */ void b(String str, String str2, String str3) {
        }

        public /* synthetic */ void d() {
        }

        public /* synthetic */ void f(String str) {
        }

        public /* synthetic */ void h() {
        }

        public /* synthetic */ void j() {
        }

        public /* synthetic */ void l(String str, int i2) {
        }

        public /* synthetic */ void n(String str, String str2, String str3) {
        }

        @Override // tencent.txlive.room.roomutil.im.IMMessageMgr.IMMessageListener
        public void onC2CCustomMessage(String str, String str2, String str3) {
        }

        @Override // tencent.txlive.room.roomutil.im.IMMessageMgr.IMMessageListener
        public void onConnected() {
        }

        @Override // tencent.txlive.room.roomutil.im.IMMessageMgr.IMMessageListener
        public void onDebugLog(String str) {
        }

        @Override // tencent.txlive.room.roomutil.im.IMMessageMgr.IMMessageListener
        public void onDisconnected() {
        }

        @Override // tencent.txlive.room.roomutil.im.IMMessageMgr.IMMessageListener
        public void onForceOffline() {
        }

        @Override // tencent.txlive.room.roomutil.im.IMMessageMgr.IMMessageListener
        public void onGroupBanChange(String str, int i2) {
        }

        @Override // tencent.txlive.room.roomutil.im.IMMessageMgr.IMMessageListener
        public void onGroupCustomMessage(String str, String str2, String str3) {
        }

        @Override // tencent.txlive.room.roomutil.im.IMMessageMgr.IMMessageListener
        public void onGroupDestroyed(String str) {
        }

        @Override // tencent.txlive.room.roomutil.im.IMMessageMgr.IMMessageListener
        public void onGroupMemberEnter(String str, ArrayList<AudienceInfo> arrayList) {
        }

        @Override // tencent.txlive.room.roomutil.im.IMMessageMgr.IMMessageListener
        public void onGroupMemberExit(String str, ArrayList<AudienceInfo> arrayList) {
        }

        @Override // tencent.txlive.room.roomutil.im.IMMessageMgr.IMMessageListener
        public void onGroupTextMessage(String str, String str2, String str3, String str4, int i2, String str5) {
        }

        @Override // tencent.txlive.room.roomutil.im.IMMessageMgr.IMMessageListener
        public void onLiveActivityChange(String str) {
        }

        @Override // tencent.txlive.room.roomutil.im.IMMessageMgr.IMMessageListener
        public void onLiveHot(String str, String str2) {
        }

        @Override // tencent.txlive.room.roomutil.im.IMMessageMgr.IMMessageListener
        public void onLiveStatusChange(String str, int i2, String str2) {
        }

        @Override // tencent.txlive.room.roomutil.im.IMMessageMgr.IMMessageListener
        public void onMemberOnlineChange(String str, int i2) {
        }

        @Override // tencent.txlive.room.roomutil.im.IMMessageMgr.IMMessageListener
        public void onPusherChanged() {
        }

        public /* synthetic */ void p(String str) {
        }

        public /* synthetic */ void r(String str, ArrayList arrayList) {
        }

        public void setListener(IMMessageListener iMMessageListener) {
        }

        public /* synthetic */ void t(String str, ArrayList arrayList) {
        }

        public /* synthetic */ void v(String str, String str2, String str3, String str4, int i2, String str5) {
        }

        public /* synthetic */ void x(String str) {
        }

        public /* synthetic */ void z(String str, String str2) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public interface IMMessageListener {
        void onC2CCustomMessage(String str, String str2, String str3);

        void onConnected();

        void onDebugLog(String str);

        void onDisconnected();

        void onForceOffline();

        void onGroupBanChange(String str, int i2);

        void onGroupCustomMessage(String str, String str2, String str3);

        void onGroupDestroyed(String str);

        void onGroupMemberEnter(String str, ArrayList<AudienceInfo> arrayList);

        void onGroupMemberExit(String str, ArrayList<AudienceInfo> arrayList);

        void onGroupTextMessage(String str, String str2, String str3, String str4, int i2, String str5);

        void onLiveActivityChange(String str);

        void onLiveHot(String str, String str2);

        void onLiveStatusChange(String str, int i2, String str2);

        void onMemberOnlineChange(String str, int i2);

        void onPusherChanged();
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static class PlatformNews implements Serializable {
        public String cmd;
        public int forbidSendMsg;
        public int liveStatus;
        public int onlineNum;
        public String popularityStr;
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class UserInfo implements Serializable {
        public String userAvatar;
        public String userId;
        public String userName;
        public int userRole;
    }

    public IMMessageMgr(Context context) {
    }

    private /* synthetic */ void a(List list, Callback callback, boolean z) {
    }

    public static /* synthetic */ String access$000(IMMessageMgr iMMessageMgr) {
    }

    public static /* synthetic */ String access$002(IMMessageMgr iMMessageMgr, String str) {
    }

    public static /* synthetic */ IMMessageCallback access$100(IMMessageMgr iMMessageMgr) {
    }

    public static /* synthetic */ String access$200() {
    }

    public static /* synthetic */ void access$300(IMMessageMgr iMMessageMgr, String str, Object[] objArr) {
    }

    private /* synthetic */ void c(String str, String str2, Callback callback) {
    }

    private /* synthetic */ void e(List list, Callback callback) {
    }

    private /* synthetic */ void g(String str, Callback callback) {
    }

    private /* synthetic */ void i(String str, Callback callback) {
    }

    private /* synthetic */ void k(String str, Callback callback, String str2) {
    }

    private /* synthetic */ void m(String str, String str2, String str3, int i2, String str4, String str5, Callback callback) {
    }

    private void printDebugLog(String str, Object... objArr) {
    }

    public void FullBan(String str, boolean z, Callback callback) {
    }

    public void OnePeopleBan(String str, String str2, Callback callback) {
    }

    public /* synthetic */ void b(List list, Callback callback, boolean z) {
    }

    public /* synthetic */ void d(String str, String str2, Callback callback) {
    }

    public void destroyGroup(String str, Callback callback) {
    }

    public /* synthetic */ void f(List list, Callback callback) {
    }

    public void groupIsFullBan(String str, Callback callback) {
    }

    public /* synthetic */ void h(String str, Callback callback) {
    }

    public void initialize(String str, String str2, int i2, Callback callback) {
    }

    public /* synthetic */ void j(String str, Callback callback) {
    }

    public void jionGroup(String str, Callback callback) {
    }

    public /* synthetic */ void l(String str, Callback callback, String str2) {
    }

    public /* synthetic */ void n(String str, String str2, String str3, int i2, String str4, String str5, Callback callback) {
    }

    @Override // com.tencent.imsdk.v2.V2TIMAdvancedMsgListener
    public void onRecvNewMessage(V2TIMMessage v2TIMMessage) {
    }

    public void quitGroup(String str, Callback callback) {
    }

    public void runOnHandlerThread(Runnable runnable) {
    }

    public void sendGroupCustomMessage(@NonNull String str, @NonNull String str2, Callback callback) {
    }

    public void sendGroupTextMessage(@NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull String str4, @NonNull int i2, @NonNull String str5, Callback callback) {
    }

    public void setIMMessageListener(IMMessageListener iMMessageListener) {
    }

    public void setSelfProfile(String str, String str2) {
    }

    public void unInitialize() {
    }
}
