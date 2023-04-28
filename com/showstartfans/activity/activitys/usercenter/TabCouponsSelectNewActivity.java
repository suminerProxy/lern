package com.showstartfans.activity.activitys.usercenter;

import android.app.Activity;
import android.view.View;
import android.widget.RadioGroup;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.taihebase.activity.base.BaseNewActivity;
import h.u.a.g.f0;
import java.util.ArrayList;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class TabCouponsSelectNewActivity extends BaseNewActivity {

    /* renamed from: j  reason: collision with root package name */
    public static final String f6394j = "totalAmout";

    /* renamed from: k  reason: collision with root package name */
    public static final String f6395k = "sequence";

    /* renamed from: l  reason: collision with root package name */
    public static final String f6396l = "FromPay";

    /* renamed from: m  reason: collision with root package name */
    public static final String f6397m = "GOOD_TYPE";

    /* renamed from: n  reason: collision with root package name */
    public static final String f6398n = "couponBeanId";

    /* renamed from: o  reason: collision with root package name */
    public static final String f6399o = "ticketId";
    private String b;
    private int c;

    /* renamed from: d  reason: collision with root package name */
    private double f6400d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f6401e;

    /* renamed from: f  reason: collision with root package name */
    private long f6402f;

    /* renamed from: g  reason: collision with root package name */
    private String f6403g;

    /* renamed from: h  reason: collision with root package name */
    private String f6404h;

    /* renamed from: i  reason: collision with root package name */
    private f0 f6405i;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class a implements ViewPager.OnPageChangeListener {
        public final /* synthetic */ TabCouponsSelectNewActivity b;

        public a(TabCouponsSelectNewActivity tabCouponsSelectNewActivity) {
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
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class b extends FragmentPagerAdapter {

        /* renamed from: a  reason: collision with root package name */
        private final ArrayList<Fragment> f6406a;

        public b(FragmentManager fragmentManager, ArrayList<Fragment> arrayList) {
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getCount() {
        }

        @Override // androidx.fragment.app.FragmentPagerAdapter
        public Fragment getItem(int i2) {
        }
    }

    public static void D(Activity activity) {
    }

    public static void E(Activity activity, double d2, String str, int i2, boolean z, long j2, String str2, int i3) {
    }

    public static /* synthetic */ f0 w(TabCouponsSelectNewActivity tabCouponsSelectNewActivity) {
    }

    private /* synthetic */ void x(RadioGroup radioGroup, int i2) {
    }

    private /* synthetic */ void z(int i2, View view) {
    }

    public /* synthetic */ void A(int i2, View view) {
    }

    public void B(String str) {
    }

    public void C(int i2, int i3, int i4) {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity
    public void initData() {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity
    public void initListener() {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity
    public void initView() {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity
    @NonNull
    public View setContentViewResByViewBind() {
    }

    public /* synthetic */ void y(RadioGroup radioGroup, int i2) {
    }
}
