package com.showstartfans.activity.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.showstartfans.activity.model.OrderDetailBean;
import com.showstartfans.activity.model.OrderExpressBean;
import com.showstartfans.activity.model.OrderTicketInfoBean;
import h.u.a.c.i0.n0;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: OrderEntityTicketsCenterView.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004B\u001b\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B#\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0016\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\tJ\u001e\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\t2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0002R\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000e¨\u0006\u001b"}, d2 = {"Lcom/showstartfans/activity/view/OrderEntityTicketsCenterView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "adapter", "Lcom/showstartfans/activity/activitys/pay/TicketManStyleAdapter;", "getAdapter", "()Lcom/showstartfans/activity/activitys/pay/TicketManStyleAdapter;", "adapter$delegate", "Lkotlin/Lazy;", "bindData", "", "bean", "Lcom/showstartfans/activity/model/OrderDetailBean;", "orderBeanType", "setLogistice", "orderId", "logisticsList", "", "Lcom/showstartfans/activity/model/OrderExpressBean;", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class OrderEntityTicketsCenterView extends LinearLayout {
    @NotNull
    public Map<Integer, View> b;
    @NotNull
    private final Lazy c;

    /* compiled from: OrderEntityTicketsCenterView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/showstartfans/activity/activitys/pay/TicketManStyleAdapter;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a extends Lambda implements Function0<n0> {
        public final /* synthetic */ OrderEntityTicketsCenterView this$0;

        public a(OrderEntityTicketsCenterView orderEntityTicketsCenterView) {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ n0 invoke() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final n0 invoke() {
        }
    }

    public OrderEntityTicketsCenterView(@Nullable Context context) {
    }

    private static final void d(OrderTicketInfoBean orderTicketInfoBean, OrderEntityTicketsCenterView orderEntityTicketsCenterView, View view) {
    }

    public static /* synthetic */ void e(OrderTicketInfoBean orderTicketInfoBean, OrderEntityTicketsCenterView orderEntityTicketsCenterView, View view) {
    }

    public static /* synthetic */ void f(OrderEntityTicketsCenterView orderEntityTicketsCenterView, int i2, View view) {
    }

    private final void g(int i2, List<? extends OrderExpressBean> list) {
    }

    private final n0 getAdapter() {
    }

    private static final void h(OrderEntityTicketsCenterView orderEntityTicketsCenterView, int i2, View view) {
    }

    public void a() {
    }

    @Nullable
    public View b(int i2) {
    }

    public final void c(@NotNull OrderDetailBean orderDetailBean, int i2) {
    }

    public OrderEntityTicketsCenterView(@Nullable Context context, @Nullable AttributeSet attributeSet) {
    }

    public OrderEntityTicketsCenterView(@Nullable Context context, @Nullable AttributeSet attributeSet, int i2) {
    }
}
