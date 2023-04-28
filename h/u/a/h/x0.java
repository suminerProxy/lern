package h.u.a.h;

import android.app.Dialog;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.showstartfans.activity.model.TagBean;
import com.tencent.ugc.videoprocessor.watermark.data.AnimatedPasterJsonConfig;
import com.umeng.analytics.pro.am;
import h.u.a.d.k1;
import h.u.a.g.y9;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TagDialog.kt */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u0012H\u0002J\b\u0010\u001f\u001a\u00020\u0012H\u0016J\u0012\u0010 \u001a\u00020!2\b\u0010\u0011\u001a\u0004\u0018\u00010\tH\u0002J\u0012\u0010\"\u001a\u00020\u00122\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\u0012\u0010%\u001a\u00020&2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\u0012\u0010'\u001a\u00020\u00122\b\u0010\u0010\u001a\u0004\u0018\u00010(H\u0002J\u0016\u0010)\u001a\u00020\u00122\u000e\u0010*\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010+R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.¢\u0006\u0002\n\u0000R?\u0010\r\u001a'\u0012\u0015\u0012\u0013\u0018\u00010\t¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000ej\u0004\u0018\u0001`\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006,"}, d2 = {"Lcom/showstartfans/activity/dialog/TagDialog;", "Lcom/taihebase/activity/view/bottomsheet/BaseBottomSheetDialogFragment;", "act", "Landroidx/appcompat/app/AppCompatActivity;", "(Landroidx/appcompat/app/AppCompatActivity;)V", "adapter", "Lcom/showstartfans/activity/adapter/SearchTagAdapter;", "alreadyData", "Ljava/util/ArrayList;", "Lcom/showstartfans/activity/model/TagBean;", "Lkotlin/collections/ArrayList;", "binding", "Lcom/showstartfans/activity/databinding/DialogTagBinding;", "onChekcTagListener", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "bean", "", "Lcom/showstartfans/activity/adapter/OnChekcTagListener;", "getOnChekcTagListener", "()Lkotlin/jvm/functions/Function1;", "setOnChekcTagListener", "(Lkotlin/jvm/functions/Function1;)V", "getDialogView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "getRecommendData", "initView", "isContains", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateDialog", "Landroid/app/Dialog;", "searchData", "", "show", "datas", "", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class x0 extends h.y.a.o.y.a {
    @NotNull

    /* renamed from: e  reason: collision with root package name */
    public Map<Integer, View> f24332e;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    private Function1<? super TagBean, Unit> f24333f;

    /* renamed from: g  reason: collision with root package name */
    private y9 f24334g;
    @Nullable

    /* renamed from: h  reason: collision with root package name */
    private k1 f24335h;
    @NotNull

    /* renamed from: i  reason: collision with root package name */
    private ArrayList<TagBean> f24336i;

    /* compiled from: TextView.kt */
    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J*\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016J*\u0010\r\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016¨\u0006\u000f¸\u0006\u0000"}, d2 = {"androidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1", "Landroid/text/TextWatcher;", "afterTextChanged", "", am.aB, "Landroid/text/Editable;", "beforeTextChanged", "text", "", "start", "", AnimatedPasterJsonConfig.CONFIG_COUNT, TtmlNode.ANNOTATION_POSITION_AFTER, "onTextChanged", TtmlNode.ANNOTATION_POSITION_BEFORE, "core-ktx_release"}, k = 1, mv = {1, 6, 0})
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a implements TextWatcher {
        public final /* synthetic */ x0 b;

        public a(x0 x0Var) {
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

    /* compiled from: TagDialog.kt */
    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002#\u0012\u0015\u0012\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u00060\u0001j\u0002`\u0007J\u0013\u0010\b\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¨\u0006\t"}, d2 = {"com/showstartfans/activity/dialog/TagDialog$initView$3", "Lkotlin/Function1;", "Lcom/showstartfans/activity/model/TagBean;", "Lkotlin/ParameterName;", "name", "bean", "", "Lcom/showstartfans/activity/adapter/OnChekcTagListener;", "invoke", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class b implements Function1<TagBean, Unit> {
        public final /* synthetic */ x0 b;

        public b(x0 x0Var) {
        }

        public void a(@Nullable TagBean tagBean) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(TagBean tagBean) {
        }
    }

    public x0(@NotNull AppCompatActivity appCompatActivity) {
    }

    public static final /* synthetic */ void h(x0 x0Var) {
    }

    public static final /* synthetic */ boolean i(x0 x0Var, TagBean tagBean) {
    }

    public static final /* synthetic */ void j(x0 x0Var, String str) {
    }

    private final void l() {
    }

    private static final void m(x0 x0Var, h.y.a.m.n nVar) {
    }

    private static final void n(x0 x0Var, View view) {
    }

    private final boolean q(TagBean tagBean) {
    }

    public static /* synthetic */ void r(x0 x0Var, h.y.a.m.n nVar) {
    }

    public static /* synthetic */ void s(x0 x0Var, String str, h.y.a.m.n nVar) {
    }

    public static /* synthetic */ void u(x0 x0Var, View view) {
    }

    private final void v(String str) {
    }

    private static final void w(x0 x0Var, String str, h.y.a.m.n nVar) {
    }

    @Override // h.y.a.o.y.a
    public void _$_clearFindViewByIdCache() {
    }

    @Override // h.y.a.o.y.a
    @Nullable
    public View _$_findCachedViewById(int i2) {
    }

    @Override // h.y.a.o.y.a
    @Nullable
    public View f(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup) {
    }

    @Override // h.y.a.o.y.a
    public void initView() {
    }

    @Nullable
    public final Function1<TagBean, Unit> k() {
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
    }

    @Override // h.y.a.o.y.a, com.google.android.material.bottomsheet.BottomSheetDialogFragment, androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    @NotNull
    public Dialog onCreateDialog(@Nullable Bundle bundle) {
    }

    @Override // h.y.a.o.y.a, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
    }

    public final void x(@Nullable Function1<? super TagBean, Unit> function1) {
    }

    public final void y(@Nullable List<TagBean> list) {
    }
}
