package com.showstartfans.activity.activitys.usercenter;

import android.widget.RadioButton;
import android.widget.RadioGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.showstartfans.activity.eventmodel.FansNumEvent;
import com.taihebase.activity.base.BaseNewActivity;
import com.viewpagerindicator.UnderlinePageIndicator;
import java.util.ArrayList;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class TabAttentionActivity extends BaseNewActivity {

    /* renamed from: k  reason: collision with root package name */
    public static final String f6383k = "fansId";

    /* renamed from: l  reason: collision with root package name */
    public static final String f6384l = "isAttenttion";

    /* renamed from: m  reason: collision with root package name */
    public static final String f6385m = "DATA_FROM";
    private ViewPager b;
    private RadioGroup c;

    /* renamed from: d  reason: collision with root package name */
    private RadioButton f6386d;

    /* renamed from: e  reason: collision with root package name */
    private RadioButton f6387e;

    /* renamed from: f  reason: collision with root package name */
    private RadioButton f6388f;

    /* renamed from: g  reason: collision with root package name */
    private RadioButton f6389g;

    /* renamed from: h  reason: collision with root package name */
    private UnderlinePageIndicator f6390h;

    /* renamed from: i  reason: collision with root package name */
    private b f6391i;

    /* renamed from: j  reason: collision with root package name */
    private String f6392j;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class a implements ViewPager.OnPageChangeListener {
        public final /* synthetic */ TabAttentionActivity b;

        public a(TabAttentionActivity tabAttentionActivity) {
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
        private ArrayList<Fragment> f6393a;
        public final /* synthetic */ TabAttentionActivity b;

        public b(TabAttentionActivity tabAttentionActivity, FragmentManager fragmentManager, ArrayList<Fragment> arrayList) {
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

    public static /* synthetic */ RadioButton w(TabAttentionActivity tabAttentionActivity) {
    }

    public static /* synthetic */ RadioButton x(TabAttentionActivity tabAttentionActivity) {
    }

    public static /* synthetic */ RadioButton y(TabAttentionActivity tabAttentionActivity) {
    }

    public static /* synthetic */ RadioButton z(TabAttentionActivity tabAttentionActivity) {
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

    @Override // com.taihebase.activity.base.BaseNewActivity, com.taihebase.activity.base.BaseNewFunctionActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEvent(FansNumEvent fansNumEvent) {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity
    public int setContentViewRes() {
    }
}
