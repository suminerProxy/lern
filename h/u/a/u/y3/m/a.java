package h.u.a.u.y3.m;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.viewpager.widget.PagerAdapter;
import com.showstartfans.activity.model.EmojiBean;
import com.tencent.qcloud.tuikit.tuichat.component.face.Emoji;
import com.tencent.qcloud.tuikit.tuichat.component.face.FaceGroup;
import com.tencent.qcloud.tuikit.tuichat.component.face.RecentEmojiManager;
import com.tencent.qcloud.tuikit.tuichat.ui.view.input.face.FaceFragment;
import com.tencent.qcloud.tuikit.tuichat.ui.view.input.face.FaceGroupIcon;
import java.util.ArrayList;
import java.util.List;

/* compiled from: CustomFaceFragment.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class a extends FaceFragment {
    public GridView b;
    private FrameLayout c;

    /* renamed from: d  reason: collision with root package name */
    private TextView f24807d;

    /* renamed from: e  reason: collision with root package name */
    public FaceGroupIcon f24808e;

    /* renamed from: f  reason: collision with root package name */
    public ArrayList<View> f24809f;

    /* renamed from: g  reason: collision with root package name */
    public ArrayList<EmojiBean> f24810g;

    /* renamed from: h  reason: collision with root package name */
    public ArrayList<Emoji> f24811h;

    /* renamed from: i  reason: collision with root package name */
    public ArrayList<FaceGroup> f24812i;

    /* renamed from: j  reason: collision with root package name */
    private int f24813j;

    /* renamed from: k  reason: collision with root package name */
    private int f24814k;

    /* renamed from: l  reason: collision with root package name */
    private int f24815l;

    /* renamed from: m  reason: collision with root package name */
    private int f24816m;

    /* renamed from: n  reason: collision with root package name */
    private f f24817n;

    /* renamed from: o  reason: collision with root package name */
    private RecentEmojiManager f24818o;

    /* compiled from: CustomFaceFragment.java */
    /* renamed from: h.u.a.u.y3.m.a$a  reason: collision with other inner class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class View$OnClickListenerC0370a implements View.OnClickListener {
        public final /* synthetic */ a b;

        public View$OnClickListenerC0370a(a aVar) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* compiled from: CustomFaceFragment.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class b implements View.OnClickListener {
        public final /* synthetic */ a b;

        public b(a aVar) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* compiled from: CustomFaceFragment.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class c implements AdapterView.OnItemClickListener {
        public final /* synthetic */ ArrayList b;
        public final /* synthetic */ a c;

        public c(a aVar, ArrayList arrayList) {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
        }
    }

    /* compiled from: CustomFaceFragment.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class d extends BaseAdapter {
        private List<EmojiBean> b;
        private Context c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ a f24819d;

        /* compiled from: CustomFaceFragment.java */
        /* renamed from: h.u.a.u.y3.m.a$d$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
        public class C0371a {

            /* renamed from: a  reason: collision with root package name */
            public FrameLayout f24820a;
            public ImageView b;
            public TextView c;

            /* renamed from: d  reason: collision with root package name */
            public final /* synthetic */ d f24821d;

            public C0371a(d dVar) {
            }
        }

        public d(a aVar, List<EmojiBean> list, Context context) {
        }

        @Override // android.widget.Adapter
        public int getCount() {
        }

        @Override // android.widget.Adapter
        public Object getItem(int i2) {
        }

        @Override // android.widget.Adapter
        public long getItemId(int i2) {
        }

        @Override // android.widget.Adapter
        public View getView(int i2, View view, ViewGroup viewGroup) {
        }
    }

    /* compiled from: CustomFaceFragment.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class e extends PagerAdapter {

        /* renamed from: a  reason: collision with root package name */
        private List<View> f24822a;
        public final /* synthetic */ a b;

        public e(a aVar, List<View> list) {
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public void destroyItem(View view, int i2, Object obj) {
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getCount() {
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public Object instantiateItem(View view, int i2) {
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public boolean isViewFromObject(View view, Object obj) {
        }
    }

    /* compiled from: CustomFaceFragment.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public interface f {
        void a(EmojiBean emojiBean);

        void b();

        void c(int i2, EmojiBean emojiBean);

        void onEmojiDelete();
    }

    public static a e() {
    }

    public static /* synthetic */ f f(a aVar) {
    }

    public static /* synthetic */ int g(a aVar) {
    }

    private void i(ArrayList<EmojiBean> arrayList) {
    }

    private void j(Emoji emoji) {
    }

    public ArrayList<EmojiBean> h() {
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.ui.view.input.face.FaceFragment
    public void initViews() {
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.ui.view.input.face.FaceFragment, androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.ui.view.input.face.FaceFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.ui.view.input.face.FaceFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.ui.view.input.face.FaceFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
    }

    public void setListener(f fVar) {
    }
}
