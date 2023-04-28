package h.u.a.c.k0;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.drawee.controller.BaseControllerListener;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.imagepipeline.image.ImageInfo;
import com.showstartfans.activity.model.FindVideoBean;
import javax.annotation.Nullable;

/* compiled from: MarvellousAdapter.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class d2 extends h.y.a.f.j<FindVideoBean> {

    /* renamed from: a  reason: collision with root package name */
    private int f19279a;
    private int b;
    public int c;

    /* renamed from: d  reason: collision with root package name */
    private RecyclerView f19280d;

    /* compiled from: MarvellousAdapter.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class a extends BaseControllerListener<ImageInfo> {
        public final /* synthetic */ b b;
        public final /* synthetic */ d2 c;

        public a(d2 d2Var, b bVar) {
        }

        @Override // com.facebook.drawee.controller.BaseControllerListener, com.facebook.drawee.controller.ControllerListener
        public /* bridge */ /* synthetic */ void onFinalImageSet(String str, @Nullable Object obj, @Nullable Animatable animatable) {
        }

        public void onFinalImageSet(String str, @Nullable ImageInfo imageInfo, @Nullable Animatable animatable) {
        }
    }

    /* compiled from: MarvellousAdapter.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class b extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public SimpleDraweeView f19281a;
        public TextView b;
        public TextView c;

        /* renamed from: d  reason: collision with root package name */
        public View f19282d;

        /* renamed from: e  reason: collision with root package name */
        public RelativeLayout f19283e;

        /* renamed from: f  reason: collision with root package name */
        public ImageView f19284f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ d2 f19285g;

        public b(d2 d2Var, View view) {
        }
    }

    public d2(Context context) {
    }

    private /* synthetic */ void e(FindVideoBean findVideoBean, View view) {
    }

    private /* synthetic */ void g(FindVideoBean findVideoBean, View view) {
    }

    private void init() {
    }

    public void c(RecyclerView recyclerView) {
    }

    public b d(int i2) {
    }

    public /* synthetic */ void f(FindVideoBean findVideoBean, View view) {
    }

    public /* synthetic */ void h(FindVideoBean findVideoBean, View view) {
    }

    public b i(ViewGroup viewGroup, int i2) {
    }

    public void j(int i2, boolean z) {
    }

    public void k() {
    }

    public void l() {
    }

    @Override // h.y.a.f.j, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i2) {
    }

    @Override // h.y.a.f.j, androidx.recyclerview.widget.RecyclerView.Adapter
    public /* bridge */ /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
    }
}
