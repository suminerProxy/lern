package cn.sharesdk.loopshare;

import android.app.Activity;
import android.content.Intent;
import cn.sharesdk.loopshare.utils.MobLinkImpl;
import com.mob.tools.proguard.ProtectedMemberKeeper;
import com.mob.tools.proguard.PublicMemberKeeper;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class MobLink implements ProtectedMemberKeeper, PublicMemberKeeper {
    public static final boolean DEBUGGABLE = false;

    /* renamed from: a  reason: collision with root package name */
    private static MobLinkImpl f235a;

    private static synchronized void a() {
    }

    public static void getMobID(Scene scene, ActionListener<String> actionListener) {
    }

    public static String getSdkTag() {
    }

    public static int getSdkVersion() {
    }

    public static void registerSpecifiedSchemeListener(String str, RestoreSceneListener restoreSceneListener) {
    }

    public static void setActivityDelegate(Activity activity, SceneRestorable sceneRestorable) {
    }

    public static void setRestoreSceneListener(RestoreSceneListener restoreSceneListener) {
    }

    public static void skipRestoreSceneFromWx(Class<? extends Activity>... clsArr) {
    }

    public static void updateNewIntent(Intent intent, Activity activity) {
    }
}
