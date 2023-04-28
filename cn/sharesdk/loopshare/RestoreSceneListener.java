package cn.sharesdk.loopshare;

import android.app.Activity;
import com.mob.tools.proguard.EverythingKeeper;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public interface RestoreSceneListener extends EverythingKeeper {
    void completeRestore(Scene scene);

    void notFoundScene(Scene scene);

    Class<? extends Activity> willRestoreScene(Scene scene);
}
