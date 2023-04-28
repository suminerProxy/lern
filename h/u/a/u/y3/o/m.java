package h.u.a.u.y3.o;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.showstartfans.activity.view.GroupMemberTagView;
import com.showstartfans.activity.view.UserLevelView;
import com.showstartfans.activity.view.custom_im_ui.view.ImZanListView;
import com.showstartfans.activity.view.custom_im_ui.view.SureNoticeView;
import com.tencent.qcloud.tuicore.component.gatherimage.UserIconView;
import com.tencent.qcloud.tuikit.tuichat.bean.message.TUIMessageBean;
import com.tencent.qcloud.tuikit.tuichat.presenter.ChatPresenter;
import com.tencent.qcloud.tuikit.tuichat.ui.interfaces.OnItemClickListener;
import com.tencent.qcloud.tuikit.tuichat.ui.view.message.SelectTextHelper;
import com.tencent.qcloud.tuikit.tuichat.ui.view.message.reply.ChatFlowReactView;
import java.util.List;

/* compiled from: CustomMessageContentHolder.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public abstract class m extends h.u.a.u.y3.o.l {
    public ImZanListView c;

    /* renamed from: d  reason: collision with root package name */
    public SureNoticeView f24878d;

    /* renamed from: e  reason: collision with root package name */
    public UserLevelView f24879e;

    /* renamed from: f  reason: collision with root package name */
    public Context f24880f;

    /* renamed from: g  reason: collision with root package name */
    private ImageView f24881g;

    /* renamed from: h  reason: collision with root package name */
    private RelativeLayout f24882h;

    /* renamed from: i  reason: collision with root package name */
    public UserIconView f24883i;

    /* renamed from: j  reason: collision with root package name */
    public UserIconView f24884j;

    /* renamed from: k  reason: collision with root package name */
    public TextView f24885k;

    /* renamed from: l  reason: collision with root package name */
    public LinearLayout f24886l;

    /* renamed from: m  reason: collision with root package name */
    public ProgressBar f24887m;

    /* renamed from: n  reason: collision with root package name */
    public ImageView f24888n;

    /* renamed from: o  reason: collision with root package name */
    public TextView f24889o;

    /* renamed from: p  reason: collision with root package name */
    public TextView f24890p;
    public TextView q;
    public boolean r;
    public boolean s;
    public boolean t;
    private GroupMemberTagView u;
    private List<TUIMessageBean> v;
    private SelectTextHelper w;
    public ChatPresenter x;

    /* compiled from: CustomMessageContentHolder.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class a implements View.OnLongClickListener {
        public final /* synthetic */ TUIMessageBean b;
        public final /* synthetic */ m c;

        public a(m mVar, TUIMessageBean tUIMessageBean) {
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
        }
    }

    /* compiled from: CustomMessageContentHolder.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class b implements ChatFlowReactView.ReactOnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ TUIMessageBean f24891a;
        public final /* synthetic */ m b;

        public b(m mVar, TUIMessageBean tUIMessageBean) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.ui.view.message.reply.ChatFlowReactView.ReactOnClickListener
        public void onClick(String str) {
        }
    }

    /* compiled from: CustomMessageContentHolder.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class c implements View.OnClickListener {
        public final /* synthetic */ TUIMessageBean b;
        public final /* synthetic */ m c;

        public c(m mVar, TUIMessageBean tUIMessageBean) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* compiled from: CustomMessageContentHolder.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class d implements View.OnClickListener {
        public final /* synthetic */ TUIMessageBean b;
        public final /* synthetic */ m c;

        public d(m mVar, TUIMessageBean tUIMessageBean) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* compiled from: CustomMessageContentHolder.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class e implements View.OnClickListener {
        public final /* synthetic */ TUIMessageBean b;
        public final /* synthetic */ m c;

        public e(m mVar, TUIMessageBean tUIMessageBean) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* compiled from: CustomMessageContentHolder.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class f implements SelectTextHelper.OnSelectListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ TUIMessageBean f24892a;
        public final /* synthetic */ int b;
        public final /* synthetic */ m c;

        public f(m mVar, TUIMessageBean tUIMessageBean, int i2) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.ui.view.message.SelectTextHelper.OnSelectListener
        public void onClick(View view) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.ui.view.message.SelectTextHelper.OnSelectListener
        public void onClickUrl(String str) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.ui.view.message.SelectTextHelper.OnSelectListener
        public void onDismiss() {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.ui.view.message.SelectTextHelper.OnSelectListener
        public void onDismissCustomPop() {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.ui.view.message.SelectTextHelper.OnSelectListener
        public void onLongClick(View view) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.ui.view.message.SelectTextHelper.OnSelectListener
        public void onReset() {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.ui.view.message.SelectTextHelper.OnSelectListener
        public void onScrolling() {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.ui.view.message.SelectTextHelper.OnSelectListener
        public void onSelectAllShowCustomPop() {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.ui.view.message.SelectTextHelper.OnSelectListener
        public void onTextSelected(CharSequence charSequence) {
        }
    }

    /* compiled from: CustomMessageContentHolder.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class g implements View.OnLongClickListener {
        public final /* synthetic */ int b;
        public final /* synthetic */ TUIMessageBean c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ m f24893d;

        public g(m mVar, int i2, TUIMessageBean tUIMessageBean) {
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
        }
    }

    /* compiled from: CustomMessageContentHolder.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class h implements View.OnLongClickListener {
        public final /* synthetic */ int b;
        public final /* synthetic */ TUIMessageBean c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ m f24894d;

        public h(m mVar, int i2, TUIMessageBean tUIMessageBean) {
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
        }
    }

    /* compiled from: CustomMessageContentHolder.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class i implements View.OnClickListener {
        public final /* synthetic */ int b;
        public final /* synthetic */ TUIMessageBean c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ m f24895d;

        public i(m mVar, int i2, TUIMessageBean tUIMessageBean) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* compiled from: CustomMessageContentHolder.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class j implements View.OnLongClickListener {
        public final /* synthetic */ int b;
        public final /* synthetic */ TUIMessageBean c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ m f24896d;

        public j(m mVar, int i2, TUIMessageBean tUIMessageBean) {
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
        }
    }

    /* compiled from: CustomMessageContentHolder.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class k implements View.OnClickListener {
        public final /* synthetic */ int b;
        public final /* synthetic */ TUIMessageBean c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ m f24897d;

        public k(m mVar, int i2, TUIMessageBean tUIMessageBean) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* compiled from: CustomMessageContentHolder.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class l implements View.OnClickListener {
        public final /* synthetic */ int b;
        public final /* synthetic */ TUIMessageBean c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ m f24898d;

        public l(m mVar, int i2, TUIMessageBean tUIMessageBean) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* compiled from: CustomMessageContentHolder.java */
    /* renamed from: h.u.a.u.y3.o.m$m  reason: collision with other inner class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class View$OnClickListenerC0377m implements View.OnClickListener {
        public final /* synthetic */ int b;
        public final /* synthetic */ TUIMessageBean c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ m f24899d;

        public View$OnClickListenerC0377m(m mVar, int i2, TUIMessageBean tUIMessageBean) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* compiled from: CustomMessageContentHolder.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class n implements View.OnClickListener {
        public final /* synthetic */ int b;
        public final /* synthetic */ TUIMessageBean c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ m f24900d;

        public n(m mVar, int i2, TUIMessageBean tUIMessageBean) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* compiled from: CustomMessageContentHolder.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class o implements View.OnClickListener {
        public final /* synthetic */ TUIMessageBean b;
        public final /* synthetic */ m c;

        public o(m mVar, TUIMessageBean tUIMessageBean) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    public m(View view) {
    }

    public static /* synthetic */ OnItemClickListener d(m mVar) {
    }

    public static /* synthetic */ OnItemClickListener e(m mVar) {
    }

    public static /* synthetic */ OnItemClickListener f(m mVar) {
    }

    public static /* synthetic */ OnItemClickListener g(m mVar) {
    }

    public static /* synthetic */ OnItemClickListener h(m mVar) {
    }

    public static /* synthetic */ OnItemClickListener i(m mVar) {
    }

    public static /* synthetic */ OnItemClickListener j(m mVar) {
    }

    public static /* synthetic */ OnItemClickListener k(m mVar) {
    }

    public static /* synthetic */ OnItemClickListener l(m mVar) {
    }

    public static /* synthetic */ OnItemClickListener m(m mVar) {
    }

    public static /* synthetic */ OnItemClickListener n(m mVar) {
    }

    public static /* synthetic */ OnItemClickListener o(m mVar) {
    }

    public static /* synthetic */ OnItemClickListener p(m mVar) {
    }

    public static /* synthetic */ OnItemClickListener q(m mVar) {
    }

    public static /* synthetic */ OnItemClickListener r(m mVar) {
    }

    public static /* synthetic */ OnItemClickListener s(m mVar) {
    }

    private void setReactContent(TUIMessageBean tUIMessageBean) {
    }

    private void setReplyContent(TUIMessageBean tUIMessageBean) {
    }

    private void showReadText(TUIMessageBean tUIMessageBean) {
    }

    public static /* synthetic */ OnItemClickListener t(m mVar) {
    }

    public static /* synthetic */ OnItemClickListener u(m mVar) {
    }

    public static /* synthetic */ OnItemClickListener v(m mVar) {
    }

    private void w(TUIMessageBean tUIMessageBean) {
    }

    public void c() {
    }

    public List<TUIMessageBean> getDataSource() {
    }

    public abstract void layoutVariableViews(TUIMessageBean tUIMessageBean, int i2);

    @Override // h.u.a.u.y3.o.l, com.tencent.qcloud.tuikit.tuichat.ui.view.message.viewholder.MessageBaseHolder
    public void layoutViews(TUIMessageBean tUIMessageBean, int i2) {
    }

    public void onRecycled() {
    }

    public void resetSelectableText() {
    }

    public void setDataSource(List<TUIMessageBean> list) {
    }

    public void setGravity(boolean z) {
    }

    public void setMessageAreaPadding() {
    }

    public void setPresenter(ChatPresenter chatPresenter) {
    }

    public void setSelectableTextHelper(TUIMessageBean tUIMessageBean, TextView textView, int i2, boolean z) {
    }

    public void startShowUnread(TUIMessageBean tUIMessageBean) {
    }
}
