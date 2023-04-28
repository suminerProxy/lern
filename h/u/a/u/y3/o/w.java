package h.u.a.u.y3.o;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.showstartfans.activity.model.BaseImMessageBean;
import com.tencent.qcloud.tuikit.tuichat.bean.message.ReplyMessageBean;
import com.tencent.qcloud.tuikit.tuichat.bean.message.TUIMessageBean;
import com.tencent.qcloud.tuikit.tuichat.bean.message.reply.TUIReplyQuoteBean;
import com.tencent.qcloud.tuikit.tuichat.ui.interfaces.OnItemClickListener;

/* compiled from: CustomReplyMessageHolder.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class w extends m {
    private TextView A;
    private TextView B;
    private FrameLayout C;
    private LinearLayout D;
    private ImageView E;
    private View y;
    private TextView z;

    /* compiled from: CustomReplyMessageHolder.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class a implements View.OnLongClickListener {
        public final /* synthetic */ int b;
        public final /* synthetic */ TUIMessageBean c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ w f24909d;

        public a(w wVar, int i2, TUIMessageBean tUIMessageBean) {
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
        }
    }

    /* compiled from: CustomReplyMessageHolder.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class b implements View.OnClickListener {
        public final /* synthetic */ int b;
        public final /* synthetic */ ReplyMessageBean c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ w f24910d;

        public b(w wVar, int i2, ReplyMessageBean replyMessageBean) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* compiled from: CustomReplyMessageHolder.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class c implements View.OnClickListener {
        public final /* synthetic */ BaseImMessageBean b;
        public final /* synthetic */ w c;

        public c(w wVar, BaseImMessageBean baseImMessageBean) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    public w(View view) {
    }

    private boolean A(ReplyMessageBean replyMessageBean) {
    }

    private void performMsgAbstract(ReplyMessageBean replyMessageBean, int i2) {
    }

    private void performNotFound(TUIReplyQuoteBean tUIReplyQuoteBean, ReplyMessageBean replyMessageBean) {
    }

    private void performQuote(TUIReplyQuoteBean tUIReplyQuoteBean, ReplyMessageBean replyMessageBean) {
    }

    private void setThemeColor(TUIMessageBean tUIMessageBean) {
    }

    public static /* synthetic */ OnItemClickListener x(w wVar) {
    }

    public static /* synthetic */ OnItemClickListener y(w wVar) {
    }

    public static /* synthetic */ OnItemClickListener z(w wVar) {
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.ui.view.message.viewholder.MessageBaseHolder
    public int getVariableLayout() {
    }

    @Override // h.u.a.u.y3.o.m
    public void layoutVariableViews(TUIMessageBean tUIMessageBean, int i2) {
    }

    @Override // h.u.a.u.y3.o.m
    public void setGravity(boolean z) {
    }

    @Override // h.u.a.u.y3.o.m
    public void setMessageAreaPadding() {
    }
}
