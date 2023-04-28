package com.showstartfans.activity.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.showstartfans.activity.model.MessageFollowBean;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CustomMessageItemView.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0010\u0010#\u001a\u00020\t2\b\u0010$\u001a\u0004\u0018\u00010!J\u0012\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010!H\u0002J\"\u0010(\u001a\u00020&2\b\u0010)\u001a\u0004\u0018\u00010!2\u0006\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0012\u001a\u00020\u0013J\b\u0010*\u001a\u00020&H\u0002J\b\u0010+\u001a\u00020&H\u0002J\b\u0010,\u001a\u00020&H\u0002J\b\u0010-\u001a\u00020&H\u0002J\b\u0010.\u001a\u00020&H\u0002J\b\u0010/\u001a\u00020&H\u0002R\u000e\u0010\u000b\u001a\u00020\tX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\tX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\tX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\tX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\tX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\tX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\tX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010 \u001a\u0004\u0018\u00010!X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\"\u001a\u0004\u0018\u00010\u001fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u00060"}, d2 = {"Lcom/showstartfans/activity/view/CustomMessageItemView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "TYPE_LIVE_THEME", "TYPE_SHOW_ALL", "TYPE_SHOW_NOTICE", "TYPE_STORE_GOODS", "TYPE_TEXT_ALL", "TYPE_VIDEO", "TYPE_WEEK", "isReplyed", "", "isSelf", "layout_Week", "layout_goods", "layout_live_theme", "layout_live_theme_main", "Landroid/widget/RelativeLayout;", "layout_show_all", "layout_show_notice", "Landroid/widget/LinearLayout;", "layout_video", "live_title", "Landroid/widget/TextView;", "mMessageBean", "Lcom/showstartfans/activity/model/MessageFollowBean;", "tv_title_view", "getViewType", "imMessageBean", "onClickItem", "", "bean", "setData", "messageBean", "setLayout_Goods", "setLayout_LiveTheme", "setLayout_ShowAll", "setLayout_ShowNotice", "setLayout_ShowWeek", "setLayout_Video", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class CustomMessageItemView extends FrameLayout {
    @NotNull
    public Map<Integer, View> b;
    private final int c;

    /* renamed from: d  reason: collision with root package name */
    private final int f6623d;

    /* renamed from: e  reason: collision with root package name */
    private final int f6624e;

    /* renamed from: f  reason: collision with root package name */
    private final int f6625f;

    /* renamed from: g  reason: collision with root package name */
    private final int f6626g;

    /* renamed from: h  reason: collision with root package name */
    private final int f6627h;

    /* renamed from: i  reason: collision with root package name */
    private final int f6628i;
    @Nullable

    /* renamed from: j  reason: collision with root package name */
    private TextView f6629j;
    @Nullable

    /* renamed from: k  reason: collision with root package name */
    private RelativeLayout f6630k;
    @Nullable

    /* renamed from: l  reason: collision with root package name */
    private LinearLayout f6631l;
    @Nullable

    /* renamed from: m  reason: collision with root package name */
    private FrameLayout f6632m;
    @Nullable

    /* renamed from: n  reason: collision with root package name */
    private FrameLayout f6633n;
    @Nullable

    /* renamed from: o  reason: collision with root package name */
    private FrameLayout f6634o;
    @Nullable

    /* renamed from: p  reason: collision with root package name */
    private FrameLayout f6635p;
    @Nullable
    private MessageFollowBean q;
    @Nullable
    private RelativeLayout r;
    @Nullable
    private TextView s;
    private boolean t;
    private boolean u;

    public CustomMessageItemView(@NotNull Context context) {
    }

    public static /* synthetic */ void d(CustomMessageItemView customMessageItemView, View view) {
    }

    public static /* synthetic */ void e(CustomMessageItemView customMessageItemView, AdapterView adapterView, View view, int i2, long j2) {
    }

    public static /* synthetic */ void f(CustomMessageItemView customMessageItemView, View view) {
    }

    public static /* synthetic */ void g(CustomMessageItemView customMessageItemView, View view) {
    }

    public static /* synthetic */ void h(CustomMessageItemView customMessageItemView, View view) {
    }

    public static /* synthetic */ void i(CustomMessageItemView customMessageItemView, int i2, View view) {
    }

    public static /* synthetic */ void j(CustomMessageItemView customMessageItemView, View view) {
    }

    private final void k(MessageFollowBean messageFollowBean) {
    }

    public static /* synthetic */ void m(CustomMessageItemView customMessageItemView, MessageFollowBean messageFollowBean, boolean z, boolean z2, int i2, Object obj) {
    }

    private final void n() {
    }

    private static final void o(CustomMessageItemView customMessageItemView, int i2, View view) {
    }

    private final void p() {
    }

    private static final void q(CustomMessageItemView customMessageItemView, View view) {
    }

    private final void r() {
    }

    private static final void s(CustomMessageItemView customMessageItemView, View view) {
    }

    private final void t() {
    }

    private static final void u(CustomMessageItemView customMessageItemView, View view) {
    }

    private final void v() {
    }

    private static final void w(CustomMessageItemView customMessageItemView, AdapterView adapterView, View view, int i2, long j2) {
    }

    private static final void x(CustomMessageItemView customMessageItemView, View view) {
    }

    private final void y() {
    }

    private static final void z(CustomMessageItemView customMessageItemView, View view) {
    }

    public void a() {
    }

    @Nullable
    public View b(int i2) {
    }

    public final int c(@Nullable MessageFollowBean messageFollowBean) {
    }

    public final void l(@Nullable MessageFollowBean messageFollowBean, boolean z, boolean z2) {
    }

    public CustomMessageItemView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
    }

    public CustomMessageItemView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i2) {
    }
}
