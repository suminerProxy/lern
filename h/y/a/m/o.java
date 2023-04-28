package h.y.a.m;

/* compiled from: ResultCode.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public enum o {
    RESULT_OK(0),
    RESULT_FAILED(1),
    NETWORK_TROBLE(2),
    ACCESS_TO_MANY(3),
    THIRD_REGISTER_ALERT(4),
    USER_NOT_LOGIN_SIGN_ERROR(5),
    ServiceErr(6),
    LOCATION_ERROR(7),
    OTHER_LOGIN(8),
    FLOW_CONTROL(9),
    NO_USER(16),
    NO_DATA_MSG(17);
    
    private int mIntValue;

    o(int i2) {
        this.mIntValue = i2;
    }

    public static o mapIntToValue(int i2) {
        o[] values;
        for (o oVar : values()) {
            if (i2 == oVar.getIntValue()) {
                return oVar;
            }
        }
        return RESULT_FAILED;
    }

    public int getIntValue() {
        return this.mIntValue;
    }
}
