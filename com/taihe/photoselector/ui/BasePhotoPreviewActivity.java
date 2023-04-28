package com.taihe.photoselector.ui;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.taihe.photoselector.model.PhotoModel;
import com.taihe.photoselector.ui.photodrawee.MultiTouchViewPager;
import h.x.e.d.l.j;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class BasePhotoPreviewActivity extends FragmentActivity implements ViewPager.OnPageChangeListener, View.OnClickListener {
    private MultiTouchViewPager b;
    private RelativeLayout c;

    /* renamed from: d  reason: collision with root package name */
    private ImageButton f7838d;

    /* renamed from: e  reason: collision with root package name */
    private TextView f7839e;

    /* renamed from: f  reason: collision with root package name */
    public List<PhotoModel> f7840f;

    /* renamed from: g  reason: collision with root package name */
    public int f7841g;

    /* renamed from: h  reason: collision with root package name */
    private PagerAdapter f7842h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f7843i;

    /* renamed from: j  reason: collision with root package name */
    private View.OnClickListener f7844j;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class a extends PagerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ BasePhotoPreviewActivity f7845a;

        /* renamed from: com.taihe.photoselector.ui.BasePhotoPreviewActivity$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
        public class C0147a implements j {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ a f7846a;

            public C0147a(a aVar) {
            }

            @Override // h.x.e.d.l.j
            public void onViewTap(View view, float f2, float f3) {
            }
        }

        public a(BasePhotoPreviewActivity basePhotoPreviewActivity) {
        }

        public View c(ViewGroup viewGroup, int i2) {
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public void destroyItem(ViewGroup viewGroup, int i2, Object obj) {
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getCount() {
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public /* bridge */ /* synthetic */ Object instantiateItem(ViewGroup viewGroup, int i2) {
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public boolean isViewFromObject(View view, Object obj) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class b implements View.OnClickListener {
        public final /* synthetic */ BasePhotoPreviewActivity b;

        public b(BasePhotoPreviewActivity basePhotoPreviewActivity) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    public static /* synthetic */ View.OnClickListener w(BasePhotoPreviewActivity basePhotoPreviewActivity) {
    }

    public static /* synthetic */ RelativeLayout x(BasePhotoPreviewActivity basePhotoPreviewActivity) {
    }

    public void initView() {
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i2) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrolled(int i2, float f2, int i3) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageSelected(int i2) {
    }

    public void y() {
    }

    public void z() {
    }
}
