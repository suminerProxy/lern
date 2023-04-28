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
public class CollectShowTabActivity extends BaseNewActivity {
    private ViewPager b;
    private RadioGroup c;

    /* renamed from: d  reason: collision with root package name */
    private RadioButton f6310d;

    /* renamed from: e  reason: collision with root package name */
    private RadioButton f6311e;

    /* renamed from: f  reason: collision with root package name */
    private UnderlinePageIndicator f6312f;

    /* renamed from: g  reason: collision with root package name */
    private b f6313g;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class a implements ViewPager.OnPageChangeListener {
        public final /* synthetic */ CollectShowTabActivity b;

        public a(CollectShowTabActivity collectShowTabActivity) {
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
        private ArrayList<Fragment> f6314a;
        public final /* synthetic */ CollectShowTabActivity b;

        public b(CollectShowTabActivity collectShowTabActivity, FragmentManager fragmentManager, ArrayList<Fragment> arrayList) {
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getCount() {
        }

        @Override // androidx.fragment.app.FragmentPagerAdapter
        public Fragment getItem(int i2) {
        }
    }

    public static /* synthetic */ RadioButton w(CollectShowTabActivity collectShowTabActivity) {
    }

    public static /* synthetic */ RadioButton x(CollectShowTabActivity collectShowTabActivity) {
    }

    private /* synthetic */ void y(RadioGroup radioGroup, int i2) {
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

    public /* synthetic */ void z(RadioGroup radioGroup, int i2) {
    }
}
