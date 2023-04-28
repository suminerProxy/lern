package skin.support.widget;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public abstract class SkinCompatHelper {
    public static final int INVALID_ID = 0;
    public static final String SYSTEM_ID_PREFIX = "1";

    public static final int checkResourceId(int i2) {
        if (Integer.toHexString(i2).startsWith("1")) {
            return 0;
        }
        return i2;
    }

    public abstract void applySkin();
}
