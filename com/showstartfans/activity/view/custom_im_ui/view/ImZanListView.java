package com.showstartfans.activity.view.custom_im_ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.showstartfans.activity.model.MessageLikeBean;
import com.tencent.imsdk.v2.V2TIMUserFullInfo;
import h.a.a.a.a.i.g;
import h.y.a.f.m;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ImZanListView.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0013B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0010\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/showstartfans/activity/view/custom_im_ui/view/ImZanListView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "adapter", "Lcom/showstartfans/activity/view/custom_im_ui/view/ImZanListView$likeAdapter;", "rvList", "Landroidx/recyclerview/widget/RecyclerView;", "setData", "", "messageLikeBean", "Lcom/showstartfans/activity/model/MessageLikeBean;", "likeAdapter", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class ImZanListView extends FrameLayout {
    @NotNull
    public Map<Integer, View> b;
    @Nullable
    private RecyclerView c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    private a f7213d;

    /* compiled from: ImZanListView.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0012B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J*\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0014J\u001a\u0010\u000e\u001a\u00020\t2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u000bH\u0014¨\u0006\u0013"}, d2 = {"Lcom/showstartfans/activity/view/custom_im_ui/view/ImZanListView$likeAdapter;", "Lcom/taihebase/activity/base/NewBaseRecycleAdapter;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "onBindViewHolder_impl", "", "mholder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemType", "", "original_position", g.C, "onCreateViewHolder_impl", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHodler", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a extends m<String> {

        /* compiled from: ImZanListView.kt */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0019\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/showstartfans/activity/view/custom_im_ui/view/ImZanListView$likeAdapter$ViewHodler;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Lcom/showstartfans/activity/view/custom_im_ui/view/ImZanListView$likeAdapter;Landroid/view/View;)V", "tvContent", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "getTvContent", "()Landroid/widget/TextView;", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
        /* renamed from: com.showstartfans.activity.view.custom_im_ui.view.ImZanListView$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
        public final class C0137a extends RecyclerView.ViewHolder {

            /* renamed from: a  reason: collision with root package name */
            private final TextView f7214a;
            public final /* synthetic */ a b;

            public C0137a(@NotNull a aVar, View view) {
            }

            public final TextView c() {
            }
        }

        public a(@NotNull Context context) {
        }

        public static /* synthetic */ void Q(a aVar, V2TIMUserFullInfo v2TIMUserFullInfo, View view) {
        }

        private static final void R(a aVar, V2TIMUserFullInfo v2TIMUserFullInfo, View view) {
        }

        @Override // h.y.a.f.m
        @NotNull
        public RecyclerView.ViewHolder C(@Nullable ViewGroup viewGroup, int i2) {
        }

        @Override // h.y.a.f.m
        public void z(@Nullable RecyclerView.ViewHolder viewHolder, int i2, int i3, int i4) {
        }
    }

    /* compiled from: ImZanListView.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "Lcom/tencent/imsdk/v2/V2TIMUserFullInfo;", "invoke", "(Ljava/util/List;)Lkotlin/Unit;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class b extends Lambda implements Function1<List<? extends V2TIMUserFullInfo>, Unit> {
        public final /* synthetic */ ImZanListView this$0;

        public b(ImZanListView imZanListView) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends V2TIMUserFullInfo> list) {
        }

        @Nullable
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Unit invoke2(@Nullable List<? extends V2TIMUserFullInfo> list) {
        }
    }

    public ImZanListView(@NotNull Context context) {
    }

    public static final /* synthetic */ a c(ImZanListView imZanListView) {
    }

    public void a() {
    }

    @Nullable
    public View b(int i2) {
    }

    public final void setData(@Nullable MessageLikeBean messageLikeBean) {
    }

    public ImZanListView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
    }

    public ImZanListView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i2) {
    }
}
