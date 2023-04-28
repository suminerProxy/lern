package com.google.android.material.datepicker;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Collection;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class MonthAdapter extends BaseAdapter {
    public static final int MAXIMUM_WEEKS = 0;
    public final CalendarConstraints calendarConstraints;
    public CalendarStyle calendarStyle;
    public final DateSelector<?> dateSelector;
    public final Month month;
    private Collection<Long> previouslySelectedDates;

    public MonthAdapter(Month month, DateSelector<?> dateSelector, CalendarConstraints calendarConstraints) {
    }

    private void initializeStyles(Context context) {
    }

    private boolean isSelected(long j2) {
    }

    private void updateSelectedState(@Nullable TextView textView, long j2) {
    }

    private void updateSelectedStateForDate(MaterialCalendarGridView materialCalendarGridView, long j2) {
    }

    public int dayToPosition(int i2) {
    }

    public int firstPositionInMonth() {
    }

    @Override // android.widget.Adapter
    public int getCount() {
    }

    @Override // android.widget.Adapter
    @Nullable
    public /* bridge */ /* synthetic */ Object getItem(int i2) {
    }

    @Override // android.widget.Adapter
    public long getItemId(int i2) {
    }

    @Override // android.widget.Adapter
    @NonNull
    public /* bridge */ /* synthetic */ View getView(int i2, @Nullable View view, @NonNull ViewGroup viewGroup) {
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
    }

    public boolean isFirstInRow(int i2) {
    }

    public boolean isLastInRow(int i2) {
    }

    public int lastPositionInMonth() {
    }

    public int positionToDay(int i2) {
    }

    public void updateSelectedStates(MaterialCalendarGridView materialCalendarGridView) {
    }

    public boolean withinMonth(int i2) {
    }

    @Override // android.widget.Adapter
    @Nullable
    public Long getItem(int i2) {
    }

    @Override // android.widget.Adapter
    @NonNull
    public TextView getView(int i2, @Nullable View view, @NonNull ViewGroup viewGroup) {
    }
}
