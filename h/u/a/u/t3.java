package h.u.a.u;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.sobot.network.http.model.SobotProgress;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TabFragmentManager.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001:\u0001\u001aB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J*\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00052\u000e\u0010\u0011\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00130\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015J\u0006\u0010\u0016\u001a\u00020\u0005J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0010\u001a\u00020\u0005J\u000e\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0005J\u0010\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0005H\u0002R\u000e\u0010\u0007\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R*\u0010\t\u001a\u001e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nj\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f`\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/showstartfans/activity/view/TabFragmentManager;", "", "activity", "Landroidx/appcompat/app/AppCompatActivity;", "containerId", "", "(Landroidx/appcompat/app/AppCompatActivity;I)V", "mActivity", "mContainerId", "mtabs", "Ljava/util/LinkedHashMap;", "", "Lcom/showstartfans/activity/view/TabFragmentManager$TabInfo;", "Lkotlin/collections/LinkedHashMap;", "addTab", "", "id", "clss", "Ljava/lang/Class;", "Lcom/taihebase/activity/base/fragment/BaseNewFragment;", "args", "Landroid/os/Bundle;", "getAddedNum", "getFragment", "setCurrentTab", "showTab", "TabInfo", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class t3 {
    @NotNull

    /* renamed from: a  reason: collision with root package name */
    private final AppCompatActivity f24741a;
    private final int b;
    @NotNull
    private final LinkedHashMap<String, a> c;

    /* compiled from: TabFragmentManager.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\nJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0016\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0006HÆ\u0003J=\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006 "}, d2 = {"Lcom/showstartfans/activity/view/TabFragmentManager$TabInfo;", "", SobotProgress.TAG, "", "clss", "Ljava/lang/Class;", "Lcom/taihebase/activity/base/fragment/BaseNewFragment;", "args", "Landroid/os/Bundle;", "fragment", "(Ljava/lang/String;Ljava/lang/Class;Landroid/os/Bundle;Lcom/taihebase/activity/base/fragment/BaseNewFragment;)V", "getArgs", "()Landroid/os/Bundle;", "getClss", "()Ljava/lang/Class;", "getFragment", "()Lcom/taihebase/activity/base/fragment/BaseNewFragment;", "setFragment", "(Lcom/taihebase/activity/base/fragment/BaseNewFragment;)V", "getTag", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a {
        @NotNull

        /* renamed from: a  reason: collision with root package name */
        private final String f24742a;
        @NotNull
        private final Class<? extends h.y.a.f.o.e> b;
        @Nullable
        private final Bundle c;
        @Nullable

        /* renamed from: d  reason: collision with root package name */
        private h.y.a.f.o.e f24743d;

        public a(@NotNull String str, @NotNull Class<? extends h.y.a.f.o.e> cls, @Nullable Bundle bundle, @Nullable h.y.a.f.o.e eVar) {
        }

        public static /* synthetic */ a f(a aVar, String str, Class cls, Bundle bundle, h.y.a.f.o.e eVar, int i2, Object obj) {
        }

        @NotNull
        public final String a() {
        }

        @NotNull
        public final Class<? extends h.y.a.f.o.e> b() {
        }

        @Nullable
        public final Bundle c() {
        }

        @Nullable
        public final h.y.a.f.o.e d() {
        }

        @NotNull
        public final a e(@NotNull String str, @NotNull Class<? extends h.y.a.f.o.e> cls, @Nullable Bundle bundle, @Nullable h.y.a.f.o.e eVar) {
        }

        public boolean equals(@Nullable Object obj) {
        }

        @Nullable
        public final Bundle g() {
        }

        @NotNull
        public final Class<? extends h.y.a.f.o.e> h() {
        }

        public int hashCode() {
        }

        @Nullable
        public final h.y.a.f.o.e i() {
        }

        @NotNull
        public final String j() {
        }

        public final void k(@Nullable h.y.a.f.o.e eVar) {
        }

        @NotNull
        public String toString() {
        }

        public /* synthetic */ a(String str, Class cls, Bundle bundle, h.y.a.f.o.e eVar, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public t3(@NotNull AppCompatActivity appCompatActivity, int i2) {
    }

    public static /* synthetic */ void b(t3 t3Var, int i2, Class cls, Bundle bundle, int i3, Object obj) {
    }

    private final void f(int i2) {
    }

    public final void a(int i2, @NotNull Class<? extends h.y.a.f.o.e> cls, @Nullable Bundle bundle) {
    }

    public final int c() {
    }

    @Nullable
    public final h.y.a.f.o.e d(int i2) {
    }

    public final void e(int i2) {
    }
}
