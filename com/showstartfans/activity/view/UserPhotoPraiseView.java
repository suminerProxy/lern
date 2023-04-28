package com.showstartfans.activity.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.showstartfans.activity.model.Article;
import h.y.a.m.n;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import skin.support.widget.SkinCompatFrameLayout;

/* compiled from: UserPhotoPraiseView.kt */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010+\u001a\u00020 H\u0016J\u000e\u0010,\u001a\u00020 2\u0006\u0010-\u001a\u00020\u0013J\u000e\u0010.\u001a\u00020 2\u0006\u0010-\u001a\u00020\u0013J\n\u0010/\u001a\u0004\u0018\u00010\u0019H\u0014J\n\u00100\u001a\u0004\u0018\u00010*H\u0014J\u0012\u00101\u001a\u00020 2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0002J\b\u00102\u001a\u00020\tH\u0014J\u001c\u00103\u001a\u00020 2\b\u00104\u001a\u0004\u0018\u0001052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fJ,\u00103\u001a\u00020 2\u0006\u00106\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\f2\u0006\u00107\u001a\u00020\u00132\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u000e\u0010\u0015\u001a\u00020 2\u0006\u00108\u001a\u00020\u0013J\u001e\u00109\u001a\u00020 2\u0006\u0010&\u001a\u00020\t2\u0006\u0010'\u001a\u00020\t2\u0006\u0010:\u001a\u00020\tJ\u0006\u0010;\u001a\u00020 R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0017\u001a\u0004\b\u0012\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R=\u0010\u001b\u001a%\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020 \u0018\u00010\u001cj\u0004\u0018\u0001`!X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u000e\u0010&\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010)\u001a\u0004\u0018\u00010*X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006<"}, d2 = {"Lcom/showstartfans/activity/view/UserPhotoPraiseView;", "Lskin/support/widget/SkinCompatFrameLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "emptyStr", "", "followType", "followUserId", "formatPraiseNum", "imageHeight", "imageWidth", "isPress", "", "()Ljava/lang/Boolean;", "setPress", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "iv_zan", "Landroid/widget/ImageView;", "needText", "onPraiseListener", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "isPraise", "", "Lcom/showstartfans/activity/view/OnPraiseListener;", "getOnPraiseListener", "()Lkotlin/jvm/functions/Function1;", "setOnPraiseListener", "(Lkotlin/jvm/functions/Function1;)V", "resNormal", "resPress", "textColorRes", "tvZanNum", "Landroid/widget/TextView;", "applySkin", "doPraise", "praise", "doWish", "getZanImageView", "getZanTextNumView", "init", "onInitLayoutRes", "setData", "article", "Lcom/showstartfans/activity/model/Article;", "id", "collect", "press", "setStyle", "textColor", "triggerPraise", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class UserPhotoPraiseView extends SkinCompatFrameLayout {
    @NotNull
    public Map<Integer, View> b;
    private int c;

    /* renamed from: d  reason: collision with root package name */
    private int f7068d;

    /* renamed from: e  reason: collision with root package name */
    private int f7069e;
    @NotNull

    /* renamed from: f  reason: collision with root package name */
    private String f7070f;
    @NotNull

    /* renamed from: g  reason: collision with root package name */
    private String f7071g;
    @NotNull

    /* renamed from: h  reason: collision with root package name */
    private String f7072h;
    @Nullable

    /* renamed from: i  reason: collision with root package name */
    private Function1<? super Boolean, Unit> f7073i;
    @Nullable

    /* renamed from: j  reason: collision with root package name */
    private TextView f7074j;
    @Nullable

    /* renamed from: k  reason: collision with root package name */
    private ImageView f7075k;
    @Nullable

    /* renamed from: l  reason: collision with root package name */
    private Boolean f7076l;

    /* renamed from: m  reason: collision with root package name */
    private int f7077m;

    /* renamed from: n  reason: collision with root package name */
    private int f7078n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f7079o;
    @NotNull

    /* renamed from: p  reason: collision with root package name */
    private String f7080p;

    /* compiled from: UserPhotoPraiseView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a extends Lambda implements Function1<Boolean, Unit> {
        public final /* synthetic */ boolean $praise;
        public final /* synthetic */ UserPhotoPraiseView this$0;

        public a(UserPhotoPraiseView userPhotoPraiseView, boolean z) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        }

        public final void invoke(boolean z) {
        }
    }

    /* compiled from: UserPhotoPraiseView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class b extends Lambda implements Function1<Boolean, Unit> {
        public final /* synthetic */ boolean $praise;
        public final /* synthetic */ UserPhotoPraiseView this$0;

        public b(UserPhotoPraiseView userPhotoPraiseView, boolean z) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        }

        public final void invoke(boolean z) {
        }
    }

    public UserPhotoPraiseView(@NotNull Context context) {
    }

    private static final void i(UserPhotoPraiseView userPhotoPraiseView, boolean z, n nVar) {
    }

    private final void j(AttributeSet attributeSet) {
    }

    private static final void k(UserPhotoPraiseView userPhotoPraiseView, View view) {
    }

    public static /* synthetic */ void m(UserPhotoPraiseView userPhotoPraiseView, View view) {
    }

    public static /* synthetic */ void n(UserPhotoPraiseView userPhotoPraiseView, boolean z, n nVar) {
    }

    public static /* synthetic */ void r(UserPhotoPraiseView userPhotoPraiseView, Article article, String str, int i2, Object obj) {
    }

    public static /* synthetic */ void s(UserPhotoPraiseView userPhotoPraiseView, String str, String str2, boolean z, String str3, int i2, Object obj) {
    }

    @Override // skin.support.widget.SkinCompatFrameLayout, skin.support.widget.SkinCompatSupportable
    public void applySkin() {
    }

    public void e() {
    }

    @Nullable
    public View f(int i2) {
    }

    public final void g(boolean z) {
    }

    @Nullable
    public final Function1<Boolean, Unit> getOnPraiseListener() {
    }

    @Nullable
    public ImageView getZanImageView() {
    }

    @Nullable
    public TextView getZanTextNumView() {
    }

    public final void h(boolean z) {
    }

    @Nullable
    public final Boolean l() {
    }

    public int o() {
    }

    public final void p(@Nullable Article article, @Nullable String str) {
    }

    public final void q(@NotNull String str, @Nullable String str2, boolean z, @Nullable String str3) {
    }

    public final void setOnPraiseListener(@Nullable Function1<? super Boolean, Unit> function1) {
    }

    public final void setPress(@Nullable Boolean bool) {
    }

    public final void t(int i2, int i3, int i4) {
    }

    public final void u() {
    }

    public final void setPress(boolean z) {
    }

    public UserPhotoPraiseView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
    }

    public UserPhotoPraiseView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i2) {
    }
}
