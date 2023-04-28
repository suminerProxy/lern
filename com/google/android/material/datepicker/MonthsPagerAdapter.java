package com.google.android.material.datepicker;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.MaterialCalendar;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class MonthsPagerAdapter extends RecyclerView.Adapter<ViewHolder> {
    @NonNull
    private final CalendarConstraints calendarConstraints;
    private final Context context;
    private final DateSelector<?> dateSelector;
    private final int itemHeight;
    private final MaterialCalendar.OnDayClickListener onDayClickListener;

    /* renamed from: com.google.android.material.datepicker.MonthsPagerAdapter$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass1 implements AdapterView.OnItemClickListener {
        public final /* synthetic */ MonthsPagerAdapter this$0;
        public final /* synthetic */ MaterialCalendarGridView val$monthGrid;

        public AnonymousClass1(MonthsPagerAdapter monthsPagerAdapter, MaterialCalendarGridView materialCalendarGridView) {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class ViewHolder extends RecyclerView.ViewHolder {
        public final MaterialCalendarGridView monthGrid;
        public final TextView monthTitle;

        public ViewHolder(@NonNull LinearLayout linearLayout, boolean z) {
        }
    }

    public MonthsPagerAdapter(@NonNull Context context, DateSelector<?> dateSelector, @NonNull CalendarConstraints calendarConstraints, MaterialCalendar.OnDayClickListener onDayClickListener) {
    }

    public static /* synthetic */ MaterialCalendar.OnDayClickListener access$000(MonthsPagerAdapter monthsPagerAdapter) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i2) {
    }

    @NonNull
    public Month getPageMonth(int i2) {
    }

    @NonNull
    public CharSequence getPageTitle(int i2) {
    }

    public int getPosition(@NonNull Month month) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public /* bridge */ /* synthetic */ void onBindViewHolder(@NonNull ViewHolder viewHolder, int i2) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    public /* bridge */ /* synthetic */ ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i2) {
    }

    /* renamed from: onBindViewHolder  reason: avoid collision after fix types in other method */
    public void onBindViewHolder2(@NonNull ViewHolder viewHolder, int i2) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    /* renamed from: onCreateViewHolder  reason: avoid collision after fix types in other method */
    public ViewHolder onCreateViewHolder2(@NonNull ViewGroup viewGroup, int i2) {
    }
}
