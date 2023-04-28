package tencent.txlive.room.roomutil.commondef;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public class MLVBCommonDef {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class CustomFieldOp {
        private static final /* synthetic */ CustomFieldOp[] $VALUES = null;
        public static final CustomFieldOp DEC = null;
        public static final CustomFieldOp INC = null;
        public static final CustomFieldOp SET = null;

        private CustomFieldOp(String str, int i2) {
        }

        public static CustomFieldOp valueOf(String str) {
        }

        public static CustomFieldOp[] values() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public interface LiveRoomErrorCode {
        public static final int ERROR_CODE_ADD_AUDIENCE = 205002;
        public static final int ERROR_CODE_APPID_RELATION = 202005;
        public static final int ERROR_CODE_AUDIENCE_MGR = 205000;
        public static final int ERROR_CODE_AUDIENCE_NUM_FULL = 205001;
        public static final int ERROR_CODE_CONNECTED_TO_IM_SERVER = 202002;
        public static final int ERROR_CODE_CREATE_ROOM = 203002;
        public static final int ERROR_CODE_DB_FAILED = 207001;
        public static final int ERROR_CODE_DEL_AUDIENCE = 205003;
        public static final int ERROR_CODE_DEL_HEARTBEAT = 206002;
        public static final int ERROR_CODE_DESTROY_ROOM = 203003;
        public static final int ERROR_CODE_ENTER_ROOM = 203006;
        public static final int ERROR_CODE_GET_AUDIENCES = 205004;
        public static final int ERROR_CODE_GET_CUSTOM_FIELD = 207004;
        public static final int ERROR_CODE_GET_PUSHERS = 204002;
        public static final int ERROR_CODE_GET_PUSH_AND_ACC_URL = 204004;
        public static final int ERROR_CODE_GET_PUSH_URL = 204001;
        public static final int ERROR_CODE_GET_ROOM_ID = 203001;
        public static final int ERROR_CODE_GET_ROOM_LIST = 203004;
        public static final int ERROR_CODE_HEARTBEAT = 206000;
        public static final int ERROR_CODE_INCOMPLETE_LOGIN_PARAM = 201001;
        public static final int ERROR_CODE_INCOMPLETE_PARAM = 201000;
        public static final int ERROR_CODE_INVALID_JSON = 200101;
        public static final int ERROR_CODE_INVALID_MSG = 200100;
        public static final int ERROR_CODE_INVALID_PUSH_URL = 203008;
        public static final int ERROR_CODE_INVALID_RSP = 202003;
        public static final int ERROR_CODE_LEAVE_ROOM = 204003;
        public static final int ERROR_CODE_LOGOUT = 202004;
        public static final int ERROR_CODE_MIX_FAILED = 207002;
        public static final int ERROR_CODE_NO_COUNT = 201005;
        public static final int ERROR_CODE_NO_MERGE_STREAM_PARAM = 201006;
        public static final int ERROR_CODE_NO_ROOMID = 201004;
        public static final int ERROR_CODE_NO_USERID = 201002;
        public static final int ERROR_CODE_OPERATION_EMPTY = 201007;
        public static final int ERROR_CODE_OTHER = 207000;
        public static final int ERROR_CODE_PUSHER_MGR = 204000;
        public static final int ERROR_CODE_ROOM_MGR = 203000;
        public static final int ERROR_CODE_ROOM_NAME_TOO_LONG = 203009;
        public static final int ERROR_CODE_ROOM_PUSHER_TOO_MUCH = 203007;
        public static final int ERROR_CODE_SET_CUSTOM_FIELD = 207003;
        public static final int ERROR_CODE_SET_FIELD_VALUE_EMPTY = 201009;
        public static final int ERROR_CODE_SET_HEARTBEAT = 206001;
        public static final int ERROR_CODE_UNSUPPORT_ACTION = 207005;
        public static final int ERROR_CODE_UNSUPPORT_OPERATION = 201008;
        public static final int ERROR_CODE_UNSUPPORT_ROOM_TYPE = 207006;
        public static final int ERROR_CODE_UPDATE_ROOM_MEMBER = 203005;
        public static final int ERROR_CODE_USERID_NOT_EQUAL = 201003;
        public static final int ERROR_CODE_USER_NOT_IN_ROOM = 203010;
        public static final int ERROR_CODE_VERIFY = 202000;
        public static final int ERROR_CODE_VERIFY_FAILED = 202001;
        public static final int ERROR_IM_FORCE_OFFLINE = -7;
        public static final int ERROR_LICENSE_INVALID = -5;
        public static final int ERROR_NOT_IN_ROOM = -2;
        public static final int ERROR_NOT_LOGIN = -1;
        public static final int ERROR_PARAMETERS_INVALID = -4;
        public static final int ERROR_PLAY = -6;
        public static final int ERROR_PUSH = -3;
        public static final int OK = 0;
    }
}
