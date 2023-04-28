package androidx.appcompat.widget;

import android.content.Context;
import android.content.pm.ResolveInfo;
import android.database.DataSetObserver;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.ShowableListMenu;
import androidx.appcompat.widget.ActivityChooserModel;
import androidx.core.view.ActionProvider;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class ActivityChooserView extends ViewGroup implements ActivityChooserModel.ActivityChooserModelClient {
    private final View mActivityChooserContent;
    private final Drawable mActivityChooserContentBackground;
    public final ActivityChooserViewAdapter mAdapter;
    private final Callbacks mCallbacks;
    private int mDefaultActionButtonContentDescription;
    public final FrameLayout mDefaultActivityButton;
    private final ImageView mDefaultActivityButtonImage;
    public final FrameLayout mExpandActivityOverflowButton;
    private final ImageView mExpandActivityOverflowButtonImage;
    public int mInitialActivityCount;
    private boolean mIsAttachedToWindow;
    public boolean mIsSelectingDefaultActivity;
    private final int mListPopupMaxWidth;
    private ListPopupWindow mListPopupWindow;
    public final DataSetObserver mModelDataSetObserver;
    public PopupWindow.OnDismissListener mOnDismissListener;
    private final ViewTreeObserver.OnGlobalLayoutListener mOnGlobalLayoutListener;
    public ActionProvider mProvider;

    /* renamed from: androidx.appcompat.widget.ActivityChooserView$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass1 extends DataSetObserver {
        public final /* synthetic */ ActivityChooserView this$0;

        public AnonymousClass1(ActivityChooserView activityChooserView) {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
        }
    }

    /* renamed from: androidx.appcompat.widget.ActivityChooserView$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass2 implements ViewTreeObserver.OnGlobalLayoutListener {
        public final /* synthetic */ ActivityChooserView this$0;

        public AnonymousClass2(ActivityChooserView activityChooserView) {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
        }
    }

    /* renamed from: androidx.appcompat.widget.ActivityChooserView$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass3 extends View.AccessibilityDelegate {
        public final /* synthetic */ ActivityChooserView this$0;

        public AnonymousClass3(ActivityChooserView activityChooserView) {
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        }
    }

    /* renamed from: androidx.appcompat.widget.ActivityChooserView$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass4 extends ForwardingListener {
        public final /* synthetic */ ActivityChooserView this$0;

        public AnonymousClass4(ActivityChooserView activityChooserView, View view) {
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

    /* renamed from: androidx.appcompat.widget.ActivityChooserView$5  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass5 extends DataSetObserver {
        public final /* synthetic */ ActivityChooserView this$0;

        public AnonymousClass5(ActivityChooserView activityChooserView) {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class ActivityChooserViewAdapter extends BaseAdapter {
        private static final int ITEM_VIEW_TYPE_ACTIVITY = 0;
        private static final int ITEM_VIEW_TYPE_COUNT = 3;
        private static final int ITEM_VIEW_TYPE_FOOTER = 1;
        public static final int MAX_ACTIVITY_COUNT_DEFAULT = 4;
        public static final int MAX_ACTIVITY_COUNT_UNLIMITED = Integer.MAX_VALUE;
        private ActivityChooserModel mDataModel;
        private boolean mHighlightDefaultActivity;
        private int mMaxActivityCount;
        private boolean mShowDefaultActivity;
        private boolean mShowFooterView;
        public final /* synthetic */ ActivityChooserView this$0;

        public ActivityChooserViewAdapter(ActivityChooserView activityChooserView) {
        }

        public int getActivityCount() {
        }

        @Override // android.widget.Adapter
        public int getCount() {
        }

        public ActivityChooserModel getDataModel() {
        }

        public ResolveInfo getDefaultActivity() {
        }

        public int getHistorySize() {
        }

        @Override // android.widget.Adapter
        public Object getItem(int i2) {
        }

        @Override // android.widget.Adapter
        public long getItemId(int i2) {
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public int getItemViewType(int i2) {
        }

        public boolean getShowDefaultActivity() {
        }

        @Override // android.widget.Adapter
        public View getView(int i2, View view, ViewGroup viewGroup) {
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public int getViewTypeCount() {
        }

        public int measureContentWidth() {
        }

        public void setDataModel(ActivityChooserModel activityChooserModel) {
        }

        public void setMaxActivityCount(int i2) {
        }

        public void setShowDefaultActivity(boolean z, boolean z2) {
        }

        public void setShowFooterView(boolean z) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class Callbacks implements AdapterView.OnItemClickListener, View.OnClickListener, View.OnLongClickListener, PopupWindow.OnDismissListener {
        public final /* synthetic */ ActivityChooserView this$0;

        public Callbacks(ActivityChooserView activityChooserView) {
        }

        private void notifyOnDismissListener() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class InnerLayout extends LinearLayout {
        private static final int[] TINT_ATTRS = null;

        public InnerLayout(Context context, AttributeSet attributeSet) {
        }
    }

    public ActivityChooserView(@NonNull Context context) {
    }

    public boolean dismissPopup() {
    }

    public ActivityChooserModel getDataModel() {
    }

    public ListPopupWindow getListPopupWindow() {
    }

    public boolean isShowingPopup() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
    }

    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
    }

    @Override // androidx.appcompat.widget.ActivityChooserModel.ActivityChooserModelClient
    public void setActivityChooserModel(ActivityChooserModel activityChooserModel) {
    }

    public void setDefaultActionButtonContentDescription(int i2) {
    }

    public void setExpandActivityOverflowButtonContentDescription(int i2) {
    }

    public void setExpandActivityOverflowButtonDrawable(Drawable drawable) {
    }

    public void setInitialActivityCount(int i2) {
    }

    public void setOnDismissListener(PopupWindow.OnDismissListener onDismissListener) {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setProvider(ActionProvider actionProvider) {
    }

    public boolean showPopup() {
    }

    public void showPopupUnchecked(int i2) {
    }

    public void updateAppearance() {
    }

    public ActivityChooserView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
    }

    public ActivityChooserView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i2) {
    }
}
