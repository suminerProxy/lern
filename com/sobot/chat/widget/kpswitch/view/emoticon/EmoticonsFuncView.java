package com.sobot.chat.widget.kpswitch.view.emoticon;

import android.content.Context;
import android.util.AttributeSet;
import androidx.viewpager.widget.ViewPager;
import com.sobot.chat.widget.kpswitch.widget.adpater.PageSetAdapter;
import com.sobot.chat.widget.kpswitch.widget.data.PageSetEntity;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class EmoticonsFuncView extends ViewPager {
    public int mCurrentPagePosition;
    private OnEmoticonsPageViewListener mOnEmoticonsPageViewListener;
    public PageSetAdapter mPageSetAdapter;

    /* renamed from: com.sobot.chat.widget.kpswitch.view.emoticon.EmoticonsFuncView$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass1 implements ViewPager.OnPageChangeListener {
        public final /* synthetic */ EmoticonsFuncView this$0;

        public AnonymousClass1(EmoticonsFuncView emoticonsFuncView) {
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
    public interface OnEmoticonsPageViewListener {
        void emoticonSetChanged(PageSetEntity pageSetEntity);

        void playBy(int i2, int i3, PageSetEntity pageSetEntity);

        void playTo(int i2, PageSetEntity pageSetEntity);
    }

    public EmoticonsFuncView(Context context, AttributeSet attributeSet) {
    }

    public void checkPageChange(int i2) {
    }

    public void setAdapter(PageSetAdapter pageSetAdapter) {
    }

    public void setCurrentPageSet(PageSetEntity pageSetEntity) {
    }

    public void setOnIndicatorListener(OnEmoticonsPageViewListener onEmoticonsPageViewListener) {
    }
}
