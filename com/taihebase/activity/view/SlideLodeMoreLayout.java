package com.taihebase.activity.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.easypull.EasyPullLayout;
import com.sobot.network.http.model.SobotProgress;
import h.h.e;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SlideLodeMoreLayout.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004B\u001b\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B#\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0019\u0010\u0018\u001a\u0004\u0018\u00010\f2\b\u0010\u0019\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0002\u0010\u001aJ\b\u0010\u001b\u001a\u00020\u0010H\u0014J\u0006\u0010\u001c\u001a\u00020\u0010R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R*\u0010\u000e\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0018\u00010\u000fj\u0004\u0018\u0001`\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/taihebase/activity/view/SlideLodeMoreLayout;", "Lcom/easypull/EasyPullLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "bottomView", "Lcom/easypull/IEasyPullComponent;", "leftView", "onRightLoadListener", "Lkotlin/Function0;", "", "Lcom/taihebase/activity/view/OnRightLoadListener;", "getOnRightLoadListener", "()Lkotlin/jvm/functions/Function0;", "setOnRightLoadListener", "(Lkotlin/jvm/functions/Function0;)V", "rightView", "topView", "getComponent", "type", "(Ljava/lang/Integer;)Lcom/easypull/IEasyPullComponent;", "onFinishInflate", "onloadMoreComplete", "module_common_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class SlideLodeMoreLayout extends EasyPullLayout {
    @NotNull
    public Map<Integer, View> O;
    @Nullable
    private Function0<Unit> P;
    @Nullable
    private e Q;
    @Nullable
    private e R;
    @Nullable
    private e S;
    @Nullable
    private e T;

    /* compiled from: SlideLodeMoreLayout.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"<anonymous>", "", "type", "", SobotProgress.FRACTION, "", "changed", "", "invoke", "(Ljava/lang/Integer;Ljava/lang/Float;Z)V"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a extends Lambda implements Function3<Integer, Float, Boolean, Unit> {
        public final /* synthetic */ SlideLodeMoreLayout this$0;

        public a(SlideLodeMoreLayout slideLodeMoreLayout) {
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Integer num, Float f2, Boolean bool) {
        }

        public final void invoke(@Nullable Integer num, @Nullable Float f2, boolean z) {
        }
    }

    /* compiled from: SlideLodeMoreLayout.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/Integer;)V"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class b extends Lambda implements Function1<Integer, Unit> {
        public final /* synthetic */ SlideLodeMoreLayout this$0;

        public b(SlideLodeMoreLayout slideLodeMoreLayout) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@Nullable Integer num) {
        }
    }

    public SlideLodeMoreLayout(@Nullable Context context) {
    }

    public static final /* synthetic */ e w(SlideLodeMoreLayout slideLodeMoreLayout, Integer num) {
    }

    private final e x(Integer num) {
    }

    @Override // com.easypull.EasyPullLayout
    public void a() {
    }

    @Override // com.easypull.EasyPullLayout
    @Nullable
    public View b(int i2) {
    }

    @Nullable
    public final Function0<Unit> getOnRightLoadListener() {
    }

    @Override // com.easypull.EasyPullLayout, android.view.View
    public void onFinishInflate() {
    }

    public final void setOnRightLoadListener(@Nullable Function0<Unit> function0) {
    }

    public final void y() {
    }

    public SlideLodeMoreLayout(@Nullable Context context, @Nullable AttributeSet attributeSet) {
    }

    public SlideLodeMoreLayout(@Nullable Context context, @Nullable AttributeSet attributeSet, int i2) {
    }
}
