package h.u.a.u;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import com.umeng.analytics.pro.am;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ViewListener.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JH\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u000628\u0010\u0007\u001a4\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0005\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\bJo\u0010\r\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u000628\u0010\u000e\u001a4\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0005\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\b2#\u0010\u0010\u001a\u001f\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0011¨\u0006\u0012"}, d2 = {"Lcom/showstartfans/activity/view/ViewListener;", "", "()V", "registerDoubleClickListener", "", "view", "Landroid/view/View;", "callListener", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "", "isDoubleClick", "registerSelectDoubleClickListener", "signelistener", "isInCheckDoubleClick", "doublelistener", "Lkotlin/Function1;", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class v3 {
    @NotNull

    /* renamed from: a  reason: collision with root package name */
    public static final v3 f24747a = null;

    /* compiled from: ViewListener.kt */
    @Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0002\u0000\u0003\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u0010\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0004R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"com/showstartfans/activity/view/ViewListener$registerDoubleClickListener$1", "Landroid/view/View$OnClickListener;", "handler", "com/showstartfans/activity/view/ViewListener$registerDoubleClickListener$1$handler$1", "Lcom/showstartfans/activity/view/ViewListener$registerDoubleClickListener$1$handler$1;", "waitDouble", "", "onClick", "", am.aE, "Landroid/view/View;", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a implements View.OnClickListener {
        private boolean b;
        @NotNull
        private final HandlerC0365a c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ Function2<View, Boolean, Unit> f24748d;

        /* compiled from: ViewListener.kt */
        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\u000b\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/showstartfans/activity/view/ViewListener$registerDoubleClickListener$1$handler$1", "Landroid/os/Handler;", "handleMessage", "", "msg", "Landroid/os/Message;", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
        @SuppressLint({"HandlerLeak"})
        /* renamed from: h.u.a.u.v3$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
        public static final class HandlerC0365a extends Handler {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Function2<View, Boolean, Unit> f24749a;

            public HandlerC0365a(Function2<? super View, ? super Boolean, Unit> function2) {
            }

            @Override // android.os.Handler
            public void handleMessage(@NotNull Message message) {
            }
        }

        /* compiled from: ViewListener.kt */
        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/showstartfans/activity/view/ViewListener$registerDoubleClickListener$1$onClick$1", "Ljava/lang/Thread;", "run", "", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
        public static final class b extends Thread {
            public final /* synthetic */ a b;
            public final /* synthetic */ View c;

            public b(a aVar, View view) {
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
            }
        }

        public a(Function2<? super View, ? super Boolean, Unit> function2) {
        }

        public static final /* synthetic */ HandlerC0365a a(a aVar) {
        }

        public static final /* synthetic */ boolean b(a aVar) {
        }

        public static final /* synthetic */ void c(a aVar, boolean z) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(@NotNull View view) {
        }
    }

    /* compiled from: ViewListener.kt */
    @Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0002\u0000\u0003\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u0010\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0004R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"com/showstartfans/activity/view/ViewListener$registerSelectDoubleClickListener$1", "Landroid/view/View$OnClickListener;", "handler", "com/showstartfans/activity/view/ViewListener$registerSelectDoubleClickListener$1$handler$1", "Lcom/showstartfans/activity/view/ViewListener$registerSelectDoubleClickListener$1$handler$1;", "waitDouble", "", "onClick", "", am.aE, "Landroid/view/View;", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class b implements View.OnClickListener {
        private boolean b;
        @NotNull
        private final a c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ Function2<View, Boolean, Unit> f24750d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ View f24751e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ Function1<View, Unit> f24752f;

        /* compiled from: ViewListener.kt */
        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\u000b\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/showstartfans/activity/view/ViewListener$registerSelectDoubleClickListener$1$handler$1", "Landroid/os/Handler;", "handleMessage", "", "msg", "Landroid/os/Message;", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
        @SuppressLint({"HandlerLeak"})
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
        public static final class a extends Handler {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Function2<View, Boolean, Unit> f24753a;

            public a(Function2<? super View, ? super Boolean, Unit> function2) {
            }

            @Override // android.os.Handler
            public void handleMessage(@NotNull Message message) {
            }
        }

        /* compiled from: ViewListener.kt */
        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/showstartfans/activity/view/ViewListener$registerSelectDoubleClickListener$1$onClick$1", "Ljava/lang/Thread;", "run", "", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
        /* renamed from: h.u.a.u.v3$b$b  reason: collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
        public static final class C0366b extends Thread {
            public final /* synthetic */ b b;
            public final /* synthetic */ View c;

            public C0366b(b bVar, View view) {
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
            }
        }

        public b(Function2<? super View, ? super Boolean, Unit> function2, View view, Function1<? super View, Unit> function1) {
        }

        public static final /* synthetic */ a a(b bVar) {
        }

        public static final /* synthetic */ boolean b(b bVar) {
        }

        public static final /* synthetic */ void c(b bVar, boolean z) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(@NotNull View view) {
        }
    }

    private v3() {
    }

    public final void a(@NotNull View view, @Nullable Function2<? super View, ? super Boolean, Unit> function2) {
    }

    public final void b(@Nullable View view, @Nullable Function2<? super View, ? super Boolean, Unit> function2, @Nullable Function1<? super View, Unit> function1) {
    }
}
