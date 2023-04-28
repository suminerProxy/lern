package com.showstartfans.activity.activitys.usercenter;

import android.widget.RadioButton;
import android.widget.RadioGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.taihebase.activity.base.BaseNewActivity;
import com.viewpagerindicator.UnderlinePageIndicator;
import java.util.ArrayList;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class CollectActivity extends BaseNewActivity {
    private ViewPager b;
    private RadioGroup c;

    /* renamed from: d  reason: collision with root package name */
    private RadioButton f6304d;

    /* renamed from: e  reason: collision with root package name */
    private RadioButton f6305e;

    /* renamed from: f  reason: collision with root package name */
    private RadioButton f6306f;

    /* renamed from: g  reason: collision with root package name */
    private UnderlinePageIndicator f6307g;

    /* renamed from: h  reason: collision with root package name */
    private ArrayList<Fragment> f6308h;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class a implements ViewPager.OnPageChangeListener {
        public final /* synthetic */ CollectActivity b;

        public a(CollectActivity collectActivity) {
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
    public class b extends FragmentPagerAdapter {

        /* renamed from: a  reason: collision with root package name */
        private ArrayList<Fragment> f6309a;
        public final /* synthetic */ CollectActivity b;

        public b(CollectActivity collectActivity, FragmentManager fragmentManager, ArrayList<Fragment> arrayList) {
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getCount() {
        }

        @Override // androidx.fragment.app.FragmentPagerAdapter
        public Fragment getItem(int i2) {
        }
    }

    private /* synthetic */ void A(RadioGroup radioGroup, int i2) {
    }

    public static /* synthetic */ RadioButton w(CollectActivity collectActivity) {
    }

    public static /* synthetic */ RadioButton x(CollectActivity collectActivity) {
    }

    public static /* synthetic */ ArrayList y(CollectActivity collectActivity) {
    }

    public static /* synthetic */ RadioButton z(CollectActivity collectActivity) {
    }

    public /* synthetic */ void B(RadioGroup radioGroup, int i2) {
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
    public int setContentViewRes() {
    }
}
