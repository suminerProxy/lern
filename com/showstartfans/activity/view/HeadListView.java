package com.showstartfans.activity.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.showstartfans.activity.model.Tag;
import h.a.a.a.a.i.g;
import h.u.a.d.o0;
import h.y.a.f.m;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import skin.support.widget.SkinCompatFrameLayout;

/* compiled from: HeadListView.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004B\u001b\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B#\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0018\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0016\u001a\u00020\tR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/showstartfans/activity/view/HeadListView;", "Lskin/support/widget/SkinCompatFrameLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "adapter", "Lcom/showstartfans/activity/adapter/HeadAdapter;", "mData", "Lcom/showstartfans/activity/model/Tag;", "rv_list", "Landroidx/recyclerview/widget/RecyclerView;", "tv_all_num", "Landroid/widget/TextView;", "setData", "", "bean", "type", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class HeadListView extends SkinCompatFrameLayout {
    @NotNull
    public Map<Integer, View> b;
    @NotNull
    private RecyclerView c;
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    private o0 f6709d;
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    private TextView f6710e;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    private Tag f6711f;

    /* compiled from: HeadListView.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/showstartfans/activity/view/HeadListView$2", "Lcom/taihebase/activity/base/NewBaseRecycleAdapter$OnItemClickListener;", "OnItemClick", "", g.C, "", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a implements m.b {
        public final /* synthetic */ HeadListView b;

        public a(HeadListView headListView) {
        }

        @Override // h.y.a.f.m.b
        public void c(int i2) {
        }
    }

    public HeadListView(@Nullable Context context) {
    }

    private static final void g(HeadListView headListView, View view) {
    }

    public static final /* synthetic */ Tag h(HeadListView headListView) {
    }

    public static /* synthetic */ void i(HeadListView headListView, View view) {
    }

    public void e() {
    }

    @Nullable
    public View f(int i2) {
    }

    public final void j(@Nullable Tag tag, int i2) {
    }

    public HeadListView(@Nullable Context context, @Nullable AttributeSet attributeSet) {
    }

    public HeadListView(@Nullable Context context, @Nullable AttributeSet attributeSet, int i2) {
    }
}
