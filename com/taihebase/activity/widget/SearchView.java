package com.taihebase.activity.widget;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.tencent.ugc.videoprocessor.watermark.data.AnimatedPasterJsonConfig;
import i.a.u0.c;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SearchView.kt */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B#\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u0012J\u0006\u0010\u0015\u001a\u00020\u0014J\u0006\u0010\u0016\u001a\u00020\u0014J\u0006\u0010\u0017\u001a\u00020\u0014J\u0010\u0010\u0018\u001a\u00020\u00142\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aJ\u000e\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u001aJJ\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020 28\u0010!\u001a4\u0012\u0013\u0012\u00110\u001a¢\u0006\f\b#\u0012\b\b$\u0012\u0004\b\b(\u001c\u0012\u0013\u0012\u00110 ¢\u0006\f\b#\u0012\b\b$\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020\u0014\u0018\u00010\"R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lcom/taihebase/activity/widget/SearchView;", "Landroid/widget/FrameLayout;", "ctx", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "context", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "searchClear", "Landroid/view/View;", "searchFinish", "searchInput", "Landroid/widget/EditText;", "textWatcher", "Landroid/text/TextWatcher;", "addTextChangedListener", "", "clearInput", "hideFinishButtom", "looseInputFocus", "setInputHintText", "hint", "", "setInputText", "text", "setOnSearchListener", "Lio/reactivex/disposables/Disposable;", "needClick", "", "listener", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "clickSearch", "module_common_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class SearchView extends FrameLayout {
    @NotNull
    public Map<Integer, View> b;
    @NotNull
    private Context c;
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    private final View f8208d;
    @NotNull

    /* renamed from: e  reason: collision with root package name */
    private final View f8209e;
    @NotNull

    /* renamed from: f  reason: collision with root package name */
    private final EditText f8210f;
    @Nullable

    /* renamed from: g  reason: collision with root package name */
    private TextWatcher f8211g;

    /* compiled from: SearchView.kt */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J*\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016J*\u0010\f\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\u000e"}, d2 = {"com/taihebase/activity/widget/SearchView$3", "Landroid/text/TextWatcher;", "afterTextChanged", "", "text", "Landroid/text/Editable;", "beforeTextChanged", "", "start", "", AnimatedPasterJsonConfig.CONFIG_COUNT, TtmlNode.ANNOTATION_POSITION_AFTER, "onTextChanged", TtmlNode.ANNOTATION_POSITION_BEFORE, "module_common_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a implements TextWatcher {
        public final /* synthetic */ SearchView b;

        public a(SearchView searchView) {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(@Nullable Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(@Nullable CharSequence charSequence, int i2, int i3, int i4) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(@Nullable CharSequence charSequence, int i2, int i3, int i4) {
        }
    }

    public /* synthetic */ SearchView(Context context, AttributeSet attributeSet, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
    }

    private static final void c(Context context, View view) {
    }

    private static final void d(SearchView searchView, View view) {
    }

    public static final /* synthetic */ View e(SearchView searchView) {
    }

    public static final /* synthetic */ TextWatcher f(SearchView searchView) {
    }

    public static /* synthetic */ boolean j(Function2 function2, SearchView searchView, TextView textView, int i2, KeyEvent keyEvent) {
    }

    public static /* synthetic */ void k(Function2 function2, CharSequence charSequence) {
    }

    public static /* synthetic */ void l(Context context, View view) {
    }

    public static /* synthetic */ void m(SearchView searchView, View view) {
    }

    public static /* synthetic */ c p(SearchView searchView, boolean z, Function2 function2, int i2, Object obj) {
    }

    private static final boolean q(Function2 function2, SearchView searchView, TextView textView, int i2, KeyEvent keyEvent) {
    }

    private static final void r(Function2 function2, CharSequence charSequence) {
    }

    public void a() {
    }

    @Nullable
    public View b(int i2) {
    }

    public final void g(@NotNull TextWatcher textWatcher) {
    }

    public final void h() {
    }

    public final void i() {
    }

    public final void n() {
    }

    @NotNull
    public final c o(boolean z, @Nullable Function2<? super String, ? super Boolean, Unit> function2) {
    }

    public final void setInputHintText(@Nullable String str) {
    }

    public final void setInputText(@NotNull String str) {
    }

    public SearchView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i2) {
    }

    public SearchView(@NotNull Context context) {
    }

    public SearchView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
    }
}
