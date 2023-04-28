package com.showstartfans.activity.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.showstartfans.activity.model.GroupNoticeBean;
import com.showstartfans.activity.view.custom_im_ui.view.CustomMessageRecyclerView;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: GroupNoticeTipsView.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\u0013\u001a\u00020\u0014H\u0002J\u0006\u0010\u0015\u001a\u00020\u0014J\u0010\u0010\u0016\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\fJ\u0006\u0010\u0018\u001a\u00020\u0014R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/showstartfans/activity/view/GroupNoticeTipsView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mData", "Lcom/showstartfans/activity/model/GroupNoticeBean;", "getMData", "()Lcom/showstartfans/activity/model/GroupNoticeBean;", "setMData", "(Lcom/showstartfans/activity/model/GroupNoticeBean;)V", "tvContent", "Landroid/widget/TextView;", "OnClick", "", "close", "setData", "data", "show", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class GroupNoticeTipsView extends FrameLayout {
    @NotNull
    public Map<Integer, View> b;
    @Nullable
    private TextView c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    private GroupNoticeBean f6703d;

    /* compiled from: GroupNoticeTipsView.kt */
    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, d2 = {"com/showstartfans/activity/view/GroupNoticeTipsView$OnClick$1", "Lcom/showstartfans/activity/view/custom_im_ui/view/CustomMessageRecyclerView$OnMsgScrollListener;", "OnFail", "", "OnSuccess", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a implements CustomMessageRecyclerView.h {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ GroupNoticeTipsView f6704a;

        /* compiled from: GroupNoticeTipsView.kt */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
        /* renamed from: com.showstartfans.activity.view.GroupNoticeTipsView$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
        public static final class C0134a extends Lambda implements Function0<Unit> {
            public final /* synthetic */ GroupNoticeTipsView this$0;

            public C0134a(GroupNoticeTipsView groupNoticeTipsView) {
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }
        }

        public a(GroupNoticeTipsView groupNoticeTipsView) {
        }

        @Override // com.showstartfans.activity.view.custom_im_ui.view.CustomMessageRecyclerView.h
        public void a() {
        }

        @Override // com.showstartfans.activity.view.custom_im_ui.view.CustomMessageRecyclerView.h
        public void b() {
        }
    }

    public GroupNoticeTipsView(@NotNull Context context) {
    }

    private final void a() {
    }

    private static final void d(GroupNoticeTipsView groupNoticeTipsView, View view) {
    }

    public static /* synthetic */ void f(GroupNoticeTipsView groupNoticeTipsView, View view) {
    }

    public void b() {
    }

    @Nullable
    public View c(int i2) {
    }

    public final void e() {
    }

    public final void g() {
    }

    @Nullable
    public final GroupNoticeBean getMData() {
    }

    public final void setData(@Nullable GroupNoticeBean groupNoticeBean) {
    }

    public final void setMData(@Nullable GroupNoticeBean groupNoticeBean) {
    }

    public GroupNoticeTipsView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
    }

    public GroupNoticeTipsView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i2) {
    }
}
