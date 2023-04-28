package com.taihebase.activity.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import skin.support.widget.SkinCompatBackgroundHelper;
import skin.support.widget.SkinCompatSupportable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class RecycleEmptyView extends RecyclerView implements SkinCompatSupportable {
    private View b;
    private SkinCompatBackgroundHelper c;

    /* renamed from: d  reason: collision with root package name */
    private RecyclerView.AdapterDataObserver f8206d;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class a extends RecyclerView.AdapterDataObserver {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ RecycleEmptyView f8207a;

        public a(RecycleEmptyView recycleEmptyView) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onChanged() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeInserted(int i2, int i3) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeRemoved(int i2, int i3) {
        }
    }

    public RecycleEmptyView(Context context) {
    }

    public static /* synthetic */ void a(RecycleEmptyView recycleEmptyView) {
    }

    private void b() {
    }

    @Override // skin.support.widget.SkinCompatSupportable
    public void applySkin() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setAdapter(RecyclerView.Adapter adapter) {
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
    }

    public void setEmptyView(View view) {
    }

    public RecycleEmptyView(Context context, @Nullable AttributeSet attributeSet) {
    }

    public RecycleEmptyView(Context context, @Nullable AttributeSet attributeSet, int i2) {
    }
}
