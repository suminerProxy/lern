package h.u.a.u.y3.m;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.showstartfans.activity.view.custom_im_ui.view.CustomChatView;
import com.showstartfans.activity.view.custom_im_ui.view.CustomMessageRecyclerView;
import com.tencent.qcloud.tuicore.component.TitleBarLayout;
import com.tencent.qcloud.tuicore.component.fragments.BaseFragment;
import com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback;
import com.tencent.qcloud.tuikit.tuichat.bean.ChatInfo;
import com.tencent.qcloud.tuikit.tuichat.bean.message.TUIMessageBean;
import com.tencent.qcloud.tuikit.tuichat.presenter.ChatPresenter;
import com.tencent.qcloud.tuikit.tuichat.ui.interfaces.OnItemClickListener;
import com.tencent.qcloud.tuikit.tuichat.ui.view.ChatView;
import com.tencent.qcloud.tuikit.tuichat.ui.view.input.InputView;
import com.tencent.qcloud.tuikit.tuichat.util.DataStoreUtil;
import h.u.a.w.d0.w2;
import h.y.a.m.n;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: CustomTUIBaseChatFragment.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public abstract class c extends BaseFragment {

    /* renamed from: l  reason: collision with root package name */
    private static final String f24823l = null;
    public i b;
    public View c;

    /* renamed from: d  reason: collision with root package name */
    public TitleBarLayout f24824d;

    /* renamed from: e  reason: collision with root package name */
    public CustomChatView f24825e;

    /* renamed from: f  reason: collision with root package name */
    private List<TUIMessageBean> f24826f;

    /* renamed from: g  reason: collision with root package name */
    private int f24827g;

    /* renamed from: h  reason: collision with root package name */
    public CustomMessageRecyclerView f24828h;

    /* renamed from: i  reason: collision with root package name */
    public String f24829i;

    /* renamed from: j  reason: collision with root package name */
    public String f24830j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f24831k;

    /* compiled from: CustomTUIBaseChatFragment.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class a implements View.OnClickListener {
        public final /* synthetic */ c b;

        public a(c cVar) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* compiled from: CustomTUIBaseChatFragment.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class b implements ChatView.ForwardSelectActivityListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ c f24832a;

        public b(c cVar) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.ui.view.ChatView.ForwardSelectActivityListener
        public void onStartForwardSelectActivity(int i2, List<TUIMessageBean> list) {
        }
    }

    /* compiled from: CustomTUIBaseChatFragment.java */
    /* renamed from: h.u.a.u.y3.m.c$c  reason: collision with other inner class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class C0372c extends OnItemClickListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ c f24833a;

        /* compiled from: CustomTUIBaseChatFragment.java */
        /* renamed from: h.u.a.u.y3.m.c$c$a */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
        public class a implements w2 {
            public final /* synthetic */ TUIMessageBean b;
            public final /* synthetic */ boolean c;

            /* renamed from: d  reason: collision with root package name */
            public final /* synthetic */ C0372c f24834d;

            /* compiled from: CustomTUIBaseChatFragment.java */
            /* renamed from: h.u.a.u.y3.m.c$c$a$a  reason: collision with other inner class name */
            /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
            public class C0373a implements Function1<n, Unit> {
                public final /* synthetic */ a b;

                public C0373a(a aVar) {
                }

                public Unit a(n nVar) {
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(n nVar) {
                }
            }

            /* compiled from: CustomTUIBaseChatFragment.java */
            /* renamed from: h.u.a.u.y3.m.c$c$a$b */
            /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
            public class b implements Function1<n, Unit> {
                public final /* synthetic */ a b;

                public b(a aVar) {
                }

                public Unit a(n nVar) {
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(n nVar) {
                }
            }

            public a(C0372c c0372c, TUIMessageBean tUIMessageBean, boolean z) {
            }

            @Override // h.u.a.w.d0.w2
            public void onPupMenuViewClick(View view, String str, int i2) {
            }
        }

        public C0372c(c cVar) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.ui.interfaces.OnItemClickListener
        public void onMessageLongClick(View view, int i2, TUIMessageBean tUIMessageBean) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.ui.interfaces.OnItemClickListener
        public void onReEditRevokeMessage(View view, int i2, TUIMessageBean tUIMessageBean) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.ui.interfaces.OnItemClickListener
        public void onRecallClick(View view, int i2, TUIMessageBean tUIMessageBean) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.ui.interfaces.OnItemClickListener
        public void onTextSelected(View view, int i2, TUIMessageBean tUIMessageBean) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.ui.interfaces.OnItemClickListener
        public void onUserIconClick(View view, int i2, TUIMessageBean tUIMessageBean) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.ui.interfaces.OnItemClickListener
        public void onUserIconLongClick(View view, int i2, TUIMessageBean tUIMessageBean) {
        }
    }

    /* compiled from: CustomTUIBaseChatFragment.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class d implements InputView.OnStartActivityListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ c f24835a;

        /* compiled from: CustomTUIBaseChatFragment.java */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
        public class a implements Function2<ArrayList<String>, ArrayList<String>, Unit> {
            public final /* synthetic */ d b;

            public a(d dVar) {
            }

            public Unit a(ArrayList<String> arrayList, ArrayList<String> arrayList2) {
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(ArrayList<String> arrayList, ArrayList<String> arrayList2) {
            }
        }

        public d(c cVar) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.ui.view.input.InputView.OnStartActivityListener
        public void onStartGroupMemberSelectActivity() {
        }
    }

    /* compiled from: CustomTUIBaseChatFragment.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class e implements CustomMessageRecyclerView.g {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ c f24836a;

        /* compiled from: CustomTUIBaseChatFragment.java */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
        public class a implements Runnable {
            public final /* synthetic */ e b;

            public a(e eVar) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        public e(c cVar) {
        }

        @Override // com.showstartfans.activity.view.custom_im_ui.view.CustomMessageRecyclerView.g
        public void a(TUIMessageBean tUIMessageBean, boolean z) {
        }
    }

    /* compiled from: CustomTUIBaseChatFragment.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class f extends IUIKitCallback {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ c f24837a;

        public f(c cVar) {
        }

        @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
        public void onError(String str, int i2, String str2) {
        }

        @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
        public void onSuccess(Object obj) {
        }
    }

    /* compiled from: CustomTUIBaseChatFragment.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class g implements DataStoreUtil.GetResult<String> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ c f24838a;

        public g(c cVar) {
        }

        public void a(String str) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.util.DataStoreUtil.GetResult
        public void onFail() {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.util.DataStoreUtil.GetResult
        public /* bridge */ /* synthetic */ void onSuccess(String str) {
        }
    }

    /* compiled from: CustomTUIBaseChatFragment.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class h implements Runnable {
        public final /* synthetic */ c b;

        /* compiled from: CustomTUIBaseChatFragment.java */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
        public class a extends h.g.a.t.l.e<Bitmap> {
            public final /* synthetic */ int b;
            public final /* synthetic */ int c;

            /* renamed from: d  reason: collision with root package name */
            public final /* synthetic */ h f24839d;

            /* compiled from: CustomTUIBaseChatFragment.java */
            /* renamed from: h.u.a.u.y3.m.c$h$a$a  reason: collision with other inner class name */
            /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
            public class C0374a extends BitmapDrawable {

                /* renamed from: a  reason: collision with root package name */
                public final /* synthetic */ Bitmap f24840a;
                public final /* synthetic */ a b;

                public C0374a(a aVar, Resources resources, Bitmap bitmap, Bitmap bitmap2) {
                }

                @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
                public void draw(@NonNull Canvas canvas) {
                }
            }

            public a(h hVar, int i2, int i3, int i4, int i5) {
            }

            @Override // h.g.a.t.l.p
            public void onLoadCleared(@Nullable Drawable drawable) {
            }

            @Override // h.g.a.t.l.p
            public /* bridge */ /* synthetic */ void onResourceReady(@NonNull Object obj, @Nullable h.g.a.t.m.f fVar) {
            }

            public void onResourceReady(@NonNull Bitmap bitmap, @Nullable h.g.a.t.m.f<? super Bitmap> fVar) {
            }
        }

        public h(c cVar) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* compiled from: CustomTUIBaseChatFragment.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public interface i {
        void a();
    }

    public static /* synthetic */ String access$200() {
    }

    public static /* synthetic */ int e(c cVar, int i2) {
    }

    public static /* synthetic */ List f(c cVar, List list) {
    }

    public static /* synthetic */ boolean g(c cVar) {
    }

    public static /* synthetic */ void h(c cVar, TUIMessageBean tUIMessageBean) {
    }

    public static /* synthetic */ void i(c cVar) {
    }

    public static /* synthetic */ Bitmap j(c cVar, Bitmap bitmap, int i2, int i3) {
    }

    private void k(TUIMessageBean tUIMessageBean) {
    }

    private void n() {
    }

    private Bitmap zoomImg(Bitmap bitmap, int i2, int i3) {
    }

    public ChatInfo getChatInfo() {
    }

    public ChatPresenter getPresenter() {
    }

    public void initChatViewBackground() {
    }

    public void initView() {
    }

    public abstract boolean l();

    public void m() {
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i2, int i3, Intent intent) {
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, Bundle bundle) {
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
    }

    public void setChatViewBackground(String str) {
    }
}
