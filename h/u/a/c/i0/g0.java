package h.u.a.c.i0;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.showstartfans.activity.model.TicketSessionMsgBean;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ActivityShowSessionAdapter.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\r\u001a\u0004\u0018\u00010\u0002J\u0006\u0010\u000e\u001a\u00020\u000bJ\u001a\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\b\u0001\u0010\u0013\u001a\u00020\u000bH\u0016J\u0018\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bH\u0016J\u0010\u0010\u0018\u001a\u00020\u00102\b\u0010\u0019\u001a\u0004\u0018\u00010\tR\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/showstartfans/activity/activitys/pay/ActivityShowSessionAdapter;", "Lcom/taihebase/activity/base/BaseRecycleAdapter;", "Lcom/showstartfans/activity/model/TicketSessionMsgBean;", "context", "Landroid/content/Context;", "call", "Lcom/showstartfans/activity/listener/OnSessionShowCall;", "(Landroid/content/Context;Lcom/showstartfans/activity/listener/OnSessionShowCall;)V", "checkSessionId", "", "currentPoi", "", "showCall", "getCurrentSession", "getCurrentSessionPoi", "onBindViewHolder", "", "mholder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", h.a.a.a.a.i.g.C, "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setCheckSessionId", "sessionId", "ViewHodler", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class g0 extends h.y.a.f.j<TicketSessionMsgBean> {

    /* renamed from: a  reason: collision with root package name */
    private int f19224a;
    @Nullable
    private h.u.a.l.e b;
    @NotNull
    private String c;

    /* compiled from: ActivityShowSessionAdapter.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/showstartfans/activity/activitys/pay/ActivityShowSessionAdapter$ViewHodler;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Lcom/showstartfans/activity/activitys/pay/ActivityShowSessionAdapter;Landroid/view/View;)V", "name", "Landroid/widget/TextView;", "getName", "()Landroid/widget/TextView;", "setName", "(Landroid/widget/TextView;)V", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public final class a extends RecyclerView.ViewHolder {
        @NotNull

        /* renamed from: a  reason: collision with root package name */
        private TextView f19225a;
        public final /* synthetic */ g0 b;

        public a(@NotNull g0 g0Var, View view) {
        }

        @NotNull
        public final TextView c() {
        }

        public final void d(@NotNull TextView textView) {
        }
    }

    public g0(@Nullable Context context, @Nullable h.u.a.l.e eVar) {
    }

    public static /* synthetic */ void e(g0 g0Var, int i2, TicketSessionMsgBean ticketSessionMsgBean, View view) {
    }

    private static final void f(g0 g0Var, int i2, TicketSessionMsgBean ticketSessionMsgBean, View view) {
    }

    @Nullable
    public final TicketSessionMsgBean c() {
    }

    public final int d() {
    }

    public final void g(@Nullable String str) {
    }

    @Override // h.y.a.f.j, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.ViewHolder viewHolder, @SuppressLint({"RecyclerView"}) int i2) {
    }

    @Override // h.y.a.f.j, androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.ViewHolder onCreateViewHolder(@NotNull ViewGroup viewGroup, int i2) {
    }
}
