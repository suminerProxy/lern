package androidx.appcompat.widget;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.annotation.AttrRes;
import androidx.annotation.MenuRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuPopupHelper;
import androidx.appcompat.view.menu.ShowableListMenu;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class PopupMenu {
    private final View mAnchor;
    private final Context mContext;
    private View.OnTouchListener mDragListener;
    private final MenuBuilder mMenu;
    public OnMenuItemClickListener mMenuItemClickListener;
    public OnDismissListener mOnDismissListener;
    public final MenuPopupHelper mPopup;

    /* renamed from: androidx.appcompat.widget.PopupMenu$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass1 implements MenuBuilder.Callback {
        public final /* synthetic */ PopupMenu this$0;

        public AnonymousClass1(PopupMenu popupMenu) {
        }

        @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
        public boolean onMenuItemSelected(@NonNull MenuBuilder menuBuilder, @NonNull MenuItem menuItem) {
        }

        @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
        public void onMenuModeChange(@NonNull MenuBuilder menuBuilder) {
        }
    }

    /* renamed from: androidx.appcompat.widget.PopupMenu$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass2 implements PopupWindow.OnDismissListener {
        public final /* synthetic */ PopupMenu this$0;

        public AnonymousClass2(PopupMenu popupMenu) {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
        }
    }

    /* renamed from: androidx.appcompat.widget.PopupMenu$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass3 extends ForwardingListener {
        public final /* synthetic */ PopupMenu this$0;

        public AnonymousClass3(PopupMenu popupMenu, View view) {
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

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface OnDismissListener {
        void onDismiss(PopupMenu popupMenu);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface OnMenuItemClickListener {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public PopupMenu(@NonNull Context context, @NonNull View view) {
    }

    public void dismiss() {
    }

    @NonNull
    public View.OnTouchListener getDragToOpenListener() {
    }

    public int getGravity() {
    }

    @NonNull
    public Menu getMenu() {
    }

    @NonNull
    public MenuInflater getMenuInflater() {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public ListView getMenuListView() {
    }

    public void inflate(@MenuRes int i2) {
    }

    public void setGravity(int i2) {
    }

    public void setOnDismissListener(@Nullable OnDismissListener onDismissListener) {
    }

    public void setOnMenuItemClickListener(@Nullable OnMenuItemClickListener onMenuItemClickListener) {
    }

    public void show() {
    }

    public PopupMenu(@NonNull Context context, @NonNull View view, int i2) {
    }

    public PopupMenu(@NonNull Context context, @NonNull View view, int i2, @AttrRes int i3, @StyleRes int i4) {
    }
}
