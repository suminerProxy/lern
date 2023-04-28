package h.u.a.t;

import android.content.Context;
import android.text.TextUtils;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CheckModuleOpenConfig.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%2\u0014\u0010&\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020#\u0018\u00010'R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001a\u0010\u0012\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001a\u0010\u0015\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR\u001a\u0010\u0018\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0006\"\u0004\b\u0019\u0010\bR\u001a\u0010\u001a\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0006\"\u0004\b\u001b\u0010\bR\u001a\u0010\u001c\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0006\"\u0004\b\u001e\u0010\bR\u001a\u0010\u001f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0006\"\u0004\b!\u0010\b¨\u0006("}, d2 = {"Lcom/showstartfans/activity/utils/CheckModuleOpenConfig;", "", "()V", "activity_review", "", "getActivity_review", "()Z", "setActivity_review", "(Z)V", "closeFriend", "getCloseFriend", "setCloseFriend", "community", "getCommunity", "setCommunity", "disvideo", "getDisvideo", "setDisvideo", "homeColour", "getHomeColour", "setHomeColour", "interaction", "getInteraction", "setInteraction", "isDisNft", "setDisNft", "isHideHotel", "setHideHotel", "photo", "getPhoto", "setPhoto", "raise_review", "getRaise_review", "setRaise_review", "check", "", "ctx", "Landroid/content/Context;", "callBack", "Lkotlin/Function1;", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class m1 {
    private static boolean b;
    private static boolean c;

    /* renamed from: e  reason: collision with root package name */
    private static boolean f24540e;

    /* renamed from: f  reason: collision with root package name */
    private static boolean f24541f;

    /* renamed from: g  reason: collision with root package name */
    private static boolean f24542g;

    /* renamed from: h  reason: collision with root package name */
    private static boolean f24543h;

    /* renamed from: i  reason: collision with root package name */
    private static boolean f24544i;

    /* renamed from: j  reason: collision with root package name */
    private static boolean f24545j;

    /* renamed from: k  reason: collision with root package name */
    private static boolean f24546k;
    @NotNull

    /* renamed from: a  reason: collision with root package name */
    public static final m1 f24538a = new m1();

    /* renamed from: d  reason: collision with root package name */
    private static boolean f24539d = true;

    private m1() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Function1 function1, h.y.a.m.n nVar) {
        if (!nVar.f()) {
            if (function1 == null) {
                return;
            }
            function1.invoke(Boolean.FALSE);
            return;
        }
        String value = nVar.c();
        if (!TextUtils.isEmpty(value)) {
            Intrinsics.checkNotNullExpressionValue(value, "value");
            b = StringsKt__StringsKt.contains$default((CharSequence) value, (CharSequence) "disvideo", false, 2, (Object) null);
            c = StringsKt__StringsKt.contains$default((CharSequence) value, (CharSequence) "community", false, 2, (Object) null);
            f24540e = StringsKt__StringsKt.contains$default((CharSequence) value, (CharSequence) "nft", false, 2, (Object) null);
            f24541f = StringsKt__StringsKt.contains$default((CharSequence) value, (CharSequence) "photo", false, 2, (Object) null);
            f24542g = StringsKt__StringsKt.contains$default((CharSequence) value, (CharSequence) "activity_review", false, 2, (Object) null);
            f24543h = StringsKt__StringsKt.contains$default((CharSequence) value, (CharSequence) "raise_review", false, 2, (Object) null);
            f24544i = StringsKt__StringsKt.contains$default((CharSequence) value, (CharSequence) "interaction", false, 2, (Object) null);
            f24545j = StringsKt__StringsKt.contains$default((CharSequence) value, (CharSequence) "homeColour", false, 2, (Object) null);
            f24546k = StringsKt__StringsKt.contains$default((CharSequence) value, (CharSequence) "friend", false, 2, (Object) null);
        }
        if (function1 == null) {
            return;
        }
        function1.invoke(Boolean.TRUE);
    }

    public final void a(@Nullable Context context, @Nullable Function1<? super Boolean, Unit> function1) {
        if (context == null) {
            return;
        }
        h.y.a.m.h.k(context.getApplicationContext(), "/app/common/moduleopenconfig", new h.y.a.m.i(), new h.y.a.m.g(function1) { // from class: h.u.a.t.t

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Function1 f24572a;

            @Override // h.y.a.m.g
            public final void a(h.y.a.m.n nVar) {
            }
        });
    }

    public final boolean c() {
        return f24542g;
    }

    public final boolean d() {
        return f24546k;
    }

    public final boolean e() {
        return c;
    }

    public final boolean f() {
        return b;
    }

    public final boolean g() {
        return f24545j;
    }

    public final boolean h() {
        return f24544i;
    }

    public final boolean i() {
        return f24541f;
    }

    public final boolean j() {
        return f24543h;
    }

    public final boolean k() {
        return f24540e;
    }

    public final boolean l() {
        return f24539d;
    }

    public final void n(boolean z) {
        f24542g = z;
    }

    public final void o(boolean z) {
        f24546k = z;
    }

    public final void p(boolean z) {
        c = z;
    }

    public final void q(boolean z) {
        f24540e = z;
    }

    public final void r(boolean z) {
        b = z;
    }

    public final void s(boolean z) {
        f24539d = z;
    }

    public final void t(boolean z) {
        f24545j = z;
    }

    public final void u(boolean z) {
        f24544i = z;
    }

    public final void v(boolean z) {
        f24541f = z;
    }

    public final void w(boolean z) {
        f24543h = z;
    }
}
