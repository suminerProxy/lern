package tencent.txlive.room;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import androidx.annotation.Nullable;
import com.google.gson.reflect.TypeToken;
import com.tencent.liteav.beauty.TXBeautyManager;
import com.tencent.rtmp.ITXLivePlayListener;
import com.tencent.rtmp.ITXLivePushListener;
import com.tencent.rtmp.TXLivePlayConfig;
import com.tencent.rtmp.TXLivePlayer;
import com.tencent.rtmp.TXLivePusher;
import com.tencent.rtmp.ui.TXCloudVideoView;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Vector;
import org.json.JSONObject;
import tencent.txlive.room.IMLVBLiveRoomListener;
import tencent.txlive.room.roomutil.commondef.AnchorInfo;
import tencent.txlive.room.roomutil.commondef.AudienceInfo;
import tencent.txlive.room.roomutil.commondef.LoginInfo;
import tencent.txlive.room.roomutil.commondef.MLVBCommonDef;
import tencent.txlive.room.roomutil.commondef.RoomInfo;
import tencent.txlive.room.roomutil.http.HttpRequests;
import tencent.txlive.room.roomutil.http.HttpResponse;
import tencent.txlive.room.roomutil.im.IMMessageMgr;
import tencent.txlive.zhibo.msg.TCGiftModel;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public class MLVBLiveRoomImpl extends MLVBLiveRoom implements HttpRequests.HeartBeatCallback, IMMessageMgr.IMMessageListener {
    private static final int LIVEROOM_CAMERA_PREVIEW = 0;
    public static final int LIVEROOM_ROLE_NONE = 0;
    public static final int LIVEROOM_ROLE_PLAYER = 2;
    public static final int LIVEROOM_ROLE_PUSHER = 1;
    private static final int LIVEROOM_SCREEN_PREVIEW = 1;
    private static final int MAX_MEMBER_SIZE = 20;
    private static final int REFRESH_AUDIENCE_INTERVAL_MS = 2000;
    public static final String TAG = "tencent.txlive.room.MLVBLiveRoomImpl";
    public static MLVBLiveRoomImpl mInstance = null;
    public static final String mServerDomain = "https://liveroom.qcloud.com/weapp/live_room";
    private boolean isSendResolving;
    public Context mAppContext;
    public boolean mBackground;
    public String mCurrRoomID;
    public HeartBeatThread mHeartBeatThread;
    public HttpRequests mHttpRequest;
    public IMMessageMgr mIMMessageMgr;
    private IMLVBLiveRoomListener.RequestJoinAnchorCallback mJoinAnchorCallback;
    public boolean mJoinPusher;
    private long mLastEnterAudienceTimeMS;
    private long mLastExitAudienceTimeMS;
    public IMLVBLiveRoomListener mListener;
    public Handler mListenerHandler;
    private AnchorInfo mPKAnchorInfo;
    public HashMap<String, PlayerItem> mPlayers;
    private int mPreviewType;
    public HashMap<String, AnchorInfo> mPushers;
    private IMLVBLiveRoomListener.RequestRoomPKCallback mRequestPKCallback;
    private Runnable mRequestPKTimeoutTask;
    public ArrayList<RoomInfo> mRoomList;
    public int mRoomStatusCode;
    public boolean mScreenAutoEnable;
    public LoginInfo mSelfAccountInfo;
    public String mSelfPushUrl;
    public int mSelfRoleType;
    public StreamMixturer mStreamMixturer;
    public TXLivePlayConfig mTXLivePlayConfig;
    public TXLivePlayer mTXLivePlayer;
    public TXLivePushListenerImpl mTXLivePushListener;
    public TXLivePusher mTXLivePusher;
    private long mTimeDiff;

    /* renamed from: tencent.txlive.room.MLVBLiveRoomImpl$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public class AnonymousClass1 implements IMMessageMgr.Callback {
        public final /* synthetic */ MLVBLiveRoomImpl this$0;
        public final /* synthetic */ IMLVBLiveRoomListener.LoginCallback val$callback;
        public final /* synthetic */ LoginInfo val$loginInfo;

        public AnonymousClass1(MLVBLiveRoomImpl mLVBLiveRoomImpl, IMLVBLiveRoomListener.LoginCallback loginCallback, LoginInfo loginInfo) {
        }

        @Override // tencent.txlive.room.roomutil.im.IMMessageMgr.Callback
        public void onError(int i2, String str) {
        }

        @Override // tencent.txlive.room.roomutil.im.IMMessageMgr.Callback
        public void onSuccess(Object... objArr) {
        }
    }

    /* renamed from: tencent.txlive.room.MLVBLiveRoomImpl$10  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public class AnonymousClass10 extends TypeToken<CommonJson<CustomMessage>> {
        public final /* synthetic */ MLVBLiveRoomImpl this$0;

        public AnonymousClass10(MLVBLiveRoomImpl mLVBLiveRoomImpl) {
        }
    }

    /* renamed from: tencent.txlive.room.MLVBLiveRoomImpl$11  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public class AnonymousClass11 implements IMMessageMgr.Callback {
        public final /* synthetic */ MLVBLiveRoomImpl this$0;
        public final /* synthetic */ IMLVBLiveRoomListener.SendRoomCustomMsgCallback val$callback;

        public AnonymousClass11(MLVBLiveRoomImpl mLVBLiveRoomImpl, IMLVBLiveRoomListener.SendRoomCustomMsgCallback sendRoomCustomMsgCallback) {
        }

        @Override // tencent.txlive.room.roomutil.im.IMMessageMgr.Callback
        public void onError(int i2, String str) {
        }

        @Override // tencent.txlive.room.roomutil.im.IMMessageMgr.Callback
        public void onSuccess(Object... objArr) {
        }
    }

    /* renamed from: tencent.txlive.room.MLVBLiveRoomImpl$12  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public class AnonymousClass12 implements IMMessageMgr.Callback {
        public final /* synthetic */ MLVBLiveRoomImpl this$0;
        public final /* synthetic */ IMLVBLiveRoomListener.BanCallback val$callback;

        public AnonymousClass12(MLVBLiveRoomImpl mLVBLiveRoomImpl, IMLVBLiveRoomListener.BanCallback banCallback) {
        }

        @Override // tencent.txlive.room.roomutil.im.IMMessageMgr.Callback
        public void onError(int i2, String str) {
        }

        @Override // tencent.txlive.room.roomutil.im.IMMessageMgr.Callback
        public void onSuccess(Object... objArr) {
        }
    }

    /* renamed from: tencent.txlive.room.MLVBLiveRoomImpl$13  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public class AnonymousClass13 implements IMMessageMgr.Callback {
        public final /* synthetic */ MLVBLiveRoomImpl this$0;
        public final /* synthetic */ IMLVBLiveRoomListener.BanCallback val$callback;

        public AnonymousClass13(MLVBLiveRoomImpl mLVBLiveRoomImpl, IMLVBLiveRoomListener.BanCallback banCallback) {
        }

        @Override // tencent.txlive.room.roomutil.im.IMMessageMgr.Callback
        public void onError(int i2, String str) {
        }

        @Override // tencent.txlive.room.roomutil.im.IMMessageMgr.Callback
        public void onSuccess(Object... objArr) {
        }
    }

    /* renamed from: tencent.txlive.room.MLVBLiveRoomImpl$14  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public class AnonymousClass14 implements IMMessageMgr.Callback {
        public final /* synthetic */ MLVBLiveRoomImpl this$0;
        public final /* synthetic */ IMLVBLiveRoomListener.GroupIsFullBanCallback val$callback;

        public AnonymousClass14(MLVBLiveRoomImpl mLVBLiveRoomImpl, IMLVBLiveRoomListener.GroupIsFullBanCallback groupIsFullBanCallback) {
        }

        @Override // tencent.txlive.room.roomutil.im.IMMessageMgr.Callback
        public void onError(int i2, String str) {
        }

        @Override // tencent.txlive.room.roomutil.im.IMMessageMgr.Callback
        public void onSuccess(Object... objArr) {
        }
    }

    /* renamed from: tencent.txlive.room.MLVBLiveRoomImpl$15  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public class AnonymousClass15 implements ITXLivePlayListener {
        public final /* synthetic */ MLVBLiveRoomImpl this$0;

        public AnonymousClass15(MLVBLiveRoomImpl mLVBLiveRoomImpl) {
        }

        @Override // com.tencent.rtmp.ITXLivePlayListener
        public void onNetStatus(Bundle bundle) {
        }

        @Override // com.tencent.rtmp.ITXLivePlayListener
        public void onPlayEvent(int i2, Bundle bundle) {
        }
    }

    /* renamed from: tencent.txlive.room.MLVBLiveRoomImpl$16  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public class AnonymousClass16 implements Runnable {
        public final /* synthetic */ MLVBLiveRoomImpl this$0;
        public final /* synthetic */ StandardCallback val$callback;
        public final /* synthetic */ String val$url;
        public final /* synthetic */ int val$videoQuality;

        public AnonymousClass16(MLVBLiveRoomImpl mLVBLiveRoomImpl, StandardCallback standardCallback, int i2, String str) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: tencent.txlive.room.MLVBLiveRoomImpl$17  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public class AnonymousClass17 implements HttpRequests.OnResponseCallback<HttpResponse.CreateRoom> {
        public final /* synthetic */ MLVBLiveRoomImpl this$0;
        public final /* synthetic */ StandardCallback val$callback;

        public AnonymousClass17(MLVBLiveRoomImpl mLVBLiveRoomImpl, StandardCallback standardCallback) {
        }

        @Override // tencent.txlive.room.roomutil.http.HttpRequests.OnResponseCallback
        public /* bridge */ /* synthetic */ void onResponse(int i2, String str, HttpResponse.CreateRoom createRoom) {
        }

        /* renamed from: onResponse  reason: avoid collision after fix types in other method */
        public void onResponse2(int i2, String str, HttpResponse.CreateRoom createRoom) {
        }
    }

    /* renamed from: tencent.txlive.room.MLVBLiveRoomImpl$18  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public class AnonymousClass18 implements HttpRequests.OnResponseCallback<HttpResponse> {
        public final /* synthetic */ MLVBLiveRoomImpl this$0;
        public final /* synthetic */ StandardCallback val$callback;

        public AnonymousClass18(MLVBLiveRoomImpl mLVBLiveRoomImpl, StandardCallback standardCallback) {
        }

        @Override // tencent.txlive.room.roomutil.http.HttpRequests.OnResponseCallback
        public /* bridge */ /* synthetic */ void onResponse(int i2, String str, HttpResponse httpResponse) {
        }

        /* renamed from: onResponse  reason: avoid collision after fix types in other method */
        public void onResponse2(int i2, String str, HttpResponse httpResponse) {
        }
    }

    /* renamed from: tencent.txlive.room.MLVBLiveRoomImpl$19  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public class AnonymousClass19 implements IMMessageMgr.Callback {
        public final /* synthetic */ MLVBLiveRoomImpl this$0;
        public final /* synthetic */ StandardCallback val$callback;

        public AnonymousClass19(MLVBLiveRoomImpl mLVBLiveRoomImpl, StandardCallback standardCallback) {
        }

        @Override // tencent.txlive.room.roomutil.im.IMMessageMgr.Callback
        public void onError(int i2, String str) {
        }

        @Override // tencent.txlive.room.roomutil.im.IMMessageMgr.Callback
        public void onSuccess(Object... objArr) {
        }
    }

    /* renamed from: tencent.txlive.room.MLVBLiveRoomImpl$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public class AnonymousClass2 implements StandardCallback {
        public final /* synthetic */ MLVBLiveRoomImpl this$0;
        public final /* synthetic */ IMLVBLiveRoomListener.EnterRoomCallback val$callback;

        public AnonymousClass2(MLVBLiveRoomImpl mLVBLiveRoomImpl, IMLVBLiveRoomListener.EnterRoomCallback enterRoomCallback) {
        }

        @Override // tencent.txlive.room.MLVBLiveRoomImpl.StandardCallback
        public void onError(int i2, String str) {
        }

        @Override // tencent.txlive.room.MLVBLiveRoomImpl.StandardCallback
        public void onSuccess() {
        }
    }

    /* renamed from: tencent.txlive.room.MLVBLiveRoomImpl$20  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public class AnonymousClass20 extends TypeToken<CommonJson<AnchorInfo>> {
        public final /* synthetic */ MLVBLiveRoomImpl this$0;

        public AnonymousClass20(MLVBLiveRoomImpl mLVBLiveRoomImpl) {
        }
    }

    /* renamed from: tencent.txlive.room.MLVBLiveRoomImpl$21  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public class AnonymousClass21 implements IMMessageMgr.Callback {
        public final /* synthetic */ MLVBLiveRoomImpl this$0;

        public AnonymousClass21(MLVBLiveRoomImpl mLVBLiveRoomImpl) {
        }

        @Override // tencent.txlive.room.roomutil.im.IMMessageMgr.Callback
        public void onError(int i2, String str) {
        }

        @Override // tencent.txlive.room.roomutil.im.IMMessageMgr.Callback
        public void onSuccess(Object... objArr) {
        }
    }

    /* renamed from: tencent.txlive.room.MLVBLiveRoomImpl$22  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public class AnonymousClass22 implements HttpRequests.OnResponseCallback<HttpResponse.PusherList> {
        public final /* synthetic */ MLVBLiveRoomImpl this$0;
        public final /* synthetic */ UpdateAnchorsCallback val$callback;
        public final /* synthetic */ boolean val$excludeRoomCreator;

        /* renamed from: tencent.txlive.room.MLVBLiveRoomImpl$22$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
        public class AnonymousClass1 implements Runnable {
            public final /* synthetic */ AnonymousClass22 this$1;
            public final /* synthetic */ HttpResponse.PusherList val$data;
            public final /* synthetic */ int val$retcode;

            public AnonymousClass1(AnonymousClass22 anonymousClass22, int i2, HttpResponse.PusherList pusherList) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        public AnonymousClass22(MLVBLiveRoomImpl mLVBLiveRoomImpl, boolean z, UpdateAnchorsCallback updateAnchorsCallback) {
        }

        @Override // tencent.txlive.room.roomutil.http.HttpRequests.OnResponseCallback
        public /* bridge */ /* synthetic */ void onResponse(int i2, String str, HttpResponse.PusherList pusherList) {
        }

        /* renamed from: onResponse  reason: avoid collision after fix types in other method */
        public void onResponse2(int i2, String str, HttpResponse.PusherList pusherList) {
        }
    }

    /* renamed from: tencent.txlive.room.MLVBLiveRoomImpl$23  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public class AnonymousClass23 implements Runnable {
        public final /* synthetic */ MLVBLiveRoomImpl this$0;
        public final /* synthetic */ List val$addAnchors;
        public final /* synthetic */ List val$delAnchors;

        public AnonymousClass23(MLVBLiveRoomImpl mLVBLiveRoomImpl, List list, List list2) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: tencent.txlive.room.MLVBLiveRoomImpl$24  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public class AnonymousClass24 extends TypeToken<IMMessageMgr.CommonJson<CustomMessage>> {
        public final /* synthetic */ MLVBLiveRoomImpl this$0;

        public AnonymousClass24(MLVBLiveRoomImpl mLVBLiveRoomImpl) {
        }
    }

    /* renamed from: tencent.txlive.room.MLVBLiveRoomImpl$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public class AnonymousClass3 implements IMMessageMgr.Callback {
        public final /* synthetic */ MLVBLiveRoomImpl this$0;

        public AnonymousClass3(MLVBLiveRoomImpl mLVBLiveRoomImpl) {
        }

        @Override // tencent.txlive.room.roomutil.im.IMMessageMgr.Callback
        public void onError(int i2, String str) {
        }

        @Override // tencent.txlive.room.roomutil.im.IMMessageMgr.Callback
        public void onSuccess(Object... objArr) {
        }
    }

    /* renamed from: tencent.txlive.room.MLVBLiveRoomImpl$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public class AnonymousClass4 implements IMMessageMgr.Callback {
        public final /* synthetic */ MLVBLiveRoomImpl this$0;

        public AnonymousClass4(MLVBLiveRoomImpl mLVBLiveRoomImpl) {
        }

        @Override // tencent.txlive.room.roomutil.im.IMMessageMgr.Callback
        public void onError(int i2, String str) {
        }

        @Override // tencent.txlive.room.roomutil.im.IMMessageMgr.Callback
        public void onSuccess(Object... objArr) {
        }
    }

    /* renamed from: tencent.txlive.room.MLVBLiveRoomImpl$5  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public class AnonymousClass5 implements HttpRequests.OnResponseCallback<HttpResponse> {
        public final /* synthetic */ MLVBLiveRoomImpl this$0;
        public final /* synthetic */ IMLVBLiveRoomListener.SetCustomInfoCallback val$callback;

        public AnonymousClass5(MLVBLiveRoomImpl mLVBLiveRoomImpl, IMLVBLiveRoomListener.SetCustomInfoCallback setCustomInfoCallback) {
        }

        @Override // tencent.txlive.room.roomutil.http.HttpRequests.OnResponseCallback
        public /* bridge */ /* synthetic */ void onResponse(int i2, @Nullable String str, @Nullable HttpResponse httpResponse) {
        }

        /* renamed from: onResponse  reason: avoid collision after fix types in other method */
        public void onResponse2(int i2, @Nullable String str, @Nullable HttpResponse httpResponse) {
        }
    }

    /* renamed from: tencent.txlive.room.MLVBLiveRoomImpl$6  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public class AnonymousClass6 implements HttpRequests.OnResponseCallback<HttpResponse.GetCustomInfoResponse> {
        public final /* synthetic */ MLVBLiveRoomImpl this$0;
        public final /* synthetic */ IMLVBLiveRoomListener.GetCustomInfoCallback val$callback;

        public AnonymousClass6(MLVBLiveRoomImpl mLVBLiveRoomImpl, IMLVBLiveRoomListener.GetCustomInfoCallback getCustomInfoCallback) {
        }

        @Override // tencent.txlive.room.roomutil.http.HttpRequests.OnResponseCallback
        public /* bridge */ /* synthetic */ void onResponse(int i2, @Nullable String str, @Nullable HttpResponse.GetCustomInfoResponse getCustomInfoResponse) {
        }

        /* renamed from: onResponse  reason: avoid collision after fix types in other method */
        public void onResponse2(int i2, @Nullable String str, @Nullable HttpResponse.GetCustomInfoResponse getCustomInfoResponse) {
        }
    }

    /* renamed from: tencent.txlive.room.MLVBLiveRoomImpl$7  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public class AnonymousClass7 implements IMMessageMgr.Callback {
        public final /* synthetic */ MLVBLiveRoomImpl this$0;
        public final /* synthetic */ IMLVBLiveRoomListener.SendRoomTextMsgCallback val$callback;

        public AnonymousClass7(MLVBLiveRoomImpl mLVBLiveRoomImpl, IMLVBLiveRoomListener.SendRoomTextMsgCallback sendRoomTextMsgCallback) {
        }

        @Override // tencent.txlive.room.roomutil.im.IMMessageMgr.Callback
        public void onError(int i2, String str) {
        }

        @Override // tencent.txlive.room.roomutil.im.IMMessageMgr.Callback
        public void onSuccess(Object... objArr) {
        }
    }

    /* renamed from: tencent.txlive.room.MLVBLiveRoomImpl$8  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public class AnonymousClass8 extends TypeToken<CommonJson<CustomMessage>> {
        public final /* synthetic */ MLVBLiveRoomImpl this$0;

        public AnonymousClass8(MLVBLiveRoomImpl mLVBLiveRoomImpl) {
        }
    }

    /* renamed from: tencent.txlive.room.MLVBLiveRoomImpl$9  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public class AnonymousClass9 implements IMMessageMgr.Callback {
        public final /* synthetic */ MLVBLiveRoomImpl this$0;
        public final /* synthetic */ IMLVBLiveRoomListener.SendRoomCustomMsgCallback val$callback;

        public AnonymousClass9(MLVBLiveRoomImpl mLVBLiveRoomImpl, IMLVBLiveRoomListener.SendRoomCustomMsgCallback sendRoomCustomMsgCallback) {
        }

        @Override // tencent.txlive.room.roomutil.im.IMMessageMgr.Callback
        public void onError(int i2, String str) {
        }

        @Override // tencent.txlive.room.roomutil.im.IMMessageMgr.Callback
        public void onSuccess(Object... objArr) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public class CommonJson<T> implements Serializable {
        public String cmd;
        public T data;
        public final /* synthetic */ MLVBLiveRoomImpl this$0;

        public CommonJson(MLVBLiveRoomImpl mLVBLiveRoomImpl) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public class CustomMessage implements Serializable {
        public String cmd;
        public TCGiftModel extra;
        public String msg;
        public final /* synthetic */ MLVBLiveRoomImpl this$0;
        public String userAvatar;
        public String userId;
        public String userName;
        public int userRole;

        public CustomMessage(MLVBLiveRoomImpl mLVBLiveRoomImpl) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public class HeartBeatThread {
        private Handler handler;
        private Runnable heartBeatRunnable;
        public final /* synthetic */ MLVBLiveRoomImpl this$0;

        /* renamed from: tencent.txlive.room.MLVBLiveRoomImpl$HeartBeatThread$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
        public class AnonymousClass1 implements Runnable {
            public final /* synthetic */ HeartBeatThread this$1;

            public AnonymousClass1(HeartBeatThread heartBeatThread) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        public HeartBeatThread(MLVBLiveRoomImpl mLVBLiveRoomImpl) {
        }

        public static /* synthetic */ Handler access$700(HeartBeatThread heartBeatThread) {
        }

        public static /* synthetic */ Runnable access$800(HeartBeatThread heartBeatThread) {
        }

        public void startHeartbeat() {
        }

        public void stopHeartbeat() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public class JoinAnchorRequest implements Serializable {
        public String reason;
        public String roomID;
        public final /* synthetic */ MLVBLiveRoomImpl this$0;
        public long timestamp;
        public String type;
        public String userAvatar;
        public String userID;
        public String userName;

        public JoinAnchorRequest(MLVBLiveRoomImpl mLVBLiveRoomImpl) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public class JoinAnchorResponse implements Serializable {
        public String reason;
        public String result;
        public String roomID;
        public final /* synthetic */ MLVBLiveRoomImpl this$0;
        public long timestamp;
        public String type;

        public JoinAnchorResponse(MLVBLiveRoomImpl mLVBLiveRoomImpl) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public class KickoutResponse implements Serializable {
        public String roomID;
        public final /* synthetic */ MLVBLiveRoomImpl this$0;
        public long timestamp;
        public String type;

        public KickoutResponse(MLVBLiveRoomImpl mLVBLiveRoomImpl) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public interface OnLivePicture {
        void livePicture(Bitmap bitmap);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public class PKRequest implements Serializable {
        public String accelerateURL;
        public String action;
        public String roomID;
        public final /* synthetic */ MLVBLiveRoomImpl this$0;
        public long timestamp;
        public String type;
        public String userAvatar;
        public String userID;
        public String userName;

        public PKRequest(MLVBLiveRoomImpl mLVBLiveRoomImpl) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public class PKResponse implements Serializable {
        public String accelerateURL;
        public String reason;
        public String result;
        public String roomID;
        public final /* synthetic */ MLVBLiveRoomImpl this$0;
        public long timestamp;
        public String type;

        public PKResponse(MLVBLiveRoomImpl mLVBLiveRoomImpl) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public class PlayerItem {
        public AnchorInfo anchorInfo;
        public TXLivePlayer player;
        public final /* synthetic */ MLVBLiveRoomImpl this$0;
        public TXCloudVideoView view;

        public PlayerItem(MLVBLiveRoomImpl mLVBLiveRoomImpl, TXCloudVideoView tXCloudVideoView, AnchorInfo anchorInfo, TXLivePlayer tXLivePlayer) {
        }

        public void destroy() {
        }

        public void pause() {
        }

        public void resume() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public interface StandardCallback {
        void onError(int i2, String str);

        void onSuccess();
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public class StreamMixturer {
        private int mMainStreamHeight;
        private String mMainStreamId;
        private int mMainStreamWidth;
        private String mPKStreamId;
        private Vector<String> mSubStreamIds;
        public final /* synthetic */ MLVBLiveRoomImpl this$0;

        /* renamed from: tencent.txlive.room.MLVBLiveRoomImpl$StreamMixturer$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
        public class AnonymousClass1 extends Thread {
            public final /* synthetic */ StreamMixturer this$1;
            public final /* synthetic */ JSONObject val$requestParam;
            public final /* synthetic */ int val$retryIndex;
            public final /* synthetic */ boolean val$runImmediately;

            /* renamed from: tencent.txlive.room.MLVBLiveRoomImpl$StreamMixturer$1$1  reason: invalid class name and collision with other inner class name */
            /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
            public class C06591 implements HttpRequests.OnResponseCallback<HttpResponse.MergeStream> {
                public final /* synthetic */ AnonymousClass1 this$2;

                public C06591(AnonymousClass1 anonymousClass1) {
                }

                @Override // tencent.txlive.room.roomutil.http.HttpRequests.OnResponseCallback
                public /* bridge */ /* synthetic */ void onResponse(int i2, String str, HttpResponse.MergeStream mergeStream) {
                }

                /* renamed from: onResponse  reason: avoid collision after fix types in other method */
                public void onResponse2(int i2, String str, HttpResponse.MergeStream mergeStream) {
                }
            }

            public AnonymousClass1(StreamMixturer streamMixturer, boolean z, int i2, JSONObject jSONObject) {
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
            }
        }

        public StreamMixturer(MLVBLiveRoomImpl mLVBLiveRoomImpl) {
        }

        public static /* synthetic */ String access$400(StreamMixturer streamMixturer) {
        }

        public static /* synthetic */ Vector access$500(StreamMixturer streamMixturer) {
        }

        public static /* synthetic */ void access$600(StreamMixturer streamMixturer, int i2, boolean z, JSONObject jSONObject) {
        }

        private JSONObject createPKRequestParam() {
        }

        private JSONObject createRequestParam() {
        }

        private String getStreamIDByStreamUrl(String str) {
        }

        private void internalSendRequest(int i2, boolean z, JSONObject jSONObject) {
        }

        private void sendStreamMergeRequest(int i2) {
        }

        public void addPKVideoStream(String str) {
        }

        public void addSubVideoStream(String str) {
        }

        public void delPKVideoStream(String str) {
        }

        public void delSubVideoStream(String str) {
        }

        public void resetMergeState() {
        }

        public void setMainVideoStream(String str) {
        }

        public void setMainVideoStreamResolution(int i2, int i3) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public interface UpdateAnchorsCallback {
        void onUpdateAnchors(int i2, List<AnchorInfo> list, List<AnchorInfo> list2, HashMap<String, AnchorInfo> hashMap, AnchorInfo anchorInfo);
    }

    public MLVBLiveRoomImpl(Context context) {
    }

    public static /* synthetic */ void a(Object obj, String str, Object[] objArr) {
    }

    public static /* synthetic */ void access$000(MLVBLiveRoomImpl mLVBLiveRoomImpl, Object obj, String str, Object[] objArr) {
    }

    public static /* synthetic */ boolean access$100(MLVBLiveRoomImpl mLVBLiveRoomImpl) {
    }

    public static /* synthetic */ boolean access$102(MLVBLiveRoomImpl mLVBLiveRoomImpl, boolean z) {
    }

    public static /* synthetic */ void access$200(MLVBLiveRoomImpl mLVBLiveRoomImpl, Runnable runnable) {
    }

    public static /* synthetic */ void b(Runnable runnable) {
    }

    private /* synthetic */ void c() {
    }

    private void callbackOnThread(Object obj, String str, Object... objArr) {
    }

    private void destroy() {
    }

    public static void destroySharedInstance() {
    }

    private /* synthetic */ void e() {
    }

    public static /* synthetic */ void g(OnLivePicture onLivePicture, Bitmap bitmap) {
    }

    private /* synthetic */ void h(TXCloudVideoView tXCloudVideoView, IMLVBLiveRoomListener iMLVBLiveRoomListener, String str, IMLVBLiveRoomListener.replayCallback replaycallback) {
    }

    private void initConfig(Context context) {
    }

    private boolean isCmdTimeOut(long j2) {
    }

    private void notifyPusherChange() {
    }

    private void onRecvLinkMicMessage(String str) {
    }

    private void onRecvPKMessage(String str) {
    }

    public static MLVBLiveRoom sharedInstance(Context context) {
    }

    public void addAnchor(String str, String str2, StandardCallback standardCallback) {
    }

    @Override // tencent.txlive.room.MLVBLiveRoom
    public void bindRoomListener(IMLVBLiveRoomListener iMLVBLiveRoomListener) {
    }

    public void cleanPlayers() {
    }

    @Override // tencent.txlive.room.MLVBLiveRoom
    public void closeLivePull() {
    }

    @Override // tencent.txlive.room.MLVBLiveRoom
    public void createRoom(String str, String str2, IMLVBLiveRoomListener.CreateRoomCallback createRoomCallback) {
    }

    public /* synthetic */ void d() {
    }

    public void doCreateRoom(String str, String str2, StandardCallback standardCallback) {
    }

    @Override // tencent.txlive.room.MLVBLiveRoom
    public boolean enableTorch(boolean z) {
    }

    @Override // tencent.txlive.room.MLVBLiveRoom
    public void enterRoom(String str, IMLVBLiveRoomListener.EnterRoomCallback enterRoomCallback) {
    }

    @Override // tencent.txlive.room.MLVBLiveRoom
    public void exitRoom(IMLVBLiveRoomListener.ExitRoomCallback exitRoomCallback) {
    }

    @Override // tencent.txlive.room.MLVBLiveRoom
    public void exitRoomOnly(String str) {
    }

    public /* synthetic */ void f() {
    }

    @Override // tencent.txlive.room.MLVBLiveRoom
    public void fullBan(String str, boolean z, IMLVBLiveRoomListener.BanCallback banCallback) {
    }

    @Override // tencent.txlive.room.MLVBLiveRoom
    public void getAudienceList(IMLVBLiveRoomListener.GetAudienceListCallback getAudienceListCallback) {
    }

    @Override // tencent.txlive.room.MLVBLiveRoom
    public int getBGMDuration(String str) {
    }

    @Override // tencent.txlive.room.MLVBLiveRoom
    public TXBeautyManager getBeautyManager() {
    }

    @Override // tencent.txlive.room.MLVBLiveRoom
    public void getCustomInfo(IMLVBLiveRoomListener.GetCustomInfoCallback getCustomInfoCallback) {
    }

    @Override // tencent.txlive.room.MLVBLiveRoom
    public void getLivePicture(OnLivePicture onLivePicture) {
    }

    public String getMixedPlayUrlByRoomID(String str) {
    }

    public int getPlayType(String str) {
    }

    public String getRoomCreator(String str) {
    }

    @Override // tencent.txlive.room.MLVBLiveRoom
    public void getRoomList(int i2, int i3, IMLVBLiveRoomListener.GetRoomListCallback getRoomListCallback) {
    }

    @Override // tencent.txlive.room.MLVBLiveRoom
    public TXLivePlayer getTXLivePlayer() {
    }

    @Override // tencent.txlive.room.MLVBLiveRoom
    public void groupIsBan(String str, IMLVBLiveRoomListener.GroupIsFullBanCallback groupIsFullBanCallback) {
    }

    public /* synthetic */ void i(TXCloudVideoView tXCloudVideoView, IMLVBLiveRoomListener iMLVBLiveRoomListener, String str, IMLVBLiveRoomListener.replayCallback replaycallback) {
    }

    public void initLivePusher(boolean z) {
    }

    public void jionIMGroup(String str, StandardCallback standardCallback) {
    }

    @Override // tencent.txlive.room.MLVBLiveRoom
    public void joinAnchor(IMLVBLiveRoomListener.JoinAnchorCallback joinAnchorCallback) {
    }

    @Override // tencent.txlive.room.MLVBLiveRoom
    public void joinGroup(String str, StandardCallback standardCallback) {
    }

    @Override // tencent.txlive.room.MLVBLiveRoom
    public void kickoutJoinAnchor(String str) {
    }

    @Override // tencent.txlive.room.MLVBLiveRoom
    public void login(LoginInfo loginInfo, IMLVBLiveRoomListener.LoginCallback loginCallback) {
    }

    @Override // tencent.txlive.room.MLVBLiveRoom
    public void logout(IMLVBLiveRoomListener.LoginOutCallback loginOutCallback) {
    }

    public void mergerAnchors(List<AnchorInfo> list, List<AnchorInfo> list2, List<AnchorInfo> list3, HashMap<String, AnchorInfo> hashMap) {
    }

    public void mixtureStream(List<AnchorInfo> list, List<AnchorInfo> list2) {
    }

    @Override // tencent.txlive.room.MLVBLiveRoom
    public void muteAllRemoteAudio(boolean z) {
    }

    @Override // tencent.txlive.room.MLVBLiveRoom
    public void muteLocalAudio(boolean z) {
    }

    @Override // tencent.txlive.room.MLVBLiveRoom
    public void muteRemoteAudio(String str, boolean z) {
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

    @Override // tencent.txlive.room.roomutil.http.HttpRequests.HeartBeatCallback
    public void onHeartBeatResponse(String str) {
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

    @Override // tencent.txlive.room.MLVBLiveRoom
    public void onePeopleBan(String str, String str2, IMLVBLiveRoomListener.BanCallback banCallback) {
    }

    public void parsePushers(boolean z, HttpResponse.PusherList pusherList, UpdateAnchorsCallback updateAnchorsCallback) {
    }

    @Override // tencent.txlive.room.MLVBLiveRoom
    public void pauseBGM() {
    }

    @Override // tencent.txlive.room.MLVBLiveRoom
    public void pausePlay() {
    }

    @Override // tencent.txlive.room.MLVBLiveRoom
    public boolean playBGM(String str) {
    }

    @Override // tencent.txlive.room.MLVBLiveRoom
    public void pushLivePlay(String str, TXCloudVideoView tXCloudVideoView, IMLVBLiveRoomListener iMLVBLiveRoomListener, IMLVBLiveRoomListener.replayCallback replaycallback) {
    }

    @Override // tencent.txlive.room.MLVBLiveRoom
    public void quitJoinAnchor(IMLVBLiveRoomListener.QuitAnchorCallback quitAnchorCallback) {
    }

    @Override // tencent.txlive.room.MLVBLiveRoom
    public void quitRoomPK(IMLVBLiveRoomListener.QuitRoomPKCallback quitRoomPKCallback) {
    }

    @Override // tencent.txlive.room.MLVBLiveRoom
    public void replayLive(Context context, TXCloudVideoView tXCloudVideoView, String str, IMLVBLiveRoomListener.replayCallback replaycallback) {
    }

    @Override // tencent.txlive.room.MLVBLiveRoom
    public void requestJoinAnchor(String str, IMLVBLiveRoomListener.RequestJoinAnchorCallback requestJoinAnchorCallback) {
    }

    @Override // tencent.txlive.room.MLVBLiveRoom
    public void requestRoomPK(String str, IMLVBLiveRoomListener.RequestRoomPKCallback requestRoomPKCallback) {
    }

    @Override // tencent.txlive.room.MLVBLiveRoom
    public int responseJoinAnchor(String str, boolean z, String str2) {
    }

    @Override // tencent.txlive.room.MLVBLiveRoom
    public int responseRoomPK(String str, boolean z, String str2) {
    }

    @Override // tencent.txlive.room.MLVBLiveRoom
    public void resumeBGM() {
    }

    @Override // tencent.txlive.room.MLVBLiveRoom
    public void resumePLay() {
    }

    @Override // tencent.txlive.room.MLVBLiveRoom
    public void sendRoomCustomGiftMsg(String str, String str2, TCGiftModel tCGiftModel, IMLVBLiveRoomListener.SendRoomCustomMsgCallback sendRoomCustomMsgCallback) {
    }

    @Override // tencent.txlive.room.MLVBLiveRoom
    public void sendRoomCustomMsg(String str, String str2, String str3, IMLVBLiveRoomListener.SendRoomCustomMsgCallback sendRoomCustomMsgCallback) {
    }

    @Override // tencent.txlive.room.MLVBLiveRoom
    public void sendRoomTextMsg(String str, String str2, IMLVBLiveRoomListener.SendRoomTextMsgCallback sendRoomTextMsgCallback) {
    }

    @Override // tencent.txlive.room.MLVBLiveRoom
    public void setBGMNofify(TXLivePusher.OnBGMNotify onBGMNotify) {
    }

    @Override // tencent.txlive.room.MLVBLiveRoom
    public void setBGMPitch(float f2) {
    }

    @Override // tencent.txlive.room.MLVBLiveRoom
    public boolean setBGMPosition(int i2) {
    }

    @Override // tencent.txlive.room.MLVBLiveRoom
    public void setBGMVolume(int i2) {
    }

    @Override // tencent.txlive.room.MLVBLiveRoom
    public boolean setBeautyStyle(int i2, int i3, int i4, int i5) {
    }

    @Override // tencent.txlive.room.MLVBLiveRoom
    public void setCameraMuteImage(Bitmap bitmap) {
    }

    @Override // tencent.txlive.room.MLVBLiveRoom
    public void setChinLevel(int i2) {
    }

    @Override // tencent.txlive.room.MLVBLiveRoom
    public void setCustomInfo(MLVBCommonDef.CustomFieldOp customFieldOp, String str, Object obj, IMLVBLiveRoomListener.SetCustomInfoCallback setCustomInfoCallback) {
    }

    @Override // tencent.txlive.room.MLVBLiveRoom
    public void setExposureCompensation(float f2) {
    }

    @Override // tencent.txlive.room.MLVBLiveRoom
    public void setEyeScaleLevel(int i2) {
    }

    @Override // tencent.txlive.room.MLVBLiveRoom
    public void setFaceShortLevel(int i2) {
    }

    @Override // tencent.txlive.room.MLVBLiveRoom
    public void setFaceSlimLevel(int i2) {
    }

    @Override // tencent.txlive.room.MLVBLiveRoom
    public void setFaceVLevel(int i2) {
    }

    @Override // tencent.txlive.room.MLVBLiveRoom
    public void setFilter(Bitmap bitmap) {
    }

    @Override // tencent.txlive.room.MLVBLiveRoom
    public void setFilterConcentration(float f2) {
    }

    @Override // tencent.txlive.room.MLVBLiveRoom
    public boolean setGreenScreenFile(String str) {
    }

    @Override // tencent.txlive.room.MLVBLiveRoom
    public void setListener(IMLVBLiveRoomListener iMLVBLiveRoomListener) {
    }

    @Override // tencent.txlive.room.MLVBLiveRoom
    public void setListenerHandler(Handler handler) {
    }

    @Override // tencent.txlive.room.MLVBLiveRoom
    public void setMicVolumeOnMixing(int i2) {
    }

    @Override // tencent.txlive.room.MLVBLiveRoom
    public void setMotionTmpl(String str) {
    }

    @Override // tencent.txlive.room.MLVBLiveRoom
    public void setNoseSlimLevel(int i2) {
    }

    @Override // tencent.txlive.room.MLVBLiveRoom
    public void setPlayView(TXCloudVideoView tXCloudVideoView) {
    }

    @Override // tencent.txlive.room.MLVBLiveRoom
    public void setReverbType(int i2) {
    }

    @Override // tencent.txlive.room.MLVBLiveRoom
    public void setSelfProfile(String str, String str2, int i2) {
    }

    @Override // tencent.txlive.room.MLVBLiveRoom
    public void setVoiceChangerType(int i2) {
    }

    @Override // tencent.txlive.room.MLVBLiveRoom
    public void setWatermark(Bitmap bitmap, float f2, float f3, float f4) {
    }

    @Override // tencent.txlive.room.MLVBLiveRoom
    public boolean setZoom(int i2) {
    }

    @Override // tencent.txlive.room.MLVBLiveRoom
    public void startLocalPreview(boolean z, TXCloudVideoView tXCloudVideoView) {
    }

    public void startPushStream(String str, int i2, StandardCallback standardCallback) {
    }

    @Override // tencent.txlive.room.MLVBLiveRoom
    public void startRemoteView(AnchorInfo anchorInfo, TXCloudVideoView tXCloudVideoView, IMLVBLiveRoomListener.PlayCallback playCallback) {
    }

    @Override // tencent.txlive.room.MLVBLiveRoom
    public synchronized void startScreenCapture() {
    }

    @Override // tencent.txlive.room.MLVBLiveRoom
    public void stopBGM() {
    }

    @Override // tencent.txlive.room.MLVBLiveRoom
    public void stopLocalPreview() {
    }

    @Override // tencent.txlive.room.MLVBLiveRoom
    public void stopRemoteView(AnchorInfo anchorInfo) {
    }

    @Override // tencent.txlive.room.MLVBLiveRoom
    public synchronized void stopScreenCapture() {
    }

    @Override // tencent.txlive.room.MLVBLiveRoom
    public void switchCamera() {
    }

    public void unInitLivePusher() {
    }

    public void updateAnchors(boolean z, UpdateAnchorsCallback updateAnchorsCallback) {
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public class TXLivePushListenerImpl implements ITXLivePushListener {
        private StandardCallback mCallback;
        public final /* synthetic */ MLVBLiveRoomImpl this$0;

        private TXLivePushListenerImpl(MLVBLiveRoomImpl mLVBLiveRoomImpl) {
        }

        @Override // com.tencent.rtmp.ITXLivePushListener
        public void onNetStatus(Bundle bundle) {
        }

        @Override // com.tencent.rtmp.ITXLivePushListener
        public void onPushEvent(int i2, Bundle bundle) {
        }

        public void setCallback(StandardCallback standardCallback) {
        }

        public /* synthetic */ TXLivePushListenerImpl(MLVBLiveRoomImpl mLVBLiveRoomImpl, AnonymousClass1 anonymousClass1) {
        }
    }

    private void callbackOnThread(Runnable runnable) {
    }

    @Override // tencent.txlive.room.MLVBLiveRoom
    public void setCameraMuteImage(int i2) {
    }
}
