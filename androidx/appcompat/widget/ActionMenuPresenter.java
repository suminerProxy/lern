package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.BaseMenuPresenter;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.view.menu.MenuPopupHelper;
import androidx.appcompat.view.menu.MenuPresenter;
import androidx.appcompat.view.menu.MenuView;
import androidx.appcompat.view.menu.ShowableListMenu;
import androidx.appcompat.view.menu.SubMenuBuilder;
import androidx.appcompat.widget.ActionMenuView;
import androidx.core.view.ActionProvider;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class ActionMenuPresenter extends BaseMenuPresenter implements ActionProvider.SubUiVisibilityListener {
    private static final String TAG = "ActionMenuPresenter";
    private final SparseBooleanArray mActionButtonGroups;
    public ActionButtonSubmenu mActionButtonPopup;
    private int mActionItemWidthLimit;
    private boolean mExpandedActionViewsExclusive;
    private int mMaxItems;
    private boolean mMaxItemsSet;
    private int mMinCellSize;
    public int mOpenSubMenuId;
    public OverflowMenuButton mOverflowButton;
    public OverflowPopup mOverflowPopup;
    private Drawable mPendingOverflowIcon;
    private boolean mPendingOverflowIconSet;
    private ActionMenuPopupCallback mPopupCallback;
    public final PopupPresenterCallback mPopupPresenterCallback;
    public OpenOverflowRunnable mPostedOpenRunnable;
    private boolean mReserveOverflow;
    private boolean mReserveOverflowSet;
    private boolean mStrictWidthLimit;
    private int mWidthLimit;
    private boolean mWidthLimitSet;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class ActionButtonSubmenu extends MenuPopupHelper {
        public final /* synthetic */ ActionMenuPresenter this$0;

        public ActionButtonSubmenu(ActionMenuPresenter actionMenuPresenter, Context context, SubMenuBuilder subMenuBuilder, View view) {
        }

        @Override // androidx.appcompat.view.menu.MenuPopupHelper
        public void onDismiss() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class ActionMenuPopupCallback extends ActionMenuItemView.PopupCallback {
        public final /* synthetic */ ActionMenuPresenter this$0;

        public ActionMenuPopupCallback(ActionMenuPresenter actionMenuPresenter) {
        }

        @Override // androidx.appcompat.view.menu.ActionMenuItemView.PopupCallback
        public ShowableListMenu getPopup() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class OpenOverflowRunnable implements Runnable {
        private OverflowPopup mPopup;
        public final /* synthetic */ ActionMenuPresenter this$0;

        public OpenOverflowRunnable(ActionMenuPresenter actionMenuPresenter, OverflowPopup overflowPopup) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class OverflowMenuButton extends AppCompatImageView implements ActionMenuView.ActionMenuChildView {
        public final /* synthetic */ ActionMenuPresenter this$0;

        /* renamed from: androidx.appcompat.widget.ActionMenuPresenter$OverflowMenuButton$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public class AnonymousClass1 extends ForwardingListener {
            public final /* synthetic */ OverflowMenuButton this$1;
            public final /* synthetic */ ActionMenuPresenter val$this$0;

            public AnonymousClass1(OverflowMenuButton overflowMenuButton, View view, ActionMenuPresenter actionMenuPresenter) {
            }

            @Override // androidx.appcompat.widget.ForwardingListener
            public ShowableListMenu getPopup() {
            }

            @Override // androidx.appcompat.widget.ForwardingListener
            public boolean onForwardingStarted() {
            }

            @Override // androidx.appcompat.widget.ForwardingListener
            public boolean onForwardingStopped() {
            }
        }

        public OverflowMenuButton(ActionMenuPresenter actionMenuPresenter, Context context) {
        }

        @Override // androidx.appcompat.widget.ActionMenuView.ActionMenuChildView
        public boolean needsDividerAfter() {
        }

        @Override // androidx.appcompat.widget.ActionMenuView.ActionMenuChildView
        public boolean needsDividerBefore() {
        }

        @Override // android.view.View
        public boolean performClick() {
        }

        @Override // android.widget.ImageView
        public boolean setFrame(int i2, int i3, int i4, int i5) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class OverflowPopup extends MenuPopupHelper {
        public final /* synthetic */ ActionMenuPresenter this$0;

        public OverflowPopup(ActionMenuPresenter actionMenuPresenter, Context context, MenuBuilder menuBuilder, View view, boolean z) {
        }

        @Override // androidx.appcompat.view.menu.MenuPopupHelper
        public void onDismiss() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class PopupPresenterCallback implements MenuPresenter.Callback {
        public final /* synthetic */ ActionMenuPresenter this$0;

        public PopupPresenterCallback(ActionMenuPresenter actionMenuPresenter) {
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter.Callback
        public void onCloseMenu(@NonNull MenuBuilder menuBuilder, boolean z) {
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter.Callback
        public boolean onOpenSubMenu(@NonNull MenuBuilder menuBuilder) {
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = null;
        public int openSubMenuId;

        /* renamed from: androidx.appcompat.widget.ActionMenuPresenter$SavedState$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public class AnonymousClass1 implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ SavedState createFromParcel(Parcel parcel) {
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ SavedState[] newArray(int i2) {
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel parcel) {
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int i2) {
            }
        }

        public SavedState() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
        }

        public SavedState(Parcel parcel) {
        }
    }

    public ActionMenuPresenter(Context context) {
    }

    public static /* synthetic */ MenuBuilder access$000(ActionMenuPresenter actionMenuPresenter) {
    }

    public static /* synthetic */ MenuBuilder access$100(ActionMenuPresenter actionMenuPresenter) {
    }

    public static /* synthetic */ MenuView access$200(ActionMenuPresenter actionMenuPresenter) {
    }

    public static /* synthetic */ MenuBuilder access$300(ActionMenuPresenter actionMenuPresenter) {
    }

    public static /* synthetic */ MenuBuilder access$400(ActionMenuPresenter actionMenuPresenter) {
    }

    public static /* synthetic */ MenuBuilder access$500(ActionMenuPresenter actionMenuPresenter) {
    }

    public static /* synthetic */ MenuView access$600(ActionMenuPresenter actionMenuPresenter) {
    }

    private View findViewForItem(MenuItem menuItem) {
    }

    @Override // androidx.appcompat.view.menu.BaseMenuPresenter
    public void bindItemView(MenuItemImpl menuItemImpl, MenuView.ItemView itemView) {
    }

    public boolean dismissPopupMenus() {
    }

    @Override // androidx.appcompat.view.menu.BaseMenuPresenter
    public boolean filterLeftoverView(ViewGroup viewGroup, int i2) {
    }

    @Override // androidx.appcompat.view.menu.BaseMenuPresenter, androidx.appcompat.view.menu.MenuPresenter
    public boolean flagActionItems() {
    }

    @Override // androidx.appcompat.view.menu.BaseMenuPresenter
    public View getItemView(MenuItemImpl menuItemImpl, View view, ViewGroup viewGroup) {
    }

    @Override // androidx.appcompat.view.menu.BaseMenuPresenter, androidx.appcompat.view.menu.MenuPresenter
    public MenuView getMenuView(ViewGroup viewGroup) {
    }

    public Drawable getOverflowIcon() {
    }

    public boolean hideOverflowMenu() {
    }

    public boolean hideSubMenus() {
    }

    @Override // androidx.appcompat.view.menu.BaseMenuPresenter, androidx.appcompat.view.menu.MenuPresenter
    public void initForMenu(@NonNull Context context, @Nullable MenuBuilder menuBuilder) {
    }

    public boolean isOverflowMenuShowPending() {
    }

    public boolean isOverflowMenuShowing() {
    }

    public boolean isOverflowReserved() {
    }

    @Override // androidx.appcompat.view.menu.BaseMenuPresenter, androidx.appcompat.view.menu.MenuPresenter
    public void onCloseMenu(MenuBuilder menuBuilder, boolean z) {
    }

    public void onConfigurationChanged(Configuration configuration) {
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void onRestoreInstanceState(Parcelable parcelable) {
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public Parcelable onSaveInstanceState() {
    }

    @Override // androidx.appcompat.view.menu.BaseMenuPresenter, androidx.appcompat.view.menu.MenuPresenter
    public boolean onSubMenuSelected(SubMenuBuilder subMenuBuilder) {
    }

    @Override // androidx.core.view.ActionProvider.SubUiVisibilityListener
    public void onSubUiVisibilityChanged(boolean z) {
    }

    public void setExpandedActionViewsExclusive(boolean z) {
    }

    public void setItemLimit(int i2) {
    }

    public void setMenuView(ActionMenuView actionMenuView) {
    }

    public void setOverflowIcon(Drawable drawable) {
    }

    public void setReserveOverflow(boolean z) {
    }

    public void setWidthLimit(int i2, boolean z) {
    }

    @Override // androidx.appcompat.view.menu.BaseMenuPresenter
    public boolean shouldIncludeItem(int i2, MenuItemImpl menuItemImpl) {
    }

    public boolean showOverflowMenu() {
    }

    @Override // androidx.appcompat.view.menu.BaseMenuPresenter, androidx.appcompat.view.menu.MenuPresenter
    public void updateMenuView(boolean z) {
    }
}
