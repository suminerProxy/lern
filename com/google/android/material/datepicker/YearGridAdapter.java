package com.google.android.material.datepicker;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class YearGridAdapter extends RecyclerView.Adapter<ViewHolder> {
    private final MaterialCalendar<?> materialCalendar;

    /* renamed from: com.google.android.material.datepicker.YearGridAdapter$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass1 implements View.OnClickListener {
        public final /* synthetic */ YearGridAdapter this$0;
        public final /* synthetic */ int val$year;

        public AnonymousClass1(YearGridAdapter yearGridAdapter, int i2) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class ViewHolder extends RecyclerView.ViewHolder {
        public final TextView textView;

        public ViewHolder(TextView textView) {
        }
    }

    public YearGridAdapter(MaterialCalendar<?> materialCalendar) {
    }

    public static /* synthetic */ MaterialCalendar access$000(YearGridAdapter yearGridAdapter) {
    }

    @NonNull
    private View.OnClickListener createYearClickListener(int i2) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
    }

    public int getPositionForYear(int i2) {
    }

    public int getYearForPosition(int i2) {
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
