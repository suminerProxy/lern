package tencent.txlive.room.roomutil.http;

import java.util.List;
import java.util.Map;
import tencent.txlive.room.roomutil.commondef.AnchorInfo;
import tencent.txlive.room.roomutil.commondef.AudienceInfo;
import tencent.txlive.room.roomutil.commondef.RoomInfo;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public class HttpResponse {
    public static transient int CODE_OK;
    public int code;
    public String message;
    public long timestamp;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static class AudienceList extends HttpResponse {
        public List<AudienceInfo> audiences;
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static class CreateRoom extends HttpResponse {
        public String roomID;
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static class GetCustomInfoResponse extends HttpResponse {
        public Map<String, Object> custom;
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static class LoginResponse extends HttpResponse {
        public String token;
        public String userID;
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static class MergeStream extends HttpResponse {
        public int merge_code;
        public String merge_msg;
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static class PushUrl extends HttpResponse {
        public String accelerateURL;
        public String pushURL;
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static class PusherList extends HttpResponse {
        public String mixedPlayURL;
        public List<AnchorInfo> pushers;
        public String roomCreator;
        public String roomID;
        public String roomInfo;
        public int roomStatusCode;
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static class RoomList extends HttpResponse {
        public List<RoomInfo> rooms;
    }
}
