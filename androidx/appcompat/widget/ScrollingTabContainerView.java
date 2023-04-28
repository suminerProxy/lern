package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.Interpolator;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.appcompat.app.ActionBar;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class ScrollingTabContainerView extends HorizontalScrollView implements AdapterView.OnItemSelectedListener {
    private static final int FADE_DURATION = 200;
    private static final String TAG = "ScrollingTabContainerView";
    private static final Interpolator sAlphaInterpolator = null;
    private boolean mAllowCollapse;
    private int mContentHeight;
    public int mMaxTabWidth;
    private int mSelectedTabIndex;
    public int mStackedTabMaxWidth;
    private TabClickListener mTabClickListener;
    public LinearLayoutCompat mTabLayout;
    public Runnable mTabSelector;
    private Spinner mTabSpinner;
    public final VisibilityAnimListener mVisAnimListener;
    public ViewPropertyAnimator mVisibilityAnim;

    /* renamed from: androidx.appcompat.widget.ScrollingTabContainerView$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass1 implements Runnable {
        public final /* synthetic */ ScrollingTabContainerView this$0;
        public final /* synthetic */ View val$tabView;

        public AnonymousClass1(ScrollingTabContainerView scrollingTabContainerView, View view) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class TabAdapter extends BaseAdapter {
        public final /* synthetic */ ScrollingTabContainerView this$0;

        public TabAdapter(ScrollingTabContainerView scrollingTabContainerView) {
        }

        @Override // android.widget.Adapter
        public int getCount() {
        }

        @Override // android.widget.Adapter
        public Object getItem(int i2) {
        }

        @Override // android.widget.Adapter
        public long getItemId(int i2) {
        }

        @Override // android.widget.Adapter
        public View getView(int i2, View view, ViewGroup viewGroup) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class TabClickListener implements View.OnClickListener {
        public final /* synthetic */ ScrollingTabContainerView this$0;

        public TabClickListener(ScrollingTabContainerView scrollingTabContainerView) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class TabView extends LinearLayout {
        private static final String ACCESSIBILITY_CLASS_NAME = "androidx.appcompat.app.ActionBar$Tab";
        private final int[] BG_ATTRS;
        private View mCustomView;
        private ImageView mIconView;
        private ActionBar.Tab mTab;
        private TextView mTextView;
        public final /* synthetic */ ScrollingTabContainerView this$0;

        public TabView(ScrollingTabContainerView scrollingTabContainerView, Context context, ActionBar.Tab tab, boolean z) {
        }

        public void bindTab(ActionBar.Tab tab) {
        }

        public ActionBar.Tab getTab() {
        }

        @Override // android.view.View
        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int i2, int i3) {
        }

        @Override // android.view.View
        public void setSelected(boolean z) {
        }

        public void update() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class VisibilityAnimListener extends AnimatorListenerAdapter {
        private boolean mCanceled;
        private int mFinalVisibility;
        public final /* synthetic */ ScrollingTabContainerView this$0;

        public VisibilityAnimListener(ScrollingTabContainerView scrollingTabContainerView) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }

        public VisibilityAnimListener withFinalVisibility(ViewPropertyAnimator viewPropertyAnimator, int i2) {
        }
    }

    public ScrollingTabContainerView(@NonNull Context context) {
    }

    private Spinner createSpinner() {
    }

    private LinearLayoutCompat createTabLayout() {
    }

    private boolean isCollapsed() {
    }

    private void performCollapse() {
    }

    private boolean performExpand() {
    }

    public void addTab(ActionBar.Tab tab, boolean z) {
    }

    public void animateToTab(int i2) {
    }

    public void animateToVisibility(int i2) {
    }

    public TabView createTabView(ActionBar.Tab tab, boolean z) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView<?> adapterView, View view, int i2, long j2) {
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i2, int i3) {
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView<?> adapterView) {
    }

    public void removeAllTabs() {
    }

    public void removeTabAt(int i2) {
    }

    public void setAllowCollapse(boolean z) {
    }

    public void setContentHeight(int i2) {
    }

    public void setTabSelected(int i2) {
    }

    public void updateTab(int i2) {
    }

    public void addTab(ActionBar.Tab tab, int i2, boolean z) {
    }
}
