package com.showstartfans.activity.view;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import com.showstartfans.activity.model.AtBean;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: MediaTextView.kt */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0004+,-.B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007B\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ4\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u001a\u0010\u0014\u001a\u0016\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015j\n\u0012\u0004\u0012\u00020\u0016\u0018\u0001`\u00172\u0006\u0010\u0018\u001a\u00020\u0019J<\u0010\u001a\u001a\u0012\u0012\u0004\u0012\u00020\u001b0\u0015j\b\u0012\u0004\u0012\u00020\u001b`\u00172\u0006\u0010\u0012\u001a\u00020\u00132\u001a\u0010\u0014\u001a\u0016\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015j\n\u0012\u0004\u0012\u00020\u0016\u0018\u0001`\u0017H\u0002J<\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00020\u001b0\u0015j\b\u0012\u0004\u0012\u00020\u001b`\u00172\u0006\u0010\u0012\u001a\u00020\u00132\u001a\u0010\u0014\u001a\u0016\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015j\n\u0012\u0004\u0012\u00020\u0016\u0018\u0001`\u0017H\u0002J<\u0010\u001d\u001a\u0012\u0012\u0004\u0012\u00020\u001b0\u0015j\b\u0012\u0004\u0012\u00020\u001b`\u00172\u0006\u0010\u0012\u001a\u00020\u00132\u001a\u0010\u001e\u001a\u0016\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u0015j\n\u0012\u0004\u0012\u00020\u001b\u0018\u0001`\u0017H\u0002J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0013H\u0002J \u0010\"\u001a\u0012\u0012\u0004\u0012\u00020\u001b0\u0015j\b\u0012\u0004\u0012\u00020\u001b`\u00172\u0006\u0010\u0012\u001a\u00020\u0013H\u0002JY\u0010#\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u001a\u0010$\u001a\u0016\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015j\n\u0012\u0004\u0012\u00020\u0016\u0018\u0001`\u00172+\b\u0002\u0010%\u001a%\u0012\u0013\u0012\u00110\u0019¢\u0006\f\b'\u0012\b\b(\u0012\u0004\b\b()\u0012\u0004\u0012\u00020\u0011\u0018\u00010&j\u0004\u0018\u0001`*R\u001a\u0010\u000b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006/"}, d2 = {"Lcom/showstartfans/activity/view/MediaTextView;", "Lcom/showstartfans/activity/view/BaseClickTextView;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "SpanTextColor", "getSpanTextColor", "()I", "setSpanTextColor", "(I)V", "appendOurStyle", "", "content", "", "atBeans", "Ljava/util/ArrayList;", "Lcom/showstartfans/activity/model/AtBean;", "Lkotlin/collections/ArrayList;", "canClickAtinfo", "", "getAts", "Lcom/showstartfans/activity/view/MediaTextView$ContentInfoBean;", "getContentInfo", "getTexts", "others", "getUrlSpan", "Landroid/text/SpannableString;", "url", "getUrls", "setData", "attachInfo", "onExpandTextListener", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "showEndText", "Lcom/taihebase/activity/utils/OnExpandTextListener;", "ClickSpan", "ContentInfoBean", "OnAtClickListener", "OnClickTailListener", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class MediaTextView extends BaseClickTextView {
    @NotNull

    /* renamed from: f  reason: collision with root package name */
    public Map<Integer, View> f6854f;

    /* renamed from: g  reason: collision with root package name */
    private int f6855g;

    /* compiled from: MediaTextView.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0002\u0018\u00002\u00020\u0001B3\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\f\"\u0004\b\u001a\u0010\u000e¨\u0006\u001b"}, d2 = {"Lcom/showstartfans/activity/view/MediaTextView$ContentInfoBean;", "", "type", "", "startIndex", "endIndex", "text", "", "info", "Lcom/showstartfans/activity/model/AtBean;", "(IIILjava/lang/String;Lcom/showstartfans/activity/model/AtBean;)V", "getEndIndex", "()I", "setEndIndex", "(I)V", "getInfo", "()Lcom/showstartfans/activity/model/AtBean;", "setInfo", "(Lcom/showstartfans/activity/model/AtBean;)V", "getStartIndex", "setStartIndex", "getText", "()Ljava/lang/String;", "setText", "(Ljava/lang/String;)V", "getType", "setType", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private int f6857a;
        private int b;
        private int c;
        @Nullable

        /* renamed from: d  reason: collision with root package name */
        private String f6858d;
        @Nullable

        /* renamed from: e  reason: collision with root package name */
        private AtBean f6859e;

        public b(int i2, int i3, int i4, @Nullable String str, @Nullable AtBean atBean) {
        }

        public final int a() {
        }

        @Nullable
        public final AtBean b() {
        }

        public final int c() {
        }

        @Nullable
        public final String d() {
        }

        public final int e() {
        }

        public final void f(int i2) {
        }

        public final void g(@Nullable AtBean atBean) {
        }

        public final void h(int i2) {
        }

        public final void i(@Nullable String str) {
        }

        public final void j(int i2) {
        }
    }

    /* compiled from: MediaTextView.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/showstartfans/activity/view/MediaTextView$OnAtClickListener;", "Lcom/showstartfans/activity/view/MediaTextView$OnClickTailListener;", "bean", "Lcom/showstartfans/activity/view/MediaTextView$ContentInfoBean;", "(Lcom/showstartfans/activity/view/MediaTextView$ContentInfoBean;)V", "getBean", "()Lcom/showstartfans/activity/view/MediaTextView$ContentInfoBean;", "onClick", "", "view", "Landroid/view/View;", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class c implements d {
        @NotNull

        /* renamed from: a  reason: collision with root package name */
        private final b f6860a;

        public c(@NotNull b bVar) {
        }

        @NotNull
        public final b a() {
        }

        @Override // com.showstartfans.activity.view.MediaTextView.d
        public void onClick(@NotNull View view) {
        }
    }

    /* compiled from: MediaTextView.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/showstartfans/activity/view/MediaTextView$OnClickTailListener;", "", "onClick", "", "view", "Landroid/view/View;", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public interface d {
        void onClick(@NotNull View view);
    }

    /* compiled from: MediaTextView.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/showstartfans/activity/view/MediaTextView$setData$1", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "onGlobalLayout", "", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class e implements ViewTreeObserver.OnGlobalLayoutListener {
        public final /* synthetic */ MediaTextView b;
        public final /* synthetic */ Function1<Boolean, Unit> c;

        public e(MediaTextView mediaTextView, Function1<? super Boolean, Unit> function1) {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
        }
    }

    public MediaTextView(@NotNull Context context) {
    }

    private final ArrayList<b> g(String str, ArrayList<AtBean> arrayList) {
    }

    private final ArrayList<b> h(String str, ArrayList<AtBean> arrayList) {
    }

    private static final int i(b bVar, b bVar2) {
    }

    private static final int j(b bVar, b bVar2) {
    }

    private final ArrayList<b> k(String str, ArrayList<b> arrayList) {
    }

    private final SpannableString l(String str) {
    }

    private final ArrayList<b> m(String str) {
    }

    public static /* synthetic */ int n(b bVar, b bVar2) {
    }

    public static /* synthetic */ int o(b bVar, b bVar2) {
    }

    public static /* synthetic */ void q(MediaTextView mediaTextView, String str, ArrayList arrayList, Function1 function1, int i2, Object obj) {
    }

    @Override // com.showstartfans.activity.view.BaseClickTextView
    public void a() {
    }

    @Override // com.showstartfans.activity.view.BaseClickTextView
    @Nullable
    public View b(int i2) {
    }

    public final void f(@Nullable String str, @Nullable ArrayList<AtBean> arrayList, boolean z) {
    }

    public final int getSpanTextColor() {
    }

    public final void p(@Nullable String str, @Nullable ArrayList<AtBean> arrayList, @Nullable Function1<? super Boolean, Unit> function1) {
    }

    public final void setSpanTextColor(int i2) {
    }

    public MediaTextView(@NotNull Context context, @NotNull AttributeSet attributeSet) {
    }

    /* compiled from: MediaTextView.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0012"}, d2 = {"Lcom/showstartfans/activity/view/MediaTextView$ClickSpan;", "Landroid/text/style/ClickableSpan;", "listener", "Lcom/showstartfans/activity/view/MediaTextView$OnClickTailListener;", "httpUrl", "", "(Lcom/showstartfans/activity/view/MediaTextView;Lcom/showstartfans/activity/view/MediaTextView$OnClickTailListener;Ljava/lang/String;)V", "getHttpUrl", "()Ljava/lang/String;", "getListener", "()Lcom/showstartfans/activity/view/MediaTextView$OnClickTailListener;", "onClick", "", "widget", "Landroid/view/View;", "updateDrawState", "ds", "Landroid/text/TextPaint;", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public final class a extends ClickableSpan {
        @Nullable
        private final d b;
        @NotNull
        private final String c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ MediaTextView f6856d;

        public a(@Nullable MediaTextView mediaTextView, @NotNull d dVar, String str) {
        }

        @NotNull
        public final String a() {
        }

        @Nullable
        public final d b() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(@NotNull View view) {
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(@NotNull TextPaint textPaint) {
        }

        public /* synthetic */ a(MediaTextView mediaTextView, d dVar, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public MediaTextView(@NotNull Context context, @NotNull AttributeSet attributeSet, int i2) {
    }
}
