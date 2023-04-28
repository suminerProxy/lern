package androidx.transition;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class Scene {
    private Context mContext;
    private Runnable mEnterAction;
    private Runnable mExitAction;
    private View mLayout;
    private int mLayoutId;
    private ViewGroup mSceneRoot;

    public Scene(@NonNull ViewGroup viewGroup) {
    }

    @Nullable
    public static Scene getCurrentScene(@NonNull ViewGroup viewGroup) {
    }

    @NonNull
    public static Scene getSceneForLayout(@NonNull ViewGroup viewGroup, @LayoutRes int i2, @NonNull Context context) {
    }

    public static void setCurrentScene(@NonNull ViewGroup viewGroup, @Nullable Scene scene) {
    }

    public void enter() {
    }

    public void exit() {
    }

    @NonNull
    public ViewGroup getSceneRoot() {
    }

    public boolean isCreatedFromLayoutResource() {
    }

    public void setEnterAction(@Nullable Runnable runnable) {
    }

    public void setExitAction(@Nullable Runnable runnable) {
    }

    private Scene(ViewGroup viewGroup, int i2, Context context) {
    }

    public Scene(@NonNull ViewGroup viewGroup, @NonNull View view) {
    }
}
