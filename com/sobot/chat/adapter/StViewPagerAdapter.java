package com.sobot.chat.adapter;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.sobot.chat.fragment.SobotBaseFragment;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class StViewPagerAdapter extends SmartFragmentStatePagerAdapter {
    private Context context;
    private List<SobotBaseFragment> pagers;
    private String[] tabs;

    public StViewPagerAdapter(Context context, FragmentManager fragmentManager, String[] strArr, List<SobotBaseFragment> list) {
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
    }

    @Override // androidx.fragment.app.FragmentStatePagerAdapter
    public Fragment getItem(int i2) {
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getItemPosition(@NonNull Object obj) {
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public CharSequence getPageTitle(int i2) {
    }
}
