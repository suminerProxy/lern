package androidx.appcompat.widget;

import android.content.Context;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.appcompat.view.menu.ShowableListMenu;
import java.lang.reflect.Method;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class ListPopupWindow implements ShowableListMenu {
    private static final boolean DEBUG = false;
    public static final int EXPAND_LIST_TIMEOUT = 250;
    public static final int INPUT_METHOD_FROM_FOCUSABLE = 0;
    public static final int INPUT_METHOD_NEEDED = 1;
    public static final int INPUT_METHOD_NOT_NEEDED = 2;
    public static final int MATCH_PARENT = -1;
    public static final int POSITION_PROMPT_ABOVE = 0;
    public static final int POSITION_PROMPT_BELOW = 1;
    private static final String TAG = "ListPopupWindow";
    public static final int WRAP_CONTENT = -2;
    private static Method sGetMaxAvailableHeightMethod;
    private static Method sSetClipToWindowEnabledMethod;
    private static Method sSetEpicenterBoundsMethod;
    private ListAdapter mAdapter;
    private Context mContext;
    private boolean mDropDownAlwaysVisible;
    private View mDropDownAnchorView;
    private int mDropDownGravity;
    private int mDropDownHeight;
    private int mDropDownHorizontalOffset;
    public DropDownListView mDropDownList;
    private Drawable mDropDownListHighlight;
    private int mDropDownVerticalOffset;
    private boolean mDropDownVerticalOffsetSet;
    private int mDropDownWidth;
    private int mDropDownWindowLayoutType;
    private Rect mEpicenterBounds;
    private boolean mForceIgnoreOutsideTouch;
    public final Handler mHandler;
    private final ListSelectorHider mHideSelector;
    private AdapterView.OnItemClickListener mItemClickListener;
    private AdapterView.OnItemSelectedListener mItemSelectedListener;
    public int mListItemExpandMaximum;
    private boolean mModal;
    private DataSetObserver mObserver;
    private boolean mOverlapAnchor;
    private boolean mOverlapAnchorSet;
    public PopupWindow mPopup;
    private int mPromptPosition;
    private View mPromptView;
    public final ResizePopupRunnable mResizePopupRunnable;
    private final PopupScrollListener mScrollListener;
    private Runnable mShowDropDownRunnable;
    private final Rect mTempRect;
    private final PopupTouchInterceptor mTouchInterceptor;

    /* renamed from: androidx.appcompat.widget.ListPopupWindow$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass1 extends ForwardingListener {
        public final /* synthetic */ ListPopupWindow this$0;

        public AnonymousClass1(ListPopupWindow listPopupWindow, View view) {
        }

        @Override // androidx.appcompat.widget.ForwardingListener
        public /* bridge */ /* synthetic */ ShowableListMenu getPopup() {
        }

        @Override // androidx.appcompat.widget.ForwardingListener
        public ListPopupWindow getPopup() {
        }
    }

    /* renamed from: androidx.appcompat.widget.ListPopupWindow$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass2 implements Runnable {
        public final /* synthetic */ ListPopupWindow this$0;

        public AnonymousClass2(ListPopupWindow listPopupWindow) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: androidx.appcompat.widget.ListPopupWindow$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass3 implements AdapterView.OnItemSelectedListener {
        public final /* synthetic */ ListPopupWindow this$0;

        public AnonymousClass3(ListPopupWindow listPopupWindow) {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i2, long j2) {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class ListSelectorHider implements Runnable {
        public final /* synthetic */ ListPopupWindow this$0;

        public ListSelectorHider(ListPopupWindow listPopupWindow) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class PopupDataSetObserver extends DataSetObserver {
        public final /* synthetic */ ListPopupWindow this$0;

        public PopupDataSetObserver(ListPopupWindow listPopupWindow) {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class PopupScrollListener implements AbsListView.OnScrollListener {
        public final /* synthetic */ ListPopupWindow this$0;

        public PopupScrollListener(ListPopupWindow listPopupWindow) {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i2, int i3, int i4) {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i2) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class PopupTouchInterceptor implements View.OnTouchListener {
        public final /* synthetic */ ListPopupWindow this$0;

        public PopupTouchInterceptor(ListPopupWindow listPopupWindow) {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class ResizePopupRunnable implements Runnable {
        public final /* synthetic */ ListPopupWindow this$0;

        public ResizePopupRunnable(ListPopupWindow listPopupWindow) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    public ListPopupWindow(@NonNull Context context) {
    }

    private int buildDropDown() {
    }

    private int getMaxAvailableHeight(View view, int i2, boolean z) {
    }

    private static boolean isConfirmKey(int i2) {
    }

    private void removePromptView() {
    }

    private void setPopupClipToScreenEnabled(boolean z) {
    }

    public void clearListSelection() {
    }

    public View.OnTouchListener createDragToOpenListener(View view) {
    }

    @NonNull
    public DropDownListView createDropDownListView(Context context, boolean z) {
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public void dismiss() {
    }

    @Nullable
    public View getAnchorView() {
    }

    @StyleRes
    public int getAnimationStyle() {
    }

    @Nullable
    public Drawable getBackground() {
    }

    @Nullable
    public Rect getEpicenterBounds() {
    }

    public int getHeight() {
    }

    public int getHorizontalOffset() {
    }

    public int getInputMethodMode() {
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    @Nullable
    public ListView getListView() {
    }

    public int getPromptPosition() {
    }

    @Nullable
    public Object getSelectedItem() {
    }

    public long getSelectedItemId() {
    }

    public int getSelectedItemPosition() {
    }

    @Nullable
    public View getSelectedView() {
    }

    public int getSoftInputMode() {
    }

    public int getVerticalOffset() {
    }

    public int getWidth() {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public boolean isDropDownAlwaysVisible() {
    }

    public boolean isInputMethodNotNeeded() {
    }

    public boolean isModal() {
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public boolean isShowing() {
    }

    public boolean onKeyDown(int i2, @NonNull KeyEvent keyEvent) {
    }

    public boolean onKeyPreIme(int i2, @NonNull KeyEvent keyEvent) {
    }

    public boolean onKeyUp(int i2, @NonNull KeyEvent keyEvent) {
    }

    public boolean performItemClick(int i2) {
    }

    public void postShow() {
    }

    public void setAdapter(@Nullable ListAdapter listAdapter) {
    }

    public void setAnchorView(@Nullable View view) {
    }

    public void setAnimationStyle(@StyleRes int i2) {
    }

    public void setBackgroundDrawable(@Nullable Drawable drawable) {
    }

    public void setContentWidth(int i2) {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setDropDownAlwaysVisible(boolean z) {
    }

    public void setDropDownGravity(int i2) {
    }

    public void setEpicenterBounds(@Nullable Rect rect) {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setForceIgnoreOutsideTouch(boolean z) {
    }

    public void setHeight(int i2) {
    }

    public void setHorizontalOffset(int i2) {
    }

    public void setInputMethodMode(int i2) {
    }

    public void setListItemExpandMax(int i2) {
    }

    public void setListSelector(Drawable drawable) {
    }

    public void setModal(boolean z) {
    }

    public void setOnDismissListener(@Nullable PopupWindow.OnDismissListener onDismissListener) {
    }

    public void setOnItemClickListener(@Nullable AdapterView.OnItemClickListener onItemClickListener) {
    }

    public void setOnItemSelectedListener(@Nullable AdapterView.OnItemSelectedListener onItemSelectedListener) {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setOverlapAnchor(boolean z) {
    }

    public void setPromptPosition(int i2) {
    }

    public void setPromptView(@Nullable View view) {
    }

    public void setSelection(int i2) {
    }

    public void setSoftInputMode(int i2) {
    }

    public void setVerticalOffset(int i2) {
    }

    public void setWidth(int i2) {
    }

    public void setWindowLayoutType(int i2) {
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public void show() {
    }

    public ListPopupWindow(@NonNull Context context, @Nullable AttributeSet attributeSet) {
    }

    public ListPopupWindow(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i2) {
    }

    public ListPopupWindow(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i2, @StyleRes int i3) {
    }
}
