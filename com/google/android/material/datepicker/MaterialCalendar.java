package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.annotation.VisibleForTesting;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class MaterialCalendar<S> extends PickerFragment<S> {
    private static final String CALENDAR_CONSTRAINTS_KEY = "CALENDAR_CONSTRAINTS_KEY";
    private static final String CURRENT_MONTH_KEY = "CURRENT_MONTH_KEY";
    private static final String GRID_SELECTOR_KEY = "GRID_SELECTOR_KEY";
    @VisibleForTesting
    public static final Object MONTHS_VIEW_GROUP_TAG = null;
    @VisibleForTesting
    public static final Object NAVIGATION_NEXT_TAG = null;
    @VisibleForTesting
    public static final Object NAVIGATION_PREV_TAG = null;
    @VisibleForTesting
    public static final Object SELECTOR_TOGGLE_TAG = null;
    private static final int SMOOTH_SCROLL_MAX = 3;
    private static final String THEME_RES_ID_KEY = "THEME_RES_ID_KEY";
    @Nullable
    private CalendarConstraints calendarConstraints;
    private CalendarSelector calendarSelector;
    private CalendarStyle calendarStyle;
    @Nullable
    private Month current;
    @Nullable
    private DateSelector<S> dateSelector;
    private View dayFrame;
    private RecyclerView recyclerView;
    @StyleRes
    private int themeResId;
    private View yearFrame;
    private RecyclerView yearSelector;

    /* renamed from: com.google.android.material.datepicker.MaterialCalendar$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass1 extends AccessibilityDelegateCompat {
        public final /* synthetic */ MaterialCalendar this$0;

        public AnonymousClass1(MaterialCalendar materialCalendar) {
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityNodeInfo(View view, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        }
    }

    /* renamed from: com.google.android.material.datepicker.MaterialCalendar$10  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass10 implements Runnable {
        public final /* synthetic */ MaterialCalendar this$0;
        public final /* synthetic */ int val$position;

        public AnonymousClass10(MaterialCalendar materialCalendar, int i2) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.google.android.material.datepicker.MaterialCalendar$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass2 extends SmoothCalendarLayoutManager {
        public final /* synthetic */ MaterialCalendar this$0;
        public final /* synthetic */ int val$orientation;

        public AnonymousClass2(MaterialCalendar materialCalendar, Context context, int i2, boolean z, int i3) {
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        public void calculateExtraLayoutSpace(@NonNull RecyclerView.State state, @NonNull int[] iArr) {
        }
    }

    /* renamed from: com.google.android.material.datepicker.MaterialCalendar$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass3 implements OnDayClickListener {
        public final /* synthetic */ MaterialCalendar this$0;

        public AnonymousClass3(MaterialCalendar materialCalendar) {
        }

        @Override // com.google.android.material.datepicker.MaterialCalendar.OnDayClickListener
        public void onDayClick(long j2) {
        }
    }

    /* renamed from: com.google.android.material.datepicker.MaterialCalendar$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass4 extends RecyclerView.ItemDecoration {
        private final Calendar endItem;
        private final Calendar startItem;
        public final /* synthetic */ MaterialCalendar this$0;

        public AnonymousClass4(MaterialCalendar materialCalendar) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void onDraw(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.State state) {
        }
    }

    /* renamed from: com.google.android.material.datepicker.MaterialCalendar$5  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass5 extends AccessibilityDelegateCompat {
        public final /* synthetic */ MaterialCalendar this$0;

        public AnonymousClass5(MaterialCalendar materialCalendar) {
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityNodeInfo(View view, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        }
    }

    /* renamed from: com.google.android.material.datepicker.MaterialCalendar$6  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass6 extends RecyclerView.OnScrollListener {
        public final /* synthetic */ MaterialCalendar this$0;
        public final /* synthetic */ MaterialButton val$monthDropSelect;
        public final /* synthetic */ MonthsPagerAdapter val$monthsPagerAdapter;

        public AnonymousClass6(MaterialCalendar materialCalendar, MonthsPagerAdapter monthsPagerAdapter, MaterialButton materialButton) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int i2) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(@NonNull RecyclerView recyclerView, int i2, int i3) {
        }
    }

    /* renamed from: com.google.android.material.datepicker.MaterialCalendar$7  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass7 implements View.OnClickListener {
        public final /* synthetic */ MaterialCalendar this$0;

        public AnonymousClass7(MaterialCalendar materialCalendar) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.google.android.material.datepicker.MaterialCalendar$8  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass8 implements View.OnClickListener {
        public final /* synthetic */ MaterialCalendar this$0;
        public final /* synthetic */ MonthsPagerAdapter val$monthsPagerAdapter;

        public AnonymousClass8(MaterialCalendar materialCalendar, MonthsPagerAdapter monthsPagerAdapter) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.google.android.material.datepicker.MaterialCalendar$9  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass9 implements View.OnClickListener {
        public final /* synthetic */ MaterialCalendar this$0;
        public final /* synthetic */ MonthsPagerAdapter val$monthsPagerAdapter;

        public AnonymousClass9(MaterialCalendar materialCalendar, MonthsPagerAdapter monthsPagerAdapter) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class CalendarSelector {
        private static final /* synthetic */ CalendarSelector[] $VALUES = null;
        public static final CalendarSelector DAY = null;
        public static final CalendarSelector YEAR = null;

        private CalendarSelector(String str, int i2) {
        }

        public static CalendarSelector valueOf(String str) {
        }

        public static CalendarSelector[] values() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public interface OnDayClickListener {
        void onDayClick(long j2);
    }

    public static /* synthetic */ RecyclerView access$000(MaterialCalendar materialCalendar) {
    }

    public static /* synthetic */ CalendarConstraints access$100(MaterialCalendar materialCalendar) {
    }

    public static /* synthetic */ DateSelector access$200(MaterialCalendar materialCalendar) {
    }

    public static /* synthetic */ RecyclerView access$300(MaterialCalendar materialCalendar) {
    }

    public static /* synthetic */ CalendarStyle access$400(MaterialCalendar materialCalendar) {
    }

    public static /* synthetic */ View access$500(MaterialCalendar materialCalendar) {
    }

    public static /* synthetic */ Month access$602(MaterialCalendar materialCalendar, Month month) {
    }

    private void addActionsToMonthNavigation(@NonNull View view, @NonNull MonthsPagerAdapter monthsPagerAdapter) {
    }

    @NonNull
    private RecyclerView.ItemDecoration createItemDecoration() {
    }

    @Px
    public static int getDayHeight(@NonNull Context context) {
    }

    @NonNull
    public static <T> MaterialCalendar<T> newInstance(@NonNull DateSelector<T> dateSelector, @StyleRes int i2, @NonNull CalendarConstraints calendarConstraints) {
    }

    private void postSmoothRecyclerViewScroll(int i2) {
    }

    @Override // com.google.android.material.datepicker.PickerFragment
    public boolean addOnSelectionChangedListener(@NonNull OnSelectionChangedListener<S> onSelectionChangedListener) {
    }

    @Nullable
    public CalendarConstraints getCalendarConstraints() {
    }

    public CalendarStyle getCalendarStyle() {
    }

    @Nullable
    public Month getCurrentMonth() {
    }

    @Override // com.google.android.material.datepicker.PickerFragment
    @Nullable
    public DateSelector<S> getDateSelector() {
    }

    @NonNull
    public LinearLayoutManager getLayoutManager() {
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
    }

    @Override // androidx.fragment.app.Fragment
    @NonNull
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NonNull Bundle bundle) {
    }

    public void setCurrentMonth(Month month) {
    }

    public void setSelector(CalendarSelector calendarSelector) {
    }

    public void toggleVisibleSelector() {
    }
}
