package com.taihe.videoplayer.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import h.x.g.k.d.h;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class VodQualityView extends RelativeLayout {
    private Context b;
    private b c;

    /* renamed from: d  reason: collision with root package name */
    private ListView f7969d;

    /* renamed from: e  reason: collision with root package name */
    private c f7970e;

    /* renamed from: f  reason: collision with root package name */
    private List<h> f7971f;

    /* renamed from: g  reason: collision with root package name */
    private int f7972g;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class a implements AdapterView.OnItemClickListener {
        public final /* synthetic */ VodQualityView b;

        public a(VodQualityView vodQualityView) {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public interface b {
        void j(h hVar);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class c extends BaseAdapter {
        public final /* synthetic */ VodQualityView b;

        public c(VodQualityView vodQualityView) {
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

    public VodQualityView(Context context) {
    }

    public static /* synthetic */ b a(VodQualityView vodQualityView) {
    }

    public static /* synthetic */ List b(VodQualityView vodQualityView) {
    }

    public static /* synthetic */ int c(VodQualityView vodQualityView) {
    }

    public static /* synthetic */ int d(VodQualityView vodQualityView, int i2) {
    }

    public static /* synthetic */ c e(VodQualityView vodQualityView) {
    }

    public static /* synthetic */ Context f(VodQualityView vodQualityView) {
    }

    private void g(Context context) {
    }

    public void setCallback(b bVar) {
    }

    public void setDefaultSelectedQuality(int i2) {
    }

    public void setVideoQualityList(List<h> list) {
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class d extends RelativeLayout {
        private TextView b;
        public final /* synthetic */ VodQualityView c;

        public d(VodQualityView vodQualityView, Context context, AttributeSet attributeSet, int i2) {
        }

        private void a(Context context) {
        }

        public void b(String str) {
        }

        @Override // android.view.View
        public void setSelected(boolean z) {
        }

        public d(VodQualityView vodQualityView, Context context, AttributeSet attributeSet) {
        }

        public d(VodQualityView vodQualityView, Context context) {
        }
    }

    public VodQualityView(Context context, AttributeSet attributeSet) {
    }

    public VodQualityView(Context context, AttributeSet attributeSet, int i2) {
    }
}
