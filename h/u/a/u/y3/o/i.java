package h.u.a.u.y3.o;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.tencent.qcloud.tuikit.tuichat.bean.message.ImageMessageBean;
import com.tencent.qcloud.tuikit.tuichat.bean.message.TUIMessageBean;
import com.tencent.qcloud.tuikit.tuichat.ui.interfaces.OnItemClickListener;
import java.util.List;

/* compiled from: CustomImageMessageHolder.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class i extends m {
    private static final int D = 540;
    private static final int E = 10;
    private ImageView A;
    private TextView B;
    private String C;
    private final List<String> y;
    private ImageView z;

    /* compiled from: CustomImageMessageHolder.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class a implements ImageMessageBean.ImageBean.ImageDownloadCallback {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ImageMessageBean.ImageBean f24871a;
        public final /* synthetic */ ImageMessageBean b;
        public final /* synthetic */ String c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ i f24872d;

        /* compiled from: CustomImageMessageHolder.java */
        /* renamed from: h.u.a.u.y3.o.i$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
        public class C0376a implements h.g.a.t.h {
            public final /* synthetic */ a b;

            public C0376a(a aVar) {
            }

            @Override // h.g.a.t.h
            public boolean onLoadFailed(@Nullable h.g.a.p.p.q qVar, Object obj, h.g.a.t.l.p pVar, boolean z) {
            }

            @Override // h.g.a.t.h
            public boolean onResourceReady(Object obj, Object obj2, h.g.a.t.l.p pVar, h.g.a.p.a aVar, boolean z) {
            }
        }

        public a(i iVar, ImageMessageBean.ImageBean imageBean, ImageMessageBean imageMessageBean, String str) {
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

    /* compiled from: CustomImageMessageHolder.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class b implements View.OnClickListener {
        public final /* synthetic */ int b;
        public final /* synthetic */ ImageMessageBean c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ i f24873d;

        public b(i iVar, int i2, ImageMessageBean imageMessageBean) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* compiled from: CustomImageMessageHolder.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class c implements View.OnClickListener {
        public final /* synthetic */ ImageMessageBean b;
        public final /* synthetic */ i c;

        public c(i iVar, ImageMessageBean imageMessageBean) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* compiled from: CustomImageMessageHolder.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class d implements View.OnLongClickListener {
        public final /* synthetic */ int b;
        public final /* synthetic */ ImageMessageBean c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ i f24874d;

        public d(i iVar, int i2, ImageMessageBean imageMessageBean) {
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
        }
    }

    public i(View view) {
    }

    public static /* synthetic */ OnItemClickListener A(i iVar) {
    }

    public static /* synthetic */ OnItemClickListener B(i iVar) {
    }

    public static /* synthetic */ OnItemClickListener C(i iVar) {
    }

    public static /* synthetic */ OnItemClickListener D(i iVar) {
    }

    private ViewGroup.LayoutParams getImageParams(ViewGroup.LayoutParams layoutParams, ImageMessageBean imageMessageBean) {
    }

    private void performImage(ImageMessageBean imageMessageBean, int i2) {
    }

    public static /* synthetic */ List x(i iVar) {
    }

    public static /* synthetic */ ImageView y(i iVar) {
    }

    public static /* synthetic */ String z(i iVar, String str) {
    }

    @Override // h.u.a.u.y3.o.l, com.tencent.qcloud.tuikit.tuichat.ui.view.message.viewholder.MessageBaseHolder
    public void clearHighLightBackground() {
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.ui.view.message.viewholder.MessageBaseHolder
    public int getVariableLayout() {
    }

    @Override // h.u.a.u.y3.o.m
    public void layoutVariableViews(TUIMessageBean tUIMessageBean, int i2) {
    }

    @Override // h.u.a.u.y3.o.l, com.tencent.qcloud.tuikit.tuichat.ui.view.message.viewholder.MessageBaseHolder
    public void setHighLightBackground(int i2) {
    }
}
