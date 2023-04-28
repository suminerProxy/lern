package h.y.a.n;

import android.view.ViewTreeObserver;
import android.widget.TextView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TextViewUtils.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JI\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2)\u0010\u000b\u001a%\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u0004\u0018\u00010\fj\u0004\u0018\u0001`\u0011J\u0012\u0010\u0012\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0006H\u0007¨\u0006\u0014"}, d2 = {"Lcom/taihebase/activity/utils/TextViewUtils;", "", "()V", "makeTextViewResizable", "", "tv", "Landroid/widget/TextView;", "maxLine", "", "expandText", "", "onExpandTextListener", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "showEndText", "Lcom/taihebase/activity/utils/OnExpandTextListener;", "setTextGrey", "view", "module_common_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class a1 {
    @NotNull

    /* renamed from: a  reason: collision with root package name */
    public static final a1 f26268a = null;

    /* compiled from: TextViewUtils.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/taihebase/activity/utils/TextViewUtils$makeTextViewResizable$1", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "onGlobalLayout", "", "module_common_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public final /* synthetic */ TextView b;
        public final /* synthetic */ int c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ String f26269d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ Function1<Boolean, Unit> f26270e;

        public a(TextView textView, int i2, String str, Function1<? super Boolean, Unit> function1) {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
        }
    }

    private a1() {
    }

    @JvmStatic
    public static final void b(@Nullable TextView textView) {
    }

    public final void a(@NotNull TextView textView, int i2, @NotNull String str, @Nullable Function1<? super Boolean, Unit> function1) {
    }
}
