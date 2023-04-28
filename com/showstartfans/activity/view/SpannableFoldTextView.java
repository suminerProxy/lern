package com.showstartfans.activity.view;

import android.content.Context;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.umeng.analytics.pro.am;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SpannableFoldTextView.kt */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 ,2\u00020\u00012\u00020\u0002:\u0002,-B%\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u001a\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0002J\u001a\u0010 \u001a\u00020\u001b2\b\u0010!\u001a\u0004\u0018\u00010\"2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fJ\u0012\u0010#\u001a\u00020\u001b2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\u0012\u0010&\u001a\u00020\u001b2\b\u0010'\u001a\u0004\u0018\u00010\u0002H\u0016J\u001c\u0010(\u001a\u00020\u001b2\b\u0010!\u001a\u0004\u0018\u00010\"2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\u0018\u0010)\u001a\u00020\u001b2\u0006\u0010*\u001a\u00020+2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0002X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0018\u00010\u0017R\u00020\u0000X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006."}, d2 = {"Lcom/showstartfans/activity/view/SpannableFoldTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "Landroid/view/View$OnClickListener;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "flag", "", "isExpand", "isExpandSpanClick", "isParentClick", "isShowTipAfterExpand", "listener", "mExpandText", "", "mFoldText", "mOriginalText", "mShowMaxLine", "mSpan", "Lcom/showstartfans/activity/view/SpannableFoldTextView$ExpandSpan;", "mTipClickable", "mTipColor", "addTip", "", "span", "Landroid/text/SpannableStringBuilder;", "type", "Landroid/widget/TextView$BufferType;", "formatText", "text", "", "onClick", am.aE, "Landroid/view/View;", "setOnClickListener", "l", "setText", "translateText", TtmlNode.TAG_LAYOUT, "Landroid/text/Layout;", "Companion", "ExpandSpan", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class SpannableFoldTextView extends AppCompatTextView implements View.OnClickListener {
    @NotNull

    /* renamed from: p  reason: collision with root package name */
    public static final a f7043p = null;
    @NotNull
    private static final String q = "...";
    @NotNull
    public Map<Integer, View> b;
    private int c;
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    private String f7044d;
    @NotNull

    /* renamed from: e  reason: collision with root package name */
    private String f7045e;
    @NotNull

    /* renamed from: f  reason: collision with root package name */
    private String f7046f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f7047g;

    /* renamed from: h  reason: collision with root package name */
    private int f7048h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f7049i;
    @Nullable

    /* renamed from: j  reason: collision with root package name */
    private b f7050j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f7051k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f7052l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f7053m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f7054n;
    @Nullable

    /* renamed from: o  reason: collision with root package name */
    private View.OnClickListener f7055o;

    /* compiled from: SpannableFoldTextView.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/showstartfans/activity/view/SpannableFoldTextView$Companion;", "", "()V", "ELLIPSIZE_END", "", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* compiled from: SpannableFoldTextView.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"Lcom/showstartfans/activity/view/SpannableFoldTextView$ExpandSpan;", "Landroid/text/style/ClickableSpan;", "(Lcom/showstartfans/activity/view/SpannableFoldTextView;)V", "onClick", "", "widget", "Landroid/view/View;", "updateDrawState", "ds", "Landroid/text/TextPaint;", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public final class b extends ClickableSpan {
        public final /* synthetic */ SpannableFoldTextView b;

        public b(SpannableFoldTextView spannableFoldTextView) {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(@NotNull View view) {
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(@NotNull TextPaint textPaint) {
        }
    }

    /* compiled from: SpannableFoldTextView.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/showstartfans/activity/view/SpannableFoldTextView$formatText$1", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "onGlobalLayout", "", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class c implements ViewTreeObserver.OnGlobalLayoutListener {
        public final /* synthetic */ SpannableFoldTextView b;
        public final /* synthetic */ TextView.BufferType c;

        public c(SpannableFoldTextView spannableFoldTextView, TextView.BufferType bufferType) {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
        }
    }

    /* compiled from: SpannableFoldTextView.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/showstartfans/activity/view/SpannableFoldTextView$setText$1", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "onPreDraw", "", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class d implements ViewTreeObserver.OnPreDrawListener {
        public final /* synthetic */ SpannableFoldTextView b;
        public final /* synthetic */ CharSequence c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ TextView.BufferType f7056d;

        public d(SpannableFoldTextView spannableFoldTextView, CharSequence charSequence, TextView.BufferType bufferType) {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
        }
    }

    @JvmOverloads
    public SpannableFoldTextView(@NotNull Context context) {
    }

    @JvmOverloads
    public SpannableFoldTextView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
    }

    public /* synthetic */ SpannableFoldTextView(Context context, AttributeSet attributeSet, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
    }

    public static final /* synthetic */ String c(SpannableFoldTextView spannableFoldTextView) {
    }

    public static final /* synthetic */ boolean d(SpannableFoldTextView spannableFoldTextView) {
    }

    public static final /* synthetic */ int e(SpannableFoldTextView spannableFoldTextView) {
    }

    public static final /* synthetic */ boolean f(SpannableFoldTextView spannableFoldTextView) {
    }

    public static final /* synthetic */ void g(SpannableFoldTextView spannableFoldTextView, boolean z) {
    }

    public static final /* synthetic */ void h(SpannableFoldTextView spannableFoldTextView, boolean z) {
    }

    public static final /* synthetic */ void i(SpannableFoldTextView spannableFoldTextView, boolean z) {
    }

    private final void j(SpannableStringBuilder spannableStringBuilder, TextView.BufferType bufferType) {
    }

    public void a() {
    }

    @Nullable
    public View b(int i2) {
    }

    public final void k(@Nullable CharSequence charSequence, @Nullable TextView.BufferType bufferType) {
    }

    public final void l(@NotNull Layout layout, @Nullable TextView.BufferType bufferType) {
    }

    @Override // android.view.View.OnClickListener
    public void onClick(@Nullable View view) {
    }

    @Override // android.view.View
    public void setOnClickListener(@Nullable View.OnClickListener onClickListener) {
    }

    @Override // android.widget.TextView
    public void setText(@Nullable CharSequence charSequence, @Nullable TextView.BufferType bufferType) {
    }

    @JvmOverloads
    public SpannableFoldTextView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i2) {
    }
}
