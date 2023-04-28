package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.View;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.appcompat.view.menu.MenuPresenter;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class MenuPopupHelper implements MenuHelper {
    private static final int TOUCH_EPICENTER_SIZE_DP = 48;
    private View mAnchorView;
    private final Context mContext;
    private int mDropDownGravity;
    private boolean mForceShowIcon;
    private final PopupWindow.OnDismissListener mInternalOnDismissListener;
    private final MenuBuilder mMenu;
    private PopupWindow.OnDismissListener mOnDismissListener;
    private final boolean mOverflowOnly;
    private MenuPopup mPopup;
    private final int mPopupStyleAttr;
    private final int mPopupStyleRes;
    private MenuPresenter.Callback mPresenterCallback;

    /* renamed from: androidx.appcompat.view.menu.MenuPopupHelper$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass1 implements PopupWindow.OnDismissListener {
        public final /* synthetic */ MenuPopupHelper this$0;

        public AnonymousClass1(MenuPopupHelper menuPopupHelper) {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
        }
    }

    public MenuPopupHelper(@NonNull Context context, @NonNull MenuBuilder menuBuilder) {
    }

    @NonNull
    private MenuPopup createPopup() {
    }

    private void showPopup(int i2, int i3, boolean z, boolean z2) {
    }

    @Override // androidx.appcompat.view.menu.MenuHelper
    public void dismiss() {
    }

    public int getGravity() {
    }

    public ListView getListView() {
    }

    @NonNull
    public MenuPopup getPopup() {
    }

    public boolean isShowing() {
    }

    public void onDismiss() {
    }

    public void setAnchorView(@NonNull View view) {
    }

    public void setForceShowIcon(boolean z) {
    }

    public void setGravity(int i2) {
    }

    public void setOnDismissListener(@Nullable PopupWindow.OnDismissListener onDismissListener) {
    }

    @Override // androidx.appcompat.view.menu.MenuHelper
    public void setPresenterCallback(@Nullable MenuPresenter.Callback callback) {
    }

    public void show() {
    }

    public boolean tryShow() {
    }

    public MenuPopupHelper(@NonNull Context context, @NonNull MenuBuilder menuBuilder, @NonNull View view) {
    }

    public MenuPopupHelper(@NonNull Context context, @NonNull MenuBuilder menuBuilder, @NonNull View view, boolean z, @AttrRes int i2) {
    }

    public void show(int i2, int i3) {
    }

    public MenuPopupHelper(@NonNull Context context, @NonNull MenuBuilder menuBuilder, @NonNull View view, boolean z, @AttrRes int i2, @StyleRes int i3) {
    }

    public boolean tryShow(int i2, int i3) {
    }
}
