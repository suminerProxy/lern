package tencent.txlive.room;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Map;
import tencent.txlive.room.roomutil.commondef.AnchorInfo;
import tencent.txlive.room.roomutil.commondef.AudienceInfo;
import tencent.txlive.room.roomutil.commondef.RoomInfo;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public interface IMLVBLiveRoomListener {

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public interface BanCallback {
        void onError(int i2, String str);

        void onSuccess();
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public interface CreateRoomCallback {
        void onError(int i2, String str);

        void onSuccess(String str);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public interface EnterRoomCallback {
        void onError(int i2, String str);

        void onSuccess();
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public interface ExitRoomCallback {
        void onError(int i2, String str);

        void onSuccess();
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public interface GetAudienceListCallback {
        void onError(int i2, String str);

        void onSuccess(ArrayList<AudienceInfo> arrayList);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public interface GetCustomInfoCallback {
        void onError(int i2, String str);

        void onGetCustomInfo(Map<String, Object> map);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public interface GetRoomListCallback {
        void onError(int i2, String str);

        void onSuccess(ArrayList<RoomInfo> arrayList);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public interface GroupIsFullBanCallback {
        void onError(int i2, String str);

        void onSuccess(boolean z);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public interface JoinAnchorCallback {
        void onError(int i2, String str);

        void onSuccess();
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public interface LoginCallback {
        void onError(int i2, String str);

        void onSuccess();
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public interface LoginOutCallback {
        void onSuccess();
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public interface PlayCallback {
        void onBegin();

        void onError(int i2, String str);

        void onEvent(int i2, Bundle bundle);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public interface QuitAnchorCallback {
        void onError(int i2, String str);

        void onSuccess();
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public interface QuitRoomPKCallback {
        void onError(int i2, String str);

        void onSuccess();
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public interface RequestJoinAnchorCallback {
        void onAccept();

        void onError(int i2, String str);

        void onReject(String str);

        void onTimeOut();
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public interface RequestRoomPKCallback {
        void onAccept(AnchorInfo anchorInfo);

        void onError(int i2, String str);

        void onReject(String str);

        void onTimeOut();
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public interface SendRoomCustomMsgCallback {
        void onError(int i2, String str);

        void onSuccess();
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public interface SendRoomTextMsgCallback {
        void onError(int i2, String str);

        void onSuccess();
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public interface SetCustomInfoCallback {
        void onError(int i2, String str);

        void onSuccess();
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public interface replayCallback {
        void onError(int i2, String str);

        void onSuccess();
    }

    void onAnchorEnter(AnchorInfo anchorInfo);

    void onAnchorExit(AnchorInfo anchorInfo);

    void onAudienceEnter(AudienceInfo audienceInfo);

    void onAudienceExit(AudienceInfo audienceInfo);

    void onBeginPlay();

    void onConnectSuccess();

    void onDebugLog(String str);

    void onError(int i2, String str, Bundle bundle);

    void onFirstFrame();

    void onGroupBanChange(String str, int i2);

    void onImDisconnected();

    void onKickoutJoinAnchor();

    void onLiveActivityChange(String str);

    void onLiveHot(String str, String str2);

    void onLiveStatusChange(String str, int i2, String str2);

    void onMemberOnlineChange(String str, int i2);

    void onPlayEnd();

    void onPlayLoading();

    void onQuitRoomPK(AnchorInfo anchorInfo);

    void onRecvRoomCustomGiftMsg(String str, String str2, String str3, String str4, String str5, int i2, String str6);

    void onRecvRoomCustomMsg(String str, String str2, String str3, String str4, String str5, int i2, String str6);

    void onRecvRoomTextMsg(String str, String str2, String str3, String str4, int i2, String str5);

    void onRequestJoinAnchor(AnchorInfo anchorInfo, String str);

    void onRequestRoomPK(AnchorInfo anchorInfo);

    void onRoomDestroy(String str);

    void onVideoResolving(boolean z);

    void onWarning(int i2, String str);
}
