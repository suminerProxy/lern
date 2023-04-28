package h.u.a.u.y3.o;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.tencent.qcloud.tuikit.tuichat.bean.message.ImageMessageBean;
import com.tencent.qcloud.tuikit.tuichat.bean.message.QuoteMessageBean;
import com.tencent.qcloud.tuikit.tuichat.bean.message.TUIMessageBean;
import com.tencent.qcloud.tuikit.tuichat.bean.message.VideoMessageBean;
import com.tencent.qcloud.tuikit.tuichat.bean.message.reply.FileReplyQuoteBean;
import com.tencent.qcloud.tuikit.tuichat.bean.message.reply.SoundReplyQuoteBean;
import com.tencent.qcloud.tuikit.tuichat.bean.message.reply.TUIReplyQuoteBean;
import com.tencent.qcloud.tuikit.tuichat.ui.interfaces.OnItemClickListener;
import java.util.List;

/* compiled from: CustomQuoteMessageHolder.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class v extends h.u.a.u.y3.o.c {
    public FrameLayout A;
    public final FrameLayout B;
    public final TextView C;
    public final FrameLayout D;
    public final ImageView E;
    public final ImageView F;
    public final List<String> G;
    public String H;
    public final FrameLayout I;
    public final TextView J;
    public final ImageView K;
    public final FrameLayout L;
    public final TextView M;
    public final ImageView N;
    public final TextView z;

    /* compiled from: CustomQuoteMessageHolder.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class a implements View.OnClickListener {
        public final /* synthetic */ int b;
        public final /* synthetic */ QuoteMessageBean c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ v f24903d;

        public a(v vVar, int i2, QuoteMessageBean quoteMessageBean) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* compiled from: CustomQuoteMessageHolder.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class b implements ImageMessageBean.ImageBean.ImageDownloadCallback {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ImageMessageBean.ImageBean f24904a;
        public final /* synthetic */ ImageMessageBean b;
        public final /* synthetic */ String c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ int f24905d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ v f24906e;

        /* compiled from: CustomQuoteMessageHolder.java */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
        public class a implements h.g.a.t.h {
            public final /* synthetic */ b b;

            public a(b bVar) {
            }

            @Override // h.g.a.t.h
            public boolean onLoadFailed(@Nullable h.g.a.p.p.q qVar, Object obj, h.g.a.t.l.p pVar, boolean z) {
            }

            @Override // h.g.a.t.h
            public boolean onResourceReady(Object obj, Object obj2, h.g.a.t.l.p pVar, h.g.a.p.a aVar, boolean z) {
            }
        }

        public b(v vVar, ImageMessageBean.ImageBean imageBean, ImageMessageBean imageMessageBean, String str, int i2) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.bean.message.ImageMessageBean.ImageBean.ImageDownloadCallback
        public void onError(int i2, String str) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.bean.message.ImageMessageBean.ImageBean.ImageDownloadCallback
        public void onProgress(long j2, long j3) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.bean.message.ImageMessageBean.ImageBean.ImageDownloadCallback
        public void onSuccess() {
        }
    }

    /* compiled from: CustomQuoteMessageHolder.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class c implements VideoMessageBean.VideoDownloadCallback {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ VideoMessageBean f24907a;
        public final /* synthetic */ String b;
        public final /* synthetic */ int c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ v f24908d;

        public c(v vVar, VideoMessageBean videoMessageBean, String str, int i2) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.bean.message.VideoMessageBean.VideoDownloadCallback
        public void onError(int i2, String str) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.bean.message.VideoMessageBean.VideoDownloadCallback
        public void onProgress(long j2, long j3) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.bean.message.VideoMessageBean.VideoDownloadCallback
        public void onSuccess() {
        }
    }

    public v(View view) {
    }

    public static /* synthetic */ OnItemClickListener x(v vVar) {
    }

    public static /* synthetic */ OnItemClickListener y(v vVar) {
    }

    public ViewGroup.LayoutParams getImageParams(ViewGroup.LayoutParams layoutParams, int i2, int i3) {
    }

    @Override // h.u.a.u.y3.o.c, h.u.a.u.y3.o.m
    public void layoutVariableViews(TUIMessageBean tUIMessageBean, int i2) {
    }

    public void performFile(FileReplyQuoteBean fileReplyQuoteBean) {
    }

    public void performImage(TUIReplyQuoteBean tUIReplyQuoteBean) {
    }

    public void performMsgAbstract(QuoteMessageBean quoteMessageBean) {
    }

    public void performNotFound(TUIReplyQuoteBean tUIReplyQuoteBean, QuoteMessageBean quoteMessageBean) {
    }

    public void performQuote(TUIReplyQuoteBean tUIReplyQuoteBean, QuoteMessageBean quoteMessageBean) {
    }

    public void performSound(SoundReplyQuoteBean soundReplyQuoteBean) {
    }

    public void performTextMessage(String str) {
    }

    public void resetAll() {
    }

    public void setThemeColor(TUIMessageBean tUIMessageBean) {
    }
}
