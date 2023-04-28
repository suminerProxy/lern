package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.ActionMenuItem;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuPresenter;
import androidx.core.view.ViewPropertyAnimatorCompat;
import androidx.core.view.ViewPropertyAnimatorListenerAdapter;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class ToolbarWidgetWrapper implements DecorToolbar {
    private static final int AFFECTS_LOGO_MASK = 3;
    private static final long DEFAULT_FADE_DURATION_MS = 200;
    private static final String TAG = "ToolbarWidgetWrapper";
    private ActionMenuPresenter mActionMenuPresenter;
    private View mCustomView;
    private int mDefaultNavigationContentDescription;
    private Drawable mDefaultNavigationIcon;
    private int mDisplayOpts;
    private CharSequence mHomeDescription;
    private Drawable mIcon;
    private Drawable mLogo;
    public boolean mMenuPrepared;
    private Drawable mNavIcon;
    private int mNavigationMode;
    private Spinner mSpinner;
    private CharSequence mSubtitle;
    private View mTabView;
    public CharSequence mTitle;
    private boolean mTitleSet;
    public Toolbar mToolbar;
    public Window.Callback mWindowCallback;

    /* renamed from: androidx.appcompat.widget.ToolbarWidgetWrapper$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass1 implements View.OnClickListener {
        public final ActionMenuItem mNavItem;
        public final /* synthetic */ ToolbarWidgetWrapper this$0;

        public AnonymousClass1(ToolbarWidgetWrapper toolbarWidgetWrapper) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: androidx.appcompat.widget.ToolbarWidgetWrapper$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass2 extends ViewPropertyAnimatorListenerAdapter {
        private boolean mCanceled;
        public final /* synthetic */ ToolbarWidgetWrapper this$0;
        public final /* synthetic */ int val$visibility;

        public AnonymousClass2(ToolbarWidgetWrapper toolbarWidgetWrapper, int i2) {
        }

        @Override // androidx.core.view.ViewPropertyAnimatorListenerAdapter, androidx.core.view.ViewPropertyAnimatorListener
        public void onAnimationCancel(View view) {
        }

        @Override // androidx.core.view.ViewPropertyAnimatorListenerAdapter, androidx.core.view.ViewPropertyAnimatorListener
        public void onAnimationEnd(View view) {
        }

        @Override // androidx.core.view.ViewPropertyAnimatorListenerAdapter, androidx.core.view.ViewPropertyAnimatorListener
        public void onAnimationStart(View view) {
        }
    }

    public ToolbarWidgetWrapper(Toolbar toolbar, boolean z) {
    }

    private int detectDisplayOptions() {
    }

    private void ensureSpinner() {
    }

    private void setTitleInt(CharSequence charSequence) {
    }

    private void updateHomeAccessibility() {
    }

    private void updateNavigationIcon() {
    }

    private void updateToolbarLogo() {
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void animateToVisibility(int i2) {
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public boolean canShowOverflowMenu() {
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void collapseActionView() {
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void dismissPopupMenus() {
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public Context getContext() {
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public View getCustomView() {
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public int getDisplayOptions() {
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public int getDropdownItemCount() {
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public int getDropdownSelectedPosition() {
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public int getHeight() {
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public Menu getMenu() {
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public int getNavigationMode() {
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public CharSequence getSubtitle() {
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public CharSequence getTitle() {
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public ViewGroup getViewGroup() {
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public int getVisibility() {
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public boolean hasEmbeddedTabs() {
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public boolean hasExpandedActionView() {
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public boolean hasIcon() {
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public boolean hasLogo() {
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public boolean hideOverflowMenu() {
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void initIndeterminateProgress() {
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void initProgress() {
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public boolean isOverflowMenuShowPending() {
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public boolean isOverflowMenuShowing() {
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public boolean isTitleTruncated() {
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void restoreHierarchyState(SparseArray<Parcelable> sparseArray) {
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void saveHierarchyState(SparseArray<Parcelable> sparseArray) {
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setBackgroundDrawable(Drawable drawable) {
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setCollapsible(boolean z) {
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setCustomView(View view) {
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setDefaultNavigationContentDescription(int i2) {
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setDefaultNavigationIcon(Drawable drawable) {
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setDisplayOptions(int i2) {
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setDropdownParams(SpinnerAdapter spinnerAdapter, AdapterView.OnItemSelectedListener onItemSelectedListener) {
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setDropdownSelectedPosition(int i2) {
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setEmbeddedTabView(ScrollingTabContainerView scrollingTabContainerView) {
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setHomeButtonEnabled(boolean z) {
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setIcon(int i2) {
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setLogo(int i2) {
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setMenu(Menu menu, MenuPresenter.Callback callback) {
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setMenuCallbacks(MenuPresenter.Callback callback, MenuBuilder.Callback callback2) {
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setMenuPrepared() {
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setNavigationContentDescription(CharSequence charSequence) {
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setNavigationIcon(Drawable drawable) {
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setNavigationMode(int i2) {
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setSubtitle(CharSequence charSequence) {
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setTitle(CharSequence charSequence) {
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setVisibility(int i2) {
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setWindowCallback(Window.Callback callback) {
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setWindowTitle(CharSequence charSequence) {
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public ViewPropertyAnimatorCompat setupAnimatorToVisibility(int i2, long j2) {
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public boolean showOverflowMenu() {
    }

    public ToolbarWidgetWrapper(Toolbar toolbar, boolean z, int i2, int i3) {
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setIcon(Drawable drawable) {
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setLogo(Drawable drawable) {
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setNavigationContentDescription(int i2) {
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setNavigationIcon(int i2) {
    }
}
