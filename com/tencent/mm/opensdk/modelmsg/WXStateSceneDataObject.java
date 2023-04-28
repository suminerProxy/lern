package com.tencent.mm.opensdk.modelmsg;

import android.os.Bundle;
import com.tencent.mm.opensdk.modelmsg.SendMessageToWX;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class WXStateSceneDataObject implements SendMessageToWX.IWXSceneDataObject {
    private static final int LENGTH_LIMIT = 10240;
    private static final String TAG = "MicroMsg.SDK.WXStateSceneDataObject";
    private static final String WX_STATE_JUMP_INFO_KEY_IDENTIFIER = "_wxapi_scene_data_state_jump_info_identifier";
    public String stateId;
    public IWXStateJumpInfo stateJumpInfo;
    public String stateTitle;
    public String token;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public interface IWXStateJumpInfo {
        public static final int WX_STATE_JUMP_TYPE_CHANNEL_PROFILE = 3;
        public static final int WX_STATE_JUMP_TYPE_MINI_PROGRAM = 2;
        public static final int WX_STATE_JUMP_TYPE_UNKNOWN = 0;
        public static final int WX_STATE_JUMP_TYPE_URL = 1;

        boolean checkArgs();

        void serialize(Bundle bundle);

        int type();

        void unserialize(Bundle bundle);
    }

    @Override // com.tencent.mm.opensdk.modelmsg.SendMessageToWX.IWXSceneDataObject
    public boolean checkArgs() {
    }

    @Override // com.tencent.mm.opensdk.modelmsg.SendMessageToWX.IWXSceneDataObject
    public int getJumpType() {
    }

    @Override // com.tencent.mm.opensdk.modelmsg.SendMessageToWX.IWXSceneDataObject
    public void serialize(Bundle bundle) {
    }

    @Override // com.tencent.mm.opensdk.modelmsg.SendMessageToWX.IWXSceneDataObject
    public void unserialize(Bundle bundle) {
    }
}
