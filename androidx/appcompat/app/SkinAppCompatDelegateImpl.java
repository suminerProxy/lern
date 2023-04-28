package androidx.appcompat.app;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StyleRes;
import androidx.appcompat.view.ActionMode;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.widget.Toolbar;
import java.lang.ref.WeakReference;
import java.util.Map;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class SkinAppCompatDelegateImpl extends AppCompatDelegateImpl {
    private static Map<Activity, WeakReference<AppCompatDelegate>> sDelegateMap;

    private SkinAppCompatDelegateImpl(Context context, Window window, AppCompatCallback appCompatCallback) {
    }

    public static AppCompatDelegate get(Activity activity, AppCompatCallback appCompatCallback) {
    }

    @Override // androidx.appcompat.app.AppCompatDelegateImpl, androidx.appcompat.app.AppCompatDelegate
    public /* bridge */ /* synthetic */ void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
    }

    @Override // androidx.appcompat.app.AppCompatDelegateImpl, androidx.appcompat.app.AppCompatDelegate
    public /* bridge */ /* synthetic */ boolean applyDayNight() {
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public /* bridge */ /* synthetic */ void attachBaseContext(Context context) {
    }

    @Override // androidx.appcompat.app.AppCompatDelegateImpl, androidx.appcompat.app.AppCompatDelegate
    public /* bridge */ /* synthetic */ View createView(View view, String str, @NonNull Context context, @NonNull AttributeSet attributeSet) {
    }

    @Override // androidx.appcompat.app.AppCompatDelegateImpl, androidx.appcompat.app.AppCompatDelegate
    @Nullable
    public /* bridge */ /* synthetic */ View findViewById(@IdRes int i2) {
    }

    @Override // androidx.appcompat.app.AppCompatDelegateImpl, androidx.appcompat.app.AppCompatDelegate
    public /* bridge */ /* synthetic */ int getLocalNightMode() {
    }

    @Override // androidx.appcompat.app.AppCompatDelegateImpl, androidx.appcompat.app.AppCompatDelegate
    public /* bridge */ /* synthetic */ MenuInflater getMenuInflater() {
    }

    @Override // androidx.appcompat.app.AppCompatDelegateImpl, androidx.appcompat.app.AppCompatDelegate
    public /* bridge */ /* synthetic */ ActionBar getSupportActionBar() {
    }

    @Override // androidx.appcompat.app.AppCompatDelegateImpl, androidx.appcompat.app.AppCompatDelegate
    public /* bridge */ /* synthetic */ boolean hasWindowFeature(int i2) {
    }

    @Override // androidx.appcompat.app.AppCompatDelegateImpl, androidx.appcompat.app.AppCompatDelegate
    public void installViewFactory() {
    }

    @Override // androidx.appcompat.app.AppCompatDelegateImpl, androidx.appcompat.app.AppCompatDelegate
    public /* bridge */ /* synthetic */ void invalidateOptionsMenu() {
    }

    @Override // androidx.appcompat.app.AppCompatDelegateImpl, androidx.appcompat.app.AppCompatDelegate
    public /* bridge */ /* synthetic */ boolean isHandleNativeActionModesEnabled() {
    }

    @Override // androidx.appcompat.app.AppCompatDelegateImpl, androidx.appcompat.app.AppCompatDelegate
    public /* bridge */ /* synthetic */ void onConfigurationChanged(Configuration configuration) {
    }

    @Override // androidx.appcompat.app.AppCompatDelegateImpl, androidx.appcompat.app.AppCompatDelegate
    public /* bridge */ /* synthetic */ void onCreate(Bundle bundle) {
    }

    @Override // androidx.appcompat.app.AppCompatDelegateImpl, android.view.LayoutInflater.Factory
    public /* bridge */ /* synthetic */ View onCreateView(String str, Context context, AttributeSet attributeSet) {
    }

    @Override // androidx.appcompat.app.AppCompatDelegateImpl, androidx.appcompat.app.AppCompatDelegate
    public /* bridge */ /* synthetic */ void onDestroy() {
    }

    @Override // androidx.appcompat.app.AppCompatDelegateImpl, androidx.appcompat.view.menu.MenuBuilder.Callback
    public /* bridge */ /* synthetic */ boolean onMenuItemSelected(MenuBuilder menuBuilder, MenuItem menuItem) {
    }

    @Override // androidx.appcompat.app.AppCompatDelegateImpl, androidx.appcompat.view.menu.MenuBuilder.Callback
    public /* bridge */ /* synthetic */ void onMenuModeChange(MenuBuilder menuBuilder) {
    }

    @Override // androidx.appcompat.app.AppCompatDelegateImpl, androidx.appcompat.app.AppCompatDelegate
    public /* bridge */ /* synthetic */ void onPostCreate(Bundle bundle) {
    }

    @Override // androidx.appcompat.app.AppCompatDelegateImpl, androidx.appcompat.app.AppCompatDelegate
    public /* bridge */ /* synthetic */ void onPostResume() {
    }

    @Override // androidx.appcompat.app.AppCompatDelegateImpl, androidx.appcompat.app.AppCompatDelegate
    public /* bridge */ /* synthetic */ void onSaveInstanceState(Bundle bundle) {
    }

    @Override // androidx.appcompat.app.AppCompatDelegateImpl, androidx.appcompat.app.AppCompatDelegate
    public /* bridge */ /* synthetic */ void onStart() {
    }

    @Override // androidx.appcompat.app.AppCompatDelegateImpl, androidx.appcompat.app.AppCompatDelegate
    public /* bridge */ /* synthetic */ void onStop() {
    }

    @Override // androidx.appcompat.app.AppCompatDelegateImpl, androidx.appcompat.app.AppCompatDelegate
    public /* bridge */ /* synthetic */ boolean requestWindowFeature(int i2) {
    }

    @Override // androidx.appcompat.app.AppCompatDelegateImpl, androidx.appcompat.app.AppCompatDelegate
    public /* bridge */ /* synthetic */ void setContentView(int i2) {
    }

    @Override // androidx.appcompat.app.AppCompatDelegateImpl, androidx.appcompat.app.AppCompatDelegate
    public /* bridge */ /* synthetic */ void setHandleNativeActionModesEnabled(boolean z) {
    }

    @Override // androidx.appcompat.app.AppCompatDelegateImpl, androidx.appcompat.app.AppCompatDelegate
    public /* bridge */ /* synthetic */ void setLocalNightMode(int i2) {
    }

    @Override // androidx.appcompat.app.AppCompatDelegateImpl, androidx.appcompat.app.AppCompatDelegate
    public /* bridge */ /* synthetic */ void setSupportActionBar(Toolbar toolbar) {
    }

    @Override // androidx.appcompat.app.AppCompatDelegateImpl, androidx.appcompat.app.AppCompatDelegate
    public /* bridge */ /* synthetic */ void setTheme(@StyleRes int i2) {
    }

    @Override // androidx.appcompat.app.AppCompatDelegateImpl, androidx.appcompat.app.AppCompatDelegate
    public /* bridge */ /* synthetic */ ActionMode startSupportActionMode(@NonNull ActionMode.Callback callback) {
    }

    @Override // androidx.appcompat.app.AppCompatDelegateImpl, androidx.appcompat.app.AppCompatDelegate
    public /* bridge */ /* synthetic */ void setContentView(View view) {
    }

    @Override // androidx.appcompat.app.AppCompatDelegateImpl, androidx.appcompat.app.AppCompatDelegate
    public /* bridge */ /* synthetic */ void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
    }
}
