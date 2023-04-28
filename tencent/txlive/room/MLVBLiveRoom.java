package tencent.txlive.room;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import com.tencent.liteav.beauty.TXBeautyManager;
import com.tencent.rtmp.TXLivePlayer;
import com.tencent.rtmp.TXLivePusher;
import com.tencent.rtmp.ui.TXCloudVideoView;
import tencent.txlive.room.IMLVBLiveRoomListener;
import tencent.txlive.room.MLVBLiveRoomImpl;
import tencent.txlive.room.roomutil.commondef.AnchorInfo;
import tencent.txlive.room.roomutil.commondef.LoginInfo;
import tencent.txlive.room.roomutil.commondef.MLVBCommonDef;
import tencent.txlive.zhibo.msg.TCGiftModel;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public abstract class MLVBLiveRoom {
    public static void destroySharedInstance() {
    }

    public static MLVBLiveRoom sharedInstance(Context context) {
    }

    public abstract void bindRoomListener(IMLVBLiveRoomListener iMLVBLiveRoomListener);

    public abstract void closeLivePull();

    public abstract void createRoom(String str, String str2, IMLVBLiveRoomListener.CreateRoomCallback createRoomCallback);

    public abstract boolean enableTorch(boolean z);

    public abstract void enterRoom(String str, IMLVBLiveRoomListener.EnterRoomCallback enterRoomCallback);

    public abstract void exitRoom(IMLVBLiveRoomListener.ExitRoomCallback exitRoomCallback);

    public abstract void exitRoomOnly(String str);

    public abstract void fullBan(String str, boolean z, IMLVBLiveRoomListener.BanCallback banCallback);

    public abstract void getAudienceList(IMLVBLiveRoomListener.GetAudienceListCallback getAudienceListCallback);

    public abstract int getBGMDuration(String str);

    public abstract TXBeautyManager getBeautyManager();

    public abstract void getCustomInfo(IMLVBLiveRoomListener.GetCustomInfoCallback getCustomInfoCallback);

    public abstract void getLivePicture(MLVBLiveRoomImpl.OnLivePicture onLivePicture);

    public abstract void getRoomList(int i2, int i3, IMLVBLiveRoomListener.GetRoomListCallback getRoomListCallback);

    public abstract TXLivePlayer getTXLivePlayer();

    public abstract void groupIsBan(String str, IMLVBLiveRoomListener.GroupIsFullBanCallback groupIsFullBanCallback);

    public abstract void joinAnchor(IMLVBLiveRoomListener.JoinAnchorCallback joinAnchorCallback);

    public abstract void joinGroup(String str, MLVBLiveRoomImpl.StandardCallback standardCallback);

    public abstract void kickoutJoinAnchor(String str);

    public abstract void login(LoginInfo loginInfo, IMLVBLiveRoomListener.LoginCallback loginCallback);

    public abstract void logout(IMLVBLiveRoomListener.LoginOutCallback loginOutCallback);

    public abstract void muteAllRemoteAudio(boolean z);

    public abstract void muteLocalAudio(boolean z);

    public abstract void muteRemoteAudio(String str, boolean z);

    public abstract void onePeopleBan(String str, String str2, IMLVBLiveRoomListener.BanCallback banCallback);

    public abstract void pauseBGM();

    public abstract void pausePlay();

    public abstract boolean playBGM(String str);

    public abstract void pushLivePlay(String str, TXCloudVideoView tXCloudVideoView, IMLVBLiveRoomListener iMLVBLiveRoomListener, IMLVBLiveRoomListener.replayCallback replaycallback);

    public abstract void quitJoinAnchor(IMLVBLiveRoomListener.QuitAnchorCallback quitAnchorCallback);

    public abstract void quitRoomPK(IMLVBLiveRoomListener.QuitRoomPKCallback quitRoomPKCallback);

    public abstract void replayLive(Context context, TXCloudVideoView tXCloudVideoView, String str, IMLVBLiveRoomListener.replayCallback replaycallback);

    public abstract void requestJoinAnchor(String str, IMLVBLiveRoomListener.RequestJoinAnchorCallback requestJoinAnchorCallback);

    public abstract void requestRoomPK(String str, IMLVBLiveRoomListener.RequestRoomPKCallback requestRoomPKCallback);

    public abstract int responseJoinAnchor(String str, boolean z, String str2);

    public abstract int responseRoomPK(String str, boolean z, String str2);

    public abstract void resumeBGM();

    public abstract void resumePLay();

    public abstract void sendRoomCustomGiftMsg(String str, String str2, TCGiftModel tCGiftModel, IMLVBLiveRoomListener.SendRoomCustomMsgCallback sendRoomCustomMsgCallback);

    public abstract void sendRoomCustomMsg(String str, String str2, String str3, IMLVBLiveRoomListener.SendRoomCustomMsgCallback sendRoomCustomMsgCallback);

    public abstract void sendRoomTextMsg(String str, String str2, IMLVBLiveRoomListener.SendRoomTextMsgCallback sendRoomTextMsgCallback);

    public abstract void setBGMNofify(TXLivePusher.OnBGMNotify onBGMNotify);

    public abstract void setBGMPitch(float f2);

    public abstract boolean setBGMPosition(int i2);

    public abstract void setBGMVolume(int i2);

    @Deprecated
    public abstract boolean setBeautyStyle(int i2, int i3, int i4, int i5);

    public abstract void setCameraMuteImage(int i2);

    public abstract void setCameraMuteImage(Bitmap bitmap);

    @Deprecated
    public abstract void setChinLevel(int i2);

    public abstract void setCustomInfo(MLVBCommonDef.CustomFieldOp customFieldOp, String str, Object obj, IMLVBLiveRoomListener.SetCustomInfoCallback setCustomInfoCallback);

    public abstract void setExposureCompensation(float f2);

    @Deprecated
    public abstract void setEyeScaleLevel(int i2);

    @Deprecated
    public abstract void setFaceShortLevel(int i2);

    @Deprecated
    public abstract void setFaceSlimLevel(int i2);

    @Deprecated
    public abstract void setFaceVLevel(int i2);

    public abstract void setFilter(Bitmap bitmap);

    public abstract void setFilterConcentration(float f2);

    public abstract boolean setGreenScreenFile(String str);

    public abstract void setListener(IMLVBLiveRoomListener iMLVBLiveRoomListener);

    public abstract void setListenerHandler(Handler handler);

    public abstract void setMicVolumeOnMixing(int i2);

    @Deprecated
    public abstract void setMotionTmpl(String str);

    @Deprecated
    public abstract void setNoseSlimLevel(int i2);

    public abstract void setPlayView(TXCloudVideoView tXCloudVideoView);

    public abstract void setReverbType(int i2);

    public abstract void setSelfProfile(String str, String str2, int i2);

    public abstract void setVoiceChangerType(int i2);

    public abstract void setWatermark(Bitmap bitmap, float f2, float f3, float f4);

    public abstract boolean setZoom(int i2);

    public abstract void startLocalPreview(boolean z, TXCloudVideoView tXCloudVideoView);

    public abstract void startRemoteView(AnchorInfo anchorInfo, TXCloudVideoView tXCloudVideoView, IMLVBLiveRoomListener.PlayCallback playCallback);

    public abstract void startScreenCapture();

    public abstract void stopBGM();

    public abstract void stopLocalPreview();

    public abstract void stopRemoteView(AnchorInfo anchorInfo);

    public abstract void stopScreenCapture();

    public abstract void switchCamera();
}
