package skin.support.app;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import skin.support.observe.SkinObservable;
import skin.support.observe.SkinObserver;

@Deprecated
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public class SkinCompatActivity extends AppCompatActivity implements SkinObserver {
    private SkinCompatDelegate mSkinDelegate;

    @NonNull
    public SkinCompatDelegate getSkinDelegate() {
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
    }

    @Override // skin.support.observe.SkinObserver
    public void updateSkin(SkinObservable skinObservable, Object obj) {
    }

    public void updateStatusBarColor() {
    }

    public void updateWindowBackground() {
    }
}
