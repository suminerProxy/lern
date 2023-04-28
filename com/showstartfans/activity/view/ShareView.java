package com.showstartfans.activity.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import cn.sharesdk.tencent.qq.QQ;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.showstartfans.activity.model.ShareBean;
import com.sobot.chat.widget.zxing.util.Intents;
import h.a.a.a.a.i.g;
import h.u.a.d.o1;
import h.u.a.o.u;
import h.u.a.t.b2;
import h.u.a.w.z;
import h.y.a.f.m;
import h.y.a.h.h;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ShareView.kt */
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0002BCB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nB)\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0002\u0010\fJ\u0010\u00100\u001a\u00020\u00132\b\u0010\u001e\u001a\u0004\u0018\u00010\"J\u000e\u00100\u001a\u00020\u00132\u0006\u00101\u001a\u000202J\u0018\u00100\u001a\u00020\u00132\u0006\u00103\u001a\u00020\t2\b\u0010\u001e\u001a\u0004\u0018\u00010\"J\u0010\u00104\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\"H\u0002J\b\u00105\u001a\u00020\u0013H\u0002J\u0006\u00106\u001a\u00020\u0013JD\u00107\u001a\u00020\u00132\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010.\u001a\u0004\u0018\u00010/2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001b2\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012j\u0004\u0018\u0001`\u00142\b\u0010+\u001a\u0004\u0018\u00010,J\u0018\u00108\u001a\u00020\u00132\u0006\u00109\u001a\u00020:2\b\b\u0002\u0010;\u001a\u00020\tJ3\u0010<\u001a\u00020\u00132+\u0010=\u001a'\u0012\u0015\u0012\u0013\u0018\u00010\u001b¢\u0006\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001aj\u0004\u0018\u0001` J3\u0010>\u001a\u00020\u00132+\u0010=\u001a'\u0012\u0015\u0012\u0013\u0018\u00010\"¢\u0006\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u001aj\u0004\u0018\u0001`#J\u000e\u0010?\u001a\u00020\u00132\u0006\u0010@\u001a\u00020\tJ\u000e\u0010A\u001a\u00020\u00132\u0006\u0010-\u001a\u00020\tR\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R(\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012j\u0004\u0018\u0001`\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R3\u0010\u0019\u001a'\u0012\u0015\u0012\u0013\u0018\u00010\u001b¢\u0006\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001aj\u0004\u0018\u0001` X\u0082\u000e¢\u0006\u0002\n\u0000R3\u0010!\u001a'\u0012\u0015\u0012\u0013\u0018\u00010\"¢\u0006\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u001aj\u0004\u0018\u0001`#X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010$\u001a\u0004\u0018\u00010%X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u0010\u0010*\u001a\u0004\u0018\u00010\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010+\u001a\u0004\u0018\u00010,X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010.\u001a\u0004\u0018\u00010/X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006D"}, d2 = {"Lcom/showstartfans/activity/view/ShareView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "adapter", "Lcom/showstartfans/activity/adapter/ShareAdapter;", "eShareType", "Lcom/taihebase/activity/enummodel/EShareType;", "onClickDownloadListener", "Lkotlin/Function0;", "", "Lcom/showstartfans/activity/widget/dialog/OnClickDownloadListener;", "getOnClickDownloadListener", "()Lkotlin/jvm/functions/Function0;", "setOnClickDownloadListener", "(Lkotlin/jvm/functions/Function0;)V", "onItemClickEnterListener", "Lkotlin/Function1;", "Lcom/showstartfans/activity/model/ShareBean;", "Lkotlin/ParameterName;", "name", "bean", "", "Lcom/showstartfans/activity/view/OnItemClickEnter;", "onItemClickListener", "Lcom/showstartfans/activity/model/NewShareBean;", "Lcom/showstartfans/activity/view/OnItemClick;", "rv_list", "Landroidx/recyclerview/widget/RecyclerView;", "getRv_list", "()Landroidx/recyclerview/widget/RecyclerView;", "setRv_list", "(Landroidx/recyclerview/widget/RecyclerView;)V", "shareBean", "statusListentr", "Lcom/showstartfans/activity/widget/ShareUtil$OnShareStatusListentr;", TtmlNode.TAG_STYLE, "targetId", "", "add", "type", "Lcom/showstartfans/activity/view/ShareView$TYPE;", g.C, "checkShare", "initData", "initListener", "setData", "setLayoutManager", "uiMode", "Lcom/showstartfans/activity/view/ShareView$UiMode;", "gridCount", "setOnItemClickEnterListener", "listener", "setOnItemClickListener", "setSpaceItem", "padding", "setStyle", Intents.WifiConnect.TYPE, "UiMode", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class ShareView extends FrameLayout {
    @NotNull
    public Map<Integer, View> b;
    @Nullable
    private RecyclerView c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    private o1 f6989d;

    /* renamed from: e  reason: collision with root package name */
    private int f6990e;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    private ShareBean f6991f;
    @Nullable

    /* renamed from: g  reason: collision with root package name */
    private h f6992g;
    @Nullable

    /* renamed from: h  reason: collision with root package name */
    private String f6993h;
    @Nullable

    /* renamed from: i  reason: collision with root package name */
    private Function0<Unit> f6994i;
    @Nullable

    /* renamed from: j  reason: collision with root package name */
    private z.b f6995j;
    @Nullable

    /* renamed from: k  reason: collision with root package name */
    private Function1<? super u, Unit> f6996k;
    @Nullable

    /* renamed from: l  reason: collision with root package name */
    private Function1<? super ShareBean, Boolean> f6997l;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* compiled from: ShareView.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/showstartfans/activity/view/ShareView$TYPE;", "", "(Ljava/lang/String;I)V", QQ.NAME, "PengYouQuan", "Wechart", "WeiBo", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a {
        private static final /* synthetic */ a[] $VALUES = null;
        public static final a PengYouQuan = null;
        public static final a QQ = null;
        public static final a Wechart = null;
        public static final a WeiBo = null;

        private static final /* synthetic */ a[] $values() {
        }

        private a(String str, int i2) {
        }

        public static a valueOf(String str) {
        }

        public static a[] values() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* compiled from: ShareView.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/showstartfans/activity/view/ShareView$UiMode;", "", "(Ljava/lang/String;I)V", "GRID", "LINE_HORIZONTAL", "LINE_VERTICAL", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class b {
        private static final /* synthetic */ b[] $VALUES = null;
        public static final b GRID = null;
        public static final b LINE_HORIZONTAL = null;
        public static final b LINE_VERTICAL = null;

        private static final /* synthetic */ b[] $values() {
        }

        private b(String str, int i2) {
        }

        public static b valueOf(String str) {
        }

        public static b[] values() {
        }
    }

    /* compiled from: ShareView.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/showstartfans/activity/view/ShareView$initListener$1", "Lcom/taihebase/activity/base/NewBaseRecycleAdapter$OnItemClickListener;", "OnItemClick", "", g.C, "", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class c implements m.b {
        public final /* synthetic */ ShareView b;

        /* compiled from: ShareView.kt */
        @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u001f\u0010\u0006\u001a\u00020\u00032\u0010\u0010\u0007\u001a\f\u0012\u0006\b\u0001\u0012\u00020\t\u0018\u00010\bH\u0016¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"com/showstartfans/activity/view/ShareView$initListener$1$OnItemClick$1", "Lcom/showstartfans/activity/utils/FileUtils$OnImageListener;", "onError", "", "throwable", "", "onSuccess", "paths", "", "", "([Ljava/lang/String;)V", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
        public static final class a implements b2.b {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ ShareView f6998a;
            public final /* synthetic */ u b;

            public a(ShareView shareView, u uVar) {
            }

            @Override // h.u.a.t.b2.b
            public void a(@Nullable String[] strArr) {
            }

            @Override // h.u.a.t.b2.b
            public void onError(@Nullable Throwable th) {
            }
        }

        public c(ShareView shareView) {
        }

        @Override // h.y.a.f.m.b
        public void c(int i2) {
        }
    }

    public ShareView(@NotNull Context context) {
    }

    public static final /* synthetic */ void c(ShareView shareView, u uVar) {
    }

    public static final /* synthetic */ o1 d(ShareView shareView) {
    }

    public static final /* synthetic */ Function1 e(ShareView shareView) {
    }

    public static final /* synthetic */ Function1 f(ShareView shareView) {
    }

    public static final /* synthetic */ ShareBean g(ShareView shareView) {
    }

    private final void k(u uVar) {
    }

    private final void l() {
    }

    public static /* synthetic */ void p(ShareView shareView, b bVar, int i2, int i3, Object obj) {
    }

    public void a() {
    }

    @Nullable
    public View b(int i2) {
    }

    @Nullable
    public final Function0<Unit> getOnClickDownloadListener() {
    }

    @Nullable
    public final RecyclerView getRv_list() {
    }

    public final void h(int i2, @Nullable u uVar) {
    }

    public final void i(@Nullable u uVar) {
    }

    public final void j(@NotNull a aVar) {
    }

    public final void m() {
    }

    public final void n(@Nullable h hVar, @Nullable String str, @Nullable ShareBean shareBean, @Nullable Function0<Unit> function0, @Nullable z.b bVar) {
    }

    public final void o(@NotNull b bVar, int i2) {
    }

    public final void setOnClickDownloadListener(@Nullable Function0<Unit> function0) {
    }

    public final void setOnItemClickEnterListener(@Nullable Function1<? super ShareBean, Boolean> function1) {
    }

    public final void setOnItemClickListener(@Nullable Function1<? super u, Unit> function1) {
    }

    public final void setRv_list(@Nullable RecyclerView recyclerView) {
    }

    public final void setSpaceItem(int i2) {
    }

    public final void setStyle(int i2) {
    }

    public ShareView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
    }

    public ShareView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i2) {
    }

    public ShareView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i2, int i3) {
    }
}
