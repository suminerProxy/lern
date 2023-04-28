package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.Handler;
import android.os.Parcelable;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StyleRes;
import androidx.appcompat.view.menu.MenuPresenter;
import androidx.appcompat.widget.MenuItemHoverListener;
import androidx.appcompat.widget.MenuPopupWindow;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public final class CascadingMenuPopup extends MenuPopup implements MenuPresenter, View.OnKeyListener, PopupWindow.OnDismissListener {
    public static final int HORIZ_POSITION_LEFT = 0;
    public static final int HORIZ_POSITION_RIGHT = 1;
    private static final int ITEM_LAYOUT = 0;
    public static final int SUBMENU_TIMEOUT_MS = 200;
    private View mAnchorView;
    private final View.OnAttachStateChangeListener mAttachStateChangeListener;
    private final Context mContext;
    private int mDropDownGravity;
    private boolean mForceShowIcon;
    public final ViewTreeObserver.OnGlobalLayoutListener mGlobalLayoutListener;
    private boolean mHasXOffset;
    private boolean mHasYOffset;
    private int mLastPosition;
    private final MenuItemHoverListener mMenuItemHoverListener;
    private final int mMenuMaxWidth;
    private PopupWindow.OnDismissListener mOnDismissListener;
    private final boolean mOverflowOnly;
    private final List<MenuBuilder> mPendingMenus;
    private final int mPopupStyleAttr;
    private final int mPopupStyleRes;
    private MenuPresenter.Callback mPresenterCallback;
    private int mRawDropDownGravity;
    public boolean mShouldCloseImmediately;
    private boolean mShowTitle;
    public final List<CascadingMenuInfo> mShowingMenus;
    public View mShownAnchorView;
    public final Handler mSubMenuHoverHandler;
    public ViewTreeObserver mTreeObserver;
    private int mXOffset;
    private int mYOffset;

    /* renamed from: androidx.appcompat.view.menu.CascadingMenuPopup$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass1 implements ViewTreeObserver.OnGlobalLayoutListener {
        public final /* synthetic */ CascadingMenuPopup this$0;

        public AnonymousClass1(CascadingMenuPopup cascadingMenuPopup) {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
        }
    }

    /* renamed from: androidx.appcompat.view.menu.CascadingMenuPopup$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass2 implements View.OnAttachStateChangeListener {
        public final /* synthetic */ CascadingMenuPopup this$0;

        public AnonymousClass2(CascadingMenuPopup cascadingMenuPopup) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* renamed from: androidx.appcompat.view.menu.CascadingMenuPopup$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass3 implements MenuItemHoverListener {
        public final /* synthetic */ CascadingMenuPopup this$0;

        /* renamed from: androidx.appcompat.view.menu.CascadingMenuPopup$3$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public class AnonymousClass1 implements Runnable {
            public final /* synthetic */ AnonymousClass3 this$1;
            public final /* synthetic */ MenuItem val$item;
            public final /* synthetic */ MenuBuilder val$menu;
            public final /* synthetic */ CascadingMenuInfo val$nextInfo;

            public AnonymousClass1(AnonymousClass3 anonymousClass3, CascadingMenuInfo cascadingMenuInfo, MenuItem menuItem, MenuBuilder menuBuilder) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        public AnonymousClass3(CascadingMenuPopup cascadingMenuPopup) {
        }

        @Override // androidx.appcompat.widget.MenuItemHoverListener
        public void onItemHoverEnter(@NonNull MenuBuilder menuBuilder, @NonNull MenuItem menuItem) {
        }

        @Override // androidx.appcompat.widget.MenuItemHoverListener
        public void onItemHoverExit(@NonNull MenuBuilder menuBuilder, @NonNull MenuItem menuItem) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class CascadingMenuInfo {
        public final MenuBuilder menu;
        public final int position;
        public final MenuPopupWindow window;

        public CascadingMenuInfo(@NonNull MenuPopupWindow menuPopupWindow, @NonNull MenuBuilder menuBuilder, int i2) {
        }

        public ListView getListView() {
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public @interface HorizPosition {
    }

    public CascadingMenuPopup(@NonNull Context context, @NonNull View view, @AttrRes int i2, @StyleRes int i3, boolean z) {
    }

    private MenuPopupWindow createPopupWindow() {
    }

    private int findIndexOfAddedMenu(@NonNull MenuBuilder menuBuilder) {
    }

    private MenuItem findMenuItemForSubmenu(@NonNull MenuBuilder menuBuilder, @NonNull MenuBuilder menuBuilder2) {
    }

    @Nullable
    private View findParentViewForSubmenu(@NonNull CascadingMenuInfo cascadingMenuInfo, @NonNull MenuBuilder menuBuilder) {
    }

    private int getInitialMenuPosition() {
    }

    private int getNextMenuPosition(int i2) {
    }

    private void showMenu(@NonNull MenuBuilder menuBuilder) {
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    public void addMenu(MenuBuilder menuBuilder) {
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    public boolean closeMenuOnSubMenuOpened() {
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public void dismiss() {
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public boolean flagActionItems() {
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public ListView getListView() {
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public boolean isShowing() {
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void onCloseMenu(MenuBuilder menuBuilder, boolean z) {
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i2, KeyEvent keyEvent) {
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void onRestoreInstanceState(Parcelable parcelable) {
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public Parcelable onSaveInstanceState() {
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public boolean onSubMenuSelected(SubMenuBuilder subMenuBuilder) {
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    public void setAnchorView(@NonNull View view) {
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void setCallback(MenuPresenter.Callback callback) {
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    public void setForceShowIcon(boolean z) {
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    public void setGravity(int i2) {
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    public void setHorizontalOffset(int i2) {
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    public void setOnDismissListener(PopupWindow.OnDismissListener onDismissListener) {
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    public void setShowTitle(boolean z) {
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    public void setVerticalOffset(int i2) {
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public void show() {
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void updateMenuView(boolean z) {
    }
}
