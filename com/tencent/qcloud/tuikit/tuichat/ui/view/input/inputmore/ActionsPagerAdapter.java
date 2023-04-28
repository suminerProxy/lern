package com.tencent.qcloud.tuikit.tuichat.ui.view.input.inputmore;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.tencent.qcloud.tuikit.tuichat.bean.InputMoreActionUnit;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class ActionsPagerAdapter extends PagerAdapter {
    private final int COLUMN_COUNT;
    private final int ITEM_COUNT_PER_GRID_VIEW;
    private int actionHeight;
    private int actionWidth;
    private final Context mContext;
    private final int mGridViewCount;
    private final List<InputMoreActionUnit> mInputMoreList;
    private final ViewPager mViewPager;

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.ui.view.input.inputmore.ActionsPagerAdapter$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass1 implements Runnable {
        public final /* synthetic */ ActionsPagerAdapter this$0;

        public AnonymousClass1(ActionsPagerAdapter actionsPagerAdapter) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.ui.view.input.inputmore.ActionsPagerAdapter$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass2 implements Runnable {
        public final /* synthetic */ ActionsPagerAdapter this$0;

        public AnonymousClass2(ActionsPagerAdapter actionsPagerAdapter) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.ui.view.input.inputmore.ActionsPagerAdapter$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass3 implements AdapterView.OnItemClickListener {
        public final /* synthetic */ ActionsPagerAdapter this$0;

        public AnonymousClass3(ActionsPagerAdapter actionsPagerAdapter) {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
        }
    }

    public ActionsPagerAdapter(ViewPager viewPager, List<InputMoreActionUnit> list) {
    }

    public static /* synthetic */ ViewPager access$000(ActionsPagerAdapter actionsPagerAdapter) {
    }

    public static /* synthetic */ int access$100(ActionsPagerAdapter actionsPagerAdapter) {
    }

    public static /* synthetic */ List access$200(ActionsPagerAdapter actionsPagerAdapter) {
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i2, Object obj) {
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getItemPosition(Object obj) {
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i2) {
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public boolean isViewFromObject(View view, Object obj) {
    }
}
