package com.showstartfans.activity.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.showstartfans.activity.model.Facility;
import com.showstartfans.activity.model.HotelBean;
import com.taihebase.activity.widget.NonScrollListView;
import h.a.a.a.a.i.g;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ItemHotelStrategy_03.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0017\u0018B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0012\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016R\u001f\u0010\u000b\u001a\u00060\fR\u00020\u00008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/showstartfans/activity/view/ItemHotelStrategy_03;", "Lcom/showstartfans/activity/view/BaseItemHotelStrategy;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "adapter", "Lcom/showstartfans/activity/view/ItemHotelStrategy_03$ItemHotelStrategyAdapter;", "getAdapter", "()Lcom/showstartfans/activity/view/ItemHotelStrategy_03$ItemHotelStrategyAdapter;", "adapter$delegate", "Lkotlin/Lazy;", "list", "Lcom/taihebase/activity/widget/NonScrollListView;", "setData", "", "data", "Lcom/showstartfans/activity/model/HotelBean;", "GridAdapter", "ItemHotelStrategyAdapter", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class ItemHotelStrategy_03 extends BaseItemHotelStrategy {
    @NotNull
    public Map<Integer, View> c;
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    private final Lazy f6815d;
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    private NonScrollListView f6816e;

    /* compiled from: ItemHotelStrategy_03.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005J$\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016¨\u0006\r"}, d2 = {"Lcom/showstartfans/activity/view/ItemHotelStrategy_03$GridAdapter;", "Lcom/taihebase/activity/base/BaseListAdapter;", "", "context", "Landroid/content/Context;", "(Lcom/showstartfans/activity/view/ItemHotelStrategy_03;Landroid/content/Context;)V", "getView", "Landroid/view/View;", g.C, "", "convertView", "parent", "Landroid/view/ViewGroup;", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public final class a extends h.y.a.f.g<String> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ ItemHotelStrategy_03 f6817f;

        public a(@Nullable ItemHotelStrategy_03 itemHotelStrategy_03, Context context) {
        }

        @Override // h.y.a.f.g, android.widget.Adapter
        @NotNull
        public View getView(int i2, @Nullable View view, @Nullable ViewGroup viewGroup) {
        }
    }

    /* compiled from: ItemHotelStrategy_03.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005J$\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016¨\u0006\r"}, d2 = {"Lcom/showstartfans/activity/view/ItemHotelStrategy_03$ItemHotelStrategyAdapter;", "Lcom/taihebase/activity/base/BaseListAdapter;", "Lcom/showstartfans/activity/model/Facility;", "context", "Landroid/content/Context;", "(Lcom/showstartfans/activity/view/ItemHotelStrategy_03;Landroid/content/Context;)V", "getView", "Landroid/view/View;", g.C, "", "convertView", "parent", "Landroid/view/ViewGroup;", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public final class b extends h.y.a.f.g<Facility> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ ItemHotelStrategy_03 f6818f;

        public b(@Nullable ItemHotelStrategy_03 itemHotelStrategy_03, Context context) {
        }

        @Override // h.y.a.f.g, android.widget.Adapter
        @NotNull
        public View getView(int i2, @Nullable View view, @Nullable ViewGroup viewGroup) {
        }
    }

    /* compiled from: ItemHotelStrategy_03.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00060\u0001R\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/showstartfans/activity/view/ItemHotelStrategy_03$ItemHotelStrategyAdapter;", "Lcom/showstartfans/activity/view/ItemHotelStrategy_03;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class c extends Lambda implements Function0<b> {
        public final /* synthetic */ ItemHotelStrategy_03 this$0;

        public c(ItemHotelStrategy_03 itemHotelStrategy_03) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final b invoke() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ b invoke() {
        }
    }

    public ItemHotelStrategy_03(@NotNull Context context) {
    }

    private final b getAdapter() {
    }

    @Override // com.showstartfans.activity.view.BaseItemHotelStrategy
    public void a() {
    }

    @Override // com.showstartfans.activity.view.BaseItemHotelStrategy
    @Nullable
    public View b(int i2) {
    }

    @Override // com.showstartfans.activity.view.BaseItemHotelStrategy
    public void setData(@Nullable HotelBean hotelBean) {
    }

    public ItemHotelStrategy_03(@NotNull Context context, @Nullable AttributeSet attributeSet) {
    }

    public ItemHotelStrategy_03(@NotNull Context context, @Nullable AttributeSet attributeSet, int i2) {
    }
}
